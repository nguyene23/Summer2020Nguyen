package coolguy;

    public class Receipt {
        public static void main(String[] args) {
            // Calculate total owed, assuming 8% tax / 15% tip
            // The value can be an expression; the variable stores its result; thus double variable
            double Subtotal = 38 + 40 + 30;
            double Tax = Subtotal * .08;
            double Tip = Subtotal * .15;
            double Total = Subtotal + Tax + Tip;

            System.out.println("Subtotal:" + Subtotal);

            System.out.println("Tax:" + Tax);

            System.out.println("Tip:" + Tip);

            System.out.println("Total:" + Total);

        }
//        Subtotal:
//                108
//        Tax:
//                8.64
//        Tip:
//                16.2
//        Total:
//                132.84
}
