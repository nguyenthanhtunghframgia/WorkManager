package com.example.framgianguyenthanhtungh.workmanager

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.work.*
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
        button_start.setOnClickListener(this)
        button_stop.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            button_start -> doWorker()
            button_stop -> cancelWork()
        }
    }

    private fun createInputData(): Data {
        return Data.Builder()
            .putInt(FIVE, 1)
            .build()
    }

    private fun doWorker() {
        compressionWork = OneTimeWorkRequest.Builder(MyWorker::class.java)
            .setInputData(createInputData())
            .build()
        workManager.enqueue(compressionWork)
        //
//        workManager
//            .getStatusById(oneTimeWorkRequest.id)
//            .observe(this, Observer {
//                if (it?.state == null)
//                    return@Observer
//                when (it.state) {
//                    State.SUCCEEDED -> {
//                        val successOutputData = it.outputData
//                        val firstValue = successOutputData.getString(FIRST_KEY, "output default value")
//                        val secondValue = successOutputData.getInt(SECOND_KEY, -72)
//                    }
//                    State.FAILED -> {
//                        val failureOutputData = it.outputData
//                        val firdtValue = failureOutputData.getString(FIRST_KEY, "output default value")
//                        val secondValue = failureOutputData.getInt(SECOND_KEY, -72)
//                    }
//                }
//            })
    }

    private fun doWorkerNetwork() {
        constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()

        compressionWork = OneTimeWorkRequest.Builder(MyWorker::class.java)
            .setConstraints(constraints)
            .build()

        workManager.enqueue(compressionWork)
    }

    private fun doWorkerCharged() {
        constraints = Constraints.Builder()
            .setRequiresCharging(true)
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
