
public class Chapter07 {
public static void main(String[] args) {
	int dis = 10;
	if (dis <= 5) {
	System.out.println("とても近い");
} else if(dis <=10) {
	System.out.println("近い");
}else if(dis <= 15){
	System.out.println("遠い");
}else {
	System.out.println("とても遠い");
}

	String color ="red";
	switch(color) {
	case "red":
		System.out.println("赤信号です");
		break;
	case "yellow":
		System.out.println("黄色信号");
		break;
	default:
		System.out.println("青信号です");
	}

}
}