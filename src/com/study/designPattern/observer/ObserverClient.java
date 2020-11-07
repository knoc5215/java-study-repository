package com.study.designPattern.observer;

import java.util.Random;

public class ObserverClient {
    public static final int VIEW_COUNT = 5;
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        DataSheetView dataSheetView = new DataSheetView(scoreRecord, VIEW_COUNT);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        // 각 통보 대상 클래스를 Observer로 추가
        scoreRecord.attach(dataSheetView);
        scoreRecord.attach(minMaxView);

        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            int score = rand.nextInt(10);
            System.out.println("Adding : " + score);
            scoreRecord.addScore(score);
        }
    }
}
