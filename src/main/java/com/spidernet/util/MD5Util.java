package com.spidernet.util;

import java.security.MessageDigest;

/**
 *
 * @author Ian
 *
 */

public class MD5Util
{
    public final static String MD5(String s)
    {
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f' };
        try
        {
            byte[] strTemp = s.getBytes();
            // ʹ��MD5����MessageDigest����
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            mdTemp.update(strTemp);
            byte[] md = mdTemp.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++)
            {
                byte b = md[i];
                // ��û����(int)b����˫�ֽڼ���
                str[k++] = hexDigits[b >> 4 & 0xf];
                str[k++] = hexDigits[b & 0xf];
            }
            return new String(str);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    // ����
    public static void main(String[] args)
    {
        System.out.println("caidao��MD5���ܺ�\n" + MD5Util.MD5("123"));
        System.out.println("");
    }
}
