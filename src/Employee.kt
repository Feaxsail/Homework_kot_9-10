class Employee(
    fullName: String,
    position: String,
    salary: Int,
    yearsOfExperience: Int
) : ReportGenerator {


    private var fullName: String = fullName
    private var position: String = position
    private var salary: Int = salary
    private var yearsOfExperience: Int = yearsOfExperience


    var currentTask: Task? = null


    fun getFullName(): String = fullName
    fun getPosition(): String = position
    fun getSalary(): Int = salary
    fun getYearsOfExperience(): Int = yearsOfExperience


    fun setSalary(newSalary: Int) {
        if (newSalary < 0) {
            println("ПРЕДУПРЕЖДЕНИЕ: Зарплата не может быть отрицательной! Оставлено значение: $salary")
        } else {
            salary = newSalary
        }
    }


    fun setYearsOfExperience(newExperience: Int) {
        when {
            newExperience > 50 -> {
                println("ПРЕДУПРЕЖДЕНИЕ: Опыт работы ограничен 50 годами! Установлено значение: 50")
                yearsOfExperience = 50
            }
            newExperience < 0 -> {
                println("ПРЕДУПРЕЖДЕНИЕ: Опыт работы не может быть отрицательным! Оставлено значение: $yearsOfExperience")
            }
            else -> {
                yearsOfExperience = newExperience
            }
        }
    }


    fun printEmployeeInfo() {
        println("=== ИНФОРМАЦИЯ О СОТРУДНИКЕ ===")
        println("ФИО: $fullName")
        println("Должность: $position")
        println("Зарплата: $salary руб.")
        println("Опыт работы: $yearsOfExperience лет")
        println("=".repeat(30))
    }


    fun assignTask(newTask: Task) {
        if (currentTask != null && currentTask?.isCompleted == false) {
            println("Сотрудник уже занят задачей: ${currentTask?.title}")
        } else {
            currentTask = newTask
            println("Сотруднику назначена новая задача: ${newTask.title}")
        }
    }


    override fun generateReport(): String {
        return """
            |=========================================
            |             ОТЧЁТ О СОТРУДНИКЕ
            |=========================================
            | ФИО:            $fullName
            | Должность:      $position
            | Зарплата:       $salary руб.
            | Опыт работы:    $yearsOfExperience лет
            | Текущая задача: ${currentTask?.title ?: "Нет задачи"}
            |=========================================
            | Сотрудник активен и выполняет свои обязанности.
            | Дата формирования: 2024-01-15
            |=========================================
        """.trimMargin()
    }
}