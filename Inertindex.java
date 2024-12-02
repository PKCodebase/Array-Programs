package array.com;

public class Inertindex {
    public static void main(String[] args) {
        String arr[] = {"Ram","Mohan","Shyam","Akash","Prakash","Vivek"};
        int  index_pos = 3;
        String element = "Rohit";
        for(int i =arr.length-1;i>index_pos;i--)
        {
            arr[i]= arr[i-1];
        }
        arr[index_pos] = element;
        for(int i =0; i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

}
