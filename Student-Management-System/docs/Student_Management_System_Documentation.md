## Main
`com.airtripe.studentmanagement.Main` — Entry point. Creates sample data and demonstrates service usage.

## Services
- `StudentService` — add, fetch, list students. Throws `StudentNotFoundException` when absent.
- `CourseService` — add and list courses. Throws `CourseNotFoundException` when course not found.
- `EnrollmentService` — enroll students into courses and list enrollments.

## Entities
- `Person` (abstract) — base for `Student`.
- `Student` — id, name, age, department.
- `Course` — courseId, courseName, credits.
- `Enrollment` — student + course pairing & Grades.