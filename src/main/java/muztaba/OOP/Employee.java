package muztaba.OOP;

public class Employee {
    String name = "Muztaba Ali";
    double salary = 30000;
    int hireDate = 2021;

    public void yearsOfService(){
        System.out.println(2024-2021);
    }

    public static void main(String[] args) {
        Employee em = new Employee();
        em.yearsOfService();
    }
}
