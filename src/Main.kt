fun main() {
    println("=== Тестирование класса Employee ===\n")


    val employee = Employee(
        fullName = "Щербаков Данил Николаевич",
        position = "Дотер",
        salary = 75000,
        yearsOfExperience = 5
    )


    employee.printInfo()

    println("\n=== Тестирование сеттеров ===\n")

    println("1. Попытка установить зарплату: -5000")
    employee.setSalary(-5000)
    println("Текущая зарплата: ${employee.getSalary()}")

    println("\n2. Установка зарплаты: 80000")
    employee.setSalary(80000)
    println("Текущая зарплата: ${employee.getSalary()}")

    println("\n3. Попытка установить опыт работы: 60 лет")
    employee.setYearsOfExperience(60)
    println("Текущий опыт: ${employee.getYearsOfExperience()} лет")

    println("\n4. Попытка установить опыт работы: -3 года")
    employee.setYearsOfExperience(-3)
    println("Текущий опыт: ${employee.getYearsOfExperience()} лет")

    println("\n5. Установка опыта работы: 7 лет")
    employee.setYearsOfExperience(7)
    println("Текущий опыт: ${employee.getYearsOfExperience()} лет")

    println("\n=== Финальная информация о сотруднике ===")
    employee.printInfo()
}