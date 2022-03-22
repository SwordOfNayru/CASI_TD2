public class ExpOU extends OperateurBinaire {
    public ExpOU(ExpBOOL gauche, ExpBOOL droite) {
        super(gauche, droite);
    }

    @Override
    public Boolean evalue(Contexte context) {
        return this.Gauche.evalue(context) || this.Droite.evalue(context);
    }

}
