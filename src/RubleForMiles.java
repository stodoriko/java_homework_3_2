public class RubleForMiles {
    public static void main(String[] args) {

        int clientAccount = 100;
        int refilAmount = 1100;
        int bonus;

        if (refilAmount > 1000) {
            bonus = refilAmount / 100;
            clientAccount = refilAmount + clientAccount + bonus;
        } else {
            clientAccount = refilAmount + clientAccount;
        }

        System.out.println(clientAccount);

    }
}
