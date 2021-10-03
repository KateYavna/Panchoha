package ua.com.panchoha.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_demi.*
import kotlinx.android.synthetic.main.fragment_socks.*
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.adapters.DemiAdapter
import ua.com.panchoha.adapters.SocksAdapter
import ua.com.panchoha.data.DatasourceDemi
import ua.com.panchoha.data.DatasourceMen
import ua.com.panchoha.data.DatasourceSocks
import ua.com.panchoha.main.MainActivityContract


class DemiFragment : Fragment(), MainActivityContract.DemiFragmentView, Callback {
    var presenterDemi : MainActivityContract.Presenter? = null
    val demi = DatasourceDemi().loadDemi()

    override fun setPresenter(presenter: MainActivityContract.Presenter) {
        this.presenterDemi = presenter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvDemi.adapter = DemiAdapter(requireContext(),demi,this)
        rvDemi.layoutManager = LinearLayoutManager (requireContext(), RecyclerView.HORIZONTAL,false)
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
        return inflater.inflate(R.layout.fragment_demi, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            DemiFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }



    override fun onItemSelected(index: Int) {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.flDetails, DetailsFragment.newInstance(demi[index].photo,demi[index].headline,demi[index].details,demi[index].price))
            .addToBackStack(null)
            .commit()
    }
}