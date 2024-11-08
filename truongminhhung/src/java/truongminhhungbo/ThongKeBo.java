/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongminhhungbo;

import java.util.ArrayList;
import truongminhhungbean.ThongKeBean;
import truongminhhungdao.ThongKeDao;

/**
 *
 * @author Admin
 */
public class ThongKeBo {
    ThongKeDao tkdao =  new ThongKeDao();
    public ArrayList<ThongKeBean> thongKeTrungBinhLuong() throws Exception{
        return tkdao.thongKeTrungBinhLuong();
    }
}
