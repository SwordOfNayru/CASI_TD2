import java.util.HashMap;
import java.util.Map;

public class Contexte {
    private Map<String, Boolean> Dictionnaire;

    public Contexte() {
        this.Dictionnaire = new HashMap<String, Boolean>();
    }

    public Boolean getVariable(String nom) {
        return this.Dictionnaire.get(nom);
    }

    public void assigne(Variable obj, Boolean v) {
        this.Dictionnaire.put(obj.getNom(), v);
    }

}
