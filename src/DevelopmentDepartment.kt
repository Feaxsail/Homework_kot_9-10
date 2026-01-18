class DevelopmentDepartment : Department() {

    override val departmentName: String = "Отдел разработки"

    override fun printDepartmentGoal() {
        println("Цель отдела '$departmentName': Создавать качественный программный код")
    }

    fun writeCode() {
        println("Разработчики пишут код...")
    }
}