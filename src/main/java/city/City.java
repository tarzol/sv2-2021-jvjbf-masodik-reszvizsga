package city;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private long fullArea;
    List<Building> buildings = new ArrayList<>();

    public City(String name, long fullArea) {
        this.name = name;
        this.fullArea = fullArea;
    }

    public void addBuilding(Building building) {
        long actualArea = 0;
        for ( Building item : buildings) {
            actualArea +=building.getArea();
        }
        if ( fullArea >= actualArea ) {
            buildings.add(building);
        }
    }

    public Building findHighestBuilding() {
        Building highestBuilding = buildings.get(0);
        for (Building item : buildings) {
            if ( item.getLevels() > highestBuilding.getLevels()) {
                highestBuilding = item;
            }
        }
        return highestBuilding;
    }

    public List<Building> findBuildingsByStreet(String street) {
        List<Building> buildingsInStreet = new ArrayList<>();
        for (Building item : buildings) {
            if ( item.getAddress().getStreet().equals(street)) {
                buildingsInStreet.add(item);
            }
        }
        return buildingsInStreet;
    }

    public String getName() {
        return name;
    }

    public long getFullArea() {
        return fullArea;
    }

    public List<Building> getBuildings() {
        return buildings;
    }
}
