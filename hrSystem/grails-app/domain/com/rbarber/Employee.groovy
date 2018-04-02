package com.rbarber

class Employee {

String fullName
Date dateOfBirth
String residence
Float hourlyRate
String employeeID
Date dateEmployed
String taxCode
String contract

Manager manager
TeamLeader teamleader
Shift shift

static belongsTo=[Team,Task]
static hasMany=[task:Task,team:Team]


String toString()
{
	return "$employeeID - $fullName"
}

    static constraints = {

fullName blank:false, nullable:false
dateOfBirth blank:false, nullable:false
residence blank:false, nullable:false
hourlyRate blank:false, nullable:false
employeeID blank:false, nullable:false, unique:true
dateEmployed blank:false, nullable:false
taxCode blank:false, nullable:false
contract blank:false, nullable:false


    }
}
