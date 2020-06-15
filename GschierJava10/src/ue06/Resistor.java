package ue06;


public class Resistor extends Component {

    public Resistor (double value) {
        super(value);
    }


    public Resistor (String id, double value) {
        super(id, value);
    }
    
    
    public double energy () {
        return 0;
    }
    
}
