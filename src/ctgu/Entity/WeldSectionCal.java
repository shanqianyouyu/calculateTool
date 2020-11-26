package ctgu.Entity;

import ctgu.awt.frame.homepage.calFrame.weld.Review;
import ctgu.awt.util.Tool;

public class WeldSectionCal {

	public double X1;
	public double X2;
	public double Y;
	public double HE;
	
	
	public double V1;
	public double T1;
	
	public double Wffw;
	
	public double B1;
	
	public double AF;
	public double IFX;
	public double IFY;
	public double JF;

	public double FV;
	public double TF;
	public double OF;
	public double F1;
	
	public double se;
			
     public WeldSectionCal(double X1, double X2, double Y, double HE, double V1, double T1, double Wffw,double B1){

				this.X1 = X1;
				this.X2 = X2;
				this.Y = Y;
				this.HE = HE*0.7;
				this.V1 = V1;
				this.T1 = T1;
				this.Wffw = Wffw;
				this.B1 = B1;
				System.out.println(X1);
				System.out.println(X2);
				System.out.println(Y);
				System.out.println(HE);
				System.out.println(V1);
				System.out.println(T1);
				System.out.println(Wffw);
				System.out.println(B1);
	}
     
    //角焊缝有效截面面积
    public double setAs(){
    	System.out.println(HE);
    	AF = Tool.forMat((2*(X1+X2)+Y)*HE);
        return AF;
    }
     
    //对x轴惯性矩
    public double setXXJ(){
    	IFX = Tool.forMat(2*(X1+X2)*HE*Math.pow(Y/2, 2)+HE*Math.pow(Y, 3)/12);
    	System.out.println(Tool.forMat(HE*Math.pow(Y, 3)/12));
        return IFX;
    }
	
    //对Y轴惯性矩
    public double setYXJ(){
    	IFY = Tool.forMat(HE*Y*Math.pow(X1, 2)+2*(Math.pow(X1, 3)+Math.pow(X2, 3))*HE/3);
        return IFY;
    }
    
    //极惯性矩
    public double setJXJ(){
    	JF = IFX+IFY;
        return JF;
    } 
    
    //剪力作用应力
    public double setOFV(){
    	FV = Tool.forMat(V1/AF);
    	return FV;
    }
    
    //扭矩作用最大应力分力 1
    public double setTFO(){
    	TF = Tool.forMat((T1*Y/2)/JF);
    	return TF;
    }
    
    //扭矩作用最大应力分力 2
    public double setOFT(){
    	OF = Tool.forMat(T1*X1/JF);
    	return OF;
    }
    
    //最大应力处的焊缝强度
    public double setF1(){
    	F1 = Tool.forMat(Math.sqrt(Math.pow((Math.pow(FV, 2)+Math.pow(OF, 2))/2,2)+Math.pow(TF, 2)));
    	return F1;
    }
}
