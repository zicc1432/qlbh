/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Dung's
 */
public class checkData {

    public static String md5(String str) {
        String result = "";
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
            digest.update(str.getBytes());
            BigInteger bigInteger = new BigInteger(1, digest.digest());
            result = bigInteger.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean kiemTraEmail(String email) {
//        String dinhDangEmail = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
//        boolean ktEmail = email.matches(dinhDangEmail);
//        return ktEmail;
        // String dinhDangEmail nó giống như là format chuẩn cho email mình nhập vào, nếu sai cái
        // dịnh dạng này thì là lỗi.
        // Hàm matches dùng để xác định xem chuỗi email của mình có khớp với định dạng mình đã quy 
        // định trước hay không. hàm này trả về true , false nên mình khởi tạo 1 biến ktEmail rồi gán
        // cho nó. false thì báo lỗi.
    }

    public boolean kiemTraTen(String ten) {
        for (int i = 0; i < 10; i++) {
            if (ten.contains(i + "")) {
                return false;
            }
        }
        return true;
    }

    public boolean kiemTraGiaVaSoLuong(String gia) {
        for (int i = 0; i < 10; i++) {
            if (gia.contains(i + "")) {
                return true;
            }
        }
        return false;
    }

    public boolean kiemTraMk(String matkhau) {
        boolean check = false;
        if (matkhau.length() < 8) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public boolean kiemTraSDT(String sdt) {
        boolean check = false;
        try {
            if (sdt.startsWith(0 + "") == false) {
                check = true;
            } else if (sdt.length() != 10) {
                check = true;
            }
        } catch (Exception e) {
            check = true;
        }
        return check;
    }
}
