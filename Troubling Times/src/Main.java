
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    public static void main(String[] args)throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = nextInt(); int end = nextInt();
        int makeIt = Integer.MAX_VALUE;
        for(int i = 0 ; i < n; i++){
            int temp = nextInt();
            if(end % temp == 0){
                if(Math.abs(end/temp) < makeIt){
                    makeIt = Math.abs(end/temp);
                }
            }
        }
        if(makeIt != Integer.MAX_VALUE){
            out.println(makeIt);
        }
        else{
            out.println("This is not the best time for a trip.");
        }

        out.close();
    }

    private static String next()throws IOException{
        while(st==null||!st.hasMoreTokens()){
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    private static int nextInt()throws IOException{
        return Integer.parseInt(next());
    }

}
