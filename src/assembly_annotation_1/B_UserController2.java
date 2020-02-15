package assembly_annotation_1;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userController")
public class B_UserController2 {
    @Resource(name = "userService2")
    private I_UserService2 userService2;
    public void say(){
        this.userService2.say();
        System.out.println("here in userController....");
    }
}
