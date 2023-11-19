public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double vergi;
    int work;
    double year;
    double top;
    double toplam;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.vergi = vergi;
        this.work = work;
        this.year = year;
        this.top = top;
        this.toplam = toplam;
    }

    public void tax() {
        if (this.salary > 1000) {
            this.vergi = (0.03 * this.salary);
        } else {
            this.vergi = 0;
        }
    }

    public void bonus() {
        if (this.workHours > 40) {
            this.work = (this.workHours - 40) * 30;
        } else {
            this.work = 0;
        }
    }

    public void raiseSalary() {
        if (this.hireYear > 2011) {
            this.year = (this.salary * 0.05);
        } else if (this.hireYear < 2012 && this.hireYear > 2001) {
            this.year = (this.salary * 0.10);
        } else if (this.hireYear < 2002) {
            this.year = (this.salary * 0.15);
        }
    }

    public void top() {
        this.top = this.salary + this.work - this.vergi;
        this.toplam = this.salary + this.work - this.vergi + this.year;
    }

    public void toSring() {
        tax();
        bonus();
        raiseSalary();
        top();
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.vergi);
        System.out.println("Bonus : " + this.work);
        System.out.println("Maaş Artışı : " + this.year);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + this.top);
        System.out.println("Toplam Maaş : " + this.toplam);
        System.out.println("-----------------");

    }

}
