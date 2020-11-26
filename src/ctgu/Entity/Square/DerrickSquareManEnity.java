package ctgu.Entity.Square;

import java.lang.reflect.Field;
import java.math.BigDecimal;

import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import lombok.Data;

/**
 * 
 * @author 陈煜昆
 *
 */
@Data
public class DerrickSquareManEnity {

	public Double L;
	public Double G;
	public Double a;
	public Double b;
	public Double A;
	
	
	public Double P;
	public Double K;
	public Double R;
	public Double T;
	public String getEntityName() {
		return "人字抱杆计算";
	}
}
