package org.usfirst.frc.team219.robot.subsystems;

import org.usfirst.frc.team219.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
    
	private CANTalon shooterL, shooterR;
	private DoubleSolenoid shooter;
	private Compressor c;
	
	public Shooter(){
		c = new Compressor();
		shooterL = new CANTalon(RobotMap.SHOOTER_L);
		shooterR = new CANTalon(RobotMap.SHOOTER_R);
		shooter = new DoubleSolenoid(RobotMap.PCM_PORT,RobotMap.SHOOTER_FORWARD,RobotMap.SHOOTER_REVERSE);
		c.setClosedLoopControl(true);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void setWheelSpeed(double l, double r){
		shooterL.set(l);
		shooterR.set(r);
	}

	public void extend(){
		shooter.set(Value.kForward);
	}
	
	public void retract(){
		shooter.set(Value.kReverse);
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

