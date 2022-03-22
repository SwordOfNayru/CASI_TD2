public abstract class OperateurBinaire extends OperateurUnaire {
    protected ExpBOOL Droite;

    public OperateurBinaire(ExpBOOL gauche, ExpBOOL droite) {
        super(gauche);
        this.Droite = droite;
    }
}
