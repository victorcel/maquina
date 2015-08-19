/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorios;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author vbarrera
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    Thread hilo;
    boolean estado;
    int ranm[];
    int gana;
    int alea;
    Image icon;
    
    public Ventana() {
        
        initComponents();
        icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/favicon.png"));
        setIconImage(icon);
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        Panel p = new Panel("/imagenes/Ganador.jpg");
        jpanelGanador.add(p);
        selecionar.setEnabled(false);
        ale();
        ranm = new int[]{10101,
            10102, 10201,
            10202,
            10301,
            10302,
            10303,
            10304,
            10305,
            10306,
            10307,
            10308,
            10401,
            10402,
            10403,
            10404,
            10501,
            10502,
            10503,
            10504,
            10601,
            10602,
            10603,
            10604,
            10701,
            10702,
            10703,
            10704,
            10801,
            10802,
            10803,
            10804,
            10805,
            10806,
            10807,
            10808,
            10809,
            10810,
            10901,
            10902,
            10903,
            10904,
            11001,
            11002,
            11003,
            11004,
            11005,
            11006,
            11007,
            11101,
            11102,
            11103,
            11104,
            11105,
            11106,
            11107,
            11108,
            11109,
            11110,
            11201,
            11202,
            11203,
            11204,
            11205,
            11206,
            11301,
            11302,
            11303,
            11304,
            11305,
            11401,
            11402,
            11403,
            11404,
            11501,
            11502,
            11503,
            11504,
            11601,
            11602,
            11603,
            11604,
            11605,
            11606,
            11701,
            11702,
            11703,
            11704,
            11801,
            11802,
            11803,
            11804,
            11805,
            11806,
            11807,
            11808,
            11809,
            11810,
            11811,
            11812,
            11813,
            11814,
            11901,
            11902,
            11903,
            11904,
            11905,
            11906,
            11907,
            11908,
            12001,
            12002,
            12003,
            12004,
            12005,
            12006,
            12007,
            12008,
            12101,
            12102,
            12103,
            12104,
            12105,
            12106,
            12107,
            12108,
            12201,
            12202,
            12203,
            12204,
            12205,
            12206,
            12207,
            12301,
            12302,
            12303,
            12304,
            12305,
            12306,
            12307,
            12308,
            12401,
            12402,
            12403,
            12404,
            12501,
            12502,
            12503,
            12504,
            12601,
            12602,
            12603,
            12604,
            12701,
            12702,
            12703,
            12704,
            12705,
            12706,
            12707,
            12708,
            12709,
            12710,
            12801,
            12802,
            12803,
            12804,
            12805,
            12806,
            12807,
            12808,
            12809,
            12810,
            12811,
            12901,
            12902,
            12903,
            12904,
            12905,
            12906,
            13001,
            13002,
            13003,
            13004,
            13005,
            13006,
            13101,
            13102,
            13103,
            13104,
            13105,
            13106,
            13201,
            13202,
            13203,
            13204,
            13205,
            13206,
            20101,
            20102,
            20103,
            20104,
            20105,
            20106,
            20107,
            20108,
            20109,
            20110,
            20201,
            20202,
            20203,
            20204,
            20301,
            20302,
            20303,
            20304,
            20401,
            20402,
            20403,
            20404};
        estado = false;
    }
    
    public void ale() {
        hilo = new Thread(new Runnable() {
            Random rnd = new Random();
            
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(50);
                        alea = ranm[rnd.nextInt(220)];
                        if (gana != alea) {
                            numero.setText("" + alea);
                        }
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoGanador = new javax.swing.JDialog();
        jpanelGanador = new javax.swing.JPanel();
        ganagana = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        detener = new javax.swing.JToggleButton();
        numero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selecionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        ganador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        dialogoGanador.setTitle("Ganador");

        jpanelGanador.setDoubleBuffered(false);
        jpanelGanador.setFocusable(false);
        jpanelGanador.setOpaque(false);
        jpanelGanador.setRequestFocusEnabled(false);
        jpanelGanador.setVerifyInputWhenFocusTarget(false);

        ganagana.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        ganagana.setForeground(new java.awt.Color(255, 0, 153));
        ganagana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ganagana.setText(" ");

        javax.swing.GroupLayout jpanelGanadorLayout = new javax.swing.GroupLayout(jpanelGanador);
        jpanelGanador.setLayout(jpanelGanadorLayout);
        jpanelGanadorLayout.setHorizontalGroup(
            jpanelGanadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelGanadorLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(ganagana, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jpanelGanadorLayout.setVerticalGroup(
            jpanelGanadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelGanadorLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(ganagana, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout dialogoGanadorLayout = new javax.swing.GroupLayout(dialogoGanador.getContentPane());
        dialogoGanador.getContentPane().setLayout(dialogoGanadorLayout);
        dialogoGanadorLayout.setHorizontalGroup(
            dialogoGanadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoGanadorLayout.createSequentialGroup()
                .addComponent(jpanelGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        dialogoGanadorLayout.setVerticalGroup(
            dialogoGanadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoGanadorLayout.createSequentialGroup()
                .addComponent(jpanelGanador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generación Aleatoria Máquina");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.red);
        setIconImages(null);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        detener.setBackground(new java.awt.Color(204, 204, 0));
        detener.setText("Buscar numero");
        detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detenerActionPerformed(evt);
            }
        });

        numero.setFont(new java.awt.Font("Viner Hand ITC", 0, 100)); // NOI18N
        numero.setForeground(new java.awt.Color(255, 0, 153));
        numero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("No. Maquina Seleccionada");

        selecionar.setText("Seleccionar");
        selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nao.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGap(168, 168, 168)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(detener, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(selecionar, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(566, 566, 566))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(detener, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setToolTipText("");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setFocusable(false);
        jScrollPane2.setWheelScrollingEnabled(false);

        area.setEditable(false);
        area.setBackground(new java.awt.Color(0, 51, 102));
        area.setColumns(5);
        area.setFont(new java.awt.Font("Viner Hand ITC", 0, 80)); // NOI18N
        area.setForeground(new java.awt.Color(255, 0, 153));
        area.setLineWrap(true);
        area.setRows(5);
        area.setWrapStyleWord(true);
        area.setAutoscrolls(false);
        area.setFocusable(false);
        area.setRequestFocusEnabled(false);
        area.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(area);

        ganador.setFont(new java.awt.Font("Viner Hand ITC", 1, 50)); // NOI18N
        ganador.setForeground(new java.awt.Color(255, 0, 153));
        ganador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ganador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 153), 2, true));

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 1, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("No. Jugados");

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Maquina Ganadora");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303)
                .addComponent(ganador, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1001, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(577, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(262, 262, 262)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(ganador, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel3)
                    .addContainerGap(410, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel4)
                    .addContainerGap(410, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void detenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detenerActionPerformed
        if (detener.isSelected()) {
            if (!estado) {
                
                hilo.start();

                // hilo.stop();
            } else {
                hilo.resume();
                estado = false;
                detener.setText("Detener");
                selecionar.setEnabled(false);
                
            }
        } else {
            detener.setText("Continuar");
            selecionar.setEnabled(true);
            hilo.suspend();
            area.append(" \n" + alea);
            estado = true;
        }
        

    }//GEN-LAST:event_detenerActionPerformed

    private void selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarActionPerformed
        
        dialogoGanador.setVisible(true);
        dialogoGanador.setSize(508, 408);
        dialogoGanador.setMaximumSize(new Dimension(getWidth(), getHeight()));
        dialogoGanador.setIconImage(icon);
        dialogoGanador.setLocationRelativeTo(null);
        ganador.setText("" + numero.getText());
        ganagana.setText("" + numero.getText());
        

    }//GEN-LAST:event_selecionarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JToggleButton detener;
    private javax.swing.JDialog dialogoGanador;
    private javax.swing.JLabel ganador;
    private javax.swing.JLabel ganagana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpanelGanador;
    private javax.swing.JLabel numero;
    private javax.swing.JButton selecionar;
    // End of variables declaration//GEN-END:variables
}
