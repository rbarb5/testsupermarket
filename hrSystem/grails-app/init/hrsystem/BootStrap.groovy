package hrsystem

class BootStrap {

    def init = { servletContext ->


def man1 = new com.rbarber.Manager(
	fullName: 'Graham Tighe',
	userName: 'GT123',
	password: 'passwordlol',
	managerEmail: 'gtighe@hrsystem.com',
	office: 'Big office',
	department: 'IT').save(failOnError:true)

def man2 = new com.rbarber.Manager(
	fullName: 'Rose Taylor',
	userName: 'RT123',
	password: 'passwordlol',
	managerEmail: 'rtaylor@hrsystem.com',
	office: 'Big office',
	department: 'HR').save(failOnError:true)

def shi1 = new com.rbarber.Shift(
	timeOfDay: '9AM',
	dayOfWeek: 'Saturday',
	numberOfHours: 7,
	startingTime: '7AM').save(failOnError:true)

def shi2 = new com.rbarber.Shift(
	timeOfDay: '12AM',
	dayOfWeek: 'Friday',
	numberOfHours: 6,
	startingTime: '4AM').save(failOnError:true)

def tas1 = new com.rbarber.Task(
	taskName: 'Payroll',
	numberOfPeople: 4,
	sectionName: 'Billing',
	department: 'Accounting',
	timeRequired: '2 Days',
	description: 'Pay the staff',
	taskCompleted: true).save(failOnError:true)

def tas2 = new com.rbarber.Task(
	taskName: 'Meeting',
	numberOfPeople: 4,
	sectionName: 'HR',
	department: 'HR',
	timeRequired: '1 Hour',
	description: 'Call a meeting',
	taskCompleted: true).save(failOnError:true)

def tea1 = new com.rbarber.Team(
	teamName: 'Accounting',
	numberOfEmployees: 4,
	sectionName: 'Accounts Department',
	description: 'This is the accounting department',
	manager:man1,
	team:tea1).save(failOnError:true)

def tea2= new com.rbarber.Team(
	teamName: 'Gardening',
	numberOfEmployees: 4,
	sectionName: 'Gardening Department',
	description: 'This is the gardening department',
	manager:man2,
	team:tea2).save(failOnError:true)

def lea1 = new com.rbarber.TeamLeader(
	fullName: 'Jack Hopkinson',
	department: 'Accounting',
	employeeID: 'JH456',
	sectionName: 'Accounts Department',
	officePhone: '07935765765',
	leaderEmail: 'JH456@hrsystem.com',
	password: 'passwordagainlol').save(failOnError:true)

def lea2= new com.rbarber.TeamLeader(
	fullName: 'Terry Reed',
	department: 'IT',
	employeeID: 'TR456',
	sectionName: 'IT Suport',
	officePhone: '07935765555',
	leaderEmail: 'TR@hrsystem.com',
	password: 'passwordagainlol').save(failOnError:true)

def emp1 =new com.rbarber.Employee (
	fullName: 'Jack Smith',
	dateOfBirth: new Date('18/10/1986'),
	residence: 'Chesterfield',
	hourlyRate: 9.55,
	employeeID: 'JS86',
	dateEmployed: new Date('12/04/2016'),
	taxCode: '1185L',
	contract: 'Full',
	manager:man2,
	teamleader:lea1,
	shift:[shi1,shi2],
	task: tas1).save(failOnError:true)

def emp2 =new com.rbarber.Employee (
	fullName: 'Emma Jones',
	dateOfBirth: new Date('12/10/1988'),
	residence: 'Manchester',
	hourlyRate: 9.55,
	employeeID: 'JS87',
	dateEmployed: new Date('12/08/2017'),
	taxCode: '1185L',
	contract: 'Full',
	manager:man2,
	teamleader:lea2,
	shift:[shi1,shi2],
	task: tas2).save(failOnError:true)

emp1.addToTeam(tea1)
emp2.addToTeam(tea2)

tas1.addToTeam(tea1)
tas2.addToTeam(tea2)

tas1.addToShift(shi1)
tas1.addToShift(shi2)
tas2.addToShift(shi1)
tas2.addToShift(shi2)
tas1.addToEmployee(emp1)
tas2.addToEmployee(emp2)
tea1.addToShift(shi1)
tea2.addToShift(shi2)
tea1.addToShift(shi2)
tea2.addToShift(shi1)




    }
    def destroy = {
    }
}
