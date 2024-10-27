public class Arrays {
    public static void main(String[] args) {
        int sumUnder31 = 0;
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String months[] = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie",
                "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
        for (int i = 0; i < month_days.length; i++) {
            //System.out.println(months[i] + " " + month_days[i]); //ex1

            //if(month_days[i] == 31){
            //    System.out.println(months[i]); //ex2
            //}

            //if (month_days[i] < 31) {
            //    System.out.println(months[i] + " " + month_days[i]); //ex3
            //}

            //if (month_days[i] < 31) {
            //   sumUnder31 += month_days[i]; //ex4
            //}

            System.out.println(months[i].substring(0,3)+ " " + month_days[i]); //ex1
        }
        //System.out.println(sumUnder31); //ex4

    }
}
