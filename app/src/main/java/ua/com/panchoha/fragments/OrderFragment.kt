package ua.com.panchoha.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_order.*
import ua.com.panchoha.R
import ua.com.panchoha.main.MainActivityContract


class OrderFragment : Fragment(), MainActivityContract.OrderFragmentView {
    var presenterOrder : MainActivityContract.Presenter? = null

    override fun setPresenter(presenter: MainActivityContract.Presenter) {
        this.presenterOrder = presenter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            etName.requestFocus()
        ibtName.setOnClickListener {
            etSize.requestFocus()
            ibtName.visibility = View.INVISIBLE
            ibtSize.visibility = View.VISIBLE}
        ibtSize.setOnClickListener {
            etColor.requestFocus()
            ibtSize.visibility = View.INVISIBLE
            ibtColor.visibility = View.VISIBLE }
        ibtColor.setOnClickListener {
            etNumber.requestFocus()
            ibtColor.visibility = View.INVISIBLE
            ibtNumber.visibility = View.VISIBLE }
        ibtNumber.setOnClickListener {
            etPhone.requestFocus()
            ibtNumber.visibility = View.INVISIBLE
            ibtPhone.visibility = View.VISIBLE }
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
        return inflater.inflate(R.layout.fragment_order, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            OrderFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }


}