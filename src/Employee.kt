class Employee(
    private var fullName: String,
    private var position: String,
    private var salary: Int,
    private var yearsOfExperience: Int
) {

    fun getFullName(): String = fullName
    fun getPosition(): String = position
    fun getSalary(): Int = salary
    fun getYearsOfExperience(): Int = yearsOfExperience


    fun setSalary(newSalary: Int) {
        if (newSalary < 0) {
            println("Внимание: Зарплата не может быть отрицательной! Старое значение: $salary")
        } else {
            salary = newSalary
        }
    }


    fun setYearsOfExperience(newExperience: Int) {
        if (newExperience > 50) {
            println("Внимание: Опыт работы ограничен 50 годами! Установлено значение: 50")
            yearsOfExperience = 50
        } else if (newExperience < 0) {
            println("Внимание: Опыт работы не может быть отрицательным! Старое значение: $yearsOfExperience")
        } else {
            yearsOfExperience = newExperience
        }
    }


    fun printInfo() {
        println("""
            === Информация о сотруднике ===
            ФИО: $fullName
            Должность: $position
            Зарплата: $salary
            Опыт работы: $yearsOfExperience лет
        """.trimIndent())
    }
    fun printEmployeeInfo() {
        println("=== ИНФОРМАЦИЯ О СОТРУДНИКЕ ===")
        println("ФИО: $fullName")
        println("Должность: $position")
        println("Зарплата: $salary руб.")
        println("Опыт работы: $yearsOfExperience лет")
        println("=".repeat(30))
    }
}