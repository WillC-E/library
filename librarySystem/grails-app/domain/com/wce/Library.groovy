package com.wce

class Library {
	
	String building
	String address
	String openingHours
	String location
	String studySpaces

static hasMany=[books:Book, librarians:Librarian, students:Student]
String toString(){
"$building"
}

    static constraints = {

	building blank:false, nullable:false
	address blank:false, nullable:false, maxSize:5000, widget:'textarea'
	openingHours blank:false, nullable:false
	location blank:false, nullable:false
	studySpaces blank:false, nullable:false

    
    }
    
}
