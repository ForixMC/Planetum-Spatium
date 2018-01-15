package ma.forix.ps.buttons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class ConstructMaison extends JButton {
    private Image img;

    public ConstructMaison(){
        this.setBorderPainted(false);
        try{
            img = ImageIO.read(new File("src/resources/textures/gui/Construction Habitation.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.addActionListener(new ConstructMaisonL());
    }

    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }

    private class ConstructMaisonL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Construction d'une Maison effectué!");
        }
    }
}
