package ua.com.panchoha.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_tights.*
import ua.com.panchoha.Callback
import ua.com.panchoha.main.MainActivityContract
import ua.com.panchoha.R
import ua.com.panchoha.TightsAdapter
import ua.com.panchoha.data.DatasourceTights



class TightsFragment : Fragment(), MainActivityContract.TightsFragmentView, Callback {
    var presenterTights : MainActivityContract.Presenter? = null
    var tights = DatasourceTights().loadTights()



    override fun setPresenter(presenter: MainActivityContract.Presenter) {
        this.presenterTights = presenter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        rvTights.adapter = TightsAdapter(requireContext(),tights, this)
        rvTights.layoutManager = LinearLayoutManager (requireContext(),RecyclerView.HORIZONTAL,false)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tights, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            TightsFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }

    override fun onItemSelected(index: Int) {
            requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.flDetails, DetailsFragment.newInstance(tights[index].photo,tights[index].headline,tights[index].details,tights[index].price))
                .addToBackStack(null)
            .commit()
    }

     }
