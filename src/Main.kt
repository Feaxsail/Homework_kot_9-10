// ========== ФУНКЦИИ ДЛЯ ЗАДАНИЯ 2 ==========
fun testEmployeeClass() {
    println("=== ЗАДАНИЕ 2: Тестирование класса Employee ===\n")

    val employee = Employee(
        fullName = "Щербаков Данил Николаевич",
        position = "Старший Дотер по пуджу",
        salary = 120000,
        yearsOfExperience = 8
    )

    println("1. Начальная информация:")
    employee.printEmployeeInfo()

    println("\n2. Тестирование сеттера зарплаты:")
    println("Попытка установить зарплату: -5000")
    employee.setSalary(-5000)
    println("Текущая зарплата: ${employee.getSalary()}")

    println("\nПопытка установить зарплату: 150000")
    employee.setSalary(150000)
    println("Текущая зарплата: ${employee.getSalary()}")

    println("\n3. Тестирование сеттера опыта работы:")
    println("Попытка установить опыт: 60 лет")
    employee.setYearsOfExperience(60)
    println("Текущий опыт: ${employee.getYearsOfExperience()} лет")

    println("\nПопытка установить опыт: -5 лет")
    employee.setYearsOfExperience(-5)
    println("Текущий опыт: ${employee.getYearsOfExperience()} лет")

    println("\nПопытка установить опыт: 12 лет")
    employee.setYearsOfExperience(12)
    println("Текущий опыт: ${employee.getYearsOfExperience()} лет")

    println("\n4. Финальная информация о сотруднике:")
    employee.printEmployeeInfo()

    println("\n5. Демонстрация работы геттеров:")
    println("ФИО: ${employee.getFullName()}")
    println("Должность: ${employee.getPosition()}")
    println("Зарплата: ${employee.getSalary()}")
    println("Опыт: ${employee.getYearsOfExperience()} лет")

    println("\n" + "=".repeat(50) + "\n")
}

// ========== ФУНКЦИИ ДЛЯ ЗАДАНИЯ 3 ==========
fun demonstrateDataClasses() {
    println("=== ЗАДАНИЕ 3: Демонстрация работы data-классов ===\n")

    val task1 = Task(
        title = "Рефакторинг кода",
        description = "Улучшить читаемость кода модуля",
        priority = Priority.MEDIUM
    )

    val task2 = Task(
        title = "Рефакторинг кода",
        description = "Улучшить читаемость кода модуля",
        priority = Priority.MEDIUM
    )

    val task3 = Task(
        title = "Рефакторинг кода",
        description = "Улучшить читаемость кода модуля",
        priority = Priority.MEDIUM
    )

    val task4 = Task(
        title = "Написать тесты",
        description = "Создать unit-тесты для нового функционала",
        priority = Priority.HIGH,
        isCompleted = true
    )

    println("1. Демонстрация метода toString():")
    println("task1: $task1")
    println("task4: $task4")

    println("\n2. Демонстрация метода equals():")
    println("task1 == task2: ${task1 == task2}")
    println("task1 == task4: ${task1 == task4}")
    println("task2 == task3: ${task2 == task3}")

    println("\n3. Демонстрация метода hashCode():")
    println("hashCode task1: ${task1.hashCode()}")
    println("hashCode task2: ${task2.hashCode()}")
    println("hashCode task3: ${task3.hashCode()}")
    println("hashCode task4: ${task4.hashCode()}")
    println("hashCode task1 == hashCode task2: ${task1.hashCode() == task2.hashCode()}")
    println("hashCode task1 == hashCode task4: ${task1.hashCode() == task4.hashCode()}")

    println("\n4. Демонстрация метода copy():")
    val copiedTask = task1.copy(
        priority = Priority.HIGH,
        isCompleted = true
    )
    println("Оригинал (task1): $task1")
    println("Копия с изменениями: $copiedTask")

    val lowPriorityTask = task4.copy(priority = Priority.LOW)
    println("Копия task4 с LOW приоритетом: $lowPriorityTask")

    println("\n5. Декомпозиция (Destructuring Declaration):")
    val (title, description, priority, isCompleted) = task4
    println("Название: $title")
    println("Описание: $description")
    println("Приоритет: $priority")
    println("Выполнена: $isCompleted")

    val (title1, description1, priority1, isCompleted1) = task1
    println("\nДекомпозиция task1:")
    println("Название: $title1")
    println("Описание: $description1")
    println("Приоритет: $priority1")
    println("Выполнена: $isCompleted1")

    println("\n" + "=".repeat(50))
}

// ========== ФУНКЦИИ ДЛЯ ЗАДАНИЯ 4 ==========
fun demonstrateAbstractClasses() {
    println("\n=== ЗАДАНИЕ 4: Абстрактные классы и наследование ===\n")

    val devDepartment = DevelopmentDepartment()
    val testDepartment = TestingDepartment()

    println("1. Работа абстрактного класса Department:")

    val departments: List<Department> = listOf(devDepartment, testDepartment)

    departments.forEach { department ->
        println("\n---")
        department.printDepartmentInfo()
        department.printDepartmentGoal()
    }

    println("\n2. Полиморфизм через список отделов:")

    for (department in departments) {
        println("Отдел: ${department.departmentName}")
    }

    println("\n3. Специфичные методы каждого отдела:")

    println("Разработка:")
    devDepartment.writeCode()

    println("\nТестирование:")
    testDepartment.testApplication()

    println("\n" + "=".repeat(50))
}

// ========== ГЛАВНАЯ ФУНКЦИЯ ==========
fun main() {
    println("\n" + "=".repeat(50))
    println("ЛАБОРАТОРНАЯ РАБОТА 9-10: САМОСТОЯТЕЛЬНЫЕ ЗАДАНИЯ")
    println("=".repeat(50) + "\n")

    // Задание 2
    testEmployeeClass()

    //  Задание 3
    demonstrateDataClasses()
    // Задание 4
    demonstrateAbstractClasses()

    println("\nВСЕ ЗАДАНИЯ ВЫПОЛНЕНЫ УСПЕШНО!")
    println("=".repeat(50))
}