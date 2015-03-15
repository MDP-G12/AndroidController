package mdp.grp12.chenwenjie.androidcontroller;

public class Map {
    private String robot_direction = "E";
    private String[] robot_location = {"1", "1"};
    private int[] map_info;

    public Map() {
        map_info = new int[300];
        for (int i=0; i<15; i++) {
            for (int j=0; j<20; j++) {
                map_info[i*20+j] = R.drawable.gray;
            }
        }
    }

    public String get_robot_direction() {
        return robot_direction;
    }

    public String[] get_robot_location() {
        return robot_location;
    }

    public int get_map(int x) {
        return map_info[x];
    }

    public void set_map(int x, String state) {

    }

    public int getCount() {
        return map_info.length;
    }

}
