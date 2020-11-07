package com.study.designPattern.solid;

/*
    1. SRP - 한 클래스는 하나의 책임만을 가져야 한다.
    온전히 상품의 정보를 변경하는 책임만 있다

 */
public class ProductionUpdateService {
    public void update(Production production, int price) {
        production.updatePrice(price);
    }
}
