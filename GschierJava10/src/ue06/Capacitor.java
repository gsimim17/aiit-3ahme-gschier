package ue06;


public class Capacitor extends Component {

    public Capacitor (double value) {
        super(value);
    }


    public Capacitor (String id, double value) {
        super(id, value);
    }
    
    
    public double energy () {
        return (Capacitor * (voltage * voltage)) / 2;
    }
    
    
}
