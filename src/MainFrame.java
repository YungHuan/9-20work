import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private Container cp;
    private JPanel jp1 =new JPanel(new GridLayout(3,4,3,3));
    private JPanel jp2 =new JPanel(new GridLayout(1,1,3,3));
    private JPanel jp3 =new JPanel(new GridLayout(1,1,3,3));
    private JPasswordField jpas =new JPasswordField();
    private JButton jb1 =new JButton("0");
    private JButton jb2 =new JButton("1");
    private JButton jb3 =new JButton("2");
    private JButton jb4 =new JButton("3");
    private JButton jb5 =new JButton("4");
    private JButton jb6 =new JButton("5");
    private JButton jb7 =new JButton("6");
    private JButton jb8 =new JButton("7");
    private JButton jb9 =new JButton("8");
    private JButton jb10 =new JButton("9");
    private JButton jb11 =new JButton("submit");
    private JButton jb12 =new JButton("exit");
    private JLabel jl =new JLabel("0");
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(500,500,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.add(jp1,BorderLayout.CENTER);
        cp.add(jp2,BorderLayout.NORTH);
        cp.add(jp3,BorderLayout.SOUTH);
        jb1.setFont(new Font(null, Font.PLAIN, 20));
        jb2.setFont(new Font(null, Font.PLAIN, 20));
        jb3.setFont(new Font(null, Font.PLAIN, 20));
        jb4.setFont(new Font(null, Font.PLAIN, 20));
        jb5.setFont(new Font(null, Font.PLAIN, 20));
        jb6.setFont(new Font(null, Font.PLAIN, 20));
        jb7.setFont(new Font(null, Font.PLAIN, 20));
        jb8.setFont(new Font(null, Font.PLAIN, 20));
        jb9.setFont(new Font(null, Font.PLAIN, 20));
        jb10.setFont(new Font(null, Font.PLAIN, 20));
        jb11.setFont(new Font(null, Font.PLAIN, 20));
        jb12.setFont(new Font(null, Font.PLAIN, 20));
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);
        jp1.add(jb4);
        jp1.add(jb5);
        jp1.add(jb6);
        jp1.add(jb7);
        jp1.add(jb8);
        jp1.add(jb9);
        jp1.add(jb10);
        jp1.add(jb11);
        jp1.add(jb12);
        jp2.add(jpas);
        jp3.add(jl);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpas.setText(jpas.getText()+jb1.getText());
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpas.setText(jpas.getText()+jb2.getText());
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpas.setText(jpas.getText()+jb3.getText());
            }
        });
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpas.setText(jpas.getText()+jb4.getText());
            }
        });
        jb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpas.setText(jpas.getText()+jb5.getText());
            }
        });
        jb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpas.setText(jpas.getText()+jb6.getText());
            }
        });
        jb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpas.setText(jpas.getText()+jb7.getText());
            }
        });
        jb8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpas.setText(jpas.getText()+jb8.getText());
            }
        });
        jb9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpas.setText(jpas.getText()+jb9.getText());
            }
        });
        jb10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpas.setText(jpas.getText()+jb10.getText());
            }
        });
        jb11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (new String(jpas.getPassword()).equals("123")){
                    jl.setText("成功");
                }
            }
        });
        jb12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}
