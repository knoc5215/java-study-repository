package com.study.java.thread;

public class MultiThread implements Runnable {
    private long depositeMoney = 10000;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                withDraw(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (getDepositeMoney() <= 0) {
                break;
            }
        }

    }

    public long getDepositeMoney() {
        return depositeMoney;
    }


    public synchronized void withDraw(long howMuch) {
        /*
            인스턴스 메소드 동기화
            withDraw를 호출한 instance에 대해서 Lock을 건다
            단일 instance를 사용한 멀티 스레드의 경우 한 스레드에서 withDraw를 호출하면, 다른 스레드에서 이곳에 진입할 수 없다
            해당 instance에 대해서 lock이 걸려있기 때문
         */
        if (getDepositeMoney() > 0) {
            depositeMoney -= howMuch;
            System.out.println(Thread.currentThread().getName() + " , " + "잔액 : " + getDepositeMoney() + "");
        } else {
            System.out.println(Thread.currentThread().getName() + " , 잔액 부족");
        }

    }

    public static void main(String[] args) {
        MultiThread multiThread = new MultiThread();    // 단일 instance
        Thread thread_1 = new Thread(multiThread, "Mother");
        Thread thread_2 = new Thread(multiThread, "Son");

        thread_1.start();
        thread_2.start();

    }
}
