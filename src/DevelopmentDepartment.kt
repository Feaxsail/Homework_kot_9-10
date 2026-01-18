class DevelopmentDepartment : Department(), ReportGenerator {
    override val departmentName: String = "Отдел разработки"

    private val teamSize: Int = 15
    private val mainTechnology: String = "Kotlin/Java"
    private val currentProjects: List<String> = listOf("EmployeeTracker", "GalaxyManager")

    override fun printDepartmentGoal() {
        println("Цель отдела '$departmentName': Создавать качественный программный код")
    }

    fun writeCode() {
        println("Разработчики пишут код...")
    }

    override fun generateReport(): String {
        return """
            |=========================================
            |        ОТЧЁТ ОБ ОТДЕЛЕ РАЗРАБОТКИ
            |=========================================
            | Название отдела:   $departmentName
            | Количество сотрудников: $teamSize
            | Основная технология: $mainTechnology
            | Цель отдела:       Создавать качественный программный код
            | Текущие проекты:   ${currentProjects.joinToString(", ")}
            |=========================================
            | Статус: Все проекты в разработке
            | Дата формирования: 2024-01-15
            |=========================================
        """.trimMargin()
    }
}