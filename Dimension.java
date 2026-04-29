package model;

import java.util.ArrayList;
import java.util.List;

public class Dimension {
    private final String       name;
    private final int          coefficient;
    private final List<Metric> metrics;

    public Dimension(String name, int coefficient) {
        this.name        = name;
        this.coefficient = coefficient;
        this.metrics     = new ArrayList<>();
    }

    public void addMetric(Metric metric) {
        metrics.add(metric);
    }

    public double calculateScore() {
        return 0.0;
    }

    public String       getName()        { return name; }
    public int          getCoefficient() { return coefficient; }
    public List<Metric> getMetrics()     { return metrics; }
}
