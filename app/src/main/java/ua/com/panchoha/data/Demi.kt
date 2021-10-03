package ua.com.panchoha.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Demi(
    @DrawableRes val photo :Int,
    @StringRes val headline :Int,
    @StringRes val details :Int,
    @StringRes val price :Int
)
