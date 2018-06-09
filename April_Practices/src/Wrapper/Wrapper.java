package Wrapper;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b= new Boolean(true);
		System.out.println(b);
		Character c = new Character('a');
		System.out.println(c);
		//Byte by= new Byte ((byte)111);
		Byte by= new Byte ("111");
		System.out.println(by);
		Short sh= new Short((short) 111);
		System.out.println(sh);
		Integer i1 = new Integer(111);
		System.out.println(i1);
		Long l1= new Long(333L);
		System.out.println(l1);
		Float f1= new Float("12.1");
		System.out.println(f1);
		Double d1 = new Double(3.14);
		System.out.println(d1);
		
		
		//X.parseX(str) == converting String to primitive
		// X.valueOf(str) == converting String to wrapper class Object
		// int i = Integer.parseInt("5") --> this is auto boxing
		
		
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.valueOf("FALSE"));
		System.out.println(Byte.parseByte("111"));
		System.out.println(Byte.valueOf("11"));
		System.out.println(Short.parseShort("222"));
		System.out.println(Short.valueOf("222"));
		System.out.println(Integer.parseInt("333"));
		System.out.println(Integer.valueOf("333"));
		System.out.println(Long.parseLong("444"));
		System.out.println(Long.valueOf("444"));
		System.out.println(Float.parseFloat("555"));
		System.out.println(Float.valueOf("555"));
		System.out.println(Double.parseDouble("666.6"));
		System.out.println(Double.valueOf("666.6"));
		
		//
		
		System.out.println("Maximun number of integer: "+Integer.MAX_VALUE);
		System.out.println("Max for long"+Long.MAX_VALUE);
		System.out.println(Character.isDigit('9'));
		System.out.println(Character.isDigit('z'));
		
		//
		Integer I1=new Integer(127); 
		Integer i2=127; 
		System.out.println(I1==i2); 
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE+" is max. "+Byte.MIN_VALUE+" is the min value.");
		
		
		
	}

}
