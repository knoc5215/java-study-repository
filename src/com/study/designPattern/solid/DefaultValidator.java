package com.study.designPattern.solid;

public class DefaultValidator implements Validator {
    @Override
    public boolean support(Production production) {
        return production.getOption().equals("N");
    }

    @Override
    public void validate(Production production) throws IllegalAccessException {
        if (production.getNameLength() < 3) {
            throw new IllegalAccessException("일반 상품의 이름은 3글자보다 길어야 합니다.");
        }
    }
}
