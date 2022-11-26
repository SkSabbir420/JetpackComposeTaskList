package com.ourdream771.jetpackcompose.feature_task.presentation.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ListItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import com.ourdream771.jetpackcompose.feature_task.data.util.getItem
import com.ourdream771.jetpackcompose.feature_task.domain.model.Task

@Composable
fun TaskItemList(list:List<Task>,itemRemove:(Task)->Unit){

    LazyColumn(
        modifier = Modifier
    ){
        items(list.size) {index ->
            TaskItem(
                name = list[index].name ,
                onClick = { itemRemove(list[index]) }
            )
        }
    }
}