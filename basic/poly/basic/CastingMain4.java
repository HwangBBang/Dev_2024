package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {

        Parent parent1 = new Child();
        Child child1 = (Child) parent1; // 다운 캐스팅 P -> C
        child1.childMethod();   // 문제가 없음

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 에러 ClassCastException
        child2.childMethod(); // 실행 불가
    }
}
