package Lesson5.Mobile;

import Lesson4.Mobile.Iphone;

public class main {
	public static void main(String[] args) {
//		Iphone ad = new Iphone("Iphone 3");
//		ad.sms("123456", "abc");
/*		SuTu is - a DongVatAnThit
		SuTu is - a DongVat
		SuTu is - a SuTu
*/
		SuTu st = new SuTu();

		DongVat dv = st;
		DongVat dv1 = new SuTu();
		
		
//		SuTu st1 = new DongVat(); --->Sai--Chỉ có thể trỏ đến: + Chính nó
															// + Con của nó
//		- Chỉ gọi được các phương thức thuộc kiểu tham chiếu. Nhưng khi sử dụng sẽ sử dụng phương thức của kiểu MỞ RỘNG HƠN
		IDongVatAnThit dvat = new SuTu();

		/*
		 * ------instanceof----
		 * p instanceof Student >> true
		 * <biến> + instanceof + <Kiểu dữ liệu> >>>> true/false
		 */
	}
}
