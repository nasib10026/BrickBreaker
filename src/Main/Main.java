
package Main;

import Swing.EventLogin;


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
        
        EventLogin event = new EventLogin(){
            @Override
            public void loginDone() {
                main.removeAll();
                dispose();
                MainMenu d = new MainMenu();
                d.setTitle("MainMenu");
                d.setVisible(true);
            }

            @Override
            public void logOut() {
                
            }
            
        };
        loginAndRegister1.setEventLogin(event);
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        loginAndRegister1 = new Login.LoginAndRegister();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setLayout(new java.awt.BorderLayout());
        main.add(loginAndRegister1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Login.LoginAndRegister loginAndRegister1;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
