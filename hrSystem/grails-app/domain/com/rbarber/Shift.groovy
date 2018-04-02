package com.rbarber

class Shift {

String timeOfDay
String dayOfWeek
Integer numberOfHours
String startingTime

static hasMany=[task:Task,team:Team]
static belongsTo = [Team,Task,Employee]

String toString()
{
	return "$dayOfWeek : $timeOfDay"
}

    static constraints = {

timeOfDay blank: false, nullable:false
dayOfWeek blank: false, nullable:false
numberOfHours blank: false, nullable:false
startingTime blank: false, nullable:false
    }
}
