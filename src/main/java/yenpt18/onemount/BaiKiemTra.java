package yenpt18.onemount;

import java.util.Scanner;

public class BaiKiemTra {
    public static void main(String agrs[]) {
/*
        String name = bai1("You Only Live Once. But if You do it right. once is Enough");
        System.out.println("Tên sau khi biến đổi là: " + name);*/
        bai2();
        bai3();
    }

    public static String bai1(String str2) {
        int uppercase = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (Character.isUpperCase((str2.charAt(i)))) {
                uppercase++;
            }
        }
        System.out.println("Số ký tự in hoa trong chuỗi là: " + uppercase);
        str2 = str2.trim();
        str2 = str2.replaceAll("\\s+", " ");
        String[] array = str2.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            String temp = String.valueOf(array[i].charAt(0));
            output.append(temp.toUpperCase() + array[i].substring(1));
            output.append(" ");
        }
        return output.toString().trim();

    }

    private static void bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mật khẩu: ");
        String pw = sc.nextLine();
        if (pw.length()<10){
            System.out.println("Pw yếu");
        }else if(!pw.matches("/[A-Z]/") || !pw.matches("/[0-9]/") || !pw.matches("[@$!%*?&]")){
            System.out.println("Mk chưa đủ mạnh");
        } else if (pw.matches("^(?=.*[a-z])(?=.*[A-Z])(/[0-9]/)(?=.[!@#\\$%\\^&]){10,}")) {
            System.out.println("Pw mạnh");
        }

    }
    public static void bai3()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào month: ");
        int month = sc.nextInt();
        try {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Tháng " + month + " có 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng " + month + " có 28 hoặc 29 ngày");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng " + month + " có 30 ngày");
                    break;
                default:
                    System.out.println("Tháng " + month+" không tồn tại");

            }
        } catch (Exception e)
        {
            System.out.println("lỗi"+ e.getMessage());
        }
    }

}
