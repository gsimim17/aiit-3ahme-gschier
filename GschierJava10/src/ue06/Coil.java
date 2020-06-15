package ue06;


public class Coil extends Component {

    public Coil (double value) {
        super(value);
    }


    public Coil (String id, double value) {
        super(id, value);
    }
    
    
    public double energy () {
        return (Coil * (current * current)) / 2;
    }
    
}
