public class Day_1
 {
    public static void sort0_2(int[] arr) 
    {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) 
        {
            switch (arr[mid]) 
            {
                case 0:
                    int temp_0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp_0;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    int temp_2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp_2;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 1, 0, 2, 1, 0};

        sort0_2(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
