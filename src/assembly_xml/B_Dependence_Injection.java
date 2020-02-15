package assembly_xml;

public class B_Dependence_Injection {
    private B_be_Depended dep;
    public B_Dependence_Injection(B_be_Depended dep){
        this.dep = dep;
    }
    public void business(){
        System.out.println("here is the bean be injected");
        this.dep.action();
    }
}
