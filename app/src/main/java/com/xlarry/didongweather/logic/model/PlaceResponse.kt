package com.xlarry.didongweather.logic.model

import com.google.gson.annotations.SerializedName
//解析Json数据

data class PlaceResponse (val ststus:String,val places:List<Place>)

data class Place(val name:String,val lacation:Location,@SerializedName("formatter_address") val address:String)

data class Location(val lng:String,val lat:String)
