package ua.com.panchoha.data

import ua.com.panchoha.R

class DatasourceButton() {
    fun loadButtons():ArrayList<Button>{
        return arrayListOf<Button>(
            Button(R.string.btTight),
            Button(R.string.btStockings),
            Button(R.string.btSocks),
            Button(R.string.btKids),
            Button(R.string.btMen),
            Button(R.string.btFall),
            Button(R.string.btWinter),
            Button(R.string.btThin),
            Button(R.string.btFashion),
            Button(R.string.btLocation),
            Button(R.string.btOrder)


        )
    }
}