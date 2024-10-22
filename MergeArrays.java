import java.util.ArrayList;

public class MergeArrays{

    public <T> ArrayList<T> merge(T[] arr1, T[] arr2){
        if(arr1.length < arr2.length) return mergeHelper(arr1, arr2);
        else return mergeHelper(arr2, arr1);    
    }

    public static <T> ArrayList<T> mergeHelper(T[] arr1, T[] arr2){
        ArrayList<T> result = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++) { result.add(arr1[i]) ; result.add(arr2[i]); }
        for(int i = arr1.length; i < arr2.length; i++) result.add(arr2[i]);
        return result; 
    }
    
}