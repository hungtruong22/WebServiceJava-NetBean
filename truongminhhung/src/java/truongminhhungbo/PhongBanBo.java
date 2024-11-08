/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package truongminhhungbo;

import java.util.ArrayList;
import truongminhhungbean.PhongBanBean;
import truongminhhungdao.PhongBanDao;

/**
 *
 * @author Admin
 */
public class PhongBanBo {
    PhongBanDao pbdao = new PhongBanDao();
    public ArrayList<PhongBanBean> getPB(){
        return pbdao.getPB();
    }
}
