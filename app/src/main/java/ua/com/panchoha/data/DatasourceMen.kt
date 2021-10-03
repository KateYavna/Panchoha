package ua.com.panchoha.data

import ua.com.panchoha.R

class DatasourceMen () {
    fun loadMen() :ArrayList<Men>{
        return arrayListOf<Men>(
            Men(R.drawable.zhytomyr,R.string.zhytomyr_headline,R.string.zhytomyr_details,R.string.zhytomyr_price),
            Men(R.drawable.short_men_socks_1,R.string.short_men_socks_1_headline,R.string.short_men_socks_1_details,R.string.short_men_socks_1_price),
            Men(R.drawable.short_men_socks_2,R.string.short_men_socks_2_headline,R.string.short_men_socks_2_details,R.string.short_men_socks_2_price),
            Men(R.drawable.short_men_socks_3,R.string.short_men_socks_3_headline,R.string.short_men_socks_3_details,R.string.short_men_socks_3_price),
            Men(R.drawable.short_men_socks_4,R.string.short_men_socks_4_headline,R.string.short_men_socks_4_details,R.string.short_men_socks_4_price),
            Men(R.drawable.short_men_socks_5,R.string.short_men_socks_5_headline,R.string.short_men_socks_5_details,R.string.short_men_socks_5_price),
            Men(R.drawable.short_men_socks_6,R.string.short_men_socks_6_headline,R.string.short_men_socks_6_details,R.string.short_men_socks_6_price),
            Men(R.drawable.short_men_socks_7,R.string.short_men_socks_7_headline,R.string.short_men_socks_7_details,R.string.short_men_socks_7_price),
            Men(R.drawable.pictures_men,R.string.pictures_men_headline,R.string.pictures_men_details,R.string.pictures_men_price),
            Men(R.drawable.medium_socks_men,R.string.medium_socks_men_headline,R.string.medium_socks_men_details,R.string.medium_socks_men_price),
            Men(R.drawable.legka_hoda_men_sport,R.string.legka_hoda_men_sport_headline,R.string.legka_hoda_men_sport_details,R.string.legka_hoda_men_sport_price),
            Men(R.drawable.legka_hoda_6012,R.string.legka_hoda_6012_headline,R.string.legka_hoda_6012_details,R.string.legka_hoda_6012_price),
            Men(R.drawable.konopli,R.string.konopli_headline,R.string.konopli_details,R.string.konopli_price),
            Men(R.drawable.footprints_men_25,R.string.footprints_men_headline,R.string.footprints_men_details,R.string.footprints_men_price),
            Men(R.drawable.dilek_1,R.string.dilek_1_headline,R.string.dilek_1_details,R.string.dilek_1_price)
        )
    }
}