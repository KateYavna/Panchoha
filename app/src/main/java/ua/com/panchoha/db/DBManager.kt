package ua.com.panchoha.db

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class DBManager(val callBack: CommentsCallBack): ExternalDB {
    private val database = FirebaseDatabase.getInstance()

    override fun addComment(comment: String) {

       val reference = database.getReference("db").child("comments")
        val messageID = reference.push().key
        if (messageID != null) reference.child(messageID).setValue(comment)
    }

    override fun getAllComments(): ArrayList<String> {
        val comments = ArrayList<String>()
        val reference = database.getReference("db").child("comments")
        reference.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                comments.clear()
                for (item in snapshot.children){
                    val value: String? = item.getValue(String::class.java)
                    if (value != null) comments.add(value)
                }
                callBack.onAllComments(comments)
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
        return comments
    }
}
interface CommentsCallBack{
    fun onAllComments(comments :ArrayList<String>)
}