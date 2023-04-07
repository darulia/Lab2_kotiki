package com.example.example

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Cat(
    val Name: String,
    val Age: Int,
    val Owner: String,
    val Description: String,
    val ResId: Int,

    ) : Parcelable

fun createGames(): List<Cat> {
    return listOf(
        Cat(
            "Stepan",
            1,
            "Mom's cat",
            "Moyva's son.",
            R.drawable.img4,

            ),

        Cat(
            "Moyva",
            3,
            "My cat",
            "My kitty, whom I love more than myself.",
            R.drawable.img1,

            ),

        Cat(
            "Molya",
            5,
            "Sister's cat",
            "My sister's beautiful kitty, which was given to her because of the arrival of the baby.",
            R.drawable.img2,

            ),
        Cat(
            "Patron",
            5,
            "Our cat",
            "Our missing cat.He disappeared several years ago.",
            R.drawable.img3,

            ),




    )
    

}