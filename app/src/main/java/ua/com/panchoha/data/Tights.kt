package ua.com.panchoha.data

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import ua.com.panchoha.R

data class Tights(
    @DrawableRes val photo: Int,
    @StringRes val headline: Int,
    @StringRes val details: Int,
    @StringRes val price: Int)






