package com.rbarber

class Task {

String taskName
Integer numberOfPeople
String sectionName
String department
String timeRequired
String description
Boolean taskCompleted

static hasMany = [employee:Employee, shift:Shift, team:Team]
static belongsTo = [Employee, Team, Shift]

String toString()
{
	return "$department - $taskName"
}

    static constraints = {

taskName blank: false, nullable:false
numberOfPeople blank: false, nullable:false
sectionName blank: false, nullable:false
department blank: false, nullable:false
timeRequired blank: false, nullable:false
description blank: false, nullable:false
taskCompleted blank: false, nullable:false
    }
}
