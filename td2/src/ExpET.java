public class ExpET extends OperateurBinaire {

    public ExpET(ExpBOOL gauche, ExpBOOL droite) {
        super(gauche, droite);
    }

    @Override
    public Boolean evalue(Contexte context) {
        return this.Gauche.evalue(context) && this.Droite.evalue(context);
    }

}
