import java.util.Scanner;
//Class BASE
class Stock {
String name;
int N;
int[] A;
public Stock(String name, int N) {
this.name = name;
this.N = N;
this.A = new int[N];
}
public void input() {
Scanner sc = new Scanner(System.in);
System.out.print("\nEnter the stock prices: ");
for (int i = 0; i < N; i++) {
A[i] = sc.nextInt();
}
}
public int[] getStockPrices() {
return A;
}
public int getN() {
return N;
}
}

//Class CHILD
class Transaction extends Stock {
public Transaction(String name, int N) {
super(name, N);
}
public void findMaximumProfit() {
int[] prices = getStockPrices();
int n = getN();
int[] max = new int[n];
int[] min = new int[n];
int count = 0;
int i = 0;
while (i < n - 1) {
while (i < n - 1 && prices[i + 1] <= prices[i]) {
i++;
}
if (i == n - 1) {
break;
}
min[count] = i++;
while (i < n && prices[i] >= prices[i - 1]) {
i++;
}
max[count] = i - 1;
count++;
}
if (count == 0) {
System.out.println("\nNo profitable transactions possible.");
System.out.println();
} else {
System.out.println("\nDays to buy and sell stocks for maximum profit: ");
System.out.println();
for (int j = 0; j < count; j++) {
System.out.println("\nBuy on day : " + (min[j] + 1) + "\nSell on day " +
(max[j] +1));
}
}
}
}



class StockProfit {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the name of stock: ");
String name = sc.nextLine();
System.out.print("\nEnter the number of days for stock prices : ");
int N = sc.nextInt();
Transaction t = new Transaction(name, N);
t.input();
t.findMaximumProfit();
}
}