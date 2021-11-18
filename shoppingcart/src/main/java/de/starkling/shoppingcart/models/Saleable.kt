package de.starkling.shoppingcart.models

interface Saleable {

    var itemQuantity:Int

    fun getId():String

    fun getName():String

    fun getPrice():Float

    fun getQuantity():Int

    fun getTotal() : Float

}