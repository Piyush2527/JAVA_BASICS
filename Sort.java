public class Sort {
    public static void main(String[] args) {
        int a[] = { 10, 14, 28, 11, 1, 2, 3, 0, -9, -1, 7, 16, 30, 50, 25, 18 };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int temp = 0;
        int l = a.length;
        // bubble sort start int array use '>'
        // String we use a[i].compareTo(a[i+1])>0 {greater than 0 means string is
        // badi}//
        // System.out.println("\n\nBubble sort swap with next one");
        // for (int j = 0; j < a.length; j++) {
        // for (int i = 0; i < a.length - 1 - j; i++) {
        // if (a[i] > a[i + 1]) {
        // temp = a[i + 1];
        // a[i + 1] = a[i];
        // a[i] = temp;
        // }
        // }
        // System.out.println();

        // for (int i = 0; i < a.length; i++) {
        // System.out.print(a[i] + " ");
        // }
        // }
        // // bubble sort end//
        System.out.println("\n\nSelection sort {search small then swap}");
        /* Selection sort start */
        int min = 0;
        for (int j = 0; j < a.length; j++) {
            min = j;
            for (int i = j + 1; i < a.length; i++) {
                if (a[i] < a[min]) {
                    min = i;
                }
            }
            temp = a[j];
            a[j] = a[min];
            a[min] = temp;
            System.out.println();
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
