import java.io.*;
import java.util.*;

public class CoinPiles {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);
        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            line = br.readLine();
            if (line == null) break;
            st = new StringTokenizer(line);
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            if ((n + m) % 3 == 0 && Math.max(n, m) <= 2 * Math.min(n, m)) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        
        out.flush();
    }
}