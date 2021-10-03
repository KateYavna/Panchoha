package ua.com.panchoha.data

import android.graphics.Bitmap
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Socks (
    @DrawableRes val photo : Int,
    @StringRes val headline : Int,
    @StringRes val details : Int,
    @StringRes val price : Int
        )