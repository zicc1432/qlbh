/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import OBJ.HoaDon;
import OBJ.KhachHang;
import OBJ.SanPham;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Dung's
 */
public class frmBanHang extends javax.swing.JPanel {

    /**
     * Creates new form frmBanHang
     */
    private DefaultTableModel defaultTableModel;
    ArrayList<HoaDon> listGioHang = new ArrayList<>();
    KhachHang kh = new KhachHang();
    SanPham sp = new SanPham();
    int index;
    double tongTien = 0;

    public frmBanHang() {
        initComponents();
        getDataKH(loadKH());
        getDataSP(loadSP());
        lbl_nhanvien.setText(frmDangNhap.maDN);
    }

    public ArrayList<KhachHang> loadKH() {
        frmKhachHang frm_KH = new frmKhachHang();
        frm_KH.loadFile();
        return frm_KH.listKH;
    }

    public ArrayList<SanPham> loadSP() {
        frmSanPham frm_SP = new frmSanPham();
        frm_SP.loadFile();
        return frm_SP.listSP;
    }

    private void getDataKH(ArrayList<KhachHang> listKH) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Mã KH");
        defaultTableModel.addColumn("Họ tên KH");
        defaultTableModel.addColumn("Giới tính");
        defaultTableModel.addColumn("Email");
        defaultTableModel.addColumn("SĐT");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("Trạng Thái");

        for (KhachHang obj : listKH) {
            Vector vector = new Vector();
            vector.add(obj.getMaKH());
            vector.add(obj.getTenKH());
            vector.add(obj.getGioiTinh());
            vector.add(obj.getEmail());
            vector.add(obj.getSoDienThoai());
            vector.add(obj.getDiaChi());
            vector.add(obj.getTrangThai() == 1 ? "Hoạt động" : "Đã khóa");
            defaultTableModel.addRow(vector);
        }
        tbl_khachhang.setModel(defaultTableModel);
    }

    private void getDataSP(ArrayList<SanPham> listSP) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Mã SP");
        defaultTableModel.addColumn("Tên SP");
        defaultTableModel.addColumn("Đơn vị tính");
        defaultTableModel.addColumn("Tên NSX");
        defaultTableModel.addColumn("Giá bán");
        defaultTableModel.addColumn("Giá nhập");
        defaultTableModel.addColumn("Số lượng");

        for (SanPham obj : listSP) {
            Vector vector = new Vector();
            vector.add(obj.getMaSP());
            vector.add(obj.getTenSP());
            vector.add(obj.getDVT());
            vector.add(obj.getTenNSX());
            vector.add(obj.getGiaBan());
            vector.add(obj.getGiaNhap());
            vector.add(obj.getSoLuong());
            defaultTableModel.addRow(vector);
        }
        tbl_sanpham.setModel(defaultTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_giohang = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_tongTien = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_maKH = new javax.swing.JLabel();
        lbl_soDienThoai = new javax.swing.JLabel();
        lbl_diaChi = new javax.swing.JLabel();
        lbl_tenKH = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_sanpham = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txt_soLuong = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_khachhang = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btn_thanhtoan = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        lbl_nhanvien = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Zent Coding School");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HÓA ĐƠN BÁN HÀNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), java.awt.Color.red)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_giohang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_giohang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_giohangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_giohang);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 240, 439, 106));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Xóa khỏi giỏ hàng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 357, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tổng tiền: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 405, -1, -1));

        lbl_tongTien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_tongTien.setText("..........");
        jPanel2.add(lbl_tongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 400, 119, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("Giỏ hàng:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 205, 82, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Mã khách hàng");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Số điện thoại");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Họ và tên");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Email");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Địa chỉ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 130, -1, -1));

        lbl_maKH.setText("..........");
        jPanel2.add(lbl_maKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 31, -1, -1));

        lbl_soDienThoai.setText("..........");
        jPanel2.add(lbl_soDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 81, -1, -1));

        lbl_diaChi.setText("..........");
        jPanel2.add(lbl_diaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 131, -1, -1));

        lbl_tenKH.setText("..........");
        jPanel2.add(lbl_tenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 31, -1, -1));

        lbl_email.setText("..........");
        jPanel2.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 81, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), java.awt.Color.red)); // NOI18N

        tbl_sanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sanphamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_sanpham);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Số lượng:");

        txt_soLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_soLuongActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Thêm vào giỏ hàng");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel16)
                                .addGap(27, 27, 27)
                                .addComponent(txt_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel16))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), java.awt.Color.red)); // NOI18N

        tbl_khachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_khachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_khachhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_khachhang);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_thanhtoan.setText("Thanh toán");
        btn_thanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thanhtoanActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton6.setText("Thoát");

        jLabel17.setText("Mã nhân viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btn_thanhtoan)
                        .addGap(80, 80, 80)
                        .addComponent(jButton6)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(lbl_nhanvien)
                .addGap(63, 63, 63))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lbl_nhanvien))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_khachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khachhangMouseClicked
        // TODO add your handling code here:
        int row = tbl_khachhang.getSelectedRow();
        String maKH = tbl_khachhang.getValueAt(row, 0).toString();
        ArrayList<KhachHang> listKH = loadKH();
        for (int i = 0; i < listKH.size(); i++) {
            if (maKH.equalsIgnoreCase(listKH.get(i).getMaKH())) {
                kh = listKH.get(i);
                index = i;
                break;

            }

        }
        lbl_maKH.setText(kh.getMaKH());
        lbl_tenKH.setText(kh.getTenKH());
        lbl_email.setText(kh.getEmail());
        lbl_soDienThoai.setText(kh.getSoDienThoai());
        lbl_diaChi.setText(kh.getDiaChi());
    }//GEN-LAST:event_tbl_khachhangMouseClicked

    public int soLuongSPTrongListGioHang(String maSP) {
        for (int i = 0; i < listGioHang.size(); i++) {
            if (maSP.equals(listGioHang.get(i).getMaSP())) {
                return listGioHang.get(i).getSoLuong();
            }
        }
        return 0;
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int soLuongMua = Integer.parseInt(txt_soLuong.getText());
        if (soLuongMua < 0) {
            JOptionPane.showMessageDialog(this, "Số lượng mua phải lớn hơn 0");
        } else if (soLuongMua > sp.getSoLuong()) {
            JOptionPane.showMessageDialog(this, "Số lượng sản phẩm lớn hơn số lượng trong kho");
        } else if (soLuongMua + soLuongSPTrongListGioHang(sp.getMaSP()) > sp.getSoLuong()) {
            JOptionPane.showMessageDialog(this, "Số lượng sản phẩm lớn hơn trong kho");
        } else {
            HoaDon hd = new HoaDon();
            hd.setMaSP(sp.getMaSP());
            hd.setSoLuong(soLuongMua);
            hd.setDonGia(sp.getGiaBan());
            hd.setThanhTien(hd.getSoLuong() * hd.getDonGia());
            if (checkSPExistGioHang(hd.getMaSP(), listGioHang)) {
                HoaDon hoaDon = listGioHang.get(indexMaSPTrungTrongGioHang);
                hoaDon.setSoLuong(Integer.parseInt(txt_soLuong.getText()) + hoaDon.getSoLuong());
                listGioHang.set(indexMaSPTrungTrongGioHang, hoaDon);
            } else {
                listGioHang.add(hd);
            }
            loadGioHang(listGioHang);
            JOptionPane.showMessageDialog(this, "Thêm vào giỏ hàng thành công");
            tongTien = 0;
            for (int i = 0; i < listGioHang.size(); i++) {
                tongTien += listGioHang.get(i).getThanhTien();
            }
            lbl_tongTien.setText(Double.toString(tongTien));
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbl_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sanphamMouseClicked
        // TODO add your handling code here:
        int row = tbl_sanpham.getSelectedRow();
        String maSP = tbl_sanpham.getValueAt(row, 0).toString();
        ArrayList<SanPham> listSP = loadSP();
        for (int i = 0; i < listSP.size(); i++) {
            if (maSP.equalsIgnoreCase(listSP.get(i).getMaSP())) {
                sp = listSP.get(i);
                index = i;
                break;

            }

        }
        txt_soLuong.setText("1");
    }//GEN-LAST:event_tbl_sanphamMouseClicked

    private void btn_thanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thanhtoanActionPerformed
        // TODO add your handling code here:
        if (kh.getMaKH() == null || kh.getMaKH().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn khách hàng trước");
            return;
        } else {
            Date date = new Date();
//            SimpleDate
        }

//        sendmail(sp.getTenSP(), tongTien, kh.getEmail());
//        reset();

    }//GEN-LAST:event_btn_thanhtoanActionPerformed

    String maSP;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double tienGiam;
        for (int i = 0; i < listGioHang.size(); i++) {
            if (maSP.equals(listGioHang.get(i).getMaSP())) {
                tienGiam = listGioHang.get(i).getThanhTien();
                listGioHang.remove(i);
                tongTien = tongTien - tienGiam;
                lbl_tongTien.setText(String.valueOf(tongTien));
            }
        }
        loadGioHang(listGioHang);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_giohangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_giohangMouseClicked
        // TODO add your handling code here:
        int row = tbl_giohang.getSelectedRow();
        maSP = tbl_giohang.getValueAt(row, 0).toString();
    }//GEN-LAST:event_tbl_giohangMouseClicked

    private void txt_soLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_soLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_soLuongActionPerformed

    int indexMaSPTrungTrongGioHang;

    public boolean checkSPExistGioHang(String maSP, ArrayList<HoaDon> listHD) {
        for (int i = 0; i < listHD.size(); i++) {
            if (maSP.equals(listHD.get(i).getMaSP())) {
                indexMaSPTrungTrongGioHang = i;
                return true;
            }
        }
        return false;
    }

    private void loadGioHang(ArrayList<HoaDon> listHD) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Mã SP");
        defaultTableModel.addColumn("Tên sản phẩm");
        defaultTableModel.addColumn("ĐVT");
        defaultTableModel.addColumn("SL mua");
        defaultTableModel.addColumn("Đơn giá");
        defaultTableModel.addColumn("Thành tiền");

        for (HoaDon obj : listHD) {
            SanPham sp = new frmBanHang().getSPByCode(obj.getMaSP());
            Vector vector = new Vector();
            vector.add(obj.getMaSP());
            vector.add(sp.getTenSP());
            vector.add(sp.getDVT());
            vector.add(obj.getSoLuong());
            vector.add(obj.getDonGia());
            vector.add(obj.getThanhTien());
            defaultTableModel.addRow(vector);
        }
        tbl_giohang.setModel(defaultTableModel);
    }

    public SanPham getSPByCode(String maSP) {
        ArrayList<SanPham> listSP = loadSP();
        for (int i = 0; i < listSP.size(); i++) {
            if (maSP.equals(listSP.get(i).getMaSP())) {
                return listSP.get(i);
            }
        }
        return null;
    }

//    public void sendmail() {
//        try {
//            Email email = new SimpleEmail();
//
//            // Cấu hình thông tin Email Server
//            email.setHostName("smtp.googlemail.com");
//            email.setSmtpPort(465);
//            email.setAuthenticator(new DefaultAuthenticator("diachiemailcuaban", "matkhauemailcuaban")); //Nhớ nhập đúng với tài khoản thật nhé :))
//
//            // Với gmail cái này là bắt buộc.
//            email.setSSLOnConnect(true);
//
//            // Người gửi
//            email.setFrom("ĐiaChiEmailCuaBan", "Tên thay thế khi xuất hiện email");
//
//            // Tiêu đề
//            email.setSubject("EMAIL RESET PASSWORD"); //Tiêu đề khi gửi email
//
//            // Nội dung email
////            String covert = String.valueOf(rand);
//            email.setMsg("Nội dung email bạn muốn gửi cho người nhận"); //Nội dung email bạn muốn gửi.
//            // Người nhận
//            email.addTo("Địa chỉ email người nhận"); //Đia chỉ email người nhận
//            email.send(); //Thực hiện gửi.
//            System.err.println("Gửi email thành công ! Vui lòng kiểm tra email !");
//            System.out.println("\n");
//        } catch (Exception e) {
//            System.out.println("Gửi không thành công !");
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_thanhtoan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl_diaChi;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_maKH;
    private javax.swing.JLabel lbl_nhanvien;
    private javax.swing.JLabel lbl_soDienThoai;
    private javax.swing.JLabel lbl_tenKH;
    private javax.swing.JLabel lbl_tongTien;
    private javax.swing.JTable tbl_giohang;
    private javax.swing.JTable tbl_khachhang;
    private javax.swing.JTable tbl_sanpham;
    private javax.swing.JTextField txt_soLuong;
    // End of variables declaration//GEN-END:variables
}
