package patron.strategy.principal;

import javax.swing.JOptionPane;
import patron.strategy.excepciones.ConstructorIncorrectoException;
import patron.strategy.excepciones.PoligonoNoExisteException;
import patron.strategy.excepciones.PoligonoNoSoportadoException;
import patron.strategy.implementacion.CuerpoGeometrico;

public class Formulario extends javax.swing.JFrame {

    public Formulario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoFiguras = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbCirculo = new javax.swing.JRadioButton();
        rbPoligono = new javax.swing.JRadioButton();
        rbRectangulo = new javax.swing.JRadioButton();
        rbTriangulo = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoBase = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        campoRadio = new javax.swing.JTextField();
        campoLados = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(".:: Calcular áreas ::.");
        setResizable(false);

        jLabel1.setText("Seleccione Figura Geométrica:");

        grupoFiguras.add(rbCirculo);
        rbCirculo.setText("Círculo");
        rbCirculo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbCirculoStateChanged(evt);
            }
        });

        grupoFiguras.add(rbPoligono);
        rbPoligono.setText("Polígono Regular");
        rbPoligono.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbPoligonoItemStateChanged(evt);
            }
        });

        grupoFiguras.add(rbRectangulo);
        rbRectangulo.setText("Rectángulo");
        rbRectangulo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbRectanguloItemStateChanged(evt);
            }
        });

        grupoFiguras.add(rbTriangulo);
        rbTriangulo.setText("Triángulo");
        rbTriangulo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbTrianguloItemStateChanged(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setText("Base:");

        jLabel3.setText("Altura:");

        jLabel4.setText("Radio:");

        jLabel5.setText("Lados:");

        campoBase.setEnabled(false);

        campoAltura.setEnabled(false);

        campoRadio.setEnabled(false);

        campoLados.setEnabled(false);

        btnCalcular.setText("Calcular Área");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbTriangulo)
                            .addComponent(rbRectangulo)
                            .addComponent(rbPoligono)
                            .addComponent(rbCirculo)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoBase)
                            .addComponent(campoAltura)
                            .addComponent(campoRadio)
                            .addComponent(campoLados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rbCirculo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbPoligono)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbRectangulo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rbTriangulo))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(campoBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(campoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(campoLados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void activarCasillas() {
        // Limpiamos y desactivamos todos.
        campoRadio.setText(null);
        campoAltura.setText(null);
        campoLados.setText(null);
        campoBase.setText(null);        
        campoRadio.setEnabled(false);
        campoAltura.setEnabled(false);
        campoLados.setEnabled(false);
        campoBase.setEnabled(false);
        // Activamos lo correspondiente.
        if(rbCirculo.isSelected()) 
            campoRadio.setEnabled(true);
        if(rbPoligono.isSelected()) {
            campoRadio.setEnabled(true);
            campoLados.setEnabled(true);
        }
        if(rbTriangulo.isSelected() || rbRectangulo.isSelected()) {
            campoBase.setEnabled(true);
            campoAltura.setEnabled(true);
        }
        if(rbTriangulo.isSelected())
            campoLados.setText("3");
        if(rbRectangulo.isSelected())
            campoLados.setText("4");
    }
    
    private void rbCirculoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbCirculoStateChanged
        activarCasillas();
    }//GEN-LAST:event_rbCirculoStateChanged

    private void rbPoligonoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbPoligonoItemStateChanged
        activarCasillas();
    }//GEN-LAST:event_rbPoligonoItemStateChanged

    private void rbRectanguloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbRectanguloItemStateChanged
        activarCasillas();
    }//GEN-LAST:event_rbRectanguloItemStateChanged

    private void rbTrianguloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbTrianguloItemStateChanged
        activarCasillas();
    }//GEN-LAST:event_rbTrianguloItemStateChanged
    
    private CuerpoGeometrico figura;
    
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            if(rbCirculo.isSelected())
                figura = new CuerpoGeometrico(
                        Float.parseFloat(campoRadio.getText()) );
            if(rbPoligono.isSelected())
                figura = new CuerpoGeometrico(
                        Float.parseFloat(campoRadio.getText()),
                        Integer.parseInt(campoLados.getText()) );
            if(rbTriangulo.isSelected() || rbRectangulo.isSelected())
                figura = new CuerpoGeometrico(
                        Float.parseFloat(campoBase.getText()),
                        Float.parseFloat(campoAltura.getText()),
                        Integer.parseInt(campoLados.getText()) );
            figura.establecerTipo();
            JOptionPane.showMessageDialog(this, figura.obtenerResultado(), "Resultado...", JOptionPane.INFORMATION_MESSAGE);
        } catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Se ingresaron valores no numéricos.", "Error...", JOptionPane.ERROR_MESSAGE);
        } catch(ConstructorIncorrectoException | PoligonoNoExisteException | PoligonoNoSoportadoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error ...", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    public static void main(String args[]) {
        new Formulario().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoBase;
    private javax.swing.JTextField campoLados;
    private javax.swing.JTextField campoRadio;
    private javax.swing.ButtonGroup grupoFiguras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rbCirculo;
    private javax.swing.JRadioButton rbPoligono;
    private javax.swing.JRadioButton rbRectangulo;
    private javax.swing.JRadioButton rbTriangulo;
    // End of variables declaration//GEN-END:variables
}
