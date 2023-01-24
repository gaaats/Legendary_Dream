package com.rvappstudios.montessori.math.games.kids.number.countin.apppiii


sealed class DataFromApiResource<T>(
    val hyyhyhyh: T? = null,
    val jukiikikik: String? = null
) {
    class Success<T>(data: T) : DataFromApiResource<T>(data)
    class Loading<T>(data: T? = null) : DataFromApiResource<T>(data)
    class Error<T>(message: String, data: T? = null) : DataFromApiResource<T>(data, message)
}