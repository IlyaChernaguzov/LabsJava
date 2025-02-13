package lesson3.string;

public class StringBufferDemo {
    public static void main(String[] args) {
//        StringBuffer stringBuffer1 = new StringBuffer(); //capacity -> 16
//        StringBuffer stringBuffer2 = new StringBuffer("Java"); //capacity = str.length() + 16
//        StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2); //параметр - любой класс что реализует CharSequence
//        StringBuffer stringBuffer4 = new StringBuffer(50); //capacity -> 50

        String name = "Bob";
        String surName = "Smith";

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name);
        stringBuffer.append(" ");
        stringBuffer.append(surName);

        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(name);
        stringBuffer2.append(" ");
        stringBuffer2.append(surName);

        System.out.println(stringBuffer);

        stringBuffer.delete(stringBuffer.length() - surName.length(), stringBuffer.length()); //удаляем фамилию
        //stringBuffer.delete([стартовый индекс], [индекс конечного символа])

        System.out.println(stringBuffer);

        stringBuffer.insert(0, surName);
        //stringBuffer.insert([с какого индекса вставлять], [строка])

        System.out.println(stringBuffer);

        char ch = stringBuffer.charAt(0);

        System.out.println(ch);

    }
}
