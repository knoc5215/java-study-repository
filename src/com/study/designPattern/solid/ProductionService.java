package com.study.designPattern.solid;

/*
    5. DIP(Dependency Inversion Principle) 의존관계 역전 원칙
        - 추상화에 의존해야지, 구체화에 의존하면 안된다.
 */
public class ProductionService {
    private final Validator validator;

    public ProductionService(Validator validator) {
        this.validator = validator;
    }

    // ProductionService
    // --> Validator Interface
    //      --> 1. ETicketValidator Class
    //      --> 2. LocalValidator Class
    public void validate(Production production) throws IllegalAccessException {
        validator.validate(production);
    }

/*
    ProductionService --> LocalValidator
                      --> ETicketValidor

                      2가지 의존
                      더 추가되면 OCP 위반 (if..else.. 늘어나는 구조)

    private final LocalValidator localValidator;
    private final ETicketValidator eTicketValidator;

    public ProductionService(LocalValidator localValidator, ETicketValidator eTicketValidator) {
        this.localValidator = localValidator;
        this.eTicketValidator = eTicketValidator;
    }

    public void validate(Production production) {
        if (production.getType().equals("L")) {
            localValidator.validate(production);
        } else if (production.getType().equals("E")) {
            eTicketValidator.validate(production);
        }

    }
    */
}
