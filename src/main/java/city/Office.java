package city;

public class Office extends Building {

    private int area;
    private int levels;
    private Address address;
    private String company;
    private int numberOfTablesPerLevel;

    public Office(int area, int floors, Address address, String companyName, int numberOfTablesPerLevel) {
        super(area, floors, address);

        this.levels = levels;

        this.company = company;
        this.numberOfTablesPerLevel = numberOfTablesPerLevel;
    }

    public static final int SQUARE_METERS_NEED_PER_PERSON = 20;


    public Office(int area, int floors, Address address, int area1, int levels, Address address1) {
        super(area, floors, address);
        this.area = area1;
        this.levels = levels;
        this.address = address1;
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return 0;
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

    public String getCompany() {
        return company;
    }

    public int getNumberOfTablesPerLevel() {
        return numberOfTablesPerLevel;
    }
}
