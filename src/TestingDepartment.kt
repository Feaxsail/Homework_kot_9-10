class TestingDepartment : Department() {

    override val departmentName: String = "Отдел тестирования"

    override fun printDepartmentGoal() {
        println("Цель отдела '$departmentName': Находить и исправлять ошибки в программном обеспечении")
    }

    fun testApplication() {
        println("Тестировщики проверяют приложение на наличие багов...")
    }
}