package ua.com.panchoha.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_comments.*
import ua.com.panchoha.R
import ua.com.panchoha.adapters.CommentsAdapter
import ua.com.panchoha.db.CommentsCallBack
import ua.com.panchoha.db.DBManager
import ua.com.panchoha.main.MainActivityContract


class CommentsFragment : Fragment(), MainActivityContract.CommentsFragmentView, CommentsCallBack {
    var presenterComments : MainActivityContract.Presenter? = null
    val dbManager = DBManager(this)

    override fun setPresenter(presenter: MainActivityContract.Presenter) {
        this.presenterComments = presenter
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ibtSendComment.setOnClickListener {
            dbManager.addComment(etComment.text.toString())
            etComment.text.clear()}
            dbManager.getAllComments()

    }

    override fun onAllComments(comments: ArrayList<String>) {
        rvComments.adapter = CommentsAdapter(requireContext(),comments)
        rvComments.layoutManager = LinearLayoutManager(requireContext())
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
        return inflater.inflate(R.layout.fragment_comments, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            CommentsFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }




}