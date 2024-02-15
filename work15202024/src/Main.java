public class Main {
    public static void main(String[] args) {
        Employee[]  employees = new Employee[5];
        employees[0]   = new Employee("Азамова Арина Денисовна",
                "Менеджер","azamova@gmail.com", "89754861235",30000,25);
        employees[1]  = new Employee("Гришкин Юрий Константинович",
                "Охрана","grish@gmail.com", "89754845235",25000,19);
        employees [2]  = new Employee("Симонова Виктория Андреевна",
                "Директор точки","sv@gmail.com", "89754867835",60000,26);
        employees [3] = new Employee("Петрова Валерия Андреевна",
                "Сборщик","petrovavalera@gmail.com", "89537164528",15000,22);
        employees [4] = new Employee("Толпышева Александра Максимовна",
                "Заместитель директора","alextolp@gmail.com", "89754845935",40000,24);
        for (Employee employee:employees){
            employee.Showperson();
        }
                 }
}
