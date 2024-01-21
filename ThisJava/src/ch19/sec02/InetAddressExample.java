package ch19.sec02;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 날짜 : 2024/01/21
 * IP주소 얻기  p.828 
 */
public class InetAddressExample {

	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP주소:  " + local.getHostAddress()) ;
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP 주소: " + remote.getHostAddress());
			}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}




