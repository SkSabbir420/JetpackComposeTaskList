package com.ourdream771.jetpackcompose.feature_task.data.util

import com.ourdream771.jetpackcompose.feature_task.domain.model.Task

fun getItem():List<Task>{
    var list:MutableList<Task> = mutableListOf()
    var i = 0
    while ( i<30 ){
        list.add(Task("Task $i",i))
        i++
    }
    return list
}