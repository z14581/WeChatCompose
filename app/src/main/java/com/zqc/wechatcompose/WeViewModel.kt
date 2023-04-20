package com.zqc.wechatcompose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WeViewModel  :ViewModel(){
    var name by mutableStateOf("zhao")
}