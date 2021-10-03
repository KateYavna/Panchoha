package ua.com.panchoha.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_men.*
import ua.com.panchoha.Callback
import ua.com.panchoha.main.MainActivityContract
import ua.com.panchoha.R
import ua.com.panchoha.adapters.MenAdapter
import ua.com.panchoha.data.DatasourceMen


class MenFragment : Fragment(), MainActivityContract.MenFragmentView, Callback {
   var presenterMen : MainActivityContract.Presenter? = null
    val men = DatasourceMen().loadMen()

    override fun setPresenter(presenter: MainActivityContract.Presenter) {
        this.presenterMen = presenter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvMen.adapter = MenAdapter(requireContext(),men, this)
        rvMen.layoutManager = LinearLayoutManager (requireContext(), RecyclerView.HORIZONTAL,false)
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
        return inflater.inflate(R.layout.fragment_men, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            MenFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onItemSelected(index: Int) {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.flDetails, DetailsFragment.newInstance(men[index].photo,men[index].headline,men[index].details,men[index].price))
            .addToBackStack(null)
            .commit()
    }


}