package city;

public class Home extends Building {

    private int area;
    private int levels;
    private Address address;
    public static final int SQUARE_METERS_NEED_PER_PERSON = 20;

    public Home(int area, Address address) {
        super(area, address);

    }

    public Home(int area, int levels, Address address) {
        super(area, levels, address);
        this.area = area;
        if (levels >3 ) {

        } else {
            this.levels = levels;
        }
        this.address = address;
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return SQUARE_METERS_NEED_PER_PERSON;
    }

    @Override
    public int getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public Address getAddress() {
        return address;
    }
}
