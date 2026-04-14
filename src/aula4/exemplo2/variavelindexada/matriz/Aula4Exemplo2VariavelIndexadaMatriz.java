/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula4.exemplo2.variavelindexada.matriz;

import javax.swing.JOptionPane;

/**
 *
 * @author jwern
 */
public class Aula4Exemplo2VariavelIndexadaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                  double A[ ][ ] = new double[3][4];
          int i, j;

      // leitura dos valores
      for(i=0; i<3; i++) {
             for (j=0; j<4; j++){
               A[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da linha "+i+" e coluna "+j+": "));
             }
      }
          
      // escrita dos valores
      for(i=0; i<3; i++){
         for (j=0; j<4; j++){
            JOptionPane.showMessageDialog(null, "O valor contido na linha " +i+" e coluna "+j+ " eh " + A[i][j]);
         } }
  } }
