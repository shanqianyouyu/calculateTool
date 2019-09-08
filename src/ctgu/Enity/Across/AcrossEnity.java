package ctgu.Enity.Across;

import lombok.Data;

//参数取单词缩写
@Data
public class AcrossEnity {
/*	所有参数
	 * 输入参数
	     *垂直载荷和均匀载荷
		 *	WLD		导线线密度
		 *  WCSC	风载体系系数
		 *  NOSR	子导线根数
		 *  WLAC	风荷调整系数
		 *  WS		路线设计最大风速
		 *  PA	        架面1m范围的投影面积
		 *  IC	        冲击系数
			 	
		 	
		 * 	事故，架顶宽度，最小安全距离：
		 *  FC 摩擦系数
		  
		 * 木竹跨越架的安装
		 * 	HP	跨越架最高点的对地距离
		 * 	MVD	与封顶架面的最小垂直距离
		 * 	VA	跨越架封顶网的垂弧
		 * 	LS	施工线路的线间距离
		 *  CW	跨越架顶面超出施工线路的宽度
		 *  IWP 施工线路与别跨电力线的交叉角
		 *  MS  跨越架顶面的最小跨距
		 *  HD  被跨电力线两边线间的水平距离
		 *  MHD 金属架至被跨电力线最小水平距离

		 
		 * 	单侧跨越架
		 * 	RS		最小安全距离要求的跨距
		 * 	SC		在建线路的交叉角引起的跨距
		 * 	HHP		上层拉线挂点至地面的高度
		 *  RPL		运行电力线的下导线至地面高度
		 *  ADP		拉线对地面夹角
		 *  ACB		拉线与跨越架横担轴线间的水平夹角
		 *  OPL		上拉线挂点至运行电力线的垂直距离
		 *  MSD		上拉线与运行电力线的最小安全距离
		 *  SCD		拉线位置引起的跨距
		 *  
		 *  DCL		与施工线路任一相邻杆塔的距离
		 *  HST		水平放线张力
		 *  SSC		施工线路的跨越档档距跨越
		 *  LOPT	两端悬垂绝缘子串或滑车挂具长度
		 *  ULW		导线、地线的单位长度重量
		 *  ULWL	导线或地线安装的单位长度风荷重
		 *  DWG	         导线或地线直径
		 *  WCTC	风载体型系数
		  
		 
	*输出结果

		/*
		 * 基本结果
		 * WLS		跨越架的垂直载荷
		 * ULWP		架面风压的均布载荷
		 * HLS		跨越架的水平荷载
		 * MHC		跨越架的最小高度
		 * MWS		跨越架的最小宽度
		 * 

		 * 安装与风偏计算
		 * MSS		跨越架顶面的最小跨距
		 * RPL 		架外侧至运行电力线的水平距离为
		 * WDD		风偏距离
		 
		 */
	
	public double WLD;
	public double WCSC;
	public double NOSR;
	public double WLAC;
	public double WS;
	public double PA;
	public double IC;
	
	public double FC;
	
	public double HP;
	public double MVD;
	public double VA;
	public double LS;
	public double CW;
	public double IWP;
	public double Ms;
	public double Hd;
	public double Mhd;


	public double RS;
	public double SC;
	public double HHP;
	public double RPL;
	public double ADP;
	public double ACB;
	public double OPL;
	public double MSD;
	public double SCD;
		
	public double DCL;
	public double HST;
	public double SSC;
	public double LOPT;
	public double ULW;
	public double ULWL;
	public double DWG;
	public double WCTC;
		
	public double WLS;
	public double ULWP;
	public double HLS;
	public double MHC;
	public double MWS;
	
	public double MSS;
	public double Rpl;
	public double TRpl;
	public double WDD;
	
	public String getEntityName() {
		return "跨越架计算";
	}
	
}
