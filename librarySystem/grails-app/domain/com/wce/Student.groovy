package com.wce

class Student {

	String name
	String email
	String userName
	String password
	String studentID
	Course course

static hasMany=[bookReviews:BookReview, books:Book]


String toString(){
"$studentID"
}

    static constraints = {

	name blank:false, nullable:false
	studentID blank:false, nullable:false
	email blank:false, nullable:false, email:true
	userName blank:false, nullable:false, unique:true
	password blank:false, nullable:false
	course blank:false, nullable:false

    }
}
