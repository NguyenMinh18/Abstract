package advance.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Hinh h = new HinhTron(5);
			h.chuVi();
			h.dienTich();
			System.out.println("Hình Tròn");
			System.out.println("chu vi: " + h.chuVi());
			System.out.println("dien tich: " + h.dienTich());
			
			Hinh h1 = new HinhChuNhat(4, 6, 6);
			h1.chuVi();
			h1.dienTich();
			System.out.println("--------------");
			System.out.println("Hình Chữ Nhật");
			System.out.println("chu vi: " + h1.chuVi());
			System.out.println("dien tich: " + h1.dienTich());
			
			Hinh h2 = new HinhTamGiac(4,5,6,7);
			h2.chuVi();
			h2.dienTich();
			System.out.println("--------------");
			System.out.println("Hình Tam Gíac");
			System.out.println("chu vi: " + h2.chuVi());
			System.out.println("dien tich: " + h2.dienTich());
	}

}
