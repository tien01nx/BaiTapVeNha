package com.company.quanlyphim;

import java.util.*;

public class DanhSachMovieAndSeries {
    Scanner sc = new Scanner(System.in);
    ArrayList<Movie> listMovie = new ArrayList<>();
    ArrayList<Series> listSeries = new ArrayList<>();
    ArrayList<Series> Min = new ArrayList<>();


    public void addMovie(Movie movie) {
        listMovie.add(movie);
    }

    public void addSeries(Series series) {
        listSeries.add(series);
    }


    //Nhap movie
    public void getListMovie() {
        Movie movie;
        System.out.println("Nhap so luong Movie");
        int n = sc.nextInt();
        System.out.println("Nhap vao danh sach Movie");
        for (int i = 0; i < n; i++) {
            movie = new Movie();
            movie.getMovie();
            listMovie.add(movie);
        }
    }

    // hien movie
    public void showListMovie() {
        // Hien thi danh sach hoc sinh
        for (Movie movie : listMovie) {
            System.out.println("___________");
            movie.showMovie();
        }
    }

    //Nhap series
    public void getListSeries() {
        Series series;
        System.out.println("Nhap so luong Movie");
        int n = sc.nextInt();
        System.out.println("Nhap vao danh sach Movie");
        for (int i = 0; i < n; i++) {
            series = new Series();
            series.getSeries();
            listSeries.add(series);
        }
    }

    // hien series
    public void showListSeries() {
        // Hien thi danh sach hoc sinh
        for (Series series : listSeries) {
            System.out.println("___________");
            series.showSeries();
        }
    }
    // tim kiem tieu  đề film và tìm phim theo tiêu đề ( tìm cả movie và series, tìm theo từ khoá)

    public void timKiemTD(String ten) {
        int dem = 0;
        for (Movie movie : listMovie) {
            if (movie.getTieude().contains(ten)) {
                movie.showMovie();
                dem++;
            }
        }
        for (Series series : listSeries) {
            if (series.getTieude().contains(ten)) {
                series.showSeries();
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Ko co");
        }
    }
}
    // xep hang thap nhat movie va serive
    // 1 2 4 5 2 1  5 0
    // double min= a[0]
//    ArrayList<Double> arrRank = new ArrayList<>();
//
//    public void xepHang() {
//        Movie result = null;
//        Double age = Double.MAX_VALUE;
//        for(Movie movie:listMovie){
//            if(age>movie.getXephang()){
//                age =movie.getXephang();
//                result =movie;
//            }
//        }

//
//        Movie result = listMovie.stream().min((o1,o2)->{
//            if(o1.getXephang() > o2.getXephang())
//                return 1;
//            return 0;
//        }).get();
//        System.out.print(result.toString());

//        Movie abc = listSeries.stream().
//        double min =   arrRank.get(0);
//        for(int i=0;i<arrRank.size();i++){
//            if(min >arrRank.get(i))
//                min = arrRank.get(i);
//            int a = (int)min;
//        System.out.println(arrRank.get(a));
//        }


//        System.out.println("Min : "+Collections.min(arrRank));



//    }
//    public  int min() {
//        for(Movie movie:listMovie){
//            if(listMovie.get(0)){
//
//            }
//
//    }


//        double minTemp = 0;	// số điểm lớn nhất
//        int i = 0;	// chỉ số của phần tử

//    }
        // tìm sinh viên có điểm cao nhất
//        i = 0;
//        while (i < danhSachSV.size()) {
//            arrThongTin = danhSachSV.get(i).split("\t");
//            // duyệt trong danhSachSV
//            // nếu có sinh viên nào có số điểm bằng với maxTemp
//            // thì sẽ thêm sinh viên đó vào trong svDiemCao
//            if (Double.parseDouble(arrThongTin[1]) == maxTemp) {
//                svDiemCao.add(danhSachSV.get(i));
//            }
//            i++;
//        }
//
//        System.out.println("Thông tin của các sinh viên có điểm cao nhất là: ");
//        System.out.println("Tên sinh viên\t Điểm");
//        iterator = svDiemCao.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


