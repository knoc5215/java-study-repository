package com.study.designPattern.observer;

import java.util.List;

public class DataSheetView implements Observer {
    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    // 변경을 통보 받는다
    @Override
    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displaySocores(record, viewCount);
    }

    private void displaySocores(List<Integer> record, int viewCount) {
        System.out.println("List of " + viewCount + " entries.");

        for (int i = 0; i < viewCount && i < record.size(); i++) {
            System.out.print(record.get(i) + " ");
        }
        System.out.println();
    }
}
