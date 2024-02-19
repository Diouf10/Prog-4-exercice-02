public class Director {
    Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void creerCanard() {
        builder.reset();;
        builder.creerTete();
        builder.creerCorps();
        builder.creerAiles();
        builder.CreerHabit();
    }
}
