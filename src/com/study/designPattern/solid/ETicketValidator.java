package com.study.designPattern.solid;

public class ETicketValidator implements Validator {
    @Override
    public boolean support(Production production) {
        return production.getOption().equals("E");
    }

    @Override
    public void validate(Production production) throws IllegalAccessException {
        if (production.getNameLength() < 10) {
            throw new IllegalAccessException("전자티켓 상품의 이름은 10글자보다 길어야 합니다.");
        }
    }
}
