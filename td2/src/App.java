public class App {
    public static void main(String[] args) throws Exception {
        ExpBOOL expression;
        Contexte contexte = new Contexte();
        Variable x = new Variable("X"); // crée la variable X
        Variable y = new Variable("Y"); // crée la variable Y

        expression = new ExpOU(new ExpET(x, (new ExpNON(y))), new ExpET(y, new Constante(true)));

        contexte.assigne(x, false); // X vaut Faux
        contexte.assigne(y, true); // Y vaut Vrai

        Boolean resultat = expression.evalue(contexte);

        System.out.println(resultat.toString());
    }
}
