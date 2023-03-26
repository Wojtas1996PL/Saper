import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Frame {
    public int[][] method() {
        int[][] tab = new int[8][8];
        Random rand = new Random();
        int iloscMin = 10;
        for (int x = 0; x < iloscMin; x++) {
                int px = rand.nextInt(8);
                int py = rand.nextInt(8);
                tab[px][py] = 1;
        }
        return tab;
    }

    public void Fr() {
        int arr[][] = method();
        JFrame f = new JFrame("Saper");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 8));
        JButton[][] buttons = new JButton[8][8];
        for (int x = 0, a = 0; x < buttons.length && a < arr.length; x++, a++) {
            for (int z = 0, b = 0; z < buttons[0].length && b < arr[0].length; z++, b++) {
                buttons[x][z] = new JButton(String.valueOf(arr[a][b]));
                int finalA = a;
                int finalB = b;
                buttons[x][z].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(arr[finalA][finalB] == 1){
                            System.out.println("Bum!");
                        }
                        else
                            System.out.println("Nothing happened");
                    }
                });
                panel.add(buttons[x][z]);
            }
        }
        f.add(panel);
        f.setLocation(300, 300);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }
}


