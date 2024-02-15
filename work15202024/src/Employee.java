public class Employee {
    String FCs;
    String position;
    String email;
    String phone;
    int  salary;
    int age;
    public  Employee( String FCs, String position, String email, String phone, int  salary, int age){
    this.FCs = FCs;
    this.position=position;
    this.email=email;
    this.phone=phone;
    this.salary=salary;
    this.age=age;
    }
    public void Showperson(){
        System.out.println("Сотрудник");
        System.out.println("ФИО: " + FCs);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Воздраст: " + age);
        System.out.println();
    }

}
