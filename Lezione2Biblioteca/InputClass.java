import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class InputClass {
	    BufferedReader br;
	    PrintStream ps;

	    public InputClass(){
	        br = new BufferedReader(new InputStreamReader(System.in));
	        ps = System.out;
	    }

	    public String readLine(String out){
	        ps.format(out);
	        try{
	            return br.readLine();
	        }catch(IOException e)
	        {
	            return null;
	        }
	    }
	    
	    public int readInt(String out){
	    	ps.format(out);
	        try{
	            String result=br.readLine();
	            return Integer.parseInt(result);
	        }catch(Exception e)
	        {
	            return -1;
	        }
	    }
	    
	    
	    public float readFloat(String out){
	    	ps.format(out);
	        try{
	            String result=br.readLine();
	            return Float.parseFloat(result);
	        }catch(Exception e)
	        {
	            return 0;
	        }
	    }
	}

