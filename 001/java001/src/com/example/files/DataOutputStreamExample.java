package com.example.files;

import java.io.*;

public class DataOutputStreamExample {
    public static void main(String[] args)
            throws IOException {

        DataOutputStream out = null;

        try {
            out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("files\\test.dat")
                    )
            );

            out.writeUTF("Testowy strumień binarny");
            out.writeShort(32000);
            out.writeLong(1233254345L);
            out.writeFloat(23.6544f);
            out.writeDouble(2354435.3343d);
            out.writeByte(12);
            out.writeChar('A');

            out.flush(); //wymuszenie zapisu z bufora

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(out != null) out.close();
        }
    }
}
