package com.example.ass5intent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Employee( val Name: String, val gender: String,val Email: String,val salary: Int) : Parcelable {
}