package com.example.hw_3.model

import com.google.gson.annotations.SerializedName

data class LoveModel (
    @SerializedName("fname")
    var firstname:String,
    @SerializedName("sname")
    var secondName:String,
    var percentage:String,
    var result:String,
    ):java.io.Serializable

