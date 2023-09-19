/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;

/**
 * Add your docs here.
 */
public class VorTXControllerXbox extends XboxController {
	public JoystickButton aButton, bButton, xButton, yButton, lt, rt, view, menu, ls, rs, lb, rb;
	public XboxController c_driverController = new XboxController(3);
	public POVButton pov0, pov45, pov90, pov135, pov180, pov225, pov270, pov315;

	public VorTXControllerXbox(int port) {
		super(port);
		

		aButton = new JoystickButton(this, 2);
		bButton = new JoystickButton(this, 3);
		xButton = new JoystickButton(this, 1);
		yButton = new JoystickButton(this, 4);
		lt = new JoystickButton(this, 7);
		rt = new JoystickButton(this, 8);
		view = new JoystickButton(this, 9);
		menu = new JoystickButton(this, 10);
		ls = new JoystickButton(this,11);
		rs = new JoystickButton(this, 12);

		
		pov0 = new POVButton(this, 0);
		pov45 = new POVButton(this, 45);
		pov90 = new POVButton(this, 90);
		pov135 = new POVButton(this, 135);
		pov180 = new POVButton(this, 180);
		pov225 = new POVButton(this, 225);
		pov270 = new POVButton(this, 270);
		pov315 = new POVButton(this, 315);
	}

}