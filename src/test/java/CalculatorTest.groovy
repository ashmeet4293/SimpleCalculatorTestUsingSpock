class CalculatorTest extends spock.lang.Specification {

    def CalculatorService calculatorService=Mock(CalculatorService)
    Calculator calculator=new Calculator()

    def "setup"(){
       calculator.calculatorService=calculatorService
    }

    def "PerformOperation"() {
        given:
        calculatorService.add(2,5) >>7

        when:
        def result=calculator.performOperation(2,5)

        then:echo "# SimpleCalculatorTestUsingSpock" >> README.md
        result!=null

        and:
        1* calculatorService.add(2,5)

    }
}
