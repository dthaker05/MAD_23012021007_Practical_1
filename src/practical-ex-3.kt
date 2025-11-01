// Parent Class: Person
open class Person {
    var firstName: String
    var lastName: String
    var age: Int

    // Primary constructor
    constructor(firstName: String, lastName: String, age: Int) {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }

    // Secondary constructor
    constructor() {
        this.firstName = ""
        this.lastName = ""
        this.age = 0
    }
}

// Child Class: Student
class Student : Person {
    var enrollmentNo: String
    var branch: String
    var studentClass: String
    var labBatch: String

    // Primary constructor
    constructor(firstName: String, lastName: String, age: Int,
                enrollmentNo: String, branch: String, studentClass: String, labBatch: String) :
            super(firstName, lastName, age) {
        this.enrollmentNo = enrollmentNo
        this.branch = branch
        this.studentClass = studentClass
        this.labBatch = labBatch
    }

    // Secondary constructor
    constructor() : super() {
        this.enrollmentNo = ""
        this.branch = ""
        this.studentClass = ""
        this.labBatch = ""
    }

    fun displayInfo() {
        println("First Name: $firstName")
        println("Last Name: $lastName")
        println("Age: $age")
        println("Enrollment No: $enrollmentNo")
        println("Branch: $branch")
        println("Class: $studentClass")
        println("Lab Batch: $labBatch")
        println("-------------------------")
    }
}

fun main() {
    val students = ArrayList<Student>()

    students.add(Student("Rahul", "Sharma", 20, "23012011001", "CE", "4A", "B1"))
    students.add(Student("Priya", "Patel", 21, "23012011002", "IT", "4B", "B2"))
    students.add(Student("Amit", "Verma", 19, "23012011003", "CE", "4A", "B1"))
    students.add(Student("Sneha", "Mehta", 22, "23012011004", "ME", "4C", "B3"))
    students.add(Student("Karan", "Rathod", 20, "23012011005", "EC", "4D", "B4"))

    for (student in students) {
        student.displayInfo()
    }
}
