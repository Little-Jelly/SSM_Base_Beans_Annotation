package assembly_annotation_1;

public class B_UserController3 {
    private B_UserService3 userService3;

    public void setUserService3(B_UserService3 userService3) {
        this.userService3 = userService3;
    }


//    public B_UserController3(B_UserService3 userService3) {
//        this.userService3 = userService3;
//    }

    public void say(){
        this.userService3.say();
        System.out.println("here in userController");
    }
}
