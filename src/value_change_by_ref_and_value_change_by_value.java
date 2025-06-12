import java.util.Arrays;

public class value_change_by_ref_and_value_change_by_value {

    public static void main (String[] args) {
        int [] arrymuneeb = {25,24,34,1,45};
        int [] muneeb = arrymuneeb;
        int[] muneeb1= Arrays.copyOf(arrymuneeb, arrymuneeb.length);
        //System.out.println();
        muneeb1[0]=50;
        System.out.println(arrymuneeb);
        muneeb[0]= 100;
        System.out.println(arrymuneeb);

//        Arrays.stream(arrymuneeb).sorted();
        System.out.println(arrymuneeb[0]);
        System.out.println(muneeb[0]);





            }
        }


