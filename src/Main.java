public class Main {
    public static void main(String[] args) {
        int age = 25;
        System.out.println(age);
        // 25

        age = 26;
        System.out.println(age);
        // 26

        double salary =50000.75;
        System.out.println(salary);
        // 50000.75

        String name = "백종성";
        System.out.println(name);
        // 백종성
        System.out.println(name.length());
        // 3

        double salary_toInt = 40000.75; // 소수점 자리숫자가 없어진다.
        System.out.println((int)salary_toInt);
        // 40000

        // double + int
        int bonus = 5000;
        System.out.println(salary_toInt + bonus); // 결과의 자료형은 double이 된다.
        // 45000.75

        // 만약 int형으로 리턴 받고싶으면 -> 대신, 결과 값의 소숫점이 사라짐
        int total_salary = (int)salary_toInt + bonus;
        System.out.println(total_salary);
        // 45000

        // 출력값이 많아서 디버깅 하기 힘들때, 앞에 문자열을 입력하여 구분
        System.out.println("Total salary:" + total_salary);
        // Total salary:45000
    }
}