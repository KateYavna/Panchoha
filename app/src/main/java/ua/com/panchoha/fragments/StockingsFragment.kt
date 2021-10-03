package ua.com.panchoha.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_stockings.*
import ua.com.panchoha.Callback
import ua.com.panchoha.main.MainActivityContract
import ua.com.panchoha.R
import ua.com.panchoha.adapters.StockingsAdapter
import ua.com.panchoha.data.DatasourceStockings



class StockingsFragment : Fragment(), MainActivityContract.StockingsFragmentView, Callback {

    var presenterStockings : MainActivityContract.Presenter? = null
    val stockings = DatasourceStockings().loadStockings()

    override fun setPresenter(presenter: MainActivityContract.Presenter) {
        this.presenterStockings = presenter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvStockings.adapter = StockingsAdapter(requireContext(),stockings,this)
        rvStockings.layoutManager = LinearLayoutManager (requireContext(),
            RecyclerView.HORIZONTAL,false)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stockings, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            StockingsFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onItemSelected(index: Int) {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.flDetails, DetailsFragment.newInstance(stockings[index].photo,stockings[index].headline,stockings[index].details,stockings[index].price))
            .addToBackStack(null)
            .commit()
    }


}