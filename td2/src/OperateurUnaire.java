public abstract class OperateurUnaire implements ExpBOOL {
    protected ExpBOOL Gauche;

    public OperateurUnaire(ExpBOOL gauche) {
        this.Gauche = gauche;
    }
}
