package ua.com.panchoha.data

import ua.com.panchoha.R

class DatasourceStockings() {
    fun loadStockings():ArrayList<Stockings>{
        return arrayListOf<Stockings>(
            Stockings(R.drawable.cotton_knee_highs,R.string.cotton_knee_highs_headline,R.string.cotton_knee_highs_details,R.string.cotton_knee_highs_price),
            Stockings(R.drawable.dotted,R.string.dotted_headline,R.string.dotted_details,R.string.dotted_price),
            Stockings(R.drawable.emotion_20,R.string.emotion_20_headline,R.string.emotion_20_details,R.string.emotion_20_price),
            Stockings(R.drawable.emotion_40,R.string.emotion_40_headline,R.string.emotion_40_details,R.string.emotion_40_price),
            Stockings(R.drawable.emotion_rete_vision,R.string.emotion_rete_vision_headline,R.string.emotion_rete_vision_details,R.string.emotion_rete_vision_price),
            Stockings(R.drawable.gaiters,R.string.gaiters_headline,R.string.gaiters_details,R.string.gaiters_price),
            Stockings(R.drawable.malizia_20,R.string.malizia_20_headline,R.string.malizia_20_details,R.string.malizia_20_price),
            Stockings(R.drawable.malizia_40,R.string.malizia_40_headline,R.string.malizia_40_details,R.string.malizia_40_price),
            Stockings(R.drawable.romantic_15,R.string.romantic_15_headline,R.string.romantic_15_details,R.string.romantic_15_price),
            Stockings(R.drawable.segretto_20,R.string.segretto_20_headline,R.string.segretto_20_details,R.string.segretto_20_price),
            Stockings(R.drawable.wool_knee_highs,R.string.wool_knee_highs_headline,R.string.wool_knee_highs_details,R.string.wool_knee_highs_price),
            Stockings(R.drawable.terry_knee_highs,R.string.terry_knee_highs_headline,R.string.terry_knee_highs_details,R.string.terry_knee_highs_price),
            Stockings(R.drawable.green_strip,R.string.green_strip_headline,R.string.green_strip_details,R.string.green_strip_price),
            Stockings(R.drawable.passion_20,R.string.passion_headline,R.string.passion_details,R.string.passion_price),
            Stockings(R.drawable.flirt,R.string.flirt_headline,R.string.flirt_details,R.string.flirt_price),
            Stockings(R.drawable.nika_comfort_20,R.string.nika_comfort_20_headline,R.string.nika_comfort_20_details,R.string.nika_comfort_20_price),
            Stockings(R.drawable.nika_comfort_40,R.string.nika_comfort_40_headline,R.string.nika_comfort_40_details,R.string.nika_comfort_40_price)

        )
    }
}