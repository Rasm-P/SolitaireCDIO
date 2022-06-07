package com.cdio.solitaire.model

data class Card(
    var rank: Int = 0,
    var suit: Int = 0,
    var listID: Int,
    var prev: Card? = null,
    var next: Card? = null
)
