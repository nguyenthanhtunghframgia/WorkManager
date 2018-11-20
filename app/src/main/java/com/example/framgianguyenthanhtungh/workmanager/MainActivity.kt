package com.example.framgianguyenthanhtungh.workmanager

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var workManager: WorkManager
    private lateinit var constraints: Constraints
    private lateinit var workId: UUID
    private lateinit var compressionWork: OneTimeWorkRequest

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        workManager = WorkManager.getInstance()
        registerListener()
    }

    private fun registerListener() {
        button_do_work.setOnClickListener(this)
        button_do_work_constraint.setOnClickListener(this)
        button_cancel_work.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            button_do_work -> doWorker()
            button_do_work_constraint -> doWorkerWithConstraint()
            button_cancel_work -> cancelWork()
        }
    }

    private fun doWorker() {
        compressionWork = OneTimeWorkRequest.Builder(MyWorker::class.java)
            .build()
        workManager.enqueue(compressionWork)
    }

    private fun doWorkerWithConstraint() {
        constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()

        compressionWork = OneTimeWorkRequest.Builder(MyWorker::class.java)
            .setConstraints(constraints)
            .build()

        workManager.enqueue(compressionWork)
    }

    private fun cancelWork() {
        workId = compressionWork.id
        workManager.cancelWorkById(workId)
    }
}
