package lab2;

public class Task7 {
    public static void main(String[] args) {
        interface BankOperations {
            long GetCurrentSum();

            long GetMoney(long sum);

            long PutMoney(long sum);

        }
        class BankAccount implements BankOperations {
            long CurrentSum;

            BankAccount(long StartSum) {
                this.CurrentSum = StartSum;
            }

            public long GetCurrentSum() {
                return CurrentSum;
            }

            public long GetMoney(long sum) {
                if (this.CurrentSum < sum) {
                    this.CurrentSum -= sum;
                    return sum;
                } else {
                    System.out.println("Non-sufficient funds");
                    return this.CurrentSum;
                }
            }

            public long PutMoney(long sum) {
                this.CurrentSum += sum;
                return this.CurrentSum;
            }
        }
        BankAccount Bank1 = new BankAccount(50000);
    }
}
