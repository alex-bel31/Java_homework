public class Cat extends Pet{
    protected boolean hasWool;

    public Cat(int height, int weight, String eyeColor, String voice, String name, String breed, boolean isVaccinated,
            String woolColor, int year, int month, int day, boolean hasWool) {
        super(height, weight, eyeColor, voice, name, breed, isVaccinated, woolColor, year, month, day);
        this.hasWool = hasWool;
    }

    public Cat() {
        super(17, 7, "голубой", "Мяу", "Крошик", "Британская веслоухая",
               false, "серый", 2003, 3, 13);
        this.hasWool = true;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\n", this.getClass().getSimpleName(), super.toString());
    }

    @Override
    public void showCaress() {
        System.out.println("Муррррчит......");
    } 
}