import sun.util.resources.uk.CalendarData_uk;

public class Calculator {
    public CalculatorService calculatorService;
//    public Calculator(CalculatorService calculatorService){
//        this.calculatorService=calculatorService;
//    }
    public int performOperation(int x, int y){
        return calculatorService.add(x,y)*x;
    }
}
