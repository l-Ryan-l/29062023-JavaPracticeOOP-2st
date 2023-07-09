public class Hero implements hasHealth, hasMana{
    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья
    private int maxManaPoint; // максимально количество магический энергии
    private int currentManaPoint; // текущее количество магический энергии

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;
        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

    public void setMaxHealthPoint(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
    }

    public void setMaxManaPoint(int maxManaPoint) {
        this.maxManaPoint = maxManaPoint;
    }

    @Override
    public int getMaxHealth() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealthPoint;
    }

    @Override
    public int getMaxMana() {
        return maxManaPoint;
    }

    @Override
    public int getCurrentMana() {
        return currentManaPoint;
    }

    @Override
    public String toString() {
        return String.format("The Hero. Max HP = %d, Max MP = %d, \nCurrent HP = %d, Current Mana = %d",
                maxHealthPoint, maxManaPoint, currentHealthPoint, currentManaPoint);
    }
}
