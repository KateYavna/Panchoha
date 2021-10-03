package ua.com.panchoha.data

import ua.com.panchoha.R

class DatasourceFashion() {
    fun loadFashion():ArrayList<Fashion>{
        return arrayListOf<Fashion>(
            Fashion(R.drawable.amalia_1,R.string.amalia_1_headline,R.string.amalia_1_details,R.string.amalia_1_price),
            Fashion(R.drawable.amalia_11,R.string.amalia_11_headline,R.string.amalia_11_details,R.string.amalia_11_price),
            Fashion(R.drawable.amalia_rete_2,R.string.amalia_rete_2_headline,R.string.amalia_rete_2_details,R.string.amalia_rete_2_price),
            Fashion(R.drawable.autograph,R.string.autograph_headline,R.string.autograph_details,R.string.autograph_price),
            Fashion(R.drawable.chic,R.string.chic_headline,R.string.chic_details,R.string.chic_price),
            Fashion(R.drawable.flirt,R.string.flirt_headline,R.string.flirt_details,R.string.flirt_price),
            Fashion(R.drawable.headline,R.string.headline_headline,R.string.headline_details,R.string.headline_price),
            Fashion(R.drawable.milena,R.string.milena_headline,R.string.milena_details,R.string.milena_price),
            Fashion(R.drawable.rete_vision_chic,R.string.rete_vision_chic_headline,R.string.rete_vision_chic_details,R.string.rete_vision_chic_price),
            Fashion(R.drawable.saty_rete_2,R.string.saty_rete_2_headline,R.string.saty_rete_2_details,R.string.saty_rete_2_price),
            Fashion(R.drawable.sophia,R.string.sophia_headline,R.string.sophia_details,R.string.sophia_price),
            Fashion(R.drawable.ticker,R.string.ticker_headline,R.string.ticker_details,R.string.ticker_price)
        )
    }
}