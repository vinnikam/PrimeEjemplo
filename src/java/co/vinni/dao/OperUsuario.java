/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.vinni.dao;

import co.vinni.dto.Usuario;
import interf.Operaciones;

/**
 *
 * @author Vinni
 */
public class OperUsuario implements Operaciones<Usuario>{

   @Override
   public int insertar(Usuario datos) {
      
      
      Operaciones o = (Operaciones) new OperacionesVehiculo();
      
      Operaciones op = (Operaciones) new OperUsuario();
      
      
      
      
      return 0;
   }
   
}
