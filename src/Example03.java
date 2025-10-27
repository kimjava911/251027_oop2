// super -> 생성자와 주로 관련
public class Example03 {
    public static void main(String[] args) {

    }
}

class Student {
    // 생성자를 통해서 넣어줘야함
    final String name;
    final int age;

    Student(String name, int age) {
        // this <- 클래스를 통해서 생성될 객체 자체
        this.name = name;
        this.age = age; // 입력할 변수명과 입력당할(저장될) 변수명을 통일하는 건 일종의 의미론적 코딩.
    }

    void introduce() {
        System.out.println("안녕하세요 저는 " + name + "이고 " + age + "살 입니다.");
    }
}