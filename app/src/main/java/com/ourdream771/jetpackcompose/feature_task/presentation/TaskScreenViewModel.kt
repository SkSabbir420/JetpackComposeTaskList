package com.ourdream771.jetpackcompose.feature_task.presentation

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.ourdream771.jetpackcompose.feature_task.data.util.getItem
import com.ourdream771.jetpackcompose.feature_task.domain.model.Task
import dagger.hilt.android.lifecycle.HiltViewModel

//@HiltViewModel
class TaskScreenViewModel:ViewModel() {

    private var _taskList = getItem().toMutableStateList()
    val taskList = _taskList

    fun remove(task: Task){
        _taskList.remove(task)
    }
}