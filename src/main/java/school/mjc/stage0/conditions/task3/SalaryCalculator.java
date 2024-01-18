package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public static void calculateSalary(float salary) {
        float result;
        if (salary <= 10000 && salary >0) {
            result = salary - salary * 0.15f;
            System.out.println(result);
        } else if (salary > 10000 && salary <= 20000) {
            result = salary - salary * 0.18f;
            System.out.println(result);
        }
        else if(salary > 20000){
            result = salary - salary * 0.2f;
            System.out.println(result);
        }
        else{System.out.println("wrong input!");}}


public static void main(String[] args) {
    float salary=30000.00f;
    calculateSalary(salary);
}}


