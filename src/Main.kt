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


fun demonstratePolymorphism() {
    println("\n=== ЗАДАНИЕ 5: Интерфейсы и полиморфизм ===\n")


    val employee = Employee(
        fullName = "Щербаков Данил Николаевич",
        position = "Старший Дотер по пуджу",
        salary = 120000,
        yearsOfExperience = 8
    )

    val devDepartment = DevelopmentDepartment()
    val testDepartment = TestingDepartment()


    val reportGenerators: List<ReportGenerator> = listOf(employee, devDepartment, testDepartment)

    println("1. Создан список из ${reportGenerators.size} элементов, реализующих интерфейс ReportGenerator")
    println("   Типы элементов: Employee, DevelopmentDepartment, TestingDepartment")


    println("\n2. Демонстрация полиморфизма через вызов generateReport():")
    println("=".repeat(60))

    for ((index, generator) in reportGenerators.withIndex()) {
        println("\n--- Элемент ${index + 1} (${generator::class.simpleName}) ---")
        println(generator.generateReport())
        println("=".repeat(60))
    }


    println("\n3. Дополнительная демонстрация полиморфизма:")

    val mixedList: List<Any> = listOf(employee, devDepartment, testDepartment, "Строка", 42)

    println("   Смешанный список содержит ${mixedList.size} элементов разных типов")

    val reportCount = mixedList.count { it is ReportGenerator }
    println("   Из них $reportCount элементов реализуют интерфейс ReportGenerator")


    println("\n4. Фильтрация по интерфейсу и генерация отчётов:")

    mixedList
        .filterIsInstance<ReportGenerator>()
        .forEach { generator ->
            println("\nГенерация отчёта для ${generator::class.simpleName}:")
            println(generator.generateReport().lines().first())
        }

    println("\n" + "=".repeat(50))
}

// ========== ФУНКЦИИ ДЛЯ ЗАДАНИЯ 6 ==========
fun demonstrateIntegration() {
    println("\n=== ЗАДАНИЕ 6: Интеграция ===\n")


    println("1. Создание сотрудника:")
    val employee = Employee(
        fullName = "Щербаков Данил Николаевич",
        position = "Разработчик",
        salary = 120000,
        yearsOfExperience = 8
    )
    employee.printEmployeeInfo()


    println("\n2. Создание задач:")
    val task1 = Task(
        title = "Разработать новый модуль",
        description = "Создать модуль управления задачами",
        priority = Priority.HIGH
    )

    val task2 = Task(
        title = "Протестировать модуль",
        description = "Провести unit-тестирование нового модуля",
        priority = Priority.MEDIUM
    )

    val task3 = Task(
        title = "Рефакторинг кода",
        description = "Улучшить читаемость существующего кода",
        priority = Priority.LOW,
        isCompleted = true
    )

    println("Задача 1: ${task1.title} (Приоритет: ${task1.priority})")
    println("Задача 2: ${task2.title} (Приоритет: ${task2.priority})")
    println("Задача 3: ${task3.title} (Приоритет: ${task3.priority}, Статус: ${if (task3.isCompleted) "Выполнена" else "В работе"})")


    println("\n3. Назначение задач сотруднику:")

    println("\nПервое назначение:")
    employee.assignTask(task1)
    println("Текущая задача сотрудника: ${employee.currentTask?.title ?: "Нет задачи"}")

    println("\nВторое назначение (пока задача не завершена):")
    employee.assignTask(task2) // Должно показать предупреждение


    println("\n4. Завершение текущей задачи:")
    employee.currentTask?.isCompleted = true
    println("Задача '${task1.title}' завершена: ${task1.isCompleted}")


    println("\n5. Назначение новой задачи после завершения предыдущей:")
    employee.assignTask(task2)
    println("Текущая задача сотрудника: ${employee.currentTask?.title ?: "Нет задачи"}")


    println("\n6. Создание отделов:")
    val devDepartment = DevelopmentDepartment()
    val testDepartment = TestingDepartment()

    println("Отдел разработки: ${devDepartment.departmentName}")
    println("Отдел тестирования: ${testDepartment.departmentName}")


    println("\n7. Работа отделов:")
    println("Отдел разработки:")
    devDepartment.writeCode()

    println("\nОтдел тестирования:")
    testDepartment.testApplication()


    println("\n8. Сводный отчёт по системе:")
    println("=".repeat(60))


    val allEntities: List<Any> = listOf(employee, task1, task2, task3, devDepartment, testDepartment)

    println("Всего сущностей в системе: ${allEntities.size}")
    println("\nДетализация:")

    allEntities.forEachIndexed { index, entity ->
        println("\n${index + 1}. ${entity::class.simpleName}:")
        when (entity) {
            is Employee -> {
                println("   • ФИО: ${entity.getFullName()}")
                println("   • Должность: ${entity.getPosition()}")
                println("   • Текущая задача: ${entity.currentTask?.title ?: "Нет задачи"}")
            }
            is Task -> {
                println("   • Название: ${entity.title}")
                println("   • Приоритет: ${entity.priority}")
                println("   • Статус: ${if (entity.isCompleted) "Выполнена" else "В работе"}")
            }
            is Department -> {
                println("   • Название отдела: ${entity.departmentName}")
            }
            else -> println("   • Неизвестный тип")
        }
    }


    println("\n9. Генерация отчётов всех компонентов:")
    println("=".repeat(60))

    val reportGenerators: List<ReportGenerator> = allEntities.filterIsInstance<ReportGenerator>()

    reportGenerators.forEachIndexed { index, generator ->
        println("\nОтчёт ${index + 1} (${generator::class.simpleName}):")
        println("-".repeat(40))
        println(generator.generateReport())
    }


    println("\n10. Итоги интеграции:")
    println("=".repeat(60))

    val totalTasks = allEntities.filterIsInstance<Task>().size
    val completedTasks = allEntities.filterIsInstance<Task>().count { it.isCompleted }
    val departmentsCount = allEntities.filterIsInstance<Department>().size

    println("✅ Создано сотрудников: 1")
    println("✅ Создано задач: $totalTasks (из них выполнено: $completedTasks)")
    println("✅ Создано отделов: $departmentsCount")
    println("✅ Все сущности успешно интегрированы")
    println("✅ Система работает корректно")

    println("\n" + "=".repeat(50))
}

// ========== ГЛАВНАЯ ФУНКЦИЯ ==========
fun main() {
    println("\n" + "=".repeat(50))
    println("ЛАБОРАТОРНАЯ РАБОТА 9-10: САМОСТОЯТЕЛЬНЫЕ ЗАДАНИЯ")
    println("=".repeat(50) + "\n")

    // Выполняем Задание 2
    testEmployeeClass()

    // Выполняем Задание 3
    demonstrateDataClasses()

    // Выполняем Задание 4
    demonstrateAbstractClasses()

    // Выполняем Задание 5
    demonstratePolymorphism()

    // Выполняем Задание 6
    demonstrateIntegration()

    println("\nВСЕ ЗАДАНИЯ (2-6) ВЫПОЛНЕНЫ УСПЕШНО!")
    println("=".repeat(50))
}