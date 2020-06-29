package ue06;


public class Capacitor extends Component {

    public Capacitor (double value) {
        super("C?", value);
    }


    public Capacitor (String id, double value) {
        super(id, value);
    }
    
    
    @Override
    public String unit () {
        return "F";
    }
    
    
    @Override
    public double energy () {
        return (getValue() * (getVoltage() * getVoltage())) / 2;
    }
    
    
}
