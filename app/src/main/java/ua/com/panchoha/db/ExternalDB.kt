package ua.com.panchoha.db

interface ExternalDB {
    fun addComment(comment: String)
    fun getAllComments(): ArrayList<String>
    fun addOrder (order:String)
}