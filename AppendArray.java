public class AppendArray {
    public static void main(String[] args) {
        int aray[] = {25, 30, 35, 40, 45}; 
        int sz = aray.length;

        int newAray[] = new int[sz + 1];
        int elem = 50;

        for(int i = 0; i < sz; i++) {
            newAray[i] = aray[i]; // copying element
        }
        newAray[sz] = elem;
        System.out.print("The new array after appending the element: ");

        // to print new array
        for(int i = 0; i < newAray.length; i++) {
        System.out.print(newAray[i] + " ");
        }
    }

}
