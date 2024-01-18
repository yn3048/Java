package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ComponentTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JTextField txtNum4;
	private JTextField txtNum5;
	private JTextField txtNum6;
	private JTextField txtNum7;
	private JTextField txtNum8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest window = new ComponentTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 83, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼실습");
		lblNewLabel_1.setBounds(12, 31, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//버튼을 클릭했을 때 실행되는 리스너(핸들러)
				System.out.println("확인1 클릭!!!");
				
			}
		});
		btn1.setBounds(12, 56, 77, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭!!!");
				
			}
		});
		btn2.setBounds(98, 56, 77, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭!!!", "확인대화상자",JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("Yes 클릭...");
				}else {
					System.out.println("No 클릭...");
				}
			}
		});
		btn3.setBounds(187, 56, 77, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트필드 실습");
		lblNewLabel_2.setBounds(12, 91, 100, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setBounds(12, 113, 46, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		txtUid = new JTextField();
		txtUid.setBounds(57, 110, 100, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		JButton btnUid = new JButton("확인");
		
		btnUid.setBounds(162, 109, 69, 23);
		frame.getContentPane().add(btnUid);
		
		JLabel lbResultUid = new JLabel("결과 :");
		lbResultUid.setBounds(246, 113, 106, 15);
		frame.getContentPane().add(lbResultUid);
		
		JLabel lblNewLabel_3_1 = new JLabel("이름");
		lblNewLabel_3_1.setBounds(12, 142, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(57, 139, 100, 21);
		frame.getContentPane().add(txtName);
		
		JButton btnName = new JButton("확인");
	
		btnName.setBounds(162, 138, 69, 23);
		frame.getContentPane().add(btnName);
		
		JLabel lbResultName = new JLabel("결과 :");
		lbResultName.setBounds(246, 142, 106, 15);
		frame.getContentPane().add(lbResultName);
		
		JLabel lblNewLabel_3_2 = new JLabel("휴대폰");
		lblNewLabel_3_2.setBounds(12, 171, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(57, 168, 100, 21);
		frame.getContentPane().add(txtHp);
		
		JButton btnHp = new JButton("확인");
		
		btnHp.setBounds(162, 167, 69, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lbResultHp = new JLabel("결과 :");
		lbResultHp.setBounds(246, 171, 106, 15);
		frame.getContentPane().add(lbResultHp);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("덧셈");
		lblNewLabel_3_2_1.setBounds(12, 202, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1);
		
		txtNum1 = new JTextField();
		txtNum1.setColumns(10);
		txtNum1.setBounds(57, 199, 46, 21);
		frame.getContentPane().add(txtNum1);
		
		JButton btnPlus = new JButton("확인");
		
		btnPlus.setBounds(187, 200, 69, 23);
		frame.getContentPane().add(btnPlus);
		
		JLabel lbResultPlus = new JLabel("결과 :");
		lbResultPlus.setBounds(273, 202, 106, 15);
		frame.getContentPane().add(lbResultPlus);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(137, 199, 46, 21);
		frame.getContentPane().add(txtNum2);
		
		JLabel lblNewLabel_4 = new JLabel("+");
		lblNewLabel_4.setBounds(115, 202, 14, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("뺄셈");
		lblNewLabel_3_2_1_1.setBounds(12, 230, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1_1);
		
		txtNum3 = new JTextField();
		txtNum3.setColumns(10);
		txtNum3.setBounds(57, 227, 46, 21);
		frame.getContentPane().add(txtNum3);
		
		JLabel lblNewLabel_4_1 = new JLabel("-");
		lblNewLabel_4_1.setBounds(115, 230, 14, 15);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		txtNum4 = new JTextField();
		txtNum4.setColumns(10);
		txtNum4.setBounds(137, 227, 46, 21);
		frame.getContentPane().add(txtNum4);
		
		JButton btnMinus = new JButton("확인");
		
		btnMinus.setBounds(187, 228, 69, 23);
		frame.getContentPane().add(btnMinus);
		
		JLabel lbResultMinus = new JLabel("결과 :");
		lbResultMinus.setBounds(273, 230, 106, 15);
		frame.getContentPane().add(lbResultMinus);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("곱셈");
		lblNewLabel_3_2_1_2.setBounds(12, 258, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1_2);
		
		txtNum5 = new JTextField();
		txtNum5.setColumns(10);
		txtNum5.setBounds(57, 255, 46, 21);
		frame.getContentPane().add(txtNum5);
		
		JLabel lblNewLabel_4_2 = new JLabel("*");
		lblNewLabel_4_2.setBounds(115, 258, 14, 15);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		txtNum6 = new JTextField();
		txtNum6.setColumns(10);
		txtNum6.setBounds(137, 255, 46, 21);
		frame.getContentPane().add(txtNum6);
		
		JButton btnMulti = new JButton("확인");
	
		btnMulti.setBounds(187, 256, 69, 23);
		frame.getContentPane().add(btnMulti);
		
		JLabel lbResultMulti = new JLabel("결과 :");
		lbResultMulti.setBounds(273, 258, 106, 15);
		frame.getContentPane().add(lbResultMulti);
		
		JLabel lblNewLabel_3_2_1_3 = new JLabel("나눗셈");
		lblNewLabel_3_2_1_3.setBounds(12, 286, 46, 15);
		frame.getContentPane().add(lblNewLabel_3_2_1_3);
		
		txtNum7 = new JTextField();
		txtNum7.setColumns(10);
		txtNum7.setBounds(57, 283, 46, 21);
		frame.getContentPane().add(txtNum7);
		
		JLabel lblNewLabel_4_3 = new JLabel("/");
		lblNewLabel_4_3.setBounds(115, 286, 14, 15);
		frame.getContentPane().add(lblNewLabel_4_3);
		
		txtNum8 = new JTextField();
		txtNum8.setColumns(10);
		txtNum8.setBounds(137, 283, 46, 21);
		frame.getContentPane().add(txtNum8);
		
		JButton btnDiv = new JButton("확인");
		
		btnDiv.setBounds(187, 284, 69, 23);
		frame.getContentPane().add(btnDiv);
		
		JLabel lbResultDiv = new JLabel("결과 :");
		lbResultDiv.setBounds(273, 286, 106, 15);
		frame.getContentPane().add(lbResultDiv);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 345, 57, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(73, 345, 57, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(137, 345, 57, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(199, 345, 57, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(252, 345, 57, 23);
		frame.getContentPane().add(chk5);
		
		JButton btnCheck = new JButton("확인");
	
		btnCheck.setBounds(317, 345, 69, 23);
		frame.getContentPane().add(btnCheck);
		
		JLabel lbCheckResult = new JLabel("결과:");
		lbCheckResult.setBounds(12, 380, 252, 15);
		frame.getContentPane().add(lbCheckResult);
		
		JLabel lblNewLabel_5 = new JLabel("체크박스 실습");
		lblNewLabel_5.setBounds(12, 324, 106, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		//이벤트 리스너
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbResultUid.setText("결과: " +uid);}
				
			});
		
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String name = txtName.getText();
				 lbResultName.setText("결과" + name);
				
				}
			});
		
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 String hp = txtHp.getText();
				 lbResultName.setText("결과" + hp);
				
			}
		});
		
		
		
		
		
			//사칙 연산
			btnPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int num1 = Integer.parseInt(txtNum1.getText());
					int num2 = Integer.parseInt(txtNum2.getText());
					
					int result = num1 + num2;
					lbResultPlus.setText("결과 : " + result);
					
				}
			});
				
			btnMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int num3 = Integer.parseInt(txtNum3.getText());
					int num4 = Integer.parseInt(txtNum4.getText());
					
					int result = num3 - num4;
					lbResultMinus.setText("결과 : " + result);
					
				}
			});
			
			btnMulti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int num5 = Integer.parseInt(txtNum5.getText());
					int num6 = Integer.parseInt(txtNum6.getText());
					
					int result = num5 * num6;
					lbResultMulti.setText("결과 : " + result);
					
					
				}
			});
			
			
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					

					int num7 = Integer.parseInt(txtNum7.getText());
					int num8 = Integer.parseInt(txtNum8.getText());
					
					int result = num7 / num8;
					lbResultDiv.setText("결과 : " + result);
					
					
				}
			});
	
			//지역 체크박스
			btnCheck.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					List<String> cities = new ArrayList<>();
					
					if(chk1.isSelected()) {
						cities.add(chk1.getText());
					}
					
					if(chk2.isSelected()) {
						cities.add(chk2.getText());
					}
					
					if(chk3.isSelected()) {
						cities.add(chk3.getText());
					}
					
					if(chk4.isSelected()) {
						cities.add(chk4.getText());
					}
					
					if(chk5.isSelected()) {
						cities.add(chk5.getText());
					}
					
					lbCheckResult.setText("결과 :" + cities);
					
				}
			});
	
		
		
	}
}






















