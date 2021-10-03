package ua.com.panchoha.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_kids.*
import ua.com.panchoha.Callback
import ua.com.panchoha.main.MainActivityContract
import ua.com.panchoha.R
import ua.com.panchoha.adapters.KidsAdapter
import ua.com.panchoha.data.DatasourceKids


class KidsFragment : Fragment(), MainActivityContract.KidsFragmentView, Callback {
    var presenterKids : MainActivityContract.Presenter? = null
    val kids = DatasourceKids().loadKids()

    override fun setPresenter(presenter: MainActivityContract.Presenter) {
        this.presenterKids = presenter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvKids.adapter = KidsAdapter(requireContext(),kids,this)
        rvKids.layoutManager = LinearLayoutManager (requireContext(), RecyclerView.HORIZONTAL,false)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kids, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            KidsFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }


    override fun onItemSelected(index: Int) {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.flDetails, DetailsFragment.newInstance(kids[index].photo,kids[index].headline,kids[index].details,kids[index].price))
            .addToBackStack(null)
            .commit()
    }
}