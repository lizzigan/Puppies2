package org.usfirst.frc.team219.robot;

import org.usfirst.frc.team219.robot.commands.Fire;
import org.usfirst.frc.team219.robot.commands.StartWheels;
import org.usfirst.frc.team219.robot.commands.StopWheels;
import org.usfirst.frc.team219.robot.commands.TurnWithVision;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	private Joystick drive;
	
	public OI(){
		drive = new Joystick(0);
		
		JoystickButton x = new JoystickButton(drive,3);
		x.whenPressed(new TurnWithVision());
		JoystickButton a = new JoystickButton(drive, 1);
		a.whenPressed(new Fire());
		JoystickButton b = new JoystickButton(drive, 2);
		b.whileHeld(new StartWheels());
		JoystickButton y = new JoystickButton(drive, 4);
		y.whenPressed(new StopWheels());
		
	}
	
	public double getLeft(){
		return drive.getRawAxis(1);
	}
	
	public double getRight(){
		return drive.getRawAxis(5);
	}
	
	
}

