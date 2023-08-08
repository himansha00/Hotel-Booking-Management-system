public class Room {
    String mainName; //private String mainName;
    int guestsInRoom;

    public Room() {
        mainName = "k";

    }
    public void setName(String aName) {
        System.out.println("add name class method ");
        mainName = aName;
    }
    public String getName(String roomName) {
        return mainName;
    }
}
