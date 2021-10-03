package ua.com.panchoha.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_demi.*
import kotlinx.android.synthetic.main.fragment_thin.*
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.adapters.DemiAdapter
import ua.com.panchoha.adapters.ThinAdapter

import ua.com.panchoha.data.DatasourceThin
import ua.com.panchoha.main.MainActivityContract


class ThinFragment : Fragment(), MainActivityContract.ThinFragmentView, Callback {
    var presenterThin : MainActivityContract.Presenter? = null
    val thin = DatasourceThin().loadThin()

    override fun setPresenter(presenter: MainActivityContract.Presenter) {
        this.presenterThin = presenter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvThin.adapter = ThinAdapter(requireContext(),thin,this)
        rvThin.layoutManager = LinearLayoutManager (requireContext(), RecyclerView.HORIZONTAL,false)
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
        return inflater.inflate(R.layout.fragment_thin, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            ThinFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onItemSelected(index: Int) {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.flDetails, DetailsFragment.newInstance(thin[index].photo,thin[index].headline,thin[index].details,thin[index].price))
            .addToBackStack(null)
            .commit()
    }


}