package de.honoka.lavender.lavsource.android.data

data class BilibiliLoginParams(

    var username: String? = null,

    var password: String? = null,

    var keep: Int? = 0,

    var token: String? = null,

    var challenge: String? = null,

    var validate: String? = null,

    var seccode: String? = null
)