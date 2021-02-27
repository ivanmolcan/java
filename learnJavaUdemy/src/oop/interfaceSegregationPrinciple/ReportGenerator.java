package oop.interfaceSegregationPrinciple;

public class ReportGenerator {

    private Reporting transactionObject;

    public ReportGenerator(Reporting transactionObject) {
        this.transactionObject = transactionObject;
    }

    public void generateReport(){
        System.out.println(
                transactionObject.getDate() + " " +
                transactionObject.getName() + " " +
                transactionObject.productBreakDown()

        );
    }
}
