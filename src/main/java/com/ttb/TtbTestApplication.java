package com.ttb;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@SpringBootApplication
public class TtbTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TtbTestApplication.class, args);
		
		//Test 1 ให้เขียน function นับจำนวนคำว่า flight ในข้อความด้านล่าง
		System.out.println(countFlight());
		
		//Test 2 Input = [18, 0, -3, 66, 28, 9, -70, 120] เขียนโปรแกรมให้ได้ Output = 9
		System.out.println(findNine());
		
		//Test 3 เขียนโปรแกรม Request ไปที่ https://localhost/v1/getCustomer เพื่อนำ customer name ไปแสดงผล
		// ดุที่ GetUser
		
	}
	
	public static int countFlight() {
		String str = "The head of Singapore Airlines has apologised after a flight on Tuesday was hit by severe extreme turbulence, killing one person and injuring dozens. Goh Choon Phong said the airline was very sorry for the traumatic experience for those onboard SQ321 from London to Singapore. The was forced to make an emergency landing in the Thai capital Bangkok. Smitivej Hospital, in Bangkok, said 104 people were treated and 58 remain in hospital, 20 of whom are in the intensive care unit. There are 15 Britons still being treated in hospital, with six in intensive care, the hospital said.";
		String find = "flight";
		int count = StringUtils.countOccurrencesOf(str, find);
		return count;
	}
	
	public static int findNine() {
		Integer input[] = {18, 0, -3, 66, 28, 9, -70, 120};
		int find = 9;
		int x = Arrays.asList(input).indexOf(find);
		return input[x];
	}
	

}
