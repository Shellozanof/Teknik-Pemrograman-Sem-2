classDiagram
    class Employee {
        -int id
        -String name
        -double salary
        -Department dept
        -EmploymentType type
        +getName() String
        +getSalary() double
    }

    class Department {
        -String name
        +getName() String
    }

    class EmploymentType {
        -String name
    }

    class EmployeeService {
        -Map employees
        -static int totalCreated
        +addEmployee(Employee emp)
        +static getTotalEmployees() int
    }

    %% Relasi Aggregation (Diamond Kosong)
    Employee o-- Department : aggregation
    Employee o-- EmploymentType : aggregation

    %% Relasi Dependency (Panah Putus-putus)
    EmployeeService ..> Employee : dependency