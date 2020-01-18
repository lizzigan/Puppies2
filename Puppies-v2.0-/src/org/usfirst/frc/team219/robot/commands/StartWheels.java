package org.usfirst.frc.team219.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class StartWheels extends CommandBase {

    public StartWheels() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(shooter);
    	setTimeout(5);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	shooter.setWheelSpeed(1,-1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	SmartDashboard.putString("Shooter", "PIPE IT UP");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	SmartDashboard.putString("Shooter", "Z z z");
    	shooter.setWheelSpeed(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
