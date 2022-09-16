
package principal1;

import principal1.DTO.Club;
import principal1.DTO.Suscripcion;
import principal1.DTO.Usuario;

public class Principal1 {

    
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        int ID = 1000;
        usuario.setID(ID);
        usuario.setPrimerNombre("");
        usuario.setSegundoNombre("");
        usuario.setApellidoPaterno("");
        usuario.setApellidoMaterno("");
        usuario.setRut(0);
        usuario.setDv("");
        usuario.setFechaNacimiento("");
        usuario.setTelefono(0);
        usuario.setEmail("");
        usuario.setNombreUsuario("");
        usuario.setContraseña("");   
        
    
    
     String TipodeDeporte = ("Handball");
       Club club = new Club();
       int Codigo = 10;
       club.setNombreClub("Manquehue City");
       club.setCodigo(club.getNombreClub().substring(0,2).toUpperCase()+TipodeDeporte.substring(0,1)+Codigo);
       club.setFundador("");
       club.setanioFundado(0);
       club.setPais("");
       club.setLema("");
       club.setColor1("");
       club.setColor2 ("");
       club.setValorSuscripcion(0);
       
       
    }
    
