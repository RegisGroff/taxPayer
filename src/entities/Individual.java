package entities;

public class Individual extends taxPayer{
    private Double healthExpenses;

    public Individual() {
    }

    public Individual(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }
    @Override
    public double taxPaid(){
        if (annualIncome <= 20.000){
            return (annualIncome * 0.15) - (healthExpenses * 0.5);
        }
        else {
            return (annualIncome * 0.25) - (healthExpenses * 0.5);
        }
    }
}
