import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        CalculaRob form = new CalculaRob();

        form.setContentPane(form.calculadoraPanel);
        form.setVisible(true);
        form.setSize(1000,1000);
    }
}
