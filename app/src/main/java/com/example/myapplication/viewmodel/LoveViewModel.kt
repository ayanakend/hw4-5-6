package com.example.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.remote.LoveModel
import com.example.myapplication.repository.Repository

class LoveViewModel : ViewModel() {
    private val repository = Repository()
    fun getLiveLove(firstName:String, secondName:String): LiveData<LoveModel> {
        return repository.getLove(firstName, secondName)
    }
}