public class Dog extends Pet{
    protected boolean isTrained;

    public Dog(int height, int weight, String eyeColor, String voice, String name, String breed, boolean isVaccinated,
            String woolColor, int year, int month, int day, boolean isTrained) {
        super(height, weight, eyeColor, voice, name, breed, isVaccinated, woolColor, year, month, day);
        this.isTrained = isTrained;
    }

    public Dog() {
        super(39, 28, "карий", "гав -  гав", "Лейла", "Корги",
        true, "черно-коричневый", 2017, 9, 10);
        this.isTrained = true;
    }

    public boolean isTrained() {
        return this.isTrained;
    }

    @Override
    public String toString() {
        return String.format("%s\n%s\nПодается дрессировке: %b\n", this.getClass().getSimpleName(),
                             super.toString(), this.isTrained);
    }


    @Override
    public void showCaress() {
        System.out.println("Виляет хвостом");
        
    }

    public void training() {
        if (this.isTrained) {
            System.out.println("Учим новые команды.");
        }
        else System.out.println("У меня лапки. Я ничего не умею.");
    }
}