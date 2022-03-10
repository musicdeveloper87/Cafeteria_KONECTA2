/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class productos2 {
    Connection conexion;
    public productos2() throws ClassNotFoundException{
    conexion con= new conexion();
    conexion=con.getconexion();
    }
    public List <productos>ListarProductos(){
        PreparedStatement ps;
        ResultSet rs;
        
        List<productos>Lista=new ArrayList<>();
        
        try{
            ps=conexion.prepareStatement("SELECT id, nombre, referencia, precio,peso,categoria,existencia,fecha FROM productos");
            rs=ps.executeQuery();
            while (rs.next()){
                
                int id=rs.getInt("id");
                String nombre=rs.getString("nombre");
                String referencia=rs.getString("referencia");
                int precio=rs.getInt("precio");
                int peso=rs.getInt("peso");
                String categoria=rs.getString("categoria");
                int existencia=rs.getInt("existencia");
                String fecha=rs.getString("fecha");
                
                productos producto=new productos(id,nombre,referencia,precio,peso,categoria,existencia,fecha);
             Lista.add(producto);
             
              
            }
            return Lista;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
            
            
        }
    }
     public productos mostrarproducto(int _id){
        PreparedStatement ps;
        ResultSet rs;
        
        productos producto = null;
        
        try{
            ps=conexion.prepareStatement("SELECT id, nombre, referencia, precio,peso,categoria,existencia,fecha FROM productos WHERE id=?");
            ps.setInt(_id,_id);
            rs=ps.executeQuery();
            while (rs.next()){
                
                int id=rs.getInt("id");
                String nombre=rs.getString("nombre");
                String referencia=rs.getString("referencia");
                int precio=rs.getInt("precio");
                int peso=rs.getInt("peso");
                String categoria=rs.getString("categoria");
                int existencia=rs.getInt("existencia");
                String fecha=rs.getString("fecha");
                
                producto=new productos(id,nombre,referencia,precio,peso,categoria,existencia,fecha);
   
             
              
            }
            return producto;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
}
     }
      public boolean insertarproducto(productos producto){
        PreparedStatement ps;
        
        
        try{
            ps=conexion.prepareStatement("INSERT INTO productos(id,nombre,referencia,precio,peso,categoria,existencia,fecha)VALUES(?,?,?;?;?;?;?;?");
            ps.setInt(1,producto.getId());
            ps.setString(2,producto.getNombre());
              ps.setString(3,producto.getReferencia());
               ps.setInt(4,producto.getPrecio());
               ps.setInt(5,producto.getPeso());
               ps.setString(6,producto.getCategoria());
               ps.setInt(7,producto.getExistencia());
               ps.setString(8,producto.getFecha());
               
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
}
     }
       public boolean actualizar(productos producto){
        PreparedStatement ps;
        
        
        try{
            ps=conexion.prepareStatement("UPDATE productos SET id=?,nombre=?,referencia=?,precio=?,peso=?,categoria=?,existencia=?,fecha=?WHERE cod=?");
            ps.setInt(1,producto.getId());
            ps.setString(2,producto.getNombre());
              ps.setString(3,producto.getReferencia());
               ps.setInt(4,producto.getPrecio());
               ps.setInt(5,producto.getPeso());
               ps.setString(6,producto.getCategoria());
               ps.setInt(7,producto.getExistencia());
               ps.setString(8,producto.getFecha());
           
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
}
       }
       public boolean ventas(int _id){
        PreparedStatement ps;
        
        
        try{
            ps=conexion.prepareStatement("DELETE FROM WHERE id=?");
            ps.setInt(1, _id);
           
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
}
       }
}




