/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronic_queue.Ui;

import electronic_queue.Button;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Terminal extends javax.swing.JFrame {
  Container container;
  FlowLayout FL;
  
    /**
     * Creates new form Terminnal
     */
    static GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
    public void createButton(){
        int height=0,width=0;
         Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

       // height=this.getHeight();
       height=dim.height;
         //System.out.println(  height);
        width=dim.width;
        int srheight= height/2;
        int srwidth=  width/2;
        int sr2height= srheight/2;
        int sr2width=  srwidth/2;
        int sr10procwidth=sr2width/6;
       int sr4procr2heigh=sr2height/4;   
       
        int bheight=sr2height/2,bwidth=sr2width/2;
        
      
    
        
        ArrayList<JButton> jb=new ArrayList<JButton>();
       // for(int i=0;i<9;i++){
          /* JButton j= new JButton("knopka 1 ");
       ActionListeners  a=new ActionListeners();
           j.addActionListener(a);
     j.setBounds(sr10procwidth-(int)(sr10procwidth*0.5), sr4procr2heigh, sr2width+sr10procwidth,sr2height-sr4procr2heigh);          
     jb.add(j);*/
       Button j= new Button("knopka 1 ",sr10procwidth-(int)(sr10procwidth*0.5), sr4procr2heigh, sr2width+sr10procwidth,sr2height-sr4procr2heigh);
     jb.add(j);
     JButton j1= new JButton("knopka 2 ");
     j1.setBounds(sr10procwidth-(int)(sr10procwidth*0.5), srheight-j.getHeight()/2, sr2width+sr10procwidth,sr2height-sr4procr2heigh);  
      ActionExit  a1=new ActionExit();
          j1.addActionListener(a1);   
     jb.add(j1);
      JButton j3= new JButton("knopka 3");
     j3.setBounds(sr10procwidth-(int)(sr10procwidth*0.5), srheight+ sr4procr2heigh*3, sr2width+sr10procwidth,sr2height-sr4procr2heigh);  
     jb.add(j3);
     
     
     
     
      JButton j4= new JButton("knopka 4");
     j4.setBounds(srwidth-3*sr10procwidth-(int)(sr10procwidth*0.5), sr4procr2heigh, sr2width+sr10procwidth,sr2height-sr4procr2heigh);  
     jb.add(j4);
      JButton j5= new JButton("knopka 5");
     j5.setBounds(srwidth-3*sr10procwidth-(int)(sr10procwidth*0.5), srheight-j.getHeight()/2, sr2width+sr10procwidth,sr2height-sr4procr2heigh);  
     jb.add(j5);
      JButton j6= new JButton("knopka 6");
     j6.setBounds(srwidth-3*sr10procwidth-(int)(sr10procwidth*0.5), srheight+ sr4procr2heigh*3, sr2width+sr10procwidth,sr2height-sr4procr2heigh);  
     jb.add(j6);
     
     
      JButton j7= new JButton("knopka 8");
     j7.setBounds(srwidth+5*sr10procwidth-(int)(sr10procwidth*0.5), sr4procr2heigh, sr2width+sr10procwidth,sr2height-sr4procr2heigh);  
     jb.add(j7);
      JButton j8= new JButton("knopka 9");
     j8.setBounds(srwidth+5*sr10procwidth-(int)(sr10procwidth*0.5), srheight-j.getHeight()/2, sr2width+sr10procwidth,sr2height-sr4procr2heigh);  
     jb.add(j8);
      JButton j9= new JButton("knopka ");
     j9.setBounds(srwidth+5*sr10procwidth-(int)(sr10procwidth*0.5), srheight+ sr4procr2heigh*3, sr2width+sr10procwidth,sr2height-sr4procr2heigh);  
     jb.add(j9);
     
        
      //  p1.setLayout(new FlowLayout( ));
     // p1.setLayout(new GridLayout());
      /* JPanel p2=new JPanel();
          p2.setLayout(new BorderLayout(25,25));
         JPanel p3=new JPanel();
          p3.setLayout(new BorderLayout(25,25));
        BorderLayout b= new BorderLayout(25,25);
        */
 /*                  
        p1.add(jb.get(0));
        p1.add(jb.get(1));
        p1.add(jb.get(2));
        
     /*   for(int i=3;i<6;i++){
         p2.add(jb.get(i), BorderLayout.CENTER);}
        for(int i=6;i<9;i++){
         p3.add(jb.get(i), BorderLayout.EAST);}
        */
 
  for(int i=0;i<9;i++){
   container.add(jb.get(i));}
      
      
       //container=p1;
      //  container.add(p2);
     //   container.add(p3);
    
    }
    
    
    
    public Terminal() {
          
        
         
        
          container=this.getContentPane();
      //  container.setLayout(new FlowLayout());
         container.setLayout(null);
         
       // initComponents();
     // setUndecorated(true);
      //setExtendedState(JFrame.MAXIMIZED_BOTH);
    //  setUndecorated(true);
      
      //setVisible(true); 
       createButton();
       
    
     
     
         
        
         pack();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${defaultCloseOperation}"), this, org.jdesktop.beansbinding.BeanProperty.create("undecorated"));
        bindingGroup.addBinding(binding);

        jButton1.setText("jButton1");
        jButton1.setAlignmentX(7.0F);
        jButton1.setMargin(new java.awt.Insets(4, 14, 2, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jButton1)
                .addContainerGap(459, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jButton1)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Terminal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
