public class Variable implements ExpBOOL {

    String Nom;

    public Variable(String nom) {
        this.Nom = nom;
    }

    public String getNom() {
        return Nom;
    }

    @Override
    public Boolean evalue(Contexte context) {
        return context.getVariable(this.Nom);
    }

}
