package com.wce

class Librarian {

	String name
	String email
	String office
	String userName
	String password
	String telephone
	Library library

static belongsTo=Library

String toString(){
"$name"
}


    static constraints = {

	name blank:false, nullable:false
	email blank:false, nullable:false, email:true
	office blank:false, nullable:false
	userName blank:false, nullable:false, unique:true
	password blank:false, nullable:false
	telephone blank:false, nullable:false
	library blank:false, nullable:false

    
    }
}
