package gates;

public class NOTGate{
    private int input;

    public NOTGate(){
        input1=0;
        input2=0;
    }

    public NOTGate(int input){
        this.input1=input;
    }

    public void setInput1(int input){this.input=input;}
    public int getInput1(){return this.input;}

    private  int getOutput(int input){
        setInput1(input);
        return (this.input==1)?0:1;
    }

    private void printOutput(){
        System.out.println("NOT "+0+" results "+getOutput(0)+'\n'+
                           "NOT "+1+" results "+getOutput(1)+'\n';
    }

    public void printTruthTable(){
        System.out.println("----Truth Table For NOT Gate----");
        printOutput();
    }
}