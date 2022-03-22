public class Constante implements ExpBOOL {
    private Boolean Valeur;

    public Constante(Boolean valeur) {
        this.Valeur = valeur;
    }

    @Override
    public Boolean evalue(Contexte context) {
        return Valeur;
    }

}
