package Models;

public class Mammals {
    int No_of_chambers = 4;
    boolean warmblooded = true;

    public int getNo_of_chambers() {
        return No_of_chambers;
    }

    public void setNo_of_chambers(int no_of_chambers) {
        No_of_chambers = no_of_chambers;
    }

    public boolean isWarmblooded() {
        return warmblooded;
    }

    public void setWarmblooded(boolean warmblooded) {
        this.warmblooded = warmblooded;
    }

    String foods = "Rice";

    public String getFoods() {
        return foods;
    }

    public void setFoods(String foods) {
        this.foods = foods;
    }
}
