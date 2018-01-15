package ma.forix.ps.buttons;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class SpatialVaisseau extends JButton {
    Image img;

    public SpatialVaisseau(){
        this.setBorderPainted(false);
        try{
            img = ImageIO.read(new File("src/resources/textures/gui/Vaisseau colonial.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.addActionListener(new vaisseauL());
    }

    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }

    private class vaisseauL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Construction d'un vaisseau spatial effectué!");
        }
    }
}