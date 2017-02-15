/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.UsuarioDAO;
import DAO.UsuarioJPADAO;
import java.util.List;
import javax.ejb.EJB;
import Modelo.Usuario;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Prometheus
 */
public class UsuarioBean 
{
    @EJB
    private UsuarioDAO dao;
    private static final char[] CONSTS_HEX = { '0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f' };
   
    public UsuarioBean() 
    {
        /*if (dao != null)
        {*/
            dao = new UsuarioJPADAO();
            System.out.println("***Usuario DAO ha sido creado***");
        //}
    }
    
    public static String getMD5(String stringAEncriptar) {
        try
        {
           MessageDigest msgd = MessageDigest.getInstance("MD5");
           byte[] bytes = msgd.digest(stringAEncriptar.getBytes());
           StringBuilder strbCadenaMD5 = new StringBuilder(2 * bytes.length);
           for (int i = 0; i < bytes.length; i++)
           {
               int bajo = (int)(bytes[i] & 0x0f);
               int alto = (int)((bytes[i] & 0xf0) >> 4);
               strbCadenaMD5.append(CONSTS_HEX[alto]);
               strbCadenaMD5.append(CONSTS_HEX[bajo]);
           }
           return strbCadenaMD5.toString();
        } catch (NoSuchAlgorithmException e) {
           return null;
        }
    }
    
    public Usuario IniciarSesion(String usuario,String contrasena)
    {
        contrasena = getMD5(contrasena);
        
        Usuario usu = Buscar(usuario);
        if (usu.getUsuPasword().equals(contrasena))
            return usu;
        else
            return null;
    }
    
    public List<Usuario> Listar()
    {
        return dao.ListarUsuario();
    }
    
    public Usuario Buscar(String usuario)
    {
        List<Usuario> usuarios = Listar();
        Usuario usu = null;
        for (Usuario u : usuarios)
        {
            if (u.getUsuUsuario().equals(usuario))
            {
                usu=u;
                break;
            }
        }
        return usu;
    }
    
    public void Crear(Usuario atr)
    {
        atr.setUsuPasword(getMD5(atr.getUsuPasword()));
        dao.crearUsuario(atr);
    }
    
    public Usuario Buscar(int id)
    {
        return dao.BuscarUsuario(id);
    }
    
    public void Eliminar(Usuario atr)
    {
        dao.EliminarUsuario(atr);
    }
    
    public void Modificar(Usuario atr)
    {
        dao.ModificarUsuario(atr);
    }
    
}
