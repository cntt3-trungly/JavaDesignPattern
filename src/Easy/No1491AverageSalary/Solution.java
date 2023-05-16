package Easy.No1491AverageSalary;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Solution {
    public double average(int[] salary) {
        int maxSalary = salary[0];
        int minSalary = salary[0];
        for (int i = 1 , k = salary.length; i < k ; i++){
            if (salary[i] <= minSalary) minSalary = salary[i];
            if (salary[i] >= maxSalary) maxSalary = salary[i];
        }
        double sum = 0;
        for (int i = 0 , k = salary.length; i < k ; i++){
            if (salary[i] != minSalary && salary[i] != maxSalary){
                sum+= salary[i];
            }
        }

        return sum/(salary.length-2);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().average(new int[]{8000,9000,2000,3000,6000,1000}));
    }
}
