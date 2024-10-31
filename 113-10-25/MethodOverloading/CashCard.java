package cc.openhome;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;
    private final int BOUNSCASH =10;
    //方法的身分辨識=方法名稱+參數個數+參數型態
   public  CashCard(){
      setNumber("unknown");
    }
    public CashCard(String number){setNumber(number);

    public CashCard(String number,int balance){
        setNumber(number);
        setBalance(balance);
        }
        public CashCard(String,number,int balance,int bouns){
            setNumber(number);
            setBalance(balance);
            setBouns(bouns);
        }
        public String getNumber(){return this.number;}
        public int getBalance(){return this.Balance;}
        public int getBouns(){return this.Bouns;}
        public int getNumber(String number){ this.number = number;}
        public void setBalance(int balance){
            if(balance >=0){
                this.balance = balance;
            }
            else{
                System.out.println("格式不足,保持原值");
        }
            }
            public void setBonus(int bonus){
                if(bonus>=0){
                    this.bonus = bonus;
        }

        else {
            System.out.println("儲值是負的？你是來亂的嗎？");
        }
    }
    
    void charge(int money) {
        if(money > 0) {
            if(money <= this.balance) {
                this.balance -= money;
            }
            else {
                System.out.println("錢不夠啦！");
            }
        }
        else {
            System.out.println("扣負數？這不是叫我儲值嗎？");
        }
    }
    
    int exchange(int bonus) {
        if(bonus > 0) {
            this.bonus -= bonus;
        }
        return this.bonus;
    }

    int getBalance() {
        return balance;
    }

    int getBonus() {
        return bonus;
    }

    String getNumber() {
        return number;
    }
}
public class




public vois store(int money){
 topUp(money);
       }
   }else{
       System.out.println("儲值金額為負的,來亂的!")
   }
        }

        public void store(String numder,int money){
    if(this.number.equals(number)){
        this.balance += money;
        if(money>=1000){
            this.bouns+
        }
    }
                }