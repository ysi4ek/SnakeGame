import javax.swing.*;

public class mainWindow extends JFrame {

    public mainWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        mainWindow mw = new mainWindow();

    }


}
