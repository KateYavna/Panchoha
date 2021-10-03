package ua.com.panchoha.main

import ua.com.panchoha.fragments.*
import ua.com.panchoha.main.MainActivityContract

class MainActivityPresenter(val mainView: MainActivityContract.MainView): MainActivityContract.Presenter {
    override fun showTightsFragment() {
        val fragment = TightsFragment.newInstance()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }

    override fun showStockingsFragment() {
        val fragment = StockingsFragment.newInstance()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }

    override fun showSocksFragment() {
        val fragment = SocksFragment.newInstance()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }

    override fun showKidsFragment() {
         val fragment = KidsFragment.newInstance()
         mainView.setFragment(fragment)
         fragment.setPresenter(this)
     }
    override fun showMenFragment() {
        val fragment = MenFragment.newInstance()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }
    override fun showDemiFragment() {
        val fragment = DemiFragment.newInstance()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }
    override fun showWinterFragment() {
        val fragment = WinterFragment.newInstance()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }
    override fun showThinFragment() {
        val fragment = ThinFragment.newInstance()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }
    override fun showFashionFragment() {
        val fragment = FashionFragment.newInstance()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }

    override fun showContactsFragment() {
        val fragment = ContactsFragment.newInstance()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }

    override fun showOrderFragment() {
        val fragment = OrderFragment.newInstance()
        mainView.setFragment(fragment)
        fragment.setPresenter(this)
    }
}