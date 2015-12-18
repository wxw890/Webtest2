package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import model.UserDto;


public class UserDao {
	
	private List items = new ArrayList <String>();
	private UserDto[] userDto = new UserDto[3];//UserDto클래스 배열 생성
	
	public UserDao(){
		userDto[0] = new UserDto();
		userDto[0].setName("홍길동");
		userDto[0].setAge(22);
		userDto[0].setPoint(2.5);
		
		userDto[1] = new UserDto();
		userDto[1].setName("임꺽정");
		userDto[1].setAge(20);
		userDto[1].setPoint(6.5);
		
		userDto[2] = new UserDto();
		userDto[2].setName("박세연");
		userDto[2].setAge(24);
		userDto[2].setPoint(7.5);
		
		//items 리스트에 Dto배열 저장
		items.add(userDto[0]);
		items.add(userDto[1]);
		items.add(userDto[2]);
	}
	//선택한 회원정보 가져오기
	public UserDto getItem(String name){
		if(name.equals("홍길동")){
			return userDto[0];
		}
		else if(name.equals("임꺽정")){
			return userDto[1];
		}
		else{
			return userDto[2];
		}
	}
	//모든 회원 정보 가져오기
	public List getItems(){
		return items;
	}
}
