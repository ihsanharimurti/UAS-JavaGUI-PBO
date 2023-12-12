import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formframe extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    formframe frame = new formframe();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public formframe() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(formframe.class.getResource("/icon/undip.png")));
        setTitle("Sistem Informasi Mahasiswa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 450);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(10, 10, 338, 393);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 255, 255));
        panel_2.setBounds(10, 10, 318, 72);
        panel.add(panel_2);
        panel_2.setLayout(new BorderLayout(0, 0));
        
        JLabel lblNewLabel = new JLabel("Sistem Informasi");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER); 
        panel_2.add(lblNewLabel, BorderLayout.SOUTH);

        
        JPanel panel_2_1 = new JPanel();
        panel_2_1.setBackground(new Color(255, 255, 255));
        panel_2_1.setBounds(10, 123, 291, 59);
        panel.add(panel_2_1);
        panel_2_1.setLayout(null);
        
        JLabel lblNewLabel_2 = new JLabel("Email");
        lblNewLabel_2.setBounds(41, 0, 250, 25);
        lblNewLabel_2.setBackground(new Color(255, 255, 255));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2.setBorder(new EmptyBorder(5, 0, 5, 0));
        panel_2_1.add(lblNewLabel_2);
        
        textField = new JTextField();
        textField.setBounds(41, 25, 250, 34);
        panel_2_1.add(textField);
        textField.setColumns(10);
        
        JPanel panel_2_1_1 = new JPanel();
        panel_2_1_1.setBackground(Color.WHITE);
        panel_2_1_1.setBounds(10, 206, 291, 59);
        panel.add(panel_2_1_1);
        panel_2_1_1.setLayout(null);
        
        JLabel lblNewLabel_2_1 = new JLabel("Password");
        lblNewLabel_2_1.setBounds(41, 0, 250, 25);
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_2_1.setBorder(new EmptyBorder(5, 0, 5, 0));
        lblNewLabel_2_1.setBackground(Color.WHITE);
        panel_2_1_1.add(lblNewLabel_2_1);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(41, 25, 250, 34);
        panel_2_1_1.add(passwordField);
        
        JButton btnNewButton = new JButton("Login");
        btnNewButton.setBackground(new Color(0, 64, 128));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                String enteredEmail = textField.getText();
                String enteredPassword = new String(passwordField.getPassword());
                if (validateCredentials(enteredEmail, enteredPassword)) {
                    infoframe infoFrame = new infoframe();
                    infoFrame.setVisible(true);
                    dispose(); 
                } else {
                    showWarning();
                }
            }
        });
        btnNewButton.setBounds(216, 320, 85, 21);
        panel.add(btnNewButton);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 64, 128));
        panel_1.setBounds(348, 10, 338, 393);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setBounds(57, 23, 223, 233);
        panel_1.add(lblNewLabel_1);
        adjustIconSize(lblNewLabel_1, "/icon/undip.png");
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(0, 64, 128));
        panel_3.setBounds(10, 272, 318, 33);
        panel_1.add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));
        
        JLabel lblFakultasTeknik = new JLabel("FAKULTAS TEKNIK");
        lblFakultasTeknik.setForeground(new Color(255, 255, 255));
        lblFakultasTeknik.setHorizontalAlignment(SwingConstants.CENTER);
        lblFakultasTeknik.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel_3.add(lblFakultasTeknik, BorderLayout.SOUTH);
        
        JPanel panel_3_1 = new JPanel();
        panel_3_1.setBackground(new Color(0, 64, 128));
        panel_3_1.setBounds(10, 315, 318, 33);
        panel_1.add(panel_3_1);
        panel_3_1.setLayout(new BorderLayout(0, 0));
        
        JLabel lblNewLabel_3_1 = new JLabel("UNIVERSITAS DIPONEGORO");
        lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel_3_1.add(lblNewLabel_3_1, BorderLayout.NORTH);
    }

    private void adjustIconSize(JLabel label, String imagePath) {

        ImageIcon icon = new ImageIcon(formframe.class.getResource(imagePath));
        int labelWidth = label.getWidth();
        int labelHeight = label.getHeight();

        Image image = icon.getImage();

        Image newImage = image.getScaledInstance(labelWidth, labelHeight, java.awt.Image.SCALE_SMOOTH);

        ImageIcon newIcon = new ImageIcon(newImage);

        label.setIcon(newIcon);

        label.repaint();
    }
    
    private void showWarning() {
        javax.swing.JOptionPane.showMessageDialog(this, "Email atau Password salah!",
                "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
    }

    private boolean validateCredentials(String email, String password) {

        return email.equals("ihsanharimurti@students.undip.ac.id") && password.equals("ihsan12345");
    }
}
