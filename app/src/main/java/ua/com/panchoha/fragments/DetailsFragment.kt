package ua.com.panchoha.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_details.*
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.main.MainActivityContract
import kotlin.Int.Companion


private const val ARG_PARAM1 = "photo"
private const val ARG_PARAM2 = "headline"
private const val ARG_PARAM3 = "details"
private const val ARG_PARAM4 = "price"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailsFragment : Fragment(), MainActivityContract.DetailsFragmentView {

    private var photo: Int? = null
    private var headline: Int? = null
    private var details: Int? = null
    private var price: Int? = null

    var presenterDetails : MainActivityContract.Presenter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            photo = it.getInt(ARG_PARAM1)
            headline = it.getInt(ARG_PARAM2)
            details = it.getInt(ARG_PARAM3)
            price = it.getInt(ARG_PARAM4)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        photo?.let { ivPhotoDetails.setImageResource(it) }
        tvHeadlineDetails.text = headline?.let { context?.resources?.getString(it) }
        tvDetailsDetails.text = details?.let {context?.resources?.getString(it)}
        tvPriceDetails.text = price?.let { context?.resources?.getString(it) }
        btOrder.setOnClickListener {
           presenterDetails?.showOrderFragment()
        }
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DetailsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(photo: Int, headline: Int, details: Int, price :Int) =
            DetailsFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PARAM1, photo)
                    putInt(ARG_PARAM2, headline)
                    putInt(ARG_PARAM3, details)
                    putInt(ARG_PARAM4, price)
                }
            }
    }

    override fun setPresenter(presenter: MainActivityContract.Presenter) {
        this.presenterDetails = presenter

    }


}