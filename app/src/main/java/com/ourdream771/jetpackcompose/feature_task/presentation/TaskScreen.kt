package com.ourdream771.jetpackcompose.feature_task.presentation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ourdream771.jetpackcompose.feature_task.presentation.components.TaskItemList

@Composable
fun TaskScreen(){
//    val viewModel:TaskScreenViewModel = viewModel()
//    val viewModel = hiltViewModel<TaskScreenViewModel>()
    val viewModel: TaskScreenViewModel = hiltViewModel()
    TaskItemList(viewModel.taskList){
        viewModel.remove(it)
    }
}