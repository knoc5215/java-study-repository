package com.study.singleton;

public class Printer {
/*
    1. thread-safe 하지 못한 방법.
    private static Printer printer = null;
    public static Printer getPrinter() {
        if (printer == null) {
            printer = new Printer();
        }
        return printer;
    }
*/
/*
     2. thread-safe 한 방법.
     static 변수에 인스턴스를 만들어서 바로 초기화
     이른 초기화(Eager Initialization)라고도 한다.

     static 변수에 외부에 제공할 자기 자신의 인스턴스를 만들어 초기화한다.
     static 변수는 객체가 생성되기 전 클래스 로더에 의해 클래스가 메모리에 로딩될 때 만들어지기 때문에 초기화가 한 번만 실행된다.
     또, 클래스 로더에 의해 클래스가 최초 로딩될 때 객체가 생성됨으로 Thread-Safe 하다.
    private static Printer printer = new Printer();

    static Printer getPrinter() {
        return printer;
    }
    */

/*
    3. Holder에 의한 초기화
    가장 완벽다고 평가받는 방법이다.

    객체가 필요할때로 초기화를 미루는 것.
 */

    static Printer getInstance() {
        return LazyHolder.INSTANCE;
    }

    public void print(String str) {
        System.out.println(str);
    }

    // LazyHolder 클래스는 Printer 클래스의 getInstance() 메소드에서 LazyHolder.INSTANCE를 참조하는 순간
    // 클래스 로더에 의해 Class가 로딩되며 초기화가 진행된다.
    private static class LazyHolder {
        private static final Printer INSTANCE = new Printer();
    }
}
