package com.rbarber

class Shift {

String timeOfDay
String dayOfWeek
Integer numberOfHours
String startingTime

    static constraints = {

timeOfDay blank: false, nullable:false
dayOfWeek blank: false, nullable:false
numberOfHours blank: false, nullable:false
startingTime blank: false, nullable:false
    }
}
