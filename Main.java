public class Main {
    public static void main(String[] args) {
        System.out.println("coffee-machine Кофе-машина");
        int moneyAmount = 120;

        int[] drinkPrices = {150, 80, 20};
        String[] drinkNames = {"cappuccino капучино", "espresso эспрессо", "water вода"};

        Boolean canBuyAnything = false;

        //for (int i = 0; i < 3; i = i + 1)
        //{
        //System.out.println(drinkNames[i] + " - " + drinkPrices[i]);
        //}

        for (int i = 0; i < 3; i = i + 1)
        {
            if (moneyAmount >= drinkPrices[i])
            {
                System.out.println("You can buy Вы можете купить " + drinkNames[i]);
                canBuyAnything = true;
            }
        }
        if (canBuyAnything = false)
        {
            System.out.println("Insufficient funds Недостаточно средств ");
        }
    }
}
