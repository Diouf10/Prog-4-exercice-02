public class CanardBuilder implements Builder {
    private Canard canard;


    @Override
    public void reset() {
        canard = new Canard();
    }

    @Override
    public void creerTete() {
        canard.setTete("Génération de la tête ...");
    }

    @Override
    public void creerCorps() {
        canard.setCorps("Génération du corps ...");
    }

    @Override
    public void creerAiles() {
        canard.setAiles("Génération des ailes ...");
    }

    @Override
    public void CreerHabit() {
        canard.setHabit("Génération de l'habit ...");
    }

    @Override
    public Canard getCanard() {
        Canard canard = this.canard;
        this.reset();
        return canard;
    }
}
