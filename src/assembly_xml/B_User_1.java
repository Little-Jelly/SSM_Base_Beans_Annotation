package assembly_xml;

import java.util.List;

public class B_User_1 {
    private String username;
    private Integer passwrod;
    private List<String> list;

    public B_User_1(String username, Integer password, List<String > list){
        super();
        this.username = username;
        this.passwrod = password;
        this.list = list;
    }

    public String toString(){
        return "username:"+this.username+", password:" +this.passwrod + ", List:"+ this.list.toString();
    }
}
