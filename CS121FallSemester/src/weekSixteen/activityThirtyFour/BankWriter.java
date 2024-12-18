package weekSixteen.activityThirtyFour;
import java.util.Arrays;
public class BankWriter
{

        //Divide each array into 2 equal parts.
        public static void mergeSort(int[] arr)
        {
            //Ensures that the passed array is not an individual element.
            if (arr.length < 2)
            {
                return;
            }

            //Finds the middle point of the array.
            int mid = arr.length / 2;

            //Splits the array in halves creating 2 new arrays.
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);

            //Continues the process for each new half of the array.
            mergeSort(left);
            mergeSort(right);

            //Merge the sorted halves back into the original array.
            merge(arr, left, right);
        }

        //Merge two sorted arrays into a new sorted array.
        private static void merge(int[] arr, int[] left, int[] right) {
            int i = 0, j = 0, k = 0;

            // Merge the left and right arrays into arr[]
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }

            //Add any remaining elements from the left and right arrays into the new array.
            while (i < left.length) {
                arr[k] = left[i];
                i++;
                k++;
            }
            while (j < right.length) {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
    }
