package misc;

public class UserSession{
    public static String uname;
    public static String nama;
    private static String jabatan;

    public static String getUname() {
        if(uname == null){
            return "Username";
        }
            return uname;
    }

    public static void setUname(String aUname) {
        uname = aUname;
    }

    public static String getNama() {
        if(uname == null){
            return "User";
        }
        return nama;
    }

    public static void setNama(String aNama) {
        nama = aNama;
    }

    public static String getJabatan() {
        return jabatan;
    }

    public static void setJabatan(String aJabatan) {
        jabatan = aJabatan;
    }
}
