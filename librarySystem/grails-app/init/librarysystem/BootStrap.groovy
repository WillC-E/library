package com.wce

class BootStrap {

    def init = { servletContext ->

	/* def AdSet=new Library(
	building:'Addsetts Library',
	address:'123 road name',
	openingHours:'10am',
	location:'Hallam main',
	studySpaces:'456',
	).save()

	def Col=new Library(
	building:'Coligate Library',
	address:'123 road name',
	openingHours:'10am',
	location:'Hallam main',
	studySpaces:'456',
	).save()

	def comp=new Course(
	title:'Computing',
	code:'COMP1',
	leader:'Bob F.',
	department:'IT',
	description:'The basic comptuing course',
	studyMode:'None'
	).save()

	def media=new Course(
	title:'Media',
	code:'MED2',
	leader:'Bob F.',
	department:'IT',
	description:'media',
	studyMode:'full on bs'
	).save()

	def wCE=new Student(
	name:'will',
	email:'will@gmail.com',
	userName:'w.ce',
	password:'password',
	studentID:'b5020855',
	course:comp,
	).save()
 
	def lS=new Student(
	name:'Laura',
	email:'sdfsdf@gmail.com',
	userName:'l.lk',
	password:'password',
	studentID:'b456123',
	course:media,
	).save()


	def pDid=new Librarian(
	name:'bob',
	email:'gjjgdgg@h.com',
	office:'10',
	userName:'heklk',
	password:'456354',
	telephone:'123456',
	library:AdSet
	).save()

	def gHef=new Librarian(
	name:'fgfg',
	email:'gjjgg@h.com',
	office:'104',
	userName:'hekfflk',
	password:'4563fg54',
	telephone:'12345ff6',
	library:Col
	).save()

	def GW=new Book(
	title:'Gateway',
	subject:'SciFi',
	author:'Me',
	isbn:'123456789',
	dateBorrowed:new Date('15/05/2019'),
	returnDate:new Date('15/05/2019'),
	student:wCE,
	overdue:false,
	library:AdSet
	).save()

	def MHM=new Book(
	title:'The moon is a harsh mistress',
	subject:'SciFi',
	author:'Me',
	isbn:'6575677',
	dateBorrowed:new Date('15/05/2019'),
	returnDate:new Date('15/05/2019'),
	student:lS,
	overdue:false,
	library:Col
	).save()

	def rev1 =new BookReview(
	book:GW,
	created:new Date('15/05/2019'),
	student:wCE,
	review:'Hallam main'
	).save()

	def rev2 =new BookReview(
	book:MHM,
	created:new Date('15/05/2019'),
	student:lS,
	review:'Hallam main'
	).save() 

	

	AdSet.addToStudents(wCE)
	
	Col.addToStudents(lS)*/

    }
    def destroy = {
    }
}
