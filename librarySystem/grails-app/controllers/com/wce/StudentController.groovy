package com.wce

class StudentController {

	def scaffold = Student

	def showStudentPage() {
		render view:'studentPage'
	}

	def advSearch(){
	}

	def advResults(){
		def studentProps = Student.metaClass.properties*.name
		def students = Student.withCriteria {
			"${params.queryType}"{
				params.each{field,value->
					if (studentProps.grep(field)&& value){
						ilike(field, value)
					}
			}
		}
	}
[students:students]
}


	def login(){
	}
	
	def validate(){

		def user=Student.findByUserName(params.username)

			if(user && user.password == params.password){
				session.user = user
				render view:'home'
			}
	
			else{
				flash.message="invalid username and password"
				render view:'login'
			}
	}

	def logout={
		session.user=null
		redirect(url:'/')
	}
} 

