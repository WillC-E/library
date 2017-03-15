package com.wce

class Book {

	String title
	String subject
	String author
	String isbn
	Date dateBorrowed
	Date returnDate
	String student
	Boolean overdue

    static constraints = {

	title blank:false, nullable:false
	subject blank:false, nullable:false
	author blank:false, nullable:false
	isbn blank:false, nullable:false, unique:true
	dateBorrowed blank:false, nullable:false
	returnDate blank:false, nullable:false
	student blank:false, nullable:false
	description blank:false, nullable:false, maxSize:5000, widget:'textarea'
	tuitionFees blank:false, nullable:false,  scale:2
    }
}
