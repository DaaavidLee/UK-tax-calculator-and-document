/**
 * @author Cheng-Yu Lee
 * @version 2024-03-12
 * <p>
 * This Design class calculates income tax based on specified tax rules and the provided annual salary input.
 * <p>
 * Optionally1: a bit more detail about this class.
 */
public class Design {

    public static void main(String[] args) {
        // Define tax rules
        final double ALLOWANCE = 12_570;
        final double BASIC_RATE_THRESHOLD = 12_570 + 37_700;
        final double HIGHER_RATE_THRESHOLD = BASIC_RATE_THRESHOLD + 99_730;
        final double BASIC_RATE = 0.2;
        final double HIGHER_RATE = 0.4;
        final double ADDITIONAL_RATE = 0.45;

        // Take annual salary as input
        // System.out.println("Enter annual salary: ");
        double annualSalary = Integer.parseInt(args[0]);

        // 1: Calculate personal allowance
        double personalAllowance = (annualSalary <= 100_000)
                ? ALLOWANCE : (ALLOWANCE - ((annualSalary - 100_000) / 2));

        // 2: Calculate taxable income
        double taxableIncome = annualSalary - personalAllowance;

        // 3: Calculate income tax
        double incomeTax = 0;
        if (taxableIncome <= BASIC_RATE_THRESHOLD) {
            incomeTax = taxableIncome * BASIC_RATE;
        }
        else if (taxableIncome <= HIGHER_RATE_THRESHOLD) {
            incomeTax = (BASIC_RATE_THRESHOLD * BASIC_RATE) +
                    ((taxableIncome - BASIC_RATE_THRESHOLD) * HIGHER_RATE);
        }
        else {
            incomeTax = (BASIC_RATE_THRESHOLD * BASIC_RATE) +
                    ((HIGHER_RATE_THRESHOLD - BASIC_RATE_THRESHOLD) * HIGHER_RATE) +
                    ((taxableIncome - HIGHER_RATE_THRESHOLD) * ADDITIONAL_RATE);
        }

        // Output the calculated income tax
        System.out.println("Income tax: " + incomeTax);
    }
}
