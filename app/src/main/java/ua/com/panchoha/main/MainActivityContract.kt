package ua.com.panchoha.main

import androidx.fragment.app.Fragment

class MainActivityContract {
    interface MainView{
        fun setFragment(fragment: Fragment)
    }
    interface TightsFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface StockingsFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface SocksFragmentView{
        fun setPresenter(presenter: Presenter)
    }
   interface KidsFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface MenFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface DemiFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface WinterFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface ThinFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface FashionFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface ContactsFragmentView{
        fun setPresenter(presenter: Presenter)
    }
    interface OrderFragmentView{
        fun setPresenter(presenter: Presenter)
    }



    interface Presenter{
        fun showTightsFragment()
        fun showStockingsFragment()
        fun showSocksFragment()
        fun showKidsFragment()
        fun showMenFragment()
        fun showDemiFragment()
        fun showWinterFragment()
        fun showThinFragment()
        fun showFashionFragment()
        fun showContactsFragment()
        fun showOrderFragment()

    }
}