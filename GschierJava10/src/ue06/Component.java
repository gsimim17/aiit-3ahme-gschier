package ue06;


public class Component {
    private String id;
    private double value;
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
    
    
    public String formattedValue () {
        
    }
    
    public String formattedValue (Locale locale) {
        
    }
    
    
    @Override
    public String toString () {
        return "Component{" + "id=" + id + ", value=" + value + ", voltage=" + voltage + ", current=" + current + '}';
    }
    
}
