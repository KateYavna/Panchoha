package ua.com.panchoha.data

import ua.com.panchoha.R

class DatasourceKids() {
    fun loadKids():ArrayList<Kids>{
        return arrayListOf<Kids>(
            Kids(R.drawable.toy,R.string.toy_headline,R.string.toy_details,R.string.toy_price),
            Kids(R.drawable.terry_kids,R.string.terry_kids_headline,R.string.terry_kids_details,R.string.terry_kids_price),
            Kids(R.drawable.olmi_sport_kids_1,R.string.olmi_sport_kids_1_headline,R.string.olmi_sport_kids_1_details,R.string.olmi_sport_kids_1_price),
            Kids(R.drawable.olmi_bunny,R.string.olmi_bunny_headline,R.string.olmi_bunny_details,R.string.olmi_bunny_price),
            Kids(R.drawable.legka_hoda_children_1,R.string.legka_hoda_children_1_headline,R.string.legka_hoda_children_1_details,R.string.legka_hoda_children_1_price),
            Kids(R.drawable.legka_hoda_9044,R.string.legka_hoda_9044_headline,R.string.legka_hoda_9044_details,R.string.legka_hoda_9044_price),
            Kids(R.drawable.legka_hoda_children_5,R.string.legka_hoda_children_5_headline,R.string.legka_hoda_children_5_details,R.string.legka_hoda_children_5_price),
            Kids(R.drawable.olmi_sport_kids_2,R.string.olmi_sport_kids_2_headline,R.string.olmi_sport_kids_2_details,R.string.olmi_sport_kids_2_price),
            Kids(R.drawable.legka_hoda_children_4,R.string.legka_hoda_children_4_headline,R.string.legka_hoda_children_4_details,R.string.legka_hoda_children_4_price),
            Kids(R.drawable.legka_hoda_children_3,R.string.legka_hoda_children_3_headline,R.string.legka_hoda_children_3_details,R.string.legka_hoda_children_3_price),
            Kids(R.drawable.legka_hoda_children_2,R.string.legka_hoda_children_2_headline,R.string.legka_hoda_children_2_details,R.string.legka_hoda_children_2_price)
        )
    }
}