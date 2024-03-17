/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author Agriel
 */
public class userSession {
    private static String id_user, _nama;
    
    public static void setId(String id){
        userSession.id_user = id;
    }
    public static String getId(){
        return id_user;
    }
    
    public static void setNama(String nama){
        userSession._nama = nama;
    }
    public static String getNama(){
        if(_nama == null){
            return "User";
        }else{
            return _nama;
        }
    }
}
