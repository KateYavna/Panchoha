package ua.com.panchoha.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_demi.*
import kotlinx.android.synthetic.main.fragment_winter.*
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.adapters.DemiAdapter
import ua.com.panchoha.adapters.WinterAdapter
import ua.com.panchoha.data.DatasourceDemi
import ua.com.panchoha.data.DatasourceWinter
import ua.com.panchoha.main.MainActivityContract


class WinterFragment : Fragment(), MainActivityContract.WinterFragmentView, Callback {
    var presenterWinter : MainActivityContract.Presenter? = null
    val winter = DatasourceWinter().loadWinter()

    override fun setPresenter(presenter: MainActivityContract.Presenter) {
        this.presenterWinter = presenter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvWinter.adapter = WinterAdapter(requireContext(),winter,this)
        rvWinter.layoutManager = LinearLayoutManager (requireContext(), RecyclerView.HORIZONTAL,false)
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
        return inflater.inflate(R.layout.fragment_winter, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            WinterFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onItemSelected(index: Int) {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.flDetails, DetailsFragment.newInstance(winter[index].photo,winter[index].headline,winter[index].details,winter[index].price))
            .addToBackStack(null)
            .commit()
    }


}