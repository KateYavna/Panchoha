package ua.com.panchoha.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_demi.*
import kotlinx.android.synthetic.main.fragment_fashion.*
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.adapters.DemiAdapter
import ua.com.panchoha.adapters.FashionAdapter
import ua.com.panchoha.data.DatasourceDemi
import ua.com.panchoha.data.DatasourceFashion
import ua.com.panchoha.main.MainActivityContract


class FashionFragment : Fragment(), MainActivityContract.FashionFragmentView, Callback {
    var presenterFashion : MainActivityContract.Presenter? = null
    val fashion = DatasourceFashion().loadFashion()

    override fun setPresenter(presenter: MainActivityContract.Presenter) {
        this.presenterFashion = presenter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvFashion.adapter = FashionAdapter(requireContext(),fashion,this)
        rvFashion.layoutManager = LinearLayoutManager (requireContext(), RecyclerView.HORIZONTAL,false)
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
        return inflater.inflate(R.layout.fragment_fashion, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            FashionFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onItemSelected(index: Int) {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.flDetails, DetailsFragment.newInstance(fashion[index].photo,fashion[index].headline,fashion[index].details,fashion[index].price))
            .addToBackStack(null)
            .commit()
    }


}