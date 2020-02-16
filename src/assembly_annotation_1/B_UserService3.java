package assembly_annotation_1;

public class B_UserService3 implements I_UserService3 {

    private B_UserDao3 userDao3;

    public void setUserDao3(B_UserDao3 userDao3) {
        this.userDao3 = userDao3;
    }


//    public B_UserService3(B_UserDao3 userDao3) {
//        this.userDao3 = userDao3;
//    }

    @Override
    public void say() {
        this.userDao3.say();
        System.out.println("here in UserService");
    }
}
