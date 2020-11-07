package com.study.designPattern.solid;

public class LocalValidator implements Validator {

    @Override
    public boolean support(Production production) {
        return production.getOption().equals("L");
    }

    @Override
    public void validate(Production production) throws IllegalAccessException {
        if (production.getNameLength() < 20) {
            throw new IllegalAccessException("지 상품의 이름은 20글자보다 길어야 합니다.");
        }
    }
}
