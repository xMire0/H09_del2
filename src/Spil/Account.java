package Spil;

public class Account {
        private int balance = 1000;

        public Account(){
            this.balance = balance;
        }

        public int getAccount(){
            if (balance < 0) {
                balance = 0;
            }
            else if(balance > 3000) {
                balance = 3000;
            }
                return balance;
        }

        public int setAccount(int balance){
            return this.balance = balance;
        }
}


