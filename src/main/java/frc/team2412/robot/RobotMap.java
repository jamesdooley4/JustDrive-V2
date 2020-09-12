package frc.team2412.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.AnalogInput;

//This is the class in charge of all the motors, motor ids, and any other sensors the robot uses. 
//remember to declare robot container at the bottom of this class 
public class RobotMap {

	private static final int DRIVE_LEFT_MOTOR_ID = 1;
	private static final int DRIVE_RIGHT_MOTOR_ID = 0;

	private static final int ULTRASONIC_PORT = 0;

	public static WPI_TalonFX driveLeftMotor = new WPI_TalonFX(DRIVE_LEFT_MOTOR_ID);
	
	public static WPI_TalonFX driveRightMotor = new WPI_TalonFX(DRIVE_RIGHT_MOTOR_ID);
	
	public static AnalogInput m_ultrasonic = new AnalogInput(ULTRASONIC_PORT);
	
	// Robot container
	public static RobotContainer robotContainer = new RobotContainer();
	
	public static OI oi = new OI(robotContainer);
	
}
