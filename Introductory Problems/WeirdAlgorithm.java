import java.io.*;
import java.util.*;

public class WeirdAlgorithm {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        // String line = br.readLine();
        // if (line == null) return;
        // st = new StringTokenizer(line);
        // int t = Integer.parseInt(st.nextToken());

        // while (t-- > 0) {
            String line = br.readLine();
            st = new StringTokenizer(line);
            long n = Long.parseLong(st.nextToken());
            ArrayList<Long> list = new ArrayList<>();
            list.add(n);
            while(n!=1){
                if(n%2==0){
                    n/=2;
                }
                else{
                    n=3*n+1;
                }
                list.add(n);
            }
            for(int i=0;i<list.size();i++){
                out.print(list.get(i));
                if(i!=list.size()-1) out.print(" ");
            }

            
        // }
        
        out.flush();
    }
}