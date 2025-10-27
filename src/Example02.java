import java.util.Vector;

// 메서드 오버라이딩
public class Example02 {
    public static void main(String[] args) {
        // 클래스 내부에 들어간 변수
        // -> 멤버변수 (인스턴스변수, 필드, 속성) <= 객체가 소멸하기 전까지 계속 존재.
        // => class 바로 아래 (꼭 바로 class 키워드 아래일 필요는 없음). 접근제어자가 붙을 수 있고, 인스턴스마다 격리 범위를 가지는 변수.
        // => class로 생성된 instance 범위 내에서 공통적인 접근이 가능하고, 다른 메서드에서 외부 참조가 가능
        // -> 지역변수
        // 메서드 {} 안에서 생성된 변수 -> 메서드가 종료되면 소멸. <-> 멤버변수 => 유지 기간.
        // -> 매개변수 <= 메서드시그니쳐 (이름과 매개변수를 정의하는 파트를 통해 외부에서 전달받은 지역변수)

        // 상속
        // 물려받은 파트
        // 재정의한 파트 / 다형성.
        Vehicle v = new Vehicle();
        // ...
        Car c = new Car();
//        Car ...  static
        // c -> 인스턴스
        System.out.println(c.name);
        Vehicle v2 = new Car();
        System.out.println(v2.name);
        // 예전 버전이 나온다...
    }
}

class Vehicle { // 탈것
    // 인스턴스들이 따로 가져감 (생성자나 대입을 해서, setter를 사용해서 변경하고 호출...)
    String name = "따릉이";
    // 같은 클래스로 만들어진 인스턴스들이 공유하며, 인스턴스를 만들지 않아도 호출이 가능한 변수.
    static String description = "이것은 탈것입니다";

    void run() {
        System.out.println(name + "달려달려");
        System.out.println(description);
    }
    static void describe() {
        // System.out.println(name);
        // static은 멤버변수를 쓸 수 없다 -> 인스턴스가 안만들어졌으니까
        System.out.println(description);
    }
}

class Car extends Vehicle {
    // 상속받았다고 해서 상속받은 걸 꼭 써줄 필요는 X
    // 재정의한다 <- 덮어씌워도 상관 X
    String name = "붕붕이"; // 어차피 'super' 키워드로 내부에서 호출가능하기 때문... -> 정의 안내려줬다 (겹치는게 없다면) => 자연스럽게  상위(부모) 클래스의 것을 사용 가능.
    static String description = "이것은 차입니다";
}