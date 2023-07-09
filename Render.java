public class Render {
    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_BLACK = "\u001B[30m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_YELLOW = "\u001B[33m";
    final String ANSI_BLUE = "\u001B[34m";
    final String ANSI_PURPLE = "\u001B[35m";
    final String ANSI_CYAN = "\u001B[36m";
    final String ANSI_WHITE = "\u001B[37m";
    public void showIndicator(Object object) {
        if (object instanceof hasHealth) {
            int maxHP = ((hasHealth) object).getMaxHealth();
            int currHP = ((hasHealth) object).getCurrentHealth();

            if (currHP <= maxHP && currHP >= maxHP/1.5) {
                System.out.println(ANSI_GREEN + "Max HP: " + maxHP + ANSI_RESET);
                System.out.println(ANSI_GREEN + "Current HP: " + currHP + " [xxxxx]" + ANSI_RESET);
            } else if (currHP <= maxHP/1.5 && currHP > maxHP/3) {
                System.out.println(ANSI_YELLOW + "Max HP: " + maxHP + ANSI_RESET);
                System.out.println(ANSI_YELLOW + "Current HP: " + currHP + " [xxx..]" + ANSI_RESET);
            } else if (currHP > 0 && currHP <= maxHP/3){
                System.out.println(ANSI_RED + "Max HP: " + maxHP + ANSI_RESET);
                System.out.println(ANSI_RED + "Current HP: " + currHP + " [x....]" + ANSI_RESET);
            } else if (currHP == 0) {
                System.out.println("Busted");
                System.out.println("[.....]");
            } else {
                System.out.println("something is wrong");
            }
        }

        if (object instanceof hasMana) {
            System.out.println(ANSI_CYAN + "Max Mana: " + ((hasMana) object).getMaxMana() + ANSI_RESET);
            System.out.println(ANSI_CYAN + "Current Mane: " + ((hasMana) object).getCurrentMana() + ANSI_RESET);
        }
        // Не должно быть упоминания конкретных классов!!!
    }
}
