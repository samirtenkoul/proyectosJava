/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import U11_E0_ExPropia.MiExcepcionPar;
import static U11_E0_ExPropia.MiExcepcionPar.isPar;

/**
 *
 * @author Samir Tenkoul
 */
public class TesterExPropia {

    
    
    public static void main(String[] args) {
        try {
         MiExcepcionPar.isPar(6);
        } catch (MiExcepcionPar ex) {
            System.out.println(ex.getMessage());
        }
    }

}