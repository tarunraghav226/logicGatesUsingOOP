import gates.ANDGate;
import gates.NOTGate;
import gates.ORGate;

public class GatesTest {
    public static void main(String[] args) {
        ANDGate andGate = new ANDGate();
        andGate.printTruthTable();
        ORGate orGate = new ORGate();
        orGate.printTruthTable();
        NOTGate notGate = new NOTGate();
        notGate.printTruthTable();
    }
}