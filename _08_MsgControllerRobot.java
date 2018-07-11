package M3;

import java.util.ArrayList;

public class _08_MsgControllerRobot {
		public static void main(String[] args) {
			System.out.println(moveRobot(2, 2, "1-1-N", "M R M"));
			System.out.println(moveRobot(3, 4, "2-2-E", "R M L M L M"));
		}

		public static String moveRobot(int input1,int input2,String input3,String input4){
			String res="";
			String[] ss=input3.split("-");
			int x=Integer.parseInt(ss[0]);
			int y=Integer.parseInt(ss[1]);
			String flag=ss[2];
			String[] facing=input4.split("\\s+");
			boolean c=false;
			for(int i=0;i<facing.length;i++) {
	            if(flag.equals("E")){
					if(facing[i].equals("L"))
						flag="N";
					else if(facing[i].equals("R"))
						flag="S";
				}
	            else if(flag.equals("W")){
					if(facing[i].equals("L"))
						flag="S";
					else if(facing[i].equals("R"))
						flag="N";
				}
	            else if(flag.equals("N")){
					if(facing[i].equals("L"))
						flag="W";
					else if(facing[i].equals("R"))
						flag="E";
				}
	            else if(flag.equals("S")){
					if(facing[i].equals("L"))
						flag="E";
					else if(facing[i].equals("R"))
						flag="W";
				}
	            if(facing[i].equals("M")) {
	            	if(flag.equals("E")) {
	            			x+=1;
	            			if(input1<x) {
	            				x-=1;
	            				c=true;
	            				break;
	            			}
	            	}
	            	else if(flag.equals("W")) {
	            			x-=1;
	            			if(x<0) {
	            				x+=1;
	            				c=true;
	            				break;
	            			}
	            	}
	            	else if(flag.equals("N")) {
	            			y+=1;
	            			if(input2<y) {
	            				c=true;
	            				break;
	            			}
	            	}
	            	else if(flag.equals("S")) {
	            			y-=1;
	            			if(y<0) {
	            				y+=1;
	            				c=true;
	            				break;
	            			}
	            	}
	            }
	            
			}
			if(c==true)
            	res=String.valueOf(x)+"-"+String.valueOf(y)+"-"+flag+"-ER";
            else
            	res=String.valueOf(x)+"-"+String.valueOf(y)+"-"+flag;
			
			return res;	
	}
}
