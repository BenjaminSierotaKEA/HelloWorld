public class BilletAutomat {
    private int pris;
    private int saldo;
    private int total;

    public BilletAutomat(int billetPris){
        this.saldo = 0;
        this.total = 0;
        this.pris = billetPris;
    }

    public int getPris(){
        return pris;
    }
    public int getSaldo(){
        return saldo;
    }

    public void indBetal(int kroner){
        if(kroner >= 0){
            saldo += kroner;
        }else{
            System.out.println("Please insert a positive amount of money");
        }

    }

    public void printBillet(){

        if (saldo >= pris){
            System.out.println("############################");
            System.out.println("#####LINJE-F: MOD HAVNSTRUP###");
            System.out.println("##############################");
            System.out.println("####BILLET: " + pris + " KR. #######");
            System.out.println("");


            total += saldo;
            saldo = 0;
        }else{
            System.out.println("Not enough money. Please insert more!");
        }


    }
}
