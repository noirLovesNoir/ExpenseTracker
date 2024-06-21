import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI implements ActionListener {
    JFrame jFrame = new JFrame();
    JLabel userName = new JLabel();

    JTextField userNameInput = new JTextField();

    JLabel password = new JLabel();

    JTextField passwordInput = new JTextField();

    JButton login = new JButton();

    JLabel msg = new JLabel();

    public void actionPerformed(ActionEvent a){
        if(userNameInput.getText().equals("samiya")
                && passwordInput.getText().equals("111")){
            System.out.println("successful");
            msg.setText("successful");
        }
        else {
            System.out.println("try again");
            msg.setText("fail");
        }
    }

    public GUI(){
        userName.setBounds(50,50,100,50);
        userNameInput.setBounds(200,50,100,50);
        password.setBounds(50,150,100,50);
        passwordInput.setBounds(200,150,100,50);
        login.setBounds(100,250,100,50);
        msg.setBounds(100,300,100,50);

        jFrame.add(userName);
        jFrame.add(userNameInput);
        jFrame.add(passwordInput);
        jFrame.add(password);
        jFrame.add(login);
        jFrame.add(msg);

        jFrame.setLocation(50,50);
        jFrame.setSize(600,600);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        userName.setText("username");
        password.setText("password");
        login.setText("log in");

        login.addActionListener(this);
    }
}

class Test{
    public static void main(String[] args) {
        new GUI();
    }
}