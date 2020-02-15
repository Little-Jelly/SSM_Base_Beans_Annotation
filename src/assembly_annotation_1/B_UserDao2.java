package assembly_annotation_1;

import org.springframework.stereotype.Repository;

@Repository("userDao2")
public class B_UserDao2 implements I_UserDao2 {
    public void say(){
        System.out.println("here in userdao....");
    }
}
