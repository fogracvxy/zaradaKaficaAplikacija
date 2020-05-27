package zadatak_projekt_mspudic;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

/**
 *
 * @author MSpudic
 */

public class kaficiZaradaViewForm extends javax.swing.JFrame {

    public kaficiZaradaViewForm() {
        getContentPane().setBackground(Color.LIGHT_GRAY);
        initComponents();
    }


    private void initComponents() {

        tekstKafic1 = new javax.swing.JTextField();
        tekstZarada1 = new javax.swing.JTextField();
        tekstMjesec = new javax.swing.JTextField();
        tekstZaMjesec = new javax.swing.JTextField();
        tekstZaKafic = new javax.swing.JTextField();
        tekstMjesto = new javax.swing.JTextArea();
        tekstMjesto.setBackground(new Color(0, 204, 204));
        spudaLabel1 = new javax.swing.JLabel();
        spudaLabel3 = new javax.swing.JLabel();
        spudaLabel4 = new javax.swing.JLabel();
        spudaScrollPane = new javax.swing.JScrollPane();
        gumbUnos = new javax.swing.JButton();
        gumbProvjeriZaMjesec = new javax.swing.JButton();
        gumbIspisSve = new javax.swing.JButton();
        gumbIspisZaKafic = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);



        spudaLabel1.setText("Naziv kafica");

        spudaLabel3.setText("Unos mjeseca");

        spudaLabel4.setText("Zarada kafica");

        tekstMjesto.setColumns(10);
        tekstMjesto.setRows(5);
        spudaScrollPane.setViewportView(tekstMjesto);

        gumbUnos.setText("Potvrdi unos");
        gumbUnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumbUnosActionPerformed(evt);
            }
        });

        gumbProvjeriZaMjesec.setText("Provjeri za mjesec");
        gumbProvjeriZaMjesec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumbProvjeriZaMjesecActionPerformed(evt);
            }
        });

        gumbIspisSve.setText("Ispisi sve");
        gumbIspisSve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumbIspisSveActionPerformed(evt);
            }
        });

        gumbIspisZaKafic.setText("Ispisi zaradu za kafic");
        gumbIspisZaKafic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumbIspisZaKaficActionPerformed(evt);
            }
        });

        JLabel lblNewLabel = new JLabel("Unos mjeseca pretrage");

        spudaLabelPretragaKafica = new JLabel("Unos naziva kafica pretrage");

        spudaLabel6 = new JLabel("FILTERI");

        spudaLabel7 = new JLabel("Projekt Kafici Zarada");
        
        tekstProsZarada = new JTextField();
        tekstProsZarada.setColumns(10);
        
        JButton gumbProsjecnoMjesecnoZaKafic = new JButton(" Prosjecna mjesecna zarada za kafic");
        gumbProsjecnoMjesecnoZaKafic.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		gumbProsjecnoMjesecnoZaKaficPerformed(evt);
        	}
        });
        
        JLabel lblNewLabel_1 = new JLabel("Unesite naziv kafica za ispis prosjecne zarade");
        
        JButton gumbBrisanjeSvega = new JButton("Brisi zadnji unos");
        gumbBrisanjeSvega.addActionListener(new ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		gumbBrisanjeSvega(evt);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addContainerGap()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(gumbIspisZaKafic)
        								.addGroup(layout.createSequentialGroup()
        									.addGap(8)
        									.addComponent(tekstZaKafic, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
        								.addComponent(gumbProvjeriZaMjesec)
        								.addComponent(spudaLabelPretragaKafica, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
        								.addGroup(layout.createSequentialGroup()
        									.addGap(9)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(lblNewLabel)
        										.addComponent(tekstZaMjesec, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))))
        							.addGap(68))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(19)
        							.addComponent(spudaLabel7, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(gumbBrisanjeSvega)
        					.addGap(18))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(120)
        					.addComponent(spudaLabel6)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(spudaScrollPane, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(spudaLabel1)
        						.addComponent(spudaLabel3))
        					.addGap(50)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(tekstMjesec, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
        						.addComponent(tekstKafic1, Alignment.LEADING))
        					.addGap(18)
        					.addComponent(spudaLabel4)))
        			.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
        			.addComponent(tekstZarada1, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addGap(204)
        			.addComponent(gumbIspisSve, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        			.addGap(44))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(137)
        			.addComponent(tekstProsZarada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(526, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(86)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lblNewLabel_1)
        				.addComponent(gumbProsjecnoMjesecnoZaKafic))
        			.addPreferredGap(ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
        			.addComponent(gumbUnos)
        			.addGap(22))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(16)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(tekstMjesec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(spudaLabel3))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(tekstKafic1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(spudaLabel1)
        						.addComponent(tekstZarada1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(spudaLabel4)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(27)
        					.addComponent(spudaLabel7)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(spudaLabel6)))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(lblNewLabel_1)
        			.addGap(26)
        			.addComponent(tekstProsZarada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(gumbUnos)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(gumbProsjecnoMjesecnoZaKafic)
        					.addGap(20)))
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(1)
        					.addComponent(lblNewLabel)
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(spudaScrollPane, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(15)
        							.addComponent(tekstZaMjesec, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(gumbProvjeriZaMjesec)
        							.addGap(15)
        							.addComponent(spudaLabelPretragaKafica)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(tekstZaKafic, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(gumbIspisZaKafic, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(gumbBrisanjeSvega)))
        			.addGap(18)
        			.addComponent(gumbIspisSve)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }
    public void gumbBrisanjeSvega(java.awt.event.ActionEvent evt) {

        if (kaficiZaradaController.ispisSvihZarada().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vec je prazno!", "Prazno!", JOptionPane.ERROR_MESSAGE);
        }
        kaficiZaradaController.brisiZadnjiUnos();
        tekstMjesto.setText(kaficiZaradaController.ispisSvihZarada());
    }

    public void gumbProsjecnoMjesecnoZaKaficPerformed(java.awt.event.ActionEvent evt) {
        // treba dodat fix za taj dio provjere
        if (tekstProsZarada.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prazno je upisite ime kafica!", "Prazno!", JOptionPane.ERROR_MESSAGE);
        }else if ((kaficiZaradaController.ispisSvihZarada().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Prazno je!", "Prazno!", JOptionPane.ERROR_MESSAGE);
        }else {
            tekstMjesto.setText(kaficiZaradaController.ispisProsjecneZaradeZaOdredeniKafic(tekstProsZarada.getText()));
        }

    }
    private void gumbUnosActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String kafic = tekstKafic1.getText();

            int mjesec = Integer.parseInt(tekstMjesec.getText());

            float zarada = Float.parseFloat(tekstZarada1.getText());

            kaficiZaradaController.unesiMjesecnuZaradu(kafic, mjesec, zarada);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Popunite sve i kliknite potvrdite unos", "Prazni unos", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void gumbProvjeriZaMjesecActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            tekstMjesto.setText(kaficiZaradaController.ispisZaradeZaMjesec(Integer.parseInt(tekstZaMjesec.getText())));
        } catch (Exception e) {
        	// ako je tekst za filtriranje prazan ispisat ce se message dialog "Unesite mjesec za filtriranje"
            if (tekstZaMjesec.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Unesite mjesec za filtriranje", "Krivi Upis", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void gumbIspisSveActionPerformed(java.awt.event.ActionEvent evt) {
        tekstMjesto.setText(kaficiZaradaController.ispisSvihZarada());
        // u slucaju da je prazna tablica i klikne se ispisi sve pokazat ce se message dialog "nema mogucih ispisa"
        if (kaficiZaradaController.ispisSvihZarada().isEmpty()) {
        	 JOptionPane.showMessageDialog(null, "Nema mogucih ispisa", "Prazno!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void gumbIspisZaKaficActionPerformed(java.awt.event.ActionEvent evt) {
        tekstMjesto.setText(kaficiZaradaController.ispisZaradeZaKafic(tekstZaKafic.getText()));
        if (tekstZaKafic.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Unesite ime kafica za filtriranje", "Krivi Upis", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(kaficiZaradaViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kaficiZaradaViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kaficiZaradaViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kaficiZaradaViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kaficiZaradaViewForm().setVisible(true);
            }
        });
    }

    private javax.swing.JButton gumbIspisZaKafic;
    private javax.swing.JTextArea tekstMjesto;
    private javax.swing.JButton gumbIspisSve;
    private javax.swing.JButton gumbProvjeriZaMjesec;
    private javax.swing.JButton gumbUnos;
    private javax.swing.JLabel spudaLabel1;
    private javax.swing.JLabel spudaLabel3;
    private javax.swing.JLabel spudaLabel4;
    private javax.swing.JLabel spudaLabel6;
    private javax.swing.JLabel spudaLabel7;
    private javax.swing.JLabel spudaLabelPretragaKafica;
    private javax.swing.JScrollPane spudaScrollPane;
    private javax.swing.JTextField tekstKafic1;
    private javax.swing.JTextField tekstMjesec;
    private javax.swing.JTextField tekstZarada1;
    private javax.swing.JTextField tekstZaKafic;
    private javax.swing.JTextField tekstZaMjesec;
    private JTextField tekstProsZarada;
    kaficiZaradaController kaficiZaradaController = new kaficiZaradaController();
}
