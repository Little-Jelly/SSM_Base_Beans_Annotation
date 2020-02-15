import assembly_annotation_1.B_UserController2;
import assembly_xml.B_User_1;
import assembly_xml.B_User_2;
import assembly_xml.B_Dependence_Injection;
import instantiateDependence.I_UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello, world");
        Main m = new Main();
//        m.test_replace_new();
//        m.assembly_by_constructor();
//        m.assembly_by_constructor2();
//        m.assembly_by_construstor3();
        m.assembly_auto();
    }

    /*
    *   des: how to use spring's thinking to get the object of the dependence
    *   test-result: successfully
    * */
    public void test_replace_new(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("instantiateDependence/applicationContext.xml");
        I_UserDao test = (I_UserDao) applicationContext.getBean("bean1");
        test.say();
    }

    /*
    *   des: to use constructor to assembly the Bean
    *   inject args: simple types
    *   constructor args value restoration : index
    *   related xml : applicationContext1.xml
    *   test-result : successfully
    * */
    public void assembly_by_constructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("assembly_xml/applicationContext1.xml");
        B_User_1 test = (B_User_1) applicationContext.getBean("b_userDao_1");
        System.out.println(test.toString());
    }

    /*
    *  des : to use constructor to assembly the Bean
    *  inject args: simple types
    *  constructor args value restoration: type
    *  related xml: applicationContext2.xml
    *  test-result: successfully
    * */
    public void assembly_by_constructor2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("assembly_xml/applicationContext2.xml");
        B_User_2 test = (B_User_2) applicationContext.getBean("b_userDao_2");
        System.out.println(test.toString());
    }

    /*
    *   des: to use constructor to assembly the Bean
    *   inject args: POJO
    *   constructor args value restoration: nested ref element
    *   related xml: applicationContext3.xml
    *   test-result: successfully
    * */
    public void assembly_by_construstor3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("assembly_xml/applicationContext3.xml");
        B_Dependence_Injection test = (B_Dependence_Injection) applicationContext.getBean("b_Dependence_Injection");
        test.business();
    }

    /*
    *   des:
    * */
    public void assembly_auto(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("assembly_annotation_1/applicationContext4.xml");
        B_UserController2 test = (B_UserController2)applicationContext.getBean("userController");
        test.say();
    }
}
