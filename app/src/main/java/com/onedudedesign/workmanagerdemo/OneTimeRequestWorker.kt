package com.onedudedesign.workmanagerdemo

import android.content.Context
import android.util.Log
import androidx.work.Data
import androidx.work.Worker
import androidx.work.WorkerParameters

class OneTimeRequestWorker(context: Context, params: WorkerParameters): Worker(context, params){



    override fun doWork(): Result {
        val inputValue = inputData.getString("inputKey")
        Log.i("Worker Input", "$inputValue")

        //TODO PUT BACKGROUND TASKS

        return Result.success(createOutputData())
    }

    private fun createOutputData(): Data{
        return Data.Builder().putString("outputKey", "Output Value").build()
    }

    object Companion{
        fun logger (message: String) = Log.i("WorkRequest Status", message)
    }

}