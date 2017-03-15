package com.wce

class Library {
	
	String name/building
	String address
	String openingHours
	String location
	String studySpaces

    static constraints = {

	name/building blank:false, nullable:false
	address blank:false, nullable:false, maxSize:5000, widget:'textarea'
	openingHours blank:false, nullable:false
	Location blank:false, nullable:false
	studySpaces blank:false, nullable:false

    
    }
    
}
