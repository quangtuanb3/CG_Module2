package Product;

import java.util.List;

public interface BasicCRUD<T> {
    //    Thêm sản phẩm
    //    Sửa thông tin sản phẩm theo id
    //    Xoá sản phẩm theo id
    //    Hiển thị danh sách sản phẩm
    //    Tìm kiếm sản phẩm theo tên
    //    Sắp xếp sản phẩm tăng dần, giảm dần theo giá
    void add(T ele);

    void update(T ele);

    void print();

    void remove(int id);

    List<T> find(String name);

    void sort(boolean ascending);

}
