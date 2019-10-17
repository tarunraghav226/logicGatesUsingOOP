package gates;

public class NOTGate{
    private int input;

    public NOTGate(){
        input=0;
    }

    public NOTGate(int input){
        this.input=input;
    }

    public void setInput(int input){this.input=input;}
    public int getInput(){return this.input;}

    private  int getOutput(int input){
        setInput(input);
        return (this.input==1)?0:1;
    }

    private void printOutput(){
        System.out.println("NOT "+0+" results "+getOutput(0)+'\n'+
                           "NOT "+1+" results "+getOutput(1)+'\n');
    }

    public void printTruthTable(){
        System.out.println("----Truth Table For NOT Gate----");
        printOutput();
    }

    public static void main(String[] args) {
        NOTGate o =new NOTGate();
        o.printTruthTable();
    }
}