public class RubleForMiles {
    public static void main(String[] args) {

        int clientAccount = 100;
        int refilAmount = 1099;
        int bonus;
        boolean moreThanThousand;

        if (refilAmount > 1000) {
            moreThanThousand = true;
        } else {
            moreThanThousand = false;
        }

        if (moreThanThousand) {
            bonus = refilAmount / 100;
            clientAccount = refilAmount + clientAccount + bonus;
        } else {
            clientAccount = refilAmount + clientAccount;
        }

        System.out.println(clientAccount);

    }
}
