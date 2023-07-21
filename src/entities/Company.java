package entities;

public class Company extends taxPayer{
    private Integer numberOfEmployees;

    public Company() {
    }

    public Company(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double taxPaid(){
        if (numberOfEmployees > 10){
            return annualIncome * 0.14;
        }
        else {
            return annualIncome * 0.16;
        }
    }
}
