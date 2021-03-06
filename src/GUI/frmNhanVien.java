/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import OBJ.NhanVien;
import Utils.checkData;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dung's
 */
public class frmNhanVien extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModel;
    NhanVien nv = new NhanVien();
    ArrayList<NhanVien> listNV = new ArrayList<>();
    checkData check = new checkData();
    int index;

    /**
     * Creates new form frmNhanVien
     */
    public frmNhanVien() {
        initComponents();
        loadFile();
        getData(listNV);
    }

    public void loadFile() {
        try {
            BufferedReader br = null;
            FileReader fr = null;
            listNV = new ArrayList<>(); //lưu ý
            fr = new FileReader("nhanvien.txt");
            br = new BufferedReader(fr);
            String s = null;

            try {
                while ((s = br.readLine()) != null) {
                    //Cắt chuỗi:
                    String arr[] = s.split("\t");
                    //Khởi tạo
                    NhanVien nv = new NhanVien();
                    nv.setMaNhanVien(arr[0]);
                    nv.setHoTen(arr[1]);
                    nv.setGioiTinh(arr[2]);
                    nv.setEmail(arr[3]);
                    nv.setSoDienThoai(arr[4]);
                    nv.setMatKhau(arr[5]);
                    nv.setNhom(Integer.parseInt(arr[6]));
                    nv.setTrangThai(Integer.parseInt(arr[7]));
                    listNV.add(nv);
                }
            } catch (IOException ex) {
                Logger.getLogger(frmNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void saveFile() {

        try {
            BufferedWriter bw = null; //Khởi tạo
            FileWriter fw = null; //Khởi tạo
            String data = ""; //Tạo một string data bằng rỗng.
            for (int i = 0; i < listNV.size(); i++) {
                String row = ""; //tạo hàng rỗng
                row = row + listNV.get(i).getMaNhanVien() + "\t";
                row = row + listNV.get(i).getHoTen() + "\t";
                row = row + listNV.get(i).getGioiTinh() + "\t";
                row = row + listNV.get(i).getEmail() + "\t";
                row = row + listNV.get(i).getSoDienThoai() + "\t";
                row = row + listNV.get(i).getMatKhau() + "\t";
                row = row + listNV.get(i).getNhom() + "\t";
                row = row + listNV.get(i).getTrangThai() + "\n";
                data += row;
            }
            fw = new FileWriter("nhanvien.txt");
            bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(frmNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void getData(ArrayList<NhanVien> listNV) {
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("Mã NV");
        defaultTableModel.addColumn("Họ tên NV");
        defaultTableModel.addColumn("Giới tính");
        defaultTableModel.addColumn("Email");
        defaultTableModel.addColumn("SĐT");
        defaultTableModel.addColumn("Nhóm");
        defaultTableModel.addColumn("Trạng Thái");

        for (NhanVien obj : listNV) {
            Vector vector = new Vector();
            vector.add(obj.getMaNhanVien());
            vector.add(obj.getHoTen());
            vector.add(obj.getGioiTinh());
            vector.add(obj.getEmail());
            vector.add(obj.getSoDienThoai());
            vector.add(obj.getNhom() == 1 ? "Quản lý" : "Nhân viên");
            vector.add(obj.getTrangThai() == 1 ? "Hoạt động" : "Đã khóa");
            defaultTableModel.addRow(vector);
        }
        tbl_nhanvien.setModel(defaultTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_nhanvien = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txt_maNV = new javax.swing.JTextField();
        txt_trangThai = new javax.swing.JComboBox<>();
        txt_sdt = new javax.swing.JTextField();
        txt_gioiTinh = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txt_tenNV = new javax.swing.JTextField();
        txt_nhom = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_matKhau = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        txt_tuKhoa = new javax.swing.JTextField();
        btn_timkiem = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setAutoscrolls(true);
        setMaximumSize(new java.awt.Dimension(995, 645));
        setMinimumSize(new java.awt.Dimension(995, 645));
        setPreferredSize(new java.awt.Dimension(995, 645));

        jPanel11.setBackground(new java.awt.Color(204, 255, 255));

        tbl_nhanvien.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_nhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_nhanvienMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_nhanvien);

        jPanel12.setBackground(new java.awt.Color(255, 255, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel12.setPreferredSize(new java.awt.Dimension(520, 269));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 51, 51));
        jLabel31.setText("Nhóm NV");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 51, 51));
        jLabel32.setText("Họ và tên");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 51, 51));
        jLabel33.setText("SĐT");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 51, 51));
        jLabel34.setText("Giới tính");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 51));
        jLabel35.setText("Mật khẩu");

        txt_maNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maNVjTextField1ActionPerformed(evt);
            }
        });

        txt_trangThai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_trangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoạt động", "Đã khóa" }));
        txt_trangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_trangThaijComboBox1ActionPerformed(evt);
            }
        });

        txt_gioiTinh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_gioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));
        txt_gioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gioiTinhjComboBox2ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 51, 51));
        jLabel36.setText("Mã nhân viên");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 51, 51));
        jLabel37.setText("Trạng thái");

        txt_tenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tenNVjTextField4ActionPerformed(evt);
            }
        });

        txt_nhom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nhom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Nhân viên" }));
        txt_nhom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nhomjComboBox2ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 51, 51));
        jLabel38.setText("Email");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(jLabel31)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addGap(33, 33, 33)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_sdt)
                    .addComponent(txt_nhom, 0, 170, Short.MAX_VALUE)
                    .addComponent(txt_matKhau)
                    .addComponent(txt_maNV))
                .addGap(14, 14, 14)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel32)
                            .addComponent(jLabel38))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_tenNV)
                                .addComponent(txt_gioiTinh, 0, 121, Short.MAX_VALUE))
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_trangThai, javax.swing.GroupLayout.Alignment.LEADING, 0, 118, Short.MAX_VALUE)))))
                .addGap(25, 25, 25))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32)
                        .addComponent(txt_tenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txt_gioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txt_nhom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel38)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_trangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel35)
                    .addComponent(txt_matKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Tìm kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N

        txt_tuKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tuKhoaActionPerformed(evt);
            }
        });

        btn_timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txt_tuKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_timkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(txt_tuKhoa))
                .addContainerGap())
        );

        btn_them.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        jButton4.setText("Sửa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton5.setText("Thoát");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Zent Coding School");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:String maNV = txt_maNV.getText();
        String maNV = txt_maNV.getText();
        String tenNV = txt_tenNV.getText();
        String email = txt_email.getText();
        String sdt = txt_sdt.getText();
        String matKhau = txt_matKhau.getText();
        String gioiTinh = "";
        if (txt_gioiTinh.getSelectedItem().equals("Nam")) {
            gioiTinh = "Nam";
        } else if (txt_gioiTinh.getSelectedItem().equals("Nữ")) {
            gioiTinh = "Nữ";
        } else {
            gioiTinh = "Khác";
        }

        int trangThai = 0;
        if (txt_trangThai.getSelectedItem().equals("Hoạt động")) {
            trangThai = 1;
        } else {
            trangThai = 0;
        }

        int nhom = 0;
        if (txt_nhom.getSelectedItem().equals("Quản lý")) {
            nhom = 1;
        } else {
            nhom = 0;
        }

        if (!check.kiemTraTen(tenNV)) {
            JOptionPane.showMessageDialog(this, "Tên không được chứa số");
            return;
        }
        if (!check.kiemTraEmail(email)) {
            JOptionPane.showMessageDialog(this, "Email không đúng định dạng");
            return;
        }
        if (check.kiemTraSDT(sdt)) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng");
            return;
        }
        if (check.kiemTraMk(matKhau)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải lớn hơn 8 kí tự");
            return;
        }

        if (tenNV.equals("")) {
            JOptionPane.showMessageDialog(this, "Tên nhân viên không được để trống");
            return;
        } else if (sdt.equals("")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống");
            return;
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(this, "Email không được để trống");
            return;
        } else if (matKhau.equals("")) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống");
            return;
        } else {
            nv.setHoTen(tenNV);
            nv.setEmail(email);
            nv.setSoDienThoai(sdt);
            nv.setGioiTinh(gioiTinh);
            nv.setTrangThai(trangThai);
            nv.setNhom(nhom);
            listNV.set(index, nv);
            saveFile();
            getData(listNV);
            JOptionPane.showMessageDialog(this, "Sửa nhân viên thành công");
            reset();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Integer confirm = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa không?", "Xóa", 2);
        if (confirm == JOptionPane.YES_OPTION) {
            if (listNV.remove(nv)) {
                saveFile();
                getData(listNV);
                JOptionPane.showMessageDialog(this, "Xóa thành công nhân viên" + nv.getHoTen());
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại");
            }
        }
        reset();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        String maNV = txt_maNV.getText();
        String tenNV = txt_tenNV.getText();
        String email = txt_email.getText();
        String sdt = txt_sdt.getText();
        String matKhau = txt_matKhau.getText();
        String gioiTinh = "";
        if (txt_gioiTinh.getSelectedItem().equals("Nam")) {
            gioiTinh = "Nam";
        } else if (txt_gioiTinh.getSelectedItem().equals("Nữ")) {
            gioiTinh = "Nữ";
        } else {
            gioiTinh = "Khác";
        }

        int trangThai = 0;
        if (txt_trangThai.getSelectedItem().equals("Hoạt động")) {
            trangThai = 1;
        } else {
            trangThai = 0;
        }

        int nhom = 0;
        if (txt_nhom.getSelectedItem().equals("Quản lý")) {
            nhom = 1;
        } else {
            nhom = 0;
        }

        if (!check.kiemTraTen(tenNV)) {
            JOptionPane.showMessageDialog(this, "Tên không được chứa số");
            return;
        }
        if (!check.kiemTraEmail(email)) {
            JOptionPane.showMessageDialog(this, "Email không đúng định dạng");
            return;
        }
        if (check.kiemTraSDT(sdt)) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không đúng định dạng");
            return;
        }
        if (check.kiemTraMk(matKhau)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải lớn hơn 8 kí tự");
            return;
        }

        if (maNV.equals("")) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên không được để trống");
            return;
        } else if (tenNV.equals("")) {
            JOptionPane.showMessageDialog(this, "Tên nhân viên không được để trống");
            return;
        } else if (sdt.equals("")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được để trống");
            return;
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(this, "Email không được để trống");
            return;
        } else if (matKhau.equals("")) {
            JOptionPane.showMessageDialog(this, "Mật khẩu không được để trống");
            return;
        } else {
            NhanVien nv = new NhanVien();
            nv.setMaNhanVien(maNV);
            nv.setHoTen(tenNV);
            nv.setEmail(email);
            nv.setSoDienThoai(sdt);
            nv.setMatKhau(check.md5(matKhau));
            nv.setGioiTinh(gioiTinh);
            nv.setTrangThai(trangThai);
            nv.setNhom(nhom);
            listNV.add(nv);
            saveFile();
            getData(listNV);
            JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công");
            reset();
        }

    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timkiemActionPerformed
        // TODO add your handling code here:
        String tuKhoa = txt_tuKhoa.getText();
        if (tuKhoa.equals("")) {
            getData(listNV);
        } else {
            ArrayList<NhanVien> listResult = new ArrayList<>();
            for (int i = 0; i < listNV.size(); i++) {
                if (listNV.get(i).getHoTen().contains(tuKhoa) || listNV.get(i).getMaNhanVien().contains(tuKhoa)) {
                    listResult.add(listNV.get(i));
                }
            }
            getData(listResult);
        }
    }//GEN-LAST:event_btn_timkiemActionPerformed

    private void txt_tuKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tuKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tuKhoaActionPerformed

    private void txt_nhomjComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nhomjComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nhomjComboBox2ActionPerformed

    private void txt_tenNVjTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tenNVjTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tenNVjTextField4ActionPerformed

    private void txt_gioiTinhjComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gioiTinhjComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gioiTinhjComboBox2ActionPerformed

    private void txt_trangThaijComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_trangThaijComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_trangThaijComboBox1ActionPerformed

    private void txt_maNVjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maNVjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maNVjTextField1ActionPerformed

    private void tbl_nhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_nhanvienMouseClicked
        // TODO add your handling code here:
        int row = tbl_nhanvien.getSelectedRow();
        String maNV = tbl_nhanvien.getValueAt(row, 0).toString();
        for (int i = 0; i < listNV.size(); i++) {
            if (maNV.equalsIgnoreCase(listNV.get(i).getMaNhanVien())) {
                nv = listNV.get(i);
                index = i;
                break;

            }

        }
        txt_maNV.setEnabled(false);
        txt_maNV.setText(nv.getMaNhanVien());
        txt_tenNV.setText(nv.getHoTen());
        txt_email.setText(nv.getEmail());
        txt_sdt.setText(nv.getSoDienThoai());
        txt_matKhau.setText(nv.getMatKhau());
        txt_matKhau.setEnabled(false);
        if (nv.getGioiTinh().equals("Nam")) {
            txt_gioiTinh.setSelectedItem("Nam");

        } else if (nv.getGioiTinh().equals("Nữ")) {
            txt_gioiTinh.setSelectedItem("Nữ");
        } else {
            txt_gioiTinh.setSelectedItem("Khác");
        }
        if (nv.getTrangThai() == 1) {
            txt_trangThai.setSelectedItem("Hoạt động");
        } else {
            txt_trangThai.setSelectedItem("Đã khóa");
        }
        btn_them.setEnabled(false);
    }//GEN-LAST:event_tbl_nhanvienMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton5ActionPerformed

    public void reset() {
        txt_email.setText("");
        txt_gioiTinh.setSelectedIndex(0);
        txt_maNV.setText("");
        txt_matKhau.setText("");
        txt_nhom.setSelectedIndex(0);
        txt_sdt.setText("");
        txt_tenNV.setText("");
        txt_trangThai.setSelectedIndex(0);
        btn_them.setEnabled(true);
        txt_maNV.setEnabled(true);
        txt_matKhau.setEnabled(true);
        getData(listNV);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tbl_nhanvien;
    private javax.swing.JTextField txt_email;
    private javax.swing.JComboBox<String> txt_gioiTinh;
    private javax.swing.JTextField txt_maNV;
    private javax.swing.JPasswordField txt_matKhau;
    private javax.swing.JComboBox<String> txt_nhom;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tenNV;
    private javax.swing.JComboBox<String> txt_trangThai;
    private javax.swing.JTextField txt_tuKhoa;
    // End of variables declaration//GEN-END:variables
}
