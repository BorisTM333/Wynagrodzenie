abstract class Employee {
    protected String position;
    protected double baseSalary;
    protected double overtimeHours;
    protected double overtimeRate;
    protected double bonuses;

    public Employee(String position, double baseSalary, double overtimeHours, double overtimeRate, double bonuses) {
        this.position = position;
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
        this.bonuses = bonuses;
    }

    public abstract double calculateSalary();

    public abstract void displayInfo();
}

class Manager extends Employee {
    public Manager(String position, double baseSalary, double overtimeHours, double overtimeRate, double bonuses) {
        super(position, baseSalary, overtimeHours, overtimeRate, bonuses);
    }

    @Override
    public double calculateSalary() {
        double overtimePay = overtimeHours * overtimeRate;
        return baseSalary + overtimePay + bonuses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Stanowisko: " + position);
        System.out.println("Podstawowa płaca: " + baseSalary);
        System.out.println("Nadgodziny: " + overtimeHours + " godzin");
        System.out.println("Stawka godzinowa: " + overtimeRate);
        System.out.println("Premie: " + bonuses);
        System.out.println("Cała kwota wynagrodzenia: " + calculateSalary());
    }
}

class Programmer extends Employee {
    public Programmer(String position, double baseSalary, double overtimeHours, double overtimeRate, double bonuses) {
        super(position, baseSalary, overtimeHours, overtimeRate, bonuses);
    }

    @Override
    public double calculateSalary() {
        double overtimePay = overtimeHours * overtimeRate;
        return baseSalary + overtimePay + bonuses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Stanowisko: " + position);
        System.out.println("Podstawowa płaca: " + baseSalary);
        System.out.println("Nadgodziny: " + overtimeHours + " godzin");
        System.out.println("Stawka godzinowa: " + overtimeRate);
        System.out.println("Premie: " + bonuses);
        System.out.println("Cała kwota wynagrodzenia: " + calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Menedżer", 8000, 15, 50, 1000);
        Programmer programmer = new Programmer("Programista", 6000, 20, 40, 800);

        System.out.println("Informacje o menedżerze:");
        manager.displayInfo();
        System.out.println();

        System.out.println("Informacje o programiście:");
        programmer.displayInfo();
    }
}
