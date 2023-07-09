public class Building implements hasHealth {
    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    public Building(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setMaxHealthPoint(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
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
    public String toString() {
        return String.format("The building. Max HP = %s, Current HP = %d", maxHealthPoint, currentHealthPoint);
    }

}
