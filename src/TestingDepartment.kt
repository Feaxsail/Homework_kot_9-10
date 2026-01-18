
class TestingDepartment : Department(), ReportGenerator {
    override val departmentName: String = "Отдел тестирования"

    private val testersCount: Int = 8
    private val testingMethods: List<String> = listOf("Unit-тесты", "Интеграционные тесты", "UI-тесты")
    private val bugCountThisMonth: Int = 47
    private val resolvedBugCount: Int = 42

    override fun printDepartmentGoal() {
        println("Цель отдела '$departmentName': Находить и исправлять ошибки в программном обеспечении")
    }

    fun testApplication() {
        println("Тестировщики проверяют приложение на наличие багов...")
    }

    override fun generateReport(): String {
        return """
            |=========================================
            |      ОТЧЁТ ОБ ОТДЕЛЕ ТЕСТИРОВАНИЯ
            |=========================================
            | Название отдела:   $departmentName
            | Количество тестировщиков: $testersCount
            | Методы тестирования: ${testingMethods.joinToString(", ")}
            | Цель отдела:       Находить и исправлять ошибки в ПО
            | Статистика за месяц:
            |   - Найдено багов:    $bugCountThisMonth
            |   - Исправлено багов: $resolvedBugCount
            |   - Эффективность:    ${"%.1f".format(resolvedBugCount.toDouble() / bugCountThisMonth * 100)}%
            |=========================================
            | Рекомендация: Увеличить покрытие тестами
            | Дата формирования: 2024-01-15
            |=========================================
        """.trimMargin()
    }
}