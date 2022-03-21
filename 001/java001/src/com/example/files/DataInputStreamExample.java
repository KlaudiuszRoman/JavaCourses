package com.example.files;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args)
            throws IOException {

        DataInputStream in = null;

        try {
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream("files\\test.dat")
                    )
            );

            String str = in.readUTF();
            System.out.println(str);

            //out.writeShort(32000);
            short shortNum = in.readShort();
            System.out.println(shortNum);

            //out.writeLong(1233254345L);
            //long longNum = in.readLong();
            //System.out.println(longNum);
            in.skipBytes(8);

            //out.writeFloat(23.6544f);
            float floatNum = in.readFloat();
            System.out.println(floatNum);

            //out.writeDouble(2354435.3343d);
            double doubleNum = in.readDouble();
            System.out.println(doubleNum);

            //out.writeByte(12);
            byte byteNum = in.readByte();
            System.out.println(byteNum);

            //out.writeChar('A');
            char charNum = in.readChar();
            System.out.println(charNum);

            //out.flush(); //wymuszenie zapisu z bufora

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(in != null) in.close();
        }
    }
}
