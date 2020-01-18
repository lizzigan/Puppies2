package org.usfirst.frc.team219.robot.subsystems;

import org.usfirst.frc.team219.robot.RobotMap;
import org.usfirst.frc.team219.robot.commands.OpDrive;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
	private CANTalon motorFL, motorBL, motorFR, motorBR;
	
	
	public DriveTrain(){
		motorFL = new CANTalon(RobotMap.MOTOR_PORT_FL);
		motorBL = new CANTalon(RobotMap.MOTOR_PORT_BL);
		motorFR = new CANTalon(RobotMap.MOTOR_PORT_FR);
		motorBR = new CANTalon(RobotMap.MOTOR_PORT_BR);
	}
	
	
	public void tankDrive(double left, double right){
		setTalonSpeed(left,right);
	}
	
	public void setTalonSpeed(double left, double right){
		motorFL.set(left);
		motorBL.set(left);
		motorFR.set(right);
		motorBR.set(right);	
	}
	
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new OpDrive());
    }
}

