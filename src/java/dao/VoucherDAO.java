/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.voucher;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface VoucherDAO {

    public int getLastVoucherID();

    public int addVoucher(int codeID, int userID, String code, int existTime, int discount);

    public List<voucher> getAll();

    public int DeleteVoucher(String id);

    public voucher getVoucherByID(String id);

    public int updateVoucher(voucher p);
}
