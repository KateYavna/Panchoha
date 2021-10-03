package ua.com.panchoha.main

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_order.*
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.adapters.ButtonsAdapter
import ua.com.panchoha.data.DatasourceButton

class MainActivity : AppCompatActivity(), MainActivityContract.MainView, Callback {
    val presenter = MainActivityPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var buttons = DatasourceButton().loadButtons()

        rvButtons.adapter = ButtonsAdapter(this,buttons,this)
        rvButtons.layoutManager = LinearLayoutManager (this, RecyclerView.HORIZONTAL,false)


    }

    override fun setFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flFragment, fragment)
            .commit()
    }
    fun setHelloInvisible(){
        ivHello.visibility = View.INVISIBLE
        tvHello.visibility = View.INVISIBLE
    }

    override fun onItemSelected(index: Int) {
        if (index == 0) { presenter.showTightsFragment()
            setHelloInvisible()}
        else if (index == 1) {presenter.showStockingsFragment()
            setHelloInvisible()}
        else if (index == 2){presenter.showSocksFragment()
            setHelloInvisible()}
        else if (index == 3) {presenter.showKidsFragment()
            setHelloInvisible()}
        else if (index == 4) {presenter.showMenFragment()
            setHelloInvisible()}
        else if (index == 5){presenter.showDemiFragment()
            setHelloInvisible()}
        else if (index == 6){presenter.showWinterFragment()
            setHelloInvisible()}
        else if (index == 7){presenter.showThinFragment()
            setHelloInvisible()}
        else if (index == 8) {presenter.showFashionFragment()
            setHelloInvisible()}
        else if (index == 9){presenter.showContactsFragment()
            setHelloInvisible()}
        else {presenter.showOrderFragment()
            setHelloInvisible()}
        }}