public class Pedagoga extends Funcionario implements Autenticavel {

    @Override
    public boolean autentica() {
        ///Regras especificas da Pedagoda
        return true;
    }

}

