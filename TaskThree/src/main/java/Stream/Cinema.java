package Stream;

public class Cinema {
    private String name;
    private TypeOfView typeOfView;

    public Cinema(String name, TypeOfView typeOfView) {
        this.name = name;
        this.typeOfView = typeOfView;
    }

    public String getName() {
        return name;
    }

    public TypeOfView getTypeOfView() {
        return typeOfView;
    }

}
