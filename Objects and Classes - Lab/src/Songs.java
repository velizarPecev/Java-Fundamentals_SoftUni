import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs {

    private String typeList;
    private String name;
    private String time;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        List<Songs> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Songs song = new Songs();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);

        }
        String typeList = scanner.nextLine();

        if (typeList.equals("all")){
            for (Songs song:songs) {
                System.out.println(song.getName());
            }
        }else{
            for (Songs song:songs) {
                if (song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }
        }

       //List<Songs> filterSong = songs.stream().filter(e->e.getTypeList().equals(typeList)).collect(Collectors.toList());

       //for (Songs song:filterSong) {
       //    System.out.println(song.getName());
       //}

    }

    public String getTypeList() {
        return typeList;
    }
    public void setTypeList (String typeList){
        this.typeList = typeList;
    }
    public String getName() {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getTime() {
        return time;
    }
    public void setTime (String time){
        this.time = time;
    }
}
