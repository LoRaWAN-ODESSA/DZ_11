package com.company.util;

import java.io.*;

public class StreamUtil {

    public static boolean isEmpty(String name) {
        File file = new File(name);
        return file.length() == 0;
    }

    public static String readFile(String file) {
        String newString = "";
        int num;
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            do {
                num = fileInputStream.read();
                if (num != -1) {
                    newString += (char) num;
                }
            } while (num != -1);
            return newString;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void writeFile(String file, String newString) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(newString.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
