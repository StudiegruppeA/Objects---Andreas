package Level4InformationhidingToStringAndStatic;

public class Item {
    private String name;
    private String type;
    private int value;
    private static int iteamsCreated = 0;

    public Item(String name, String type, int value) {
        this.name = name;
        this.type = type;
        this.value = value;
        iteamsCreated += 1;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
    public static int getIteamsCreated() {
        return iteamsCreated;
    }

    public String toString() {
        return "Name:" + name +" Type: " + type + " value: " + value;
    }





}
