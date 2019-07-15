import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] token = command.split(" ");

            String type = token[0];

            if (type.equals("exchange")) {
                int index = Integer.parseInt(token[1]);
                if (isInRange(arr, index)) {
                    rotateArray(arr, index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (type.equals("max")) {
                int index;
                if (token[1].equals("even")) {
                    index = findMaxEven(arr);
                } else {
                    index = findMaxOdd(arr);
                }

                if (index != -1) {
                    System.out.println(index);
                } else {
                    System.out.println("No matches");
                }

            } else if (type.equals("min")) {
                int index;
                if (token[1].equals("even")) {
                    index = findMinEven(arr);
                } else {
                    index = findMinOdd(arr);
                }

                if (index != -1) {
                    System.out.println(index);
                } else {
                    System.out.println("No matches");
                }

            } else if (type.equals("first")) {
                int count = Integer.parseInt(token[1]);
                if (count > arr.length) {
                    System.out.println("Invalid count");
                } else {
                    if (token[2].equals("even")) {
                        int[] result = getFirstEven(arr, count);
                        printArray(result);
                    } else {
                        int[] result = getFirstOdd(arr, count);
                        printArray(result);
                    }
                }
            } else if (type.equals("last")) {
                int count = Integer.parseInt(token[1]);
                if (count > arr.length) {
                    System.out.println("Invalid count");
                } else {
                    if (token[2].equals("even")) {
                        int[] result = getLastEven(arr, count);
                        printArray(result);
                    } else {
                        int[] result = getLastOdd(arr, count);
                        printArray(result);
                    }
                }
            }
            command = scanner.nextLine();
        }
        printArray(arr);
    }

    private static int[] getLastEven(int[] arr, int count) {
        int[] result = new int[count];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            if (num % 2 == 0&&index<result.length) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }

    private static int[] getLastOdd(int[] arr, int count) {
        int[] result = new int[count];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            if (num % 2 != 0&&index<result.length) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }

    private static int[] getFirstOdd(int[] arr, int count) {
        int[] result = new int[count];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num % 2 != 0&&index<result.length) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }
    private static int[] getFirstEven(int[] arr, int count) {
        int[] result = new int[count];

        for (int i = 0; i < result.length; i++) {
            result[i] = -1;
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num % 2 == 0&&index<result.length) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }

    private static void rotateArray(int[] arr, int index) {
        int[] left = new int[index + 1];
        int[] right = new int[arr.length - left.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        int indexator = 0;
        for (int i = left.length + 1; i < arr.length; i++) {
            right[indexator] = arr[i];
            indexator++;
        }
        for (int i = 0; i < right.length; i++) {
            arr[i] = right[i];
        }
        for (int i = right.length; i < arr.length; i++) {
            arr[i] = left[i - right.length];
        }


        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                continue;
            }
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else if (arr[i+1]!=-1){
                System.out.print(arr[i] + ", ");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }


    private static int findMinOdd(int[] arr) {
        int index = 1;
        int minValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] <= minValue) {
                minValue = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMinEven(int[] arr) {
        int index = 1;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] <= minValue) {
                minValue = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMaxOdd(int[] arr) {
        int index = 1;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] >= maxValue) {
                maxValue = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMaxEven(int[] arr) {
        int index = 1;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= maxValue) {
                maxValue = arr[i];
                index = i;
            }
        }
        return index;
    }

    static boolean isInRange(int[] arr, int index) {
        return index >= 0 && index < arr.length;
    }
}
