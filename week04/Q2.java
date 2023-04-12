// Implement the Student and Course class es based on the the following UML Class Diagram.

// Student
// - id: int
// - name: String
// - courses: Course[]
// + Student (id: int, name: String)
// + getId(): int
// + addCourse (course: Course): void
// + dropCourse (course: Course): void
// + toString():String

// Course
// - code: String
// - teacher: String
// + Course (code: String, teacher: String)
// + getCode():String
// + toString():String

// Your program shall produce the following output.

// Sample output 1: Courses and students are empty.
// Courses
// No. Code/Teacher
// -
// Students
// No. ID Name Course
// -
// Menu
// 1. Create a course
// 2. Create a student
// 3. A student adds a course
// 4. A student drops a course
// 0. Exit
// > 1
// Enter course code : TCP1101
// Enter teacher name: Tan
// ...

// Sample output 2: After creating 3 courses and 2 students.
// > 2
// Enter student id : 222
// Enter student name: Bob
// Courses
// No. Code/Teacher
// 1. TCP1101/Tan
// 2. TMA1101/Lim
// 3. TMA1201/Tong
// Students
// No. ID Name Course
// 1. 111 Ali []
// 2. 222 Bob []

// Sample output 3: After Ali added 3 courses and Bob added 1 course.
// > 3
// Enter student id : 111
// Enter course to add: TMA1201
// Courses
// No. Code/Teacher
// 1. TCP1101/Tan
// 2. TMA1101/Lim
// 3. TMA1201/Tong
// Students
// No. ID Name Course
// 1. 111 Ali [TCP1101/Tan, TMA1101/Lim, TMA1201/Tong]
// 2. 222 Bob [TMA1101/Lim,]
// Sample output 4: After Ali dropped 1 course.
// > 4
// Enter student id : 111
// Enter course to add: TCP1101
// Courses
// 3
// No. Code/Teacher
// 1. TCP1101/Tan
// 2. TMA1101/Lim
// 3. TMA1201/Tong
// Students
// No. ID Name Course
// 1. 111 Ali [TMA1101/Lim, TMA1201/Tong]
// 2. 222 Bob [TMA1101/Lim,]
