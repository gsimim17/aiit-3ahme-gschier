package ue06;


import java.util.Locale;


public abstract class Component {
    private final String id;
    private final double value;
    private double voltage;
    private double current;


    public Component (String id, double value) {
        this.id = id;
        this.value = value;
    }


    public String getId () {
        return id;
    }


    public double getValue () {
        return value;
    }


    public double getVoltage () {
        return voltage;
    }


    public double getCurrent () {
        return current;
    }


    public void setVoltage (double voltage) {
        this.voltage = voltage;
    }


    public void setCurrent (double current) {
        this.current = current;
    }


    public double power () {
        return current * voltage;
    }
    
    
    public String formattedValue (Locale locale) {
        double mul;
        String preUnit;

        if (value < 1E-9) {
            mul = 1E-12; preUnit = "p"; // pico
        } else if (value < 1E-6) {
            mul = 1E-9; preUnit = "n";  // nano
        } else if (value < 1E-3) {
            mul = 1E-6; preUnit = "µ";  // micro
        } else if (value < 1) {
            mul = 1E-3; preUnit = "m";  // milli
        } else if (value < 1E3) {
            mul = 1; preUnit = "";
        } else if (value < 1E6) {
            mul = 1E3; preUnit = "k";   // kilo
        } else if (value < 1E9) {
            mul = 1E6; preUnit = "M";   // kilo            
        } else {
            mul = 1E9; preUnit = "G";   // giga
        }
        
        String rv = String.format(locale, "%.2f", value / mul);
        if (rv.endsWith(".00")) {
            rv = rv.substring(0, rv.length() - 3) + preUnit + unit();
        } else if (rv.endsWith("0")) {
            rv = rv.substring(0, rv.length() - 1)  + preUnit + unit();
        } else {
            rv = rv  + preUnit + unit();
        }
        
        return rv;
    }
    
    
    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {").append("\"id\":\"").append(id).append("\"");
        sb.append(",").append("\"value\":").append(value);
        sb.append(",").append("\"voltage\":").append(voltage);
        sb.append(",").append("\"current\":").append(current);
        sb.append("}");
        return sb.toString();
    }
    
    
    public abstract String unit ();
    
    
    public abstract double energy ();
}
