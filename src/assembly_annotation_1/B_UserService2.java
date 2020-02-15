package assembly_annotation_1;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("userService2")
public class B_UserService2 implements I_UserService2 {

    @Resource(name="userDao2")
    private I_UserDao2 userDao2;
    @Override
    public void say() {
        this.userDao2.say();
        System.out.println("here in userService");
    }
}
