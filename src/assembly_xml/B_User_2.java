package assembly_xml;

public class B_User_2 {
    private int index;
    private String name;

    public B_User_2(int index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override
    public String toString() {
        return "B_User_2{" +
                "index=" + index +
                ", name='" + name + '\'' +
                '}';
    }
}
