package parsing_json;

import java.util.ArrayList;


public class Element {

    //region PROPERTIES
    private String name, appearance, category, color, discovered_by, named_by, phase, source, spectral_img, summary, symbol;
    private Double atomic_mass, boil, density, melt, molar_heat;
    private Integer number, period, xpos, ypos;
    private ArrayList<Integer> shells;
    //endregion

    //region CONSTRUCTOR
    public Element(
            String name,
            String appearance,
            Double atomic_mass,
            Double boil,
            String category,
            String color,
            Double density,
            String discovered_by,
            Double melt,
            Double molar_heat,
            String named_by,
            Integer number,
            Integer period,
            String phase,
            String source,
            String spectral_img,
            String summary,
            String symbol,
            Integer xpos,
            Integer ypos,
            ArrayList<Integer> shells) {
        this.name = name;
        this.appearance = appearance;
        this.category = category;
        this.color = color;
        this.discovered_by = discovered_by;
        this.named_by = named_by;
        this.phase = phase;
        this.source = source;
        this.spectral_img = spectral_img;
        this.summary = summary;
        this.symbol = symbol;
        this.atomic_mass = atomic_mass;
        this.boil = boil;
        this.density = density;
        this.melt = melt;
        this.molar_heat = molar_heat;
        this.number = number;
        this.period = period;
        this.xpos = xpos;
        this.ypos = ypos;
        this.shells = shells;
    }
    //endregion

    //region GETTERS
    public String getName() {
        return name;
    }

    public String getAppearance() {
        return appearance;
    }

    public double getAtomic_mass() {
        return atomic_mass;
    }

    public double getBoil() {
        return boil;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public double getDensity() {
        return density;
    }

    public double getMelt() {
        return melt;
    }

    public double getMolar_heat() {
        return molar_heat;
    }

    public String getNamed_by() {
        return named_by;
    }

    public int getNumber() {
        return number;
    }

    public int getPeriod() {
        return period;
    }

    public String getPhase() {
        return phase;
    }

    public String getSource() {
        return source;
    }

    public String getSpectral_img() {
        return spectral_img;
    }

    public String getSummary() {
        return summary;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public ArrayList<Integer> getShells() {
        return shells;
    }

    public String getDiscovered_by() {
        return discovered_by;
    }
    //endregion
}






