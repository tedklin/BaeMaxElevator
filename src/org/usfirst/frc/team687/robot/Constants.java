package org.usfirst.frc.team687.robot;

/**
 * Constants
 * 
 * @author tedfoodlin
 *
 */
public class Constants {
	
	public final static double kLoopFrequency = 1/100.0;
	public final static double kMaxVelocity = 0;
	public final static double kMaxAccel = 0;
	public static double kMaxDecel = 0;
	
	// feedforward terms
	public final static double kA = 0; // acceleration constant that tells your controller to add a little extra power to accelerate, and a little less to decelerate
	public final static double kV = 0; // a unit conversion between real-world velocities and motor power (tune this first)
	
	// feedback gains
	public final static double kP = 0; // can be really high because error is already small
	public final static double kI = 0; // add if needed (usually for end)
	public final static double kD = 0; // add if needed
	
	public final static double kSecondTapeMarkerPosition = 5627.0;
	
	public static double desiredPosition;
	
	public final static int EncoderPort1 = 8;
	public final static int EncoderPort2 = 9;
	
	public final static int JoystickPort = 1;
	public final static int ElevatorPort = 1;
	
	public final static int updatePositionButton = 1;
	
}
