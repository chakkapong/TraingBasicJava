public class MyRange {
    public static void main(String[] args) {

        //String text = "[1,5]";
        String output = "";
        if(args.length ==1){
            int max = 0;
            int min = 0;
            String[] argSp = args[0].split(",");
            if(argSp[0].startsWith("(")){
                min = min +1;
            }
            else{
                min = Integer.parseInt(argSp[0].substring(1));
            }
            if(argSp[1].endsWith(")")){
                max = max -1;
            }
            else
            {
                max = Integer.parseInt(argSp[1].substring(0,1));
            }
            for (int i = min; i <= max; i++) {
                if(output != "") {
                    output = output + ", ";
                }
                output += i;
            }
            System.out.print(output);
        }
    }
}
