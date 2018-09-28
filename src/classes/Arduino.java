/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import javax.swing.JButton;

public class Arduino {

    private ControlePorta arduino;

    /**
     * Construtor da classe Arduino
     */
    public Arduino() {
        arduino = new ControlePorta("COM11", 9600);
    }

    /**
     * Envia o comando para a porta serial
     *
     * @param angulo
     * @param eixo
     */
    public void comunicacaoArduino(int angulo, char eixo) {

        arduino.enviaDados(angulo, eixo);
        System.out.println(angulo);//Imprime o nome do botão pressionado

    }
}

