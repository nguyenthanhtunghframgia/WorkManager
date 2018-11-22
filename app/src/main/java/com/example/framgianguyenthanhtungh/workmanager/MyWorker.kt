package com.example.framgianguyenthanhtungh.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(context: Context, parameters: WorkerParameters) : Worker(context, parameters) {

    companion object {
        private const val TAG = "MyWorker"
    }

    override fun doWork(): Result =
        try {
            var i = inputData.getInt(FIVE, 1)
            while (i <= 30) {
                Thread.sleep(1000)
                i = i.plus(1)
            }
            outputData = createOutputData(i)
            Result.SUCCESS
        } catch (exception: Exception) {
            Log.i(TAG, "Fail")
            Result.FAILURE
        }

    private fun createOutputData(out: Int): Data {
        return Data.Builder()
            .putInt(OUT_FIVE, out)
            .build()
    }
}
