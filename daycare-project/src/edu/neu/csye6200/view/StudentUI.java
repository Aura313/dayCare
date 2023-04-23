/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.view;

import edu.neu.csye6200.controller.StudentService;
import edu.neu.csye6200.controller.TeacherService;
import edu.neu.csye6200.factory.StudentFactory;
import edu.neu.csye6200.model.Parent;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;
import edu.neu.csye6200.model.Vaccine;
import edu.neu.csye6200.util.FileUtil;
import edu.neu.csye6200.util.ValidationUtil;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author tanyashah
 *
 */
public class StudentUI extends javax.swing.JFrame {

	private VaccinationUI vui;
	private Vaccine vaccine;
	private Student student;
	private int initialId = 0;
	public static List<Student> studentList = new ArrayList<>();

	/**
	 * Creates new form Teacher
	 */
	public StudentUI() {
		initComponents();
		jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		jTable1.setAutoCreateColumnsFromModel(true);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabelStudentTitle = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jPanelToolBar = new javax.swing.JPanel();
		jTextFieldSearch = new javax.swing.JTextField();
		JLabelSearch = new javax.swing.JLabel();
		jButtonUpload = new javax.swing.JButton();
		jButtonSave = new javax.swing.JButton();
		jButtonDownload1 = new javax.swing.JButton();
		jButtonDeleteSelRow = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabelFirstName = new javax.swing.JLabel();
		jTextFieldStudentFirstName = new javax.swing.JTextField();
		jLabelLastName = new javax.swing.JLabel();
		jTextFieldStudentDob = new javax.swing.JTextField();
		jLabelAddress = new javax.swing.JLabel();
		jLabelPhoneNumber = new javax.swing.JLabel();
		jTextFieldAddress = new javax.swing.JTextField();
		jAddStudentButton = new javax.swing.JButton();
		jLabelPhoneNumber1 = new javax.swing.JLabel();
		jLabelPhoneNumber2 = new javax.swing.JLabel();
		jLabelPhoneNumber3 = new javax.swing.JLabel();
		jLabelPhoneNumber5 = new javax.swing.JLabel();
		jLabelPhoneNumber6 = new javax.swing.JLabel();
		jTextFieldStudentLastName = new javax.swing.JTextField();
		jTextFieldParentFirstName = new javax.swing.JTextField();
		jTextFieldParentLastName = new javax.swing.JTextField();
		jTextFieldEmail = new javax.swing.JTextField();
		jTextFieldPhoneNumber = new javax.swing.JTextField();
		jTextFieldRegDate = new javax.swing.JTextField();
		jButtonAddVaccineRec = new javax.swing.JButton();
		jInternalFrame1 = new javax.swing.JInternalFrame();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		
	

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		addContainerListener(new java.awt.event.ContainerAdapter() {
			public void componentAdded(java.awt.event.ContainerEvent evt) {
				formComponentAdded(evt);
			}
		});

		jPanel1.setBackground(new java.awt.Color(204, 204, 255));

		jLabelStudentTitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
		jLabelStudentTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabelStudentTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/std1.png"))); // NOI18N
		jLabelStudentTitle.setText("Students Info");
		jLabelStudentTitle.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

		jLabel3.setBackground(new java.awt.Color(204, 204, 255));
		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lmdic1.PNG"))); // NOI18N

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel3)
						.addGap(392, 392, 392)
						.addComponent(jLabelStudentTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 435,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addComponent(jLabelStudentTitle))));

		jPanelToolBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		jPanelToolBar.setMinimumSize(new java.awt.Dimension(827, 47));
		jPanelToolBar.setOpaque(false);
		jPanelToolBar.setPreferredSize(new java.awt.Dimension(100, 38));

		jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyReleased(java.awt.event.KeyEvent evt) {
				jTextFieldSearchKeyReleased(evt);
			}
		});

		JLabelSearch.setText("Search");

		jButtonUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upload1.png"))); // NOI18N
		jButtonUpload.setText("Upload CSV");
		jButtonUpload.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButtonUploadMouseClicked(evt);
			}
		});
		jButtonUpload.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonUploadActionPerformed(evt);
			}
		});

		jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save1.png"))); // NOI18N
		jButtonSave.setText("Save");
		jButtonSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSaveActionPerformed(evt);
			}
		});

		jButtonDownload1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download1.png"))); // NOI18N
		jButtonDownload1.setText("Download CSV");
		jButtonDownload1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButtonDownloadMouseClicked(evt);
			}
		});

		jButtonDeleteSelRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/del1.PNG"))); // NOI18N
		jButtonDeleteSelRow.setText("Delete Selected Row");
		jButtonDeleteSelRow.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButtonDeleteSelRowMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
		jPanelToolBar.setLayout(jPanelToolBarLayout);
		jPanelToolBarLayout.setHorizontalGroup(jPanelToolBarLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanelToolBarLayout.createSequentialGroup().addGap(38, 38, 38)
						.addComponent(JLabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(32, 32, 32)
						.addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 403,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(54, 54, 54).addComponent(jButtonSave).addGap(39, 39, 39).addComponent(jButtonUpload)
						.addGap(30, 30, 30).addComponent(jButtonDownload1).addGap(41, 41, 41)
						.addComponent(jButtonDeleteSelRow)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanelToolBarLayout.setVerticalGroup(jPanelToolBarLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanelToolBarLayout.createSequentialGroup().addContainerGap()
						.addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextFieldSearch).addComponent(JLabelSearch)
								.addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButtonUpload, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButtonDownload1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButtonDeleteSelRow))
						.addContainerGap()));

		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jLabelFirstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabelFirstName.setText("First Name");
		jPanel2.add(jLabelFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 84, -1));

		jTextFieldStudentFirstName.setToolTipText("Enter Text");
		jTextFieldStudentFirstName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldStudentFirstNameActionPerformed(evt);
			}
		});
		jPanel2.add(jTextFieldStudentFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 17, 410, -1));

		jLabelLastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabelLastName.setText("Last Name");
		jPanel2.add(jLabelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, 78, -1));

		jTextFieldStudentDob.setToolTipText("Enter Text");
		jTextFieldStudentDob.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldStudentDobActionPerformed(evt);
			}
		});
		jPanel2.add(jTextFieldStudentDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 176, 410, -1));

		jLabelAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabelAddress.setText("Address");
		jPanel2.add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 95, 66, -1));

		jLabelPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabelPhoneNumber.setText("Registration Date");
		jPanel2.add(jLabelPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 134, -1, -1));

		jTextFieldAddress.setToolTipText("Enter Text");
		jPanel2.add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 92, 410, -1));

		jAddStudentButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jAddStudentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add1.png"))); // NOI18N
		jAddStudentButton.setText("Add New Student");
		jAddStudentButton.setToolTipText("Click to Add Data");
		jAddStudentButton.setMargin(new java.awt.Insets(0, 2, 0, 8));
		jAddStudentButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jAddStudentButtonMouseClicked(evt);
			}
		});
		jAddStudentButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jAddStudentButtonActionPerformed(evt);
			}
		});
		jPanel2.add(jAddStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 166, 30));

		jLabelPhoneNumber1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabelPhoneNumber1.setText("Date of Birth");
		jPanel2.add(jLabelPhoneNumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 179, -1, -1));

		jLabelPhoneNumber2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabelPhoneNumber2.setText("Parent First Name");
		jPanel2.add(jLabelPhoneNumber2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 216, -1, -1));

		jLabelPhoneNumber3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabelPhoneNumber3.setText("Parent Last Name");
		jPanel2.add(jLabelPhoneNumber3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 256, -1, -1));

		jLabelPhoneNumber5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabelPhoneNumber5.setText("Phone Number");
		jPanel2.add(jLabelPhoneNumber5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 311, -1, -1));

		jLabelPhoneNumber6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		jLabelPhoneNumber6.setText("Email Id");
		jPanel2.add(jLabelPhoneNumber6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 372, -1, -1));

		jTextFieldStudentLastName.setToolTipText("Enter Text");
		jTextFieldStudentLastName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldStudentLastNameActionPerformed(evt);
			}
		});
		jPanel2.add(jTextFieldStudentLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 57, 410, -1));

		jTextFieldParentFirstName.setToolTipText("Enter Text");
		jTextFieldParentFirstName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldParentFirstNameActionPerformed(evt);
			}
		});
		jPanel2.add(jTextFieldParentFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 216, 410, -1));

		jTextFieldParentLastName.setToolTipText("Enter Text");
		jTextFieldParentLastName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldParentLastNameActionPerformed(evt);
			}
		});
		jPanel2.add(jTextFieldParentLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 256, 410, -1));

		jTextFieldEmail.setToolTipText("Enter Text");
		jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldEmailActionPerformed(evt);
			}
		});
		jPanel2.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 366, 410, -1));

		jTextFieldPhoneNumber.setToolTipText("Enter Text");
		jTextFieldPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldPhoneNumberActionPerformed(evt);
			}
		});
		jPanel2.add(jTextFieldPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 308, 410, -1));

		jTextFieldRegDate.setToolTipText("Enter Text");
		jPanel2.add(jTextFieldRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 127, 410, 30));

		jButtonAddVaccineRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vaccine11.png"))); // NOI18N
		jButtonAddVaccineRec.setText("Add Vaccination Record");
		jButtonAddVaccineRec.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jButtonAddVaccineRecMouseClicked(evt);
			}

		});
		jPanel2.add(jButtonAddVaccineRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

		jInternalFrame1.setFrameIcon(null);
		jInternalFrame1.setVisible(true);

		jScrollPane1.setAutoscrolls(true);

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Student Id", "FirstName", "LastName", "Address", "Reg. Date", "Student Dob", "Parent FName",
				"Parent LName", "PhoneNumber", "Email Id" }));

		// Sorting every column
		jTable1.setAutoCreateRowSorter(true);

		jScrollPane1.setViewportView(jTable1);
		if (jTable1.getColumnModel().getColumnCount() > 0) {
			jTable1.getColumnModel().getColumn(0).setHeaderValue("Student Id");
			jTable1.getColumnModel().getColumn(1).setHeaderValue("First Name");
			jTable1.getColumnModel().getColumn(2).setHeaderValue("Last Name");
			jTable1.getColumnModel().getColumn(3).setHeaderValue("Address");
			jTable1.getColumnModel().getColumn(4).setHeaderValue("Reg. Date");
			jTable1.getColumnModel().getColumn(5).setHeaderValue("Student Dob");
			jTable1.getColumnModel().getColumn(6).setHeaderValue("Parent FName");
			jTable1.getColumnModel().getColumn(7).setHeaderValue("Parent LName");
			jTable1.getColumnModel().getColumn(8).setHeaderValue("PhoneNumber");
			jTable1.getColumnModel().getColumn(9).setHeaderValue("Email Id");
		}

		jInternalFrame1.getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

		Object[] data = new Object[10];
		StudentService sservice = new StudentService();
		List<Student> tList = new ArrayList<Student>();
		try {
			tList = sservice.getAllStudents();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DefaultTableModel mTable = (DefaultTableModel) jTable1.getModel();
		mTable.setRowCount(0);
		for (Student t : tList) {
			
			System.out.println( "cjhhwckc ->" + t);
			data[0] = t.getStudentId();
			data[1] = t.getFirstName();
			data[2] = t.getLastName();
			data[3] = t.getAddress();
			data[4] = t.getRegistrationDate();
			data[5] = t.getDob();
			data[6] = t.getParent().getFirstName();
			data[7] = t.getParent().getLastName();
			data[8] = t.getParent().getPhone();
			data[9] = t.getParent().getEmail();
			mTable.addRow(data);
		}

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1473,
												Short.MAX_VALUE)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 594,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE,
														872, Short.MAX_VALUE)))
								.addGap(75, 75, 75)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(37, 37, 37)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 603,
										Short.MAX_VALUE)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_jTextFieldSearchKeyReleased
		searchTableContents(jTextFieldSearch.getText()); // TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldSearchKeyReleased

	private void jButtonUploadMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonUploadMouseClicked
		// TODO add your handling code here:
	}// GEN-LAST:event_jButtonUploadMouseClicked

	private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSaveActionPerformed

		StudentService studentService = new StudentService();
		if (!jTextFieldStudentFirstName.getText().isEmpty()) {
			studentList.clear();
			Student studentAdd = StudentFactory.getInstance().getObject();
			Parent parent = new Parent();
			// seting studentId as row value
			studentAdd.setStudentId(studentList.size() + 1);
			studentAdd.setFirstName(jTextFieldStudentFirstName.getText());
			studentAdd.setLastName(jTextFieldStudentLastName.getText());
			studentAdd.setAddress(jTextFieldAddress.getText());
			if (!jTextFieldStudentDob.getText().isBlank() || !jTextFieldRegDate.getText().isBlank()) {
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate dob = LocalDate.parse(jTextFieldStudentDob.getText(), formatter);
				LocalDate regDate = LocalDate.parse(jTextFieldRegDate.getText(), formatter);
				// s.setDob(dob);
				// s.setRegistrationDate(regDate);
				studentAdd.setDob(dob);
				studentAdd.setRegistrationDate(regDate);
			}
			parent.setFirstName(jTextFieldParentFirstName.getText());
			parent.setLastName(jTextFieldParentLastName.getText());
			if (!jTextFieldPhoneNumber.getText().isBlank()) {
				parent.setPhone(BigInteger.valueOf(Long.parseLong(jTextFieldPhoneNumber.getText())));
			}
			parent.setEmail(jTextFieldEmail.getText());
			// assuming studentId = parentId (since its irrelevant as we are using
			// registerStudent())
			parent.setParentId(studentAdd.getStudentId());
			studentAdd.setParent(parent);
			studentAdd.setParentId(parent.getParentId());
			System.out.println(studentAdd);
			student = studentAdd;
			studentList.add(studentAdd);
		}
		
		
		try {
			System.out.println("Regestering student into Day care system");
			studentList.forEach(student -> {
				try {
					studentService.registerStudent(student);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});

			ValidationUtil.showSuccess("Students saved successfully!");

			// TODO add your handling code here:
		} catch (Exception ex) {
			Logger.getLogger(StudentUI.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		

		Object[] data = new Object[10];
		StudentService sservice = new StudentService();
		List<Student> tList = new ArrayList<Student>();
		try {
			tList = sservice.getAllStudents();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DefaultTableModel mTable = (DefaultTableModel) jTable1.getModel();
		mTable.setRowCount(0);
		for (Student t : tList) {
			
			System.out.println( "cjhhwckc ->" + t);
			data[0] = t.getStudentId();
			data[1] = t.getFirstName();
			data[2] = t.getLastName();
			data[3] = t.getAddress();
			data[4] = t.getRegistrationDate();
			data[5] = t.getDob();
			data[6] = t.getParent().getFirstName();
			data[7] = t.getParent().getLastName();
			data[8] = t.getParent().getPhone();
			data[9] = t.getParent().getEmail();
			mTable.addRow(data);
		}
	}// GEN-LAST:event_jButtonSaveActionPerformed

	private void jButtonUploadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonUploadActionPerformed

		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		int returnValue = jfc.showOpenDialog(null);
		javax.swing.table.DefaultTableModel modelTable = (javax.swing.table.DefaultTableModel) jTable1.getModel();
		// int returnValue = jfc.showSaveDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			System.out.println("Uploading Students CSV file from: " + selectedFile.getPath());
			// System.out.println("Uploading Students CSV file...");
			if (modelTable.getRowCount() > 0) {
				System.out.println("Recreating Student Info table by overriding data");
				modelTable.setRowCount(0);
			}

			java.util.List<String> studentRecords = FileUtil.readTextFile(selectedFile.getPath());
			// teacherRecords.forEach(teacher->
			// teachers.add(TeacherFactory.getInstance().getObject(teacher)));
			studentRecords.forEach(student -> {
				modelTable.addRow(fillTableFromCSV(student));
			});
			System.out.println("Successfully created table from students CSV file");
			ValidationUtil.showSuccess("File uploaded successfully!");
		}
	}// GEN-LAST:event_jButtonUploadActionPerformed

	// Used while loading table when csv is uploaded
	public Object[] fillTableFromCSV(String csvRecord) {
		student = new Student(csvRecord);
		System.out.println(student.toString());
		studentList.add(student);
		String[] array = csvRecord.split(",");
		Object[] data = new Object[array.length];
		for (int i = 0; i < array.length; i++)
			data[i] = array[i];

		return data;
	}

	public boolean isDuplicate(DefaultTableModel model, String fName, String email) {
		for (int i = 0; i < model.getRowCount(); i++) {
			if (model.getValueAt(i, 1).equals(fName) && model.getValueAt(i, 9).equals(email)) {
				return true;
			}

		}
		return false;
	}

	private void jTextFieldStudentDobActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldStudentDobActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldStudentDobActionPerformed

	// Search in table
	public void searchTableContents(String searchString) {
		DefaultTableModel currtableModel = (DefaultTableModel) jTable1.getModel();

		TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(currtableModel);
		jTable1.setRowSorter(tr);
		tr.setRowFilter(RowFilter.regexFilter(searchString.toLowerCase()));
	};

	private void jButtonDownloadMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonDownloadMouseClicked

		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		String pathToDownloads = System.getProperty("user.home");
		FileWriter csv;
		try {
			
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			csv = new FileWriter(new File(pathToDownloads + "/Downloads/studentsDownload" + timestamp + ".txt"));
		
			System.out.println(
					"Downloading Students Info into CSV at: " + pathToDownloads + "/Downloads/studentsDownload.txt");
			for (int i = 0; i < model.getRowCount(); i++) {
				for (int j = 0; j < model.getColumnCount(); j++) {
					if (j == model.getColumnCount() - 1) {
						csv.write(model.getValueAt(i, j).toString());
					} else {
						csv.write(model.getValueAt(i, j).toString() + ",");
					}
				}
				csv.write("\n");
			}
			csv.close();
			ValidationUtil.showSuccess("Successfully downloaded studentsDownload.txt CSV file");
			// TODO add info_dialog to show success

			System.out.println("Successfully downloaded studentsDownload.txt CSV file");
		} catch (IOException e) {
			// System.out.println("Error in downloading studentsDownload.txt CSV file");
			e.printStackTrace();
		}

	}// GEN-LAST:event_jButtonDownloadMouseClicked

	private void jTextFieldStudentFirstNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldStudentFirstNameActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldStudentFirstNameActionPerformed

	private void jAddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jAddStudentButtonActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jAddStudentButtonActionPerformed

	private void jTextFieldStudentLastNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldStudentLastNameActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldStudentLastNameActionPerformed

	private void jTextFieldParentFirstNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldParentFirstNameActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldParentFirstNameActionPerformed

	private void jTextFieldParentLastNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldParentLastNameActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldParentLastNameActionPerformed

	private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldEmailActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldEmailActionPerformed

	private void jTextFieldPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextFieldPhoneNumberActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jTextFieldPhoneNumberActionPerformed

	private void jAddStudentButtonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jAddStudentButtonMouseClicked
		// TODO add your handling code here:
		javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
		initialId = model.getRowCount() + 1;

		Student studentAdd = StudentFactory.getInstance().getObject();
		Parent parent = new Parent();
		// seting studentId as row value
		studentAdd.setStudentId(studentList.size() + 1);
		studentAdd.setFirstName(jTextFieldStudentFirstName.getText());
		studentAdd.setLastName(jTextFieldStudentLastName.getText());
		studentAdd.setAddress(jTextFieldAddress.getText());
		if (!jTextFieldStudentDob.getText().isBlank() || !jTextFieldRegDate.getText().isBlank()) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate dob = LocalDate.parse(jTextFieldStudentDob.getText(), formatter);
			LocalDate regDate = LocalDate.parse(jTextFieldRegDate.getText(), formatter);
			// s.setDob(dob);
			// s.setRegistrationDate(regDate);
			studentAdd.setDob(dob);
			studentAdd.setRegistrationDate(regDate);
		}
		parent.setFirstName(jTextFieldParentFirstName.getText());
		parent.setLastName(jTextFieldParentLastName.getText());
		if (!jTextFieldPhoneNumber.getText().isBlank()) {
			parent.setPhone(BigInteger.valueOf(Long.parseLong(jTextFieldPhoneNumber.getText())));
		}
		parent.setEmail(jTextFieldEmail.getText());
		// assuming studentId = parentId (since its irrelevant as we are using
		// registerStudent())
		parent.setParentId(studentAdd.getStudentId());
		studentAdd.setParent(parent);
		studentAdd.setParentId(parent.getParentId());
		System.out.println(studentAdd);
		student = studentAdd;

		model.addRow(new Object[] { initialId, jTextFieldStudentFirstName.getText(),
				jTextFieldStudentLastName.getText(), jTextFieldAddress.getText(), jTextFieldRegDate.getText(),
				jTextFieldStudentDob.getText(), jTextFieldParentFirstName.getText(), jTextFieldParentLastName.getText(),
				jTextFieldPhoneNumber.getText(), jTextFieldEmail.getText() });

	}// GEN-LAST:event_jAddStudentButtonMouseClicked

	private void formComponentAdded(java.awt.event.ContainerEvent evt) {// GEN-FIRST:event_formComponentAdded
		// TODO add your handling code here:
	}// GEN-LAST:event_formComponentAdded

	private void jButtonAddVaccineRecMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonAddVaccineRecMouseClicked

		System.out.println("jfwgdygweyuew");
		
		jTextFieldStudentFirstName.setText("");
		jTextFieldStudentLastName.setText("");
		jTextFieldAddress.setText("");
		jTextFieldStudentDob.setText("");
		jTextFieldRegDate.setText("");
		jTextFieldStudentDob.setText("");
		jTextFieldPhoneNumber.setText("");
		jTextFieldEmail.setText("");
		jTextFieldParentFirstName.setText("");
		jTextFieldParentLastName.setText("");

		if (jTable1.getSelectedRow() > -1) {
			int selId = jTable1.getSelectedRow() + 1;
			System.out.println("Fetching vaccine details for student with Id: " + selId);
			StudentService ser = new StudentService();

			try {
				student = ser.getLatestStudent();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			System.out.println("sererre" + student);
			try {
				List<Vaccine> list = ser.getStudentImmunizationRecord(student.getStudentId());
				vaccine = new Vaccine();
//				System.out.println(student.getFirstName());
				VaccinationUI vui = new VaccinationUI(student, list);
				vui.setVisible(true);
				// TODO populate this list with student info in vacc window
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				// TODO add your handling code here:
				System.out.println("Setting vaccine details for student with Id: " + initialId);
				// student= new Student();
				vaccine = new Vaccine();
//				System.out.println(student.getFirstName());
				VaccinationUI vui = new VaccinationUI(student);
				vui.setVisible(true);
			} catch (Exception ex) {
				Logger.getLogger(StudentUI.class.getName()).log(Level.SEVERE, null, ex);
			}
		}

	}// GEN-LAST:event_jButtonAddVaccineRecMouseClicked

	private void jButtonDownload1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonDownload1MouseClicked
		// TODO add your handling code here:
		System.out.println("Downloading CSV file.");

		JFileChooser chooser = new JFileChooser();
		chooser.setSelectedFile(new File("student.txt")); // user will see this name during download
		if (JFileChooser.APPROVE_OPTION == chooser.showSaveDialog(null)) {
			String home = System.getProperty("user.home");
			File file = new File(home + "/Downloads/students.txt");
		} // GEN-LAST:event_jButtonDownload1MouseClicked
	}

	private void jButtonDeleteSelRowMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButtonDeleteSelRowMouseClicked
		// TODO add your handling code here:
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//		int delId = jTable1.getSelectedRow() + 1;
//		StudentService service = new StudentService();
//		try {
//			System.out.println("Deleting student record with id: " + delId);
//			model.removeRow(jTable1.getSelectedRow());
//			service.deleteStudent(delId);
//			ValidationUtil.showSuccess("Successfully deleted student record!");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		StudentService service = new StudentService();
		int delId = jTable1.getSelectedRow();
		int i = Integer.parseUnsignedInt(jTable1.getValueAt(delId, 0).toString());  
		System.out.println();
		try {
			System.out.println("Deleting teacher record with id: " + i);
			model.removeRow(jTable1.getSelectedRow());
			service.deleteStudent(i);
			ValidationUtil.showSuccess("Successfully deleted student record!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// GEN-LAST:event_jButtonDeleteSelRowMouseClicked

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new StudentUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel JLabelSearch;
	private javax.swing.JButton jAddStudentButton;
	private javax.swing.JButton jButtonAddVaccineRec;
	private javax.swing.JButton jButtonDeleteSelRow;
	private javax.swing.JButton jButtonDownload1;
	private javax.swing.JButton jButtonSave;
	private javax.swing.JButton jButtonUpload;
	private javax.swing.JInternalFrame jInternalFrame1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabelAddress;
	private javax.swing.JLabel jLabelFirstName;
	private javax.swing.JLabel jLabelLastName;
	private javax.swing.JLabel jLabelPhoneNumber;
	private javax.swing.JLabel jLabelPhoneNumber1;
	private javax.swing.JLabel jLabelPhoneNumber2;
	private javax.swing.JLabel jLabelPhoneNumber3;
	private javax.swing.JLabel jLabelPhoneNumber5;
	private javax.swing.JLabel jLabelPhoneNumber6;
	private javax.swing.JLabel jLabelStudentTitle;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanelToolBar;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextFieldAddress;
	private javax.swing.JTextField jTextFieldEmail;
	private javax.swing.JTextField jTextFieldParentFirstName;
	private javax.swing.JTextField jTextFieldParentLastName;
	private javax.swing.JTextField jTextFieldPhoneNumber;
	private javax.swing.JTextField jTextFieldRegDate;
	private javax.swing.JTextField jTextFieldSearch;
	private javax.swing.JTextField jTextFieldStudentDob;
	private javax.swing.JTextField jTextFieldStudentFirstName;
	private javax.swing.JTextField jTextFieldStudentLastName;

}
