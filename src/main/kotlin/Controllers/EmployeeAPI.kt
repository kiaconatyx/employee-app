package Controllers

import ie.setu.Employee

var lastId = 0

internal fun getId(): Int {
    return lastId++
}


class EmployeeAPI {

    private val employees = ArrayList<Employee>()

    //list all employees
    fun findAll(): List<Employee> {
        return employees
    }

//list one employee
    fun findOne(id: Int): Employee? {
        return employees.find { p -> p.employeeID == id }
    }

    //remove an employee based on id
fun deleteEmp(empid:Int){
    employees.remove(findOne(empid))
}

    //update employee (not working)
    fun updateEmpSalary(empid:Int){
        employees.update(findOne(empid))
    }

    //add a new employee
    fun create(employee: Employee) {
        employee.employeeID = getId()
        employees.add(employee)
    }

}