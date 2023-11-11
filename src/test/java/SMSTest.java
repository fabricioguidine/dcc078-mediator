import org.example.*;

public class SMSTest {
    public static void main(String[] args) {
        Mediator correio = new SMS();

        Destinatario ana = new Usuario("Ana");
        Destinatario carlos = new Usuario("Carlos");
        Destinatario isabel = new Usuario("Isabel");

        correio.adicionarDestinatario(ana);
        correio.adicionarDestinatario(carlos);
        correio.adicionarDestinatario(isabel);

        ana.receberMensagem("Oi pessoal!");
        carlos.receberMensagem("Olá, Ana!");
        isabel.receberMensagem("Como estão todos?");

        correio.enviar("Vamos organizar um jantar.", carlos);
    }
}