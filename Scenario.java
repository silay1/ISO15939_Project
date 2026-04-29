package model;

import java.util.ArrayList;
import java.util.List;


public class Scenario {
    private final String          name;
    private final String          qualityType;
    private final String          mode;
    private final List<Dimension> dimensions;

    public Scenario(String name, String qualityType, String mode) {
        this.name        = name;
        this.qualityType = qualityType;
        this.mode        = mode;
        this.dimensions  = new ArrayList<>();
    }

    public void addDimension(Dimension d) { dimensions.add(d); }

    public String          getName()        { return name; }
    public String          getQualityType() { return qualityType; }
    public String          getMode()        { return mode; }
    public List<Dimension> getDimensions()  { return dimensions; }

    @Override
    public String toString() { return name; }
}
