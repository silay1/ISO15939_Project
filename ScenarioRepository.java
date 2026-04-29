package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ScenarioRepository {

    private static final List<Scenario>              ALL = new ArrayList<>();
    private static final Map<String, List<Scenario>> MAP = new HashMap<>();

    static {
        buildScenarios();
        for (Scenario s : ALL) {
            String key = s.getQualityType() + "_" + s.getMode();
            if (!MAP.containsKey(key)) MAP.put(key, new ArrayList<>());
            MAP.get(key).add(s);
        }
    }

    public static List<Scenario> getScenariosFor(String qualityType, String mode) {
        List<Scenario> result = MAP.get(qualityType + "_" + mode);
        return result != null ? result : new ArrayList<>();
    }

    private static void buildScenarios() {
        buildProductEducation();
        buildProductHealth();

    }

    private static void buildProductEducation() {
        Scenario scC = new Scenario("Scenario C \u2014 Team Alpha", "Product", "Education");

        Dimension usab = new Dimension("Usability", 25);
        usab.addMetric(new Metric("SUS Score",       50, true,  0, 100, "points", 89));
        usab.addMetric(new Metric("Onboarding Time", 50, false, 0,  60, "min",     5));
        scC.addDimension(usab);

        Dimension perf = new Dimension("Performance Efficiency", 20);
        perf.addMetric(new Metric("Video Start Time", 50, false,  0,  15, "sec",     2));
        perf.addMetric(new Metric("Concurrent Exams", 50, true,   0, 600, "users", 520));
        scC.addDimension(perf);

        Dimension acc = new Dimension("Accessibility", 20);
        acc.addMetric(new Metric("WCAG Compliance",     50, true, 0, 100, "%", 85));
        acc.addMetric(new Metric("Screen Reader Score", 50, true, 0, 100, "%", 78));
        scC.addDimension(acc);

        Dimension rel = new Dimension("Reliability", 20);
        rel.addMetric(new Metric("Uptime", 50, true,  95, 100, "%",    99.5));
        rel.addMetric(new Metric("MTTR",   50, false,  0, 120, "min",  25));
        scC.addDimension(rel);

        Dimension func = new Dimension("Functional Suitability", 15);
        func.addMetric(new Metric("Feature Completion",     50, true, 0, 100, "%", 92));
        func.addMetric(new Metric("Assignment Submit Rate", 50, true, 0, 100, "%", 87));
        scC.addDimension(func);

        ALL.add(scC);

        Scenario scD = new Scenario("Scenario D \u2014 Team Beta", "Product", "Education");

        Dimension usabD = new Dimension("Usability", 25);
        usabD.addMetric(new Metric("SUS Score",       50, true,  0, 100, "points", 72));
        usabD.addMetric(new Metric("Onboarding Time", 50, false, 0,  60, "min",    18));
        scD.addDimension(usabD);

        Dimension perfD = new Dimension("Performance Efficiency", 20);
        perfD.addMetric(new Metric("Video Start Time", 50, false,  0,  15, "sec",     5));
        perfD.addMetric(new Metric("Concurrent Exams", 50, true,   0, 600, "users", 380));
        scD.addDimension(perfD);

        Dimension relD = new Dimension("Reliability", 20);
        relD.addMetric(new Metric("Uptime", 50, true,  95, 100, "%",    97.2));
        relD.addMetric(new Metric("MTTR",   50, false,  0, 120, "min",  55));
        scD.addDimension(relD);

        ALL.add(scD);
    }

    private static void buildProductHealth() {
        Scenario scA = new Scenario("Scenario A \u2014 Hospital System", "Product", "Health");

        Dimension usab = new Dimension("Usability", 25);
        usab.addMetric(new Metric("Ease of Use Score", 50, true,  0, 100, "points", 78));
        usab.addMetric(new Metric("Navigation Time",   50, false, 0, 120, "sec",    30));
        scA.addDimension(usab);

        Dimension sec = new Dimension("Security", 25);
        sec.addMetric(new Metric("Vulnerability Score", 50, false, 0, 100, "points",  8));
        sec.addMetric(new Metric("Auth Success Rate",   50, true,  0, 100, "%",      97));
        scA.addDimension(sec);

        Dimension rel = new Dimension("Reliability", 20);
        rel.addMetric(new Metric("Uptime", 50, true,  99, 100, "%",   99.7));
        rel.addMetric(new Metric("MTTR",   50, false,  0,  60, "min",   12));
        scA.addDimension(rel);

        ALL.add(scA);

        Scenario scB = new Scenario("Scenario B \u2014 Clinic System", "Product", "Health");

        Dimension usabB = new Dimension("Usability", 25);
        usabB.addMetric(new Metric("Ease of Use Score", 50, true,  0, 100, "points", 65));
        usabB.addMetric(new Metric("Navigation Time",   50, false, 0, 120, "sec",    50));
        scB.addDimension(usabB);

        Dimension secB = new Dimension("Security", 25);
        secB.addMetric(new Metric("Vulnerability Score", 50, false, 0, 100, "points", 22));
        secB.addMetric(new Metric("Auth Success Rate",   50, true,  0, 100, "%",      91));
        scB.addDimension(secB);

        Dimension relB = new Dimension("Reliability", 20);
        relB.addMetric(new Metric("Uptime", 50, true,  99, 100, "%",   99.1));
        relB.addMetric(new Metric("MTTR",   50, false,  0,  60, "min",   30));
        scB.addDimension(relB);

        ALL.add(scB);
    }
}
