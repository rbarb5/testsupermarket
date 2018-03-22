package com.rbarber

class Team {

String teamName
Integer numberOfEmployees
String sectionName
String description

    static constraints = {

teamName blank: false, nullable:false
numberOfEmployees blank: false, nullable:false
sectionName blank: false, nullable:false
description blank: false, nullable:false, widget:'textarea'
    }
}
