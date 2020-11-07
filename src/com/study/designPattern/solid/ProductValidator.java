package com.study.designPattern.solid;

import java.util.Arrays;
import java.util.List;

public class ProductValidator {
    private final List<Validator> validators = Arrays.asList(new DefaultValidator(), new ETicketValidator(), new LocalValidator());

    /*
        OCP를 지킨 구조로, validate()의 수정 없이 option의 요구사항이 변경되어도 확장 가능한 구조로 바뀜.
     */
    public void validate(Production production) throws IllegalAccessException {
        Validator productionValidator = new DefaultValidator();
        for (Validator validator : validators) {
            if (validator.support(production)) {    // 지원하는 validator가 있다면
                productionValidator = validator;    // 그걸 사용하기로 하고, break
                break;
            }
        }
        productionValidator.validate(production);   // 지원하는 validator로 검증한다
    }

}
