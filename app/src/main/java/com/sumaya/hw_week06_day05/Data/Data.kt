package com.sumaya.hw_week06_day05.Data

data class Data(
    val results : List<Results>,
)

data class Results (

    val poster_path : String,
    val release_date : String,
    val title : String,
    val vote_average : Double,
)