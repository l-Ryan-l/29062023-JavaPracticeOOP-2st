
public class Main {
    public static void main(String[] args) {

        Render render = new Render();
        // test of building
        Building building = new Building(100);
        building.setCurrentHealthPoint(45);
        render.showIndicator(building);

        // test of Hero
        Hero wizard = new Hero(50, 150);
        System.out.println(wizard);
        wizard.setCurrentHealthPoint(33);
        wizard.setCurrentManaPoint(122);
        render.showIndicator(wizard);

        // test of NPC
        Neutral randomNPC = new Neutral(20);
        System.out.println(randomNPC);
        randomNPC.setCurrentHealthPoint(15);
        render.showIndicator(randomNPC);

    }
}
