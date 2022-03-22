public class ExpNON extends OperateurUnaire {

    public ExpNON(ExpBOOL gauche) {
        super(gauche);
    }

    @Override
    public Boolean evalue(Contexte context) {
        return !this.Gauche.evalue(context);
    }

}
