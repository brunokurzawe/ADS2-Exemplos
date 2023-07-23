public class Professor extends Funcionario implements Autenticavel {

    @Override
    public boolean autentica() {
        ///Regras especificas do Professor
        return true;
    }

}

