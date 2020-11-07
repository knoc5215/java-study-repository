package com.study.java.generic;

/*
    제네릭은 클래스 내부에서 사용하는 데이터의 Type을 인스터스를 생성할때 결정하는
    인스턴스 타입을 Compile 시점에 체크하기때문에, 타입 안정성을 높이고 형변환 번거로움을 감소

 */
public class TestGenericMain {
    public static void main(String[] args) {

        System.out.println("제네릭 기본 방식.");
        // 인스턴스를 생성할때 Type을 결정한다
        // 명시적으로 Type을 지정하였기 때문에, 명시적 형변환이 필요없다
        // EX) ArrayList
        TestGeneric<String> stringTestGeneric = new TestGeneric<>();
        TestGeneric<Integer> integerTestGeneric = new TestGeneric<>();

        stringTestGeneric.setSample("Hellow");
        integerTestGeneric.setSample(12345);

        stringTestGeneric.showYourType();
        integerTestGeneric.showYourType();

        System.out.println("제네릭도 생략할 수 있다.");
        // 제네릭 생략
        // constructor를 통해 tpye 정보를 넘겨주기
        Data stringData = new Data();
        stringData.data = "Hello!";
        Data integerData = new Data();
        integerData.data = 1234;

        stringData.showYourType();
        integerData.showYourType();

        System.out.println("제네릭 메서드 정의.");
        Data.<String>showData("generic method!!");
        Data.showData(1234);
        Data.showData(1234.1234);

        System.out.println("제네릭 타입 매개변수 제한.");
        familyData<Parent> parentfamilyData = new familyData<>();
        familyData<Child> childfamilyData = new familyData<>();
        // 컴파일 오류 -> Parent를 상속한 서브 클래스로만 제한했기 때문에.
        //familyData<String> stringfamilyData = new familyData<String>();
    }
}
