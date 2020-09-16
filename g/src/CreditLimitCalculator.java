public class CreditLimitCalculator{
    int nracc, balance, charg, Cred, credit_limit;


    public void setAccountInfo(int nracc, int balance, int charg,
     int Cred, int credit_limit){
        setnr_acc(nracc);
        setbalance(balance);
        setcharg(charg);
        setcred(Cred);
        setcredit_limit(credit_limit);
    }
    public void setnr_acc(int nracc){
        this.nracc = nracc;
    }
    public void setbalance(int balance){
        this.balance = balance;
    }
    public void setcharg(int charg){
        this.charg = charg;
    }
    public void setcred(int Cred){
        this.Cred = Cred;
    }
    public void setcredit_limit(int credit_limit){
        this.credit_limit = credit_limit;
    }
    public int getnracc(){
        return nracc;
    }
    public int getBalance(){
        return balance;
    }
    public int getcredit_limit(){
        return credit_limit;
    }
    public int getcharg(){
        return charg;
    }
    public int getCred(){
        return Cred;
    }
    public int getNBalance(){
        return getBalance() + getcharg() - getCred();
    }
    public boolean creditExceeded(){
        if (getNBalance() <= getcredit_limit())
        return false ;
        else
        return true;
    }
}