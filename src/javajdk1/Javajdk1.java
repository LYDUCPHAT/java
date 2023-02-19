/*import java.util.Scanner; //bài 1
import java.lang.Math;
class JavaApp1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập n: ");
        double n = input.nextDouble();
        double i = Math.sqrt(n);
        if(i*i == n){
            System.out.println("n là số chính phương.");
        }
        else{
            System.out.println("n không phải là số chính phương.");
        }
    }
}*/



/*import java.util.Scanner; //bài 2
class JavaApp1{
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập điểm: ");
        double n = input.nextDouble();
        if(n < 5.0){
            System.out.println("Học sinh yếu.");
        }
        else if ( n >= 5.0 && 7.0 > n ){
            System.out.println("Học sinh trung bình.");
        }
        else if ( n >= 7.0 && 8 > n){
            System.out.println("Học sinh khá.");
        }
        else{
            System.out.println("Học sinh giỏi.");
        }
    }
}*/



/*import java.util.Scanner; //bài 3
class JavaApp1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên 3 chữ số: ");
        int n = input.nextInt();
        int donvi,chuc,tram;
        if(n < 100 && n > 999 ){
            System.out.println("Số không hợp lệ.");
        }
        else{
            donvi = n % 10;
            n /= 10;
            chuc = n %10;
            n /= 10;
            tram = n %10;
           
            switch(tram){
                case 1:
                System.out.println("Một");
                break;
            
                case 2:
                System.out.println("Hai");
                break;
            
                case 3:
                System.out.println("Ba");
                break;
            
                case 4:
                System.out.println("Bốn");
                break;
                
                case 5:
                System.out.println("Năm");
                break;
                
                case 6:
                System.out.println("Sáu");
                break;
            
                case 7:
                System.out.println("Bảy");
                break;
                
                case 8:
                System.out.println("Tám");
                break;
                
                case 9:
                System.out.println("Chín");
                break;
            }    
            switch(chuc){
                case 0:
                System.out.println("Không");
                break;
                
                case 1:
                System.out.println("Một");
                break;
                
                case 2:
                System.out.println("Hai");
                break;
                
                case 3:
                System.out.println("Ba");
                break;
                
                case 4:
                System.out.println("Bốn");
                break;
                
                case 5:
                System.out.println("Năm");
                break;
                
                case 6:
                System.out.println("Sáu");
                break;
            
                case 7:
                System.out.println("Bảy");
                break;
                
                case 8:
                System.out.println("Tám");
                break;
                
                case 9:
                System.out.println("Chín");
                break;
            }    
            switch(donvi){
                case 0:
                System.out.println("Không");
                break;
                
                case 1:
                System.out.println("Một");
                break;
                
                case 2:
                System.out.println("Hai");
                break;
                
                case 3:
                System.out.println("Ba");
                break;
                
                case 4:
                System.out.println("Bốn");
                break;
                
                case 5:
                System.out.println("Năm");
                break;
                
                case 6:
                System.out.println("Sáu");
                break;
                
                case 7:
                System.out.println("Bảy");
                break;
                
                case 8:
                System.out.println("Tám");
                break;
                
                case 9:
                System.out.println("Chín");
            }
            
            
            
            
        }
        
        
        
    }
}*/


/*import java.util.Scanner; //bài 4
class JavaApp1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int n = input.nextInt();
        int m = 1;
        if( n < 0){
                System.out.println("Số không hợp lệ.");
        }
        else{
            int i = 1;
            while(i < n){
                ++i;
                m *= i;
                System.out.println("Giai thừa của n là: " + m );
            }
        }
        
    }
}*/

/*import java.util.Scanner; //bài 5
import java.util.Arrays;
class JavaApp1{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int n[] = new int [5];
        for(int i = 0; i < n.length; i++){
            System.out.printf("Nhập phần tử thứ %d:  ", (i+1));
            n[i]= input.nextInt();
        }
        System.out.println("Phần tử mảng trước khi xóa : " + Arrays.toString(n));
        System.out.println("Số cần xóa: ");
        int x = input.nextInt();
        for(int i = 0 ; i < n.length ; i++){
            if(n[i] == x ){
                n[i] = 0;
            }
        }
        Arrays.sort(n);
        System.out.println("Phần tử mảng sau khi xóa được sắp xếp: " + Arrays.toString(n));
    }
}*/    

/*import java.util.Arrays;  //bài 6
import java.util.Scanner;
class JavaApp1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số dòng: ");
        int dong = input.nextInt();
        System.out.println("Nhập vào số cột: ");
        int cot = input.nextInt();
        int n[][] = new int[dong][cot];
        for(int i = 0 ; i < dong ; i++){
            for( int j = 0 ; j < cot ; j++){
                System.out.println("Nhập vào phần tử tại vị trí [" + i +"][" + j + "]");
                //int temp = input.nextInt();
                n[i][j] = input.nextInt();
          
            }
        }
        for(int i = 0 ; i < dong ; i++){
            for( int j = 0 ; j < cot ; j++){
                System.out.print(n[i][j] + " ");
            }
        }    
        
        
    }
}*/

/*import java.util.Scanner; //bài 7
class JavaApp1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a = ");
        double a = input.nextDouble();
        System.out.println("Nhập b = ");
        double b = input.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm.");
            }
            else{
                System.out.println("Phương trình vô nghiệm.");
            }
        }
        else{
            double x = -b/a;
            System.out.println("Nghiệm x = " + x);
        }
    }
}*/
/*import java.util.Scanner; //bài 8
import java.lang.Math;
class JavaApp1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a = ");
        double a = input.nextDouble();
        System.out.println("Nhập b = ");
        double b = input.nextDouble();
        System.out.println("Nhập c = ");
        double c = input.nextDouble();
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Phương trình vô số nghiệm.");
                }
                else{
                    System.out.println("Phương trình vô nghiệm.");
                }
            }
            else if(c == 0){
                System.out.println("x = 0.");
            }
            else{
                double x = -c/b;
                System.out.println("Nghiệm x = " + x);
            }
        }
        else{
            double delta = (b*b)-(4*a*c);
            if(delta < 0){
                System.out.println("Phương trình vô nghiệm.");
            }
            else if(delta == 0){
                double x = -b/(2*a);
                System.out.println("Nghiệm kép= " + x);
            }
            else{
                double x1 = ((-b + Math.sqrt(delta))/(2*a));
                System.out.println("Nghiệm x1 = " + x1);
                double x2 = ((-b - Math.sqrt(delta))/(2*a));
                System.out.println("Nghiệm x2 = " + x2);
            }
        }
    }
}*/

/*import java.util.Scanner; //bài 9
class JavaApp1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Số điện: ");
        int sodien = input.nextInt();
        if(sodien <= 50){
            int tien = sodien * 1000;
            System.out.println("Số tiền là: " + tien + " đồng.");
        }
        else{
            int tien = (50*1000) + ((sodien-50)*1200);
            System.out.println("Số tiền là: " + tien + " đồng.");
        }
    }
}*/
