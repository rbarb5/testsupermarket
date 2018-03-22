package com.rbarber

class Manager {

String fullName
String userName
String password
String managerEmail
String office
String department


    static constraints = {

fullName blank: false, nullable:false
userName blank: false, nullable:false
password blank: false, nullable:false
managerEmail blank: false, nullable:false, email:true
office blank: false, nullable:false
department blank: false, nullable:false
    }
}
