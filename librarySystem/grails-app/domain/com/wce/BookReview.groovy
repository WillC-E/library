package com.wce

class BookReview {

	Book book
	Date created
	Student student
	String review

String toString(){
"$book"
}
static belongsTo = Book

    static constraints = {
	
	book blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false, maxSize:5000, widget:'textarea'
	created blank:false, nullable:false

    

    }
}
