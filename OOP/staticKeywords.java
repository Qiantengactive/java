package OOP;

public class staticKeywords {
        private int age;
        private static int num;
        public staticKeywords(int age){
        	 this.age=age;
        	 System.out.println(++num);
        }
        public static void main(String[] args) {
        	staticKeywords staticKeywords1=new staticKeywords(2);
        	staticKeywords staticKeywords2=new staticKeywords(3);
		}
}
