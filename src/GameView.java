import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GameView extends JFrame
{

	private JLabel titleLabel;
	private JLabel clickToPlayButton;
	private JButton playButton;
	
	//Character related information
	private JLabel nameSelect;
	private JTextField playerInfo;
	private JButton nameButton;
	
	//Weapon related
	private JLabel weaponSelect;
	private JTextField weaponName;
	private JLabel weaponInfo;
	private JTextField weaponDamage;
	private JButton weaponButton;
	
	private JFrame frame;
	private JPanel gamePanel;
	private JPanel gamePanel2;

	public GameView(int num)
	{
		gamePanel2 = new JPanel();
		setSize(1000, 750);
		createPanelTwo();
		add(gamePanel2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public GameView()
	{
		
		gamePanel = new JPanel();
		setSize(1000, 750);
		createPanelOne();
		add(gamePanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
			
	}
	
	private void createPanelOne()
	{	
		gamePanel.setBackground(Color.cyan);
		gamePanel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		//Title stuffs
		titleLabel = new JLabel("FIGHTIN' FIGHTERS ");
		titleLabel.setFont(new Font("Dialog", Font.ITALIC|Font.BOLD, 50));
		titleLabel.setForeground(Color.black);
		c.fill = GridBagConstraints.PAGE_START;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 0;
		c.anchor = GridBagConstraints.NORTH;
		c.ipady = 20;
		gamePanel.add(titleLabel, c);
		
		nameSelect = new JLabel("Enter Your Name, then Click Confirm!");
		nameSelect.setFont(new Font("Dialog", Font.PLAIN, 20));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 1;
		gamePanel.add(nameSelect, c);
		
		playerInfo = new JTextField("Enter Name");
		playerInfo.setForeground(Color.blue);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 2;
		gamePanel.add(playerInfo, c);

		//Weapons stuffs
		weaponSelect = new JLabel("Enter Your Weapon Name");
		weaponSelect.setFont(new Font("Dialog", Font.PLAIN, 20));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 3;
		gamePanel.add(weaponSelect, c);
		
		weaponName = new JTextField("Enter Weapon Name");
		weaponName.setForeground(Color.red);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 4;
		gamePanel.add(weaponName, c);
		
		weaponInfo = new JLabel("Enter Your Weapon Damage < 25");
		weaponInfo.setFont(new Font("Dialog", Font.PLAIN, 20));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 3;
		c.gridy = 3;
		gamePanel.add(weaponInfo, c);


		weaponDamage  = new JTextField("Enter Weapon Damage");
		weaponDamage.setForeground(Color.green);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 3;
		c.gridy = 4;
		gamePanel.add(weaponDamage, c);
		
		weaponButton = new JButton("Confirm");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 4;
		c.gridy = 4;
		gamePanel.add(weaponButton, c);
		
		clickToPlayButton = new JLabel("Press The Play Button To Continue");
		clickToPlayButton.setFont(new Font("Dialog", Font.PLAIN, 20));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 5;
		gamePanel.add(clickToPlayButton, c);
		
		
		playButton = new JButton("PLAY");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 6;
		gamePanel.add(playButton, c);
		
	}
	
	private void createPanelTwo()
	{	
		gamePanel2.setBackground(Color.red);
		gamePanel2.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		//Title stuffs
		titleLabel = new JLabel("FIGHTIN' FIGHTERS ");
		titleLabel.setFont(new Font("Dialog", Font.ITALIC|Font.BOLD, 50));
		titleLabel.setForeground(Color.black);
		c.fill = GridBagConstraints.PAGE_START;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 0;
		c.anchor = GridBagConstraints.NORTH;
		c.ipady = 20;
		gamePanel2.add(titleLabel, c);
		
		nameSelect = new JLabel("Enter Your Name, then Click Confirm!");
		nameSelect.setFont(new Font("Dialog", Font.PLAIN, 20));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 1;
		gamePanel2.add(nameSelect, c);
		
		playerInfo = new JTextField("Enter Name");
		playerInfo.setForeground(Color.blue);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 2;
		gamePanel2.add(playerInfo, c);

		//Weapons stuffs
		weaponSelect = new JLabel("Enter Your Weapon Name");
		weaponSelect.setFont(new Font("Dialog", Font.PLAIN, 20));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 3;
		gamePanel2.add(weaponSelect, c);
		
		weaponName = new JTextField("Enter Weapon Name");
		weaponName.setForeground(Color.red);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 4;
		gamePanel2.add(weaponName, c);
		
		weaponInfo = new JLabel("Enter Your Weapon Damage < 25");
		weaponInfo.setFont(new Font("Dialog", Font.PLAIN, 20));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 3;
		c.gridy = 3;
		gamePanel2.add(weaponInfo, c);


		weaponDamage  = new JTextField("Enter Weapon Damage");
		weaponDamage.setForeground(Color.green);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 3;
		c.gridy = 4;
		gamePanel2.add(weaponDamage, c);
		
		weaponButton = new JButton("Confirm");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 4;
		c.gridy = 4;
		gamePanel2.add(weaponButton, c);
		
		clickToPlayButton = new JLabel("Press The Play Button To Continue");
		clickToPlayButton.setFont(new Font("Dialog", Font.PLAIN, 20));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 5;
		gamePanel2.add(clickToPlayButton, c);
		
		
		playButton = new JButton("PLAY");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
		c.weighty = 0;
		c.gridx = 2;
		c.gridy = 6;
		gamePanel2.add(playButton, c);
		
		setContentPane(gamePanel2);
	}
	

	public String getName()
	{
		return playerInfo.getText();
	}
	
	public String getWeaponName()
	{
		return weaponName.getText();
	}
	
	public double getWeaponDamage()
	{
		return Double.parseDouble(weaponDamage.getText());
	}
	
	public void setFightingSequenceLabel()
	{
		//
	}

	
	public void addTextListener(ActionListener listenTextName)
	{
		weaponButton.addActionListener(listenTextName);
	}
	
	public void addWeaponDamageListener(ActionListener listenWeaponDamage)
	{
		weaponButton.addActionListener(listenWeaponDamage);
	}
	
	
	public void addPlayListener(ActionListener listenPlay)
	{
		playButton.addActionListener(listenPlay);
		
	}
	
	public void errorMessage(String eMessage)
	{
		JOptionPane.showMessageDialog(this, eMessage);
	}
	
	public JTextField getNameField()
	{
		return playerInfo;
	}
	
	public JTextField getWeaponNameField()
	{
		return weaponName;
	}
	
	public JTextField getWeaponDamageField()
	{
		return weaponDamage;
	}
	

	
}
