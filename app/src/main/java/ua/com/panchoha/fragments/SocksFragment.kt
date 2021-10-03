package ua.com.panchoha.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_socks.*
import ua.com.panchoha.Callback
import ua.com.panchoha.main.MainActivityContract
import ua.com.panchoha.R
import ua.com.panchoha.adapters.SocksAdapter
import ua.com.panchoha.data.DatasourceSocks




class SocksFragment : Fragment(), MainActivityContract.SocksFragmentView, Callback {


    var presenterSocks : MainActivityContract.Presenter? = null
    val socks = DatasourceSocks().loadSocks()

    override fun setPresenter(presenter: MainActivityContract.Presenter) {
        this.presenterSocks = presenter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        rvSocks.adapter = SocksAdapter(requireContext(),socks,this)
        rvSocks.layoutManager = LinearLayoutManager (requireContext(), RecyclerView.HORIZONTAL,false)
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
        return inflater.inflate(R.layout.fragment_socks, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            SocksFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onItemSelected(index: Int) {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.flDetails, DetailsFragment.newInstance(socks[index].photo,socks[index].headline,socks[index].details,socks[index].price))
            .addToBackStack(null)
            .commit()
    }


}