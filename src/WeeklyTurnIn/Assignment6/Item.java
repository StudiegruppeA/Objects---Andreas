package WeeklyTurnIn.Assignment6;

public class Item {
    private String name;
    private int value;
    private String type;
    private int iteamID;
    private static int totalIteamsCreated = 0;

    public Item(String name, int value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
        this.iteamID = totalIteamsCreated;
        totalIteamsCreated++;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getYype() {
        return type;
    }
    public int getIteamID() {
        return iteamID;
    }

    public static int getTotalIteamsCreated() {
        return totalIteamsCreated;
    }

    public String toString() {
        return "Name" + name + "\nType: " + type + "\nValue:" + value;
    }


}
