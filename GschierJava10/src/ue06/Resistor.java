package ue06;


public class Resistor extends Component {

    public Resistor (double value) {
        super("R?", value);
    }


    public Resistor (String id, double value) {
        super(id, value);
    }
    
    
    @Override
    public void setCurrent (double current) {
        super.setCurrent(current);
        super.setVoltage(current * getValue());
    }
    
    
    @Override
    public void setVoltage (double voltage) {
        super.setVoltage(voltage);
        super.setCurrent(voltage / getValue());
    }
    
    
    @Override
    public String unit () {
        return "\u2126";
    }
    
    
    @Override
    public double energy () {
        return 0;
    }
}
