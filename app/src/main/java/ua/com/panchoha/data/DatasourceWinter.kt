package ua.com.panchoha.data

import ua.com.panchoha.R

class DatasourceWinter() {
    fun loadWinter(): ArrayList<Winter>{
        return arrayListOf<Winter>(
            Winter(R.drawable.alpina,R.string.alpina_headline,R.string.alpina_details,R.string.alpina_price),
            Winter(R.drawable.angora_1,R.string.angora_1_headline,R.string.angora_1_details,R.string.angora_1_price),
            Winter(R.drawable.angora_2,R.string.angora_2_headline,R.string.angora_2_details,R.string.angora_2_price),
            Winter(R.drawable.arctica_250,R.string.arctica_250_headline,R.string.arctica_250_details,R.string.arctica_250_price),
            Winter(R.drawable.blues_150,R.string.blues_150_headline,R.string.blues_150_details,R.string.blues_150_price),
            Winter(R.drawable.celia,R.string.celia_headline,R.string.celia_details,R.string.celia_price),
            Winter(R.drawable.effect_up_100,R.string.effect_up_100_headline,R.string.effect_up_100_details,R.string.effect_up_100_price),
            Winter(R.drawable.galaxy_120,R.string.galaxy_120_headline,R.string.galaxy_120_details,R.string.galaxy_120_price),
            Winter(R.drawable.impresso_100,R.string.impresso_100_headline,R.string.impresso_100_details,R.string.impresso_100_price),
            Winter(R.drawable.lady_may,R.string.lady_may_headline,R.string.lady_may_details,R.string.lady_may_price),
            Winter(R.drawable.mount,R.string.mount_headline,R.string.mount_details,R.string.mount_price),
            Winter(R.drawable.sophia,R.string.sophia_headline,R.string.sophia_details,R.string.sophia_price),
            Winter(R.drawable.talia_control_100,R.string.talia_control_100_headline,R.string.talia_control_100_details,R.string.talia_control_100_price),
            Winter(R.drawable.terry_folk,R.string.terry_folk_headline,R.string.terry_folk_details,R.string.terry_folk_price),
            Winter(R.drawable.terry_knee_highs,R.string.terry_knee_highs_headline,R.string.terry_knee_highs_details,R.string.terry_knee_highs_price),
            Winter(R.drawable.terry_koala,R.string.terry_koala_headline,R.string.terry_koala_details,R.string.terry_koala_price),
            Winter(R.drawable.tonic_120,R.string.tonic_120_headline,R.string.tonic_120_details,R.string.tonic_120_price),
            Winter(R.drawable.warmy,R.string.warmy_headline,R.string.warmy_details,R.string.warmy_price),
            Winter(R.drawable.wool_knee_highs,R.string.wool_knee_highs_headline,R.string.wool_knee_highs_details,R.string.wool_knee_highs_price),
            Winter(R.drawable.terry_short_women_socks_1,R.string.terry_short_women_socks_1_headline,R.string.terry_short_women_socks_1_details,R.string.terry_short_women_socks_1_price),
            Winter(R.drawable.terry_short_women_socks_2,R.string.terry_short_women_socks_2_headline,R.string.terry_short_women_socks_2_details,R.string.terry_short_women_socks_2_price)
        )
    }
}