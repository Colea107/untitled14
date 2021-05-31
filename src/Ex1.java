public class Ex1 {
    public static void reverse(int a[], int n)
    {
        int u = 90;
        while (u >= 10) {
            System.out.println(u);
            u = u - 10;
        }

        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }

        System.out.println("Reversed array is: \n");
        for (k = 0; k < n; k++) {
            System.out.println(a[k]);
        }
    }

    public static void main(String[] args)
    {
        int [] arr = {90,80,70,60,50,40,30,20,10};
        reverse(arr, arr.length);
    }
}
