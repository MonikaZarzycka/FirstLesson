package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CinemaRooms {
    public static void main(String[] args) {
        List<Cinema> cinemaHalls = Arrays.asList(
                new Cinema("Room 1", TypeOfView.FOURTH_D),
                new Cinema("Room 2", TypeOfView.TRIPLE_D),
                new Cinema("Room 3", TypeOfView.DOUBLE_D),
                new Cinema("Room 4", TypeOfView.DOUBLE_D),
                new Cinema("Room 5", TypeOfView.TRIPLE_D),
                new Cinema("Room 6", TypeOfView.DOUBLE_D),
                new Cinema("Room 7", TypeOfView.TRIPLE_D),
                new Cinema("Room 8", TypeOfView.FOURTH_D),
                new Cinema("Room 9", TypeOfView.DOUBLE_D),
                new Cinema("Room 10", TypeOfView.TRIPLE_D)
        );

        Map<TypeOfView, List<Cinema>> hallsPerType = cinemaHalls.stream()
                .collect(Collectors.groupingBy(Cinema::getTypeOfView));

        long halls_2D = hallsPerType.get(TypeOfView.DOUBLE_D).size();
        System.out.println("2D rooms: " + halls_2D);

        long halls_3D = hallsPerType.get(TypeOfView.TRIPLE_D).size();
        System.out.println("3D rooms: " + halls_3D);

        long halls_4D = hallsPerType.get(TypeOfView.FOURTH_D).size();
        System.out.println("4D rooms: " + halls_4D);
    }
}
