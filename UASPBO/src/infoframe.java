import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class infoframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					infoframe frame = new infoframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public infoframe() {
		setTitle("Sistem Informasi Mahasiswa");
		setIconImage(Toolkit.getDefaultToolkit().getImage(infoframe.class.getResource("/icon/undip.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 151, 158);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 151, 158);
		panel.add(lblNewLabel);
        adjustIconSize(lblNewLabel, "/icon/IhsanHarimurti_Almet.jpg");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 64, 128));
		panel_1.setBounds(171, 10, 505, 158);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 64, 128));
		panel_3.setBounds(0, 0, 113, 26);
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Nama");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblNewLabel_2.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_3.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel(":");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3.add(lblNewLabel_3, BorderLayout.EAST);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(0, 64, 128));
		panel_3_1.setBounds(0, 25, 113, 26);
		panel_1.add(panel_3_1);
		panel_3_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1 = new JLabel("NIM");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_3_1.add(lblNewLabel_2_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3_1 = new JLabel(":");
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3_1.add(lblNewLabel_3_1, BorderLayout.EAST);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(new Color(0, 64, 128));
		panel_3_1_1.setBounds(0, 50, 113, 26);
		panel_1.add(panel_3_1_1);
		panel_3_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Departemen");
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_3_1_1.add(lblNewLabel_2_1_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3_1_1 = new JLabel(":");
		lblNewLabel_3_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3_1_1.add(lblNewLabel_3_1_1, BorderLayout.EAST);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBackground(new Color(0, 64, 128));
		panel_3_1_1_1.setBounds(0, 75, 113, 26);
		panel_1.add(panel_3_1_1_1);
		panel_3_1_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Dosen Wali");
		lblNewLabel_2_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_1.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_3_1_1_1.add(lblNewLabel_2_1_1_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel(":");
		lblNewLabel_3_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3_1_1_1.add(lblNewLabel_3_1_1_1, BorderLayout.EAST);
		
		JPanel panel_3_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1.setBackground(new Color(0, 64, 128));
		panel_3_1_1_1_1.setBounds(0, 103, 113, 26);
		panel_1.add(panel_3_1_1_1_1);
		panel_3_1_1_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Semester");
		lblNewLabel_2_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_1_1.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_3_1_1_1_1.add(lblNewLabel_2_1_1_1_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel(":");
		lblNewLabel_3_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3_1_1_1_1.add(lblNewLabel_3_1_1_1_1, BorderLayout.EAST);
		
		JPanel panel_3_1_1_1_1_1 = new JPanel();
		panel_3_1_1_1_1_1.setBackground(new Color(0, 64, 128));
		panel_3_1_1_1_1_1.setBounds(0, 132, 113, 26);
		panel_1.add(panel_3_1_1_1_1_1);
		panel_3_1_1_1_1_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Angkatan");
		lblNewLabel_2_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_1_1_1.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_3_1_1_1_1_1.add(lblNewLabel_2_1_1_1_1_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel(":");
		lblNewLabel_3_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3_1_1_1_1_1.add(lblNewLabel_3_1_1_1_1_1, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 64, 128));
		panel_4.setBounds(123, 0, 168, 26);
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Ihsan Harimurti");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel_4.add(lblNewLabel_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(new Color(0, 64, 128));
		panel_4_1.setBounds(123, 25, 168, 26);
		panel_1.add(panel_4_1);
		panel_4_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("21120121140128");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setForeground(Color.WHITE);
		panel_4_1.add(lblNewLabel_1_1, BorderLayout.CENTER);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBackground(new Color(0, 64, 128));
		panel_4_2.setBounds(123, 50, 168, 26);
		panel_1.add(panel_4_2);
		panel_4_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_2 = new JLabel("Teknik Komputer");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setForeground(Color.WHITE);
		panel_4_2.add(lblNewLabel_1_2, BorderLayout.CENTER);
		
		JPanel panel_4_3 = new JPanel();
		panel_4_3.setBackground(new Color(0, 64, 128));
		panel_4_3.setBounds(123, 75, 358, 26);
		panel_1.add(panel_4_3);
		panel_4_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_3 = new JLabel("Prof. Dr. Ir. R. Rizal Isnanto, S.T., M.M., M.T., IPU, ASEAN Eng.");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setForeground(Color.WHITE);
		panel_4_3.add(lblNewLabel_1_3, BorderLayout.CENTER);
		
		JPanel panel_4_4 = new JPanel();
		panel_4_4.setBackground(new Color(0, 64, 128));
		panel_4_4.setBounds(123, 103, 168, 26);
		panel_1.add(panel_4_4);
		panel_4_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_4 = new JLabel("5");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_4.setForeground(Color.WHITE);
		panel_4_4.add(lblNewLabel_1_4, BorderLayout.CENTER);
		
		JPanel panel_4_5 = new JPanel();
		panel_4_5.setBackground(new Color(0, 64, 128));
		panel_4_5.setBounds(123, 132, 168, 26);
		panel_1.add(panel_4_5);
		panel_4_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_5 = new JLabel("2021");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_5.setForeground(Color.WHITE);
		panel_4_5.add(lblNewLabel_1_5, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 64, 128));
		panel_2.setBounds(10, 192, 666, 182);
		contentPane.add(panel_2);
		
        Object[][] data = {
                {"Pemrograman Jaringan", "2", "Senin"},
                {"Metodologi Penelitian", "2", "Senin"},
                {"TMA", "3", "Selasa"},
                {"PBO", "3", "Selasa"},
                {"Pengolahan Sinyal", "3", "Rabu"},
                {"Kewirausahaan", "2", "Kamis"},
                {"BPR", "2", "Kamis"},
                {"SDL", "2", "Kamis"},
                {"SOWN", "2", "Kamis"},

            };


            String[] columnNames = {"Mata Kuliah", "SKS", "Jadwal Kelas"};


            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            

            table = new JTable(model);
            
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);


            panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
            panel_2.add(table.getTableHeader());
            panel_2.add(table);
            
            JButton btnNewButton = new JButton("Logout");
            btnNewButton.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
                    formframe formframe = new formframe();
                    formframe.setVisible(true);
                    dispose(); 
            	}
            });
            btnNewButton.setBackground(new Color(0, 64, 128));
            btnNewButton.setForeground(new Color(255, 255, 255));
            btnNewButton.setBounds(591, 382, 85, 21);
            contentPane.add(btnNewButton);
	}
    private void adjustIconSize(JLabel label, String imagePath) {

        ImageIcon icon = new ImageIcon(infoframe.class.getResource(imagePath));
        int labelWidth = label.getWidth();
        int labelHeight = label.getHeight();

        Image image = icon.getImage();

        Image newImage = image.getScaledInstance(labelWidth, labelHeight, java.awt.Image.SCALE_SMOOTH);

        ImageIcon newIcon = new ImageIcon(newImage);

        label.setIcon(newIcon);

        label.repaint();
    }
    

}
