package ctgu.Entity;

import java.math.BigDecimal;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

import ctgu.awt.util.Tool;
import lombok.Data;

/**
 * 
 * @author 陈煜昆
 *
 */
@Data
public class SquareDerrickManCal {

	public double L;
	public double G;
	public double a;
	public double b;
	public double A;
	
	
	public double P;
	public double K;
	public double R;
	public double T;
	public SquareDerrickManCal() {
	}
	public SquareDerrickManCal(double L,double G,double A,double a,double b){
		
		this.L = L;
		this.G = G;
		this.P = P;
		this.a = a;
		this.b = b;
		this.K = K;
		this.R = R;
		this.T = T;
		this.A = A;
	}
	//封绳拉力
	public double fengshen(){
		if(a == b){
			P = 0; 
		}else{
		P = Tool.forMat((Tool.forMat(G*Math.sin(Math.toRadians(90-a))/Math.tan(Math.toRadians(a-b))) + G*Math.cos(Math.toRadians(90-a)))*A/4*Math.sqrt(L*L-(A/2)));
		}
		return P;
	}
	
	//单锁脚绳张力k
	public double dansuo(){
		if(a == b){
			K = 0; 
		}else{
		K =  Tool.forMat((Tool.forMat(G*Math.sin(Math.toRadians(90-a))/Math.tan(Math.toRadians(a-b))) + G*Math.cos(Math.toRadians(90-a)))*L*Math.cos(Math.toRadians(a))/2*Math.sqrt(L*L-(A/2)));
		}
		return K;
	}
	
	//单根抱杆轴拉力
	public double dangen(){
		if(a == b){
			R = 0; 
		}else{
		R = Tool.forMat((Tool.forMat(G*Math.sin(Math.toRadians(90-a))/Math.tan(Math.toRadians(a-b))) + Math.cos(Math.toRadians(90-a)))*L/2*Math.sqrt(L*L-(A/2)));
		}
		return R;
	}
	
	//拉线张力
	public double laxian(){
		if(a == b){
			T = 0; 
		}else{
		T = Tool.forMat(G*Math.sin(Math.toRadians(90-a))/Math.tan(Math.toRadians(a-b)));
		}
		return T;
	}
}