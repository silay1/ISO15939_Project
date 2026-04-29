package model;

public class Metric {
    private final String  name;
    private final int     coefficient;
    private final boolean higherIsBetter;
    private final double  rangeMin;
    private final double  rangeMax;
    private final String  unit;
    private final double  value;

    public Metric(String name, int coefficient, boolean higherIsBetter,
                  double rangeMin, double rangeMax, String unit, double value) {
        this.name           = name;
        this.coefficient    = coefficient;
        this.higherIsBetter = higherIsBetter;
        this.rangeMin       = rangeMin;
        this.rangeMax       = rangeMax;
        this.unit           = unit;
        this.value          = value;
    }

    public double calculateScore() {
        return 0.0;
    }

    public String  getName()          { return name; }
    public int     getCoefficient()   { return coefficient; }
    public double  getRangeMin()      { return rangeMin; }
    public double  getRangeMax()      { return rangeMax; }
    public String  getUnit()          { return unit; }
    public double  getValue()         { return value; }
    public boolean isHigherIsBetter() { return higherIsBetter; }

    public String getDirectionLabel() {
        return higherIsBetter ? "Higher \u2191" : "Lower \u2193";
    }

    public String getRangeLabel() {
        String lo = (rangeMin == Math.floor(rangeMin))
                ? String.valueOf((int) rangeMin) : String.format("%.1f", rangeMin);
        String hi = (rangeMax == Math.floor(rangeMax))
                ? String.valueOf((int) rangeMax) : String.format("%.1f", rangeMax);
        return lo + "\u2013" + hi;
    }
}
