// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3244.SuperSirAntsABot2;


import org.usfirst.frc3244.SuberSirAntsABot2.autonomousroutines.Auto_11_91_Get_Cube_1;
import org.usfirst.frc3244.SuberSirAntsABot2.autonomousroutines.Auto_11_93_0_Conditional_SecondPlate;
import org.usfirst.frc3244.SuberSirAntsABot2.autonomousroutines.Auto_21_4_1_Left_Get_Cube_0;
import org.usfirst.frc3244.SuperSirAntsABot2.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.InternalButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc3244.SuperSirAntsABot2.subsystems.*;
import org.usfirst.frc3244.SuperSirAntsABot2.util.AndJoystickButton;
import org.usfirst.frc3244.SuperSirAntsABot2.util.AndNOTJoystickButton2;
import org.usfirst.frc3244.SuperSirAntsABot2.util.JoystickAxisButton;
import org.usfirst.frc3244.SuperSirAntsABot2.util.JoystickPOVButton;
import org.usfirst.frc3244.SuperSirAntsABot2.util.OrJoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	private boolean CO_DRIVER_SCISSOR = false;
	private boolean SCISSOR_CONTINUTU_TO_SERVO = false;
	private boolean SCISSOR_DOWN_AFTER_LAUNCH = false;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick xBox_Driver;
    public Joystick xBox_CoDriver;
    public Joystick launchPad;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
  //Xbox game pad Channels
    public static final int GAMEPAD_XBOX_LEFT_X_AXIS = 0;//
    public static final int GAMEPAD_XBOX_LEFT_Y_AXIS = 1;//
	public static final int GAMEPAD_XBOX_LEFT_TRIGGER = 2;//
	public static final int GAMEPAD_XBOX_RIGHT_TRIGGER = 3;//
	public static final int GAMEPAD_XBOX_RIGHT_X_AXIS = 4;//
	public static final int GAMEPAD_XBOX_RIGHT_Y_AXIS = 5;//

	public static final int GAMEPAD_XBOX_A_BUTTON = 1;//
	public static final int GAMEPAD_XBOX_B_BUTTON = 2;//
	public static final int GAMEPAD_XBOX_X_BUTTON = 3;//
	public static final int GAMEPAD_XBOX_Y_BUTTON = 4;//
	public static final int GAMEPAD_XBOX_LEFT_BUTTON = 5;//
	public static final int GAMEPAD_XBOX_RIGHT_BUTTON = 6;//
	public static final int GAMEPAD_XBOX_RESET_BUTTON = 7;//
	public static final int GAMEPAD_XBOX_START_BUTTON = 8;//
	public static final int GAMEPAD_XBOX_LEFT_STICK_BUTTON = 9;
	public static final int GAMEPAD_XBOX_RIGHT_STICK_BUTTON = 10;
	
	public JoystickButton a_xBox_Driver;
	public JoystickButton b_xBox_Driver;
	public JoystickButton x_xBox_Driver;
	public JoystickButton y_xBox_Driver;
	public JoystickButton lb_xBox_Driver;
	//public JoystickButton rb_xBox_Driver;
	public AndJoystickButton rb_xBox_Driver;
	public JoystickButton start_xBox_Driver;
	public JoystickButton reset_xBox_Driver;
   
	public JoystickAxisButton rt_xBox_Driver;
	public JoystickAxisButton lt_xBox_Driver;
   
	public JoystickPOVButton povNorth_xBox_Driver;
	public JoystickPOVButton povSouth_xBox_Driver;
	public JoystickPOVButton povWest_xBox_Driver;
	public JoystickPOVButton povEast_xBox_Driver;
	
   
	public Joystick xbox_xBox_CoDriver;
	public JoystickButton a_xBox_CoDriver;
	public JoystickButton b_xBox_CoDriver;
	public JoystickButton x_xBox_CoDriver;
	public JoystickButton y_xBox_CoDriver;
	public JoystickButton lb_xBox_CoDriver;
	public JoystickButton rb_xBox_CoDriver;
	public JoystickButton start_xBox_CoDriver;
	public JoystickButton reset_xBox_CoDriver;
	public JoystickButton lsb_xBox_CoDriver;
	private JoystickAxisButton lTrig_xBox_CoDriver;
	private JoystickAxisButton rTrig_xBox_CoDriver;
	private JoystickAxisButton rJoystickUpDown_CoDriver;
	
	public JoystickPOVButton povNorth_xBox_CoDriver;
	public JoystickPOVButton povSouth_xBox_CoDriver;
	public JoystickPOVButton povWest_xBox_CoDriver;
	public JoystickPOVButton povEast_xBox_CoDriver;
   
	public JoystickAxisButton rt_xBox_CoDriver;
   
	//public JoystickButton btn1_launchPad;
	public JoystickButton btn2_launchPad;
	public JoystickButton btn3_launchPad;
	//public JoystickButton btn4_launchPad;
	//public JoystickButton btn5_launchPad;
	public JoystickButton btn6_launchPad;
	public JoystickButton btn7_launchPad;
	public JoystickButton btn8_launchPad;
	public JoystickButton btn9_launchPad;
	public JoystickButton btn10_launchPad;
	public JoystickButton btn11_launchPad;
	
	public AndJoystickButton btn1_startClimb;
	public AndJoystickButton btn5_exstendHooks;
	public AndJoystickButton btn4_prepaireScissor;
	
	public OrJoystickButton scissor_Climb;
	public OrJoystickButton scissor_Scale;
	public OrJoystickButton scissor_Switch;
	public OrJoystickButton scissor_Down;
	
	
	
	/*
	 *	 	LTa2						RTa3
	 * 		LB5							LB5
	 * 		  -
	 * 	+xa0- ya1 LS9
	 * 		  +
	 * 									Y4
	 * 		N			R6	S7		X3		B2
	 * 	w		e						A1
	 *		S					  
	 *							  -
	 *						+xa4- ya5 RS10
	 *							  +
	 */
	
   
    public OI() {
    	
    	xBox_Driver = new Joystick(0);
    	xBox_CoDriver = new Joystick(1);
    	launchPad = new Joystick(2);
    	
    		setUp_Controler_xBox_Driver();
    		setUp_Controler_xBox_CoDriver();
    		setUp_Controler_LaunchPad();
    		setUp_AND_Buttons(); //Do this after all joy sticks are declared.
    		setUp_OR_Buttons(); //Do this after all joy sticks are declared. 
    	
    	setUp_SmartDashboard_Buttons();
    	
    }

    private void setUp_Controler_xBox_Driver(){
    	//xBox_Driver = new Joystick(0);
    	
//    	if(!CO_DRIVER_SCISSOR) {
//	    	a_xBox_Driver = new JoystickButton(xBox_Driver, GAMEPAD_XBOX_A_BUTTON);
//	    	//Eliminate the cancle of scissor to setpoint when wrist or intake used
//	    	//a_xBox_CoDriver.whenPressed(new ScissorSafeLowerToStow());
//    	
//	    	a_xBox_Driver.whenPressed(new CommandGroup() {
//	    		{
//	    			addParallel(	new Winch_Hooks_Retract());
//	    			addSequential(	new Scissor_To_Setpoint(Robot.scissor.DOWN,true));
//	    		}
//	    	});
//    	
//	//    	a_xBox_CoDriver.whileHeld(new CommandGroup() {
//	//    		{
//	//    			addParallel(	new Winch_Hooks_Retract());
//	//    			addSequential(	new Scissor_To_Setpoint(Robot.scissor.DOWN,false));
//	//    		}
//	//    	});
//	    	
//	    	
//	    	b_xBox_Driver = new JoystickButton(xBox_Driver, GAMEPAD_XBOX_B_BUTTON);
//	    	b_xBox_Driver.whenPressed(new Scissor_To_Setpoint(Robot.scissor.SWITCH,true));
//	    	//b_xBox_CoDriver.whileHeld(new Scissor_To_Setpoint(Robot.scissor.SWITCH,false));
//	    	
//	    	x_xBox_Driver = new JoystickButton(xBox_Driver, GAMEPAD_XBOX_X_BUTTON);
//	    	x_xBox_Driver.whenPressed(new Scissor_To_Setpoint(Robot.scissor.CLIMB_START,true));
//	    	//x_xBox_CoDriver.whileHeld(new Scissor_To_Setpoint(Robot.scissor.CLIMB_START,false));
//	    	
//	    	y_xBox_Driver = new JoystickButton(xBox_Driver, GAMEPAD_XBOX_Y_BUTTON);
//	    	y_xBox_Driver.whenPressed(new Scissor_To_Setpoint(Robot.scissor.SCALE,true));
//	    	//y_xBox_CoDriver.whileHeld(new Scissor_To_Setpoint(Robot.scissor.SCALE,false));
//    	}
    	
    	if(true) {
    		rt_xBox_Driver = new JoystickAxisButton(xBox_Driver, GAMEPAD_XBOX_RIGHT_TRIGGER);
    		//rt_xBox_Driver.whileHeld(new Intake_Launch(-600));
    		rt_xBox_Driver.whileHeld(new Intake_Launch_Variable());
    		if(SCISSOR_DOWN_AFTER_LAUNCH) {
	    		rt_xBox_Driver.whenReleased(new CommandGroup() {
	        		{
	        			addParallel(	new Winch_Hooks_Retract());
	        			addSequential(	new Scissor_To_Setpoint(Robot.scissor.DOWN,SCISSOR_CONTINUTU_TO_SERVO));
	        		}
	        	});
    		}
    		
    		lt_xBox_Driver = new JoystickAxisButton(xBox_Driver, GAMEPAD_XBOX_LEFT_TRIGGER);
    		lt_xBox_Driver.whileHeld(new Intake_Cube_n_Open());
    		lt_xBox_Driver.whenReleased(new Intake_Cube_End());
    		
    		reset_xBox_Driver = new JoystickButton(xBox_Driver, GAMEPAD_XBOX_RESET_BUTTON);
        	reset_xBox_Driver.whenPressed(new Wrist_Up_CommandGroup());
        	
        	start_xBox_Driver = new JoystickButton(xBox_Driver, GAMEPAD_XBOX_START_BUTTON);
        	start_xBox_Driver.whenPressed(new Wrist_Down(1));
    		
    	}else {
    		/**
        	rt_xBox_Driver = new JoystickAxisButton(xBox_Driver, GAMEPAD_XBOX_RIGHT_TRIGGER);
            rt_xBox_Driver.whileHeld(new VisionHardware_LEDs_Off_On());
            
            povNorth_xBox_Driver = new JoystickPOVButton(xBox_Driver, JoystickPOVButton.NORTH);
            povNorth_xBox_Driver.whileHeld(new Drive_Turn_To_Setpoint_InTeleop(0.0,0.0,0.0f));		//DriveTurnToHeaddingInTeleop());
            
            povSouth_xBox_Driver = new JoystickPOVButton(xBox_Driver, JoystickPOVButton.SOUTH);
            povSouth_xBox_Driver.whileHeld(new Drive_Turn_To_Setpoint_InTeleop(0.0,0.0,179.9f));	//DriveTurnToHeaddingInTeleop());
            
            povWest_xBox_Driver = new JoystickPOVButton(xBox_Driver, JoystickPOVButton.WEST);
            povWest_xBox_Driver.whileHeld(new Drive_Turn_To_Setpoint_InTeleop(0.0,0.0,-90.0f));		//DriveTurnToHeaddingInTeleop());
            
            povEast_xBox_Driver = new JoystickPOVButton(xBox_Driver, JoystickPOVButton.EAST);
            povEast_xBox_Driver.whileHeld(new Drive_Turn_To_Setpoint_InTeleop(0.0,0.0,90.0f));		//DriveTurnToHeaddingInTeleop());
            
            */
    	}
    	
    	
        
        rb_xBox_Driver = new AndJoystickButton(xBox_Driver, GAMEPAD_XBOX_RIGHT_BUTTON, launchPad, 10);
        rb_xBox_Driver.whenPressed(new Winch_Hooks_Extend());
        
        lb_xBox_Driver = new JoystickButton(xBox_Driver, GAMEPAD_XBOX_LEFT_BUTTON);
        lb_xBox_Driver.whenPressed(new Winch_Hooks_Retract());
        
    }
    
    private void setUp_Controler_xBox_CoDriver(){
    	//xBox_CoDriver = new Joystick(1);
    	
    	lsb_xBox_CoDriver = new JoystickButton(xBox_CoDriver,GAMEPAD_XBOX_LEFT_STICK_BUTTON);
    	//lsb_xBox_CoDriver.whileHeld(new Drive_Tracking_Target());
    	
//    	if(CO_DRIVER_SCISSOR||true) {
//	    	a_xBox_CoDriver = new JoystickButton(xBox_CoDriver, GAMEPAD_XBOX_A_BUTTON);
//	    	//Eliminate the cancle of scissor to setpoint when wrist or intake used
//	    	//a_xBox_CoDriver.whenPressed(new ScissorSafeLowerToStow());
//    	
//	    	a_xBox_CoDriver.whenPressed(new CommandGroup() {
//	    		{
//	    			addParallel(	new Winch_Hooks_Retract());
//	    			addSequential(	new Scissor_To_Setpoint(Robot.scissor.DOWN,true));
//	    		}
//	    	});
//    	
//	//    	a_xBox_CoDriver.whileHeld(new CommandGroup() {
//	//    		{
//	//    			addParallel(	new Winch_Hooks_Retract());
//	//    			addSequential(	new Scissor_To_Setpoint(Robot.scissor.DOWN,false));
//	//    		}
//	//    	});
//	    	
//	    	
//	    	b_xBox_CoDriver = new JoystickButton(xBox_CoDriver, GAMEPAD_XBOX_B_BUTTON);
//	    	b_xBox_CoDriver.whenPressed(new Scissor_To_Setpoint(Robot.scissor.SWITCH,true));
//	    	//b_xBox_CoDriver.whileHeld(new Scissor_To_Setpoint(Robot.scissor.SWITCH,false));
//	    	
//	    	x_xBox_CoDriver = new JoystickButton(xBox_CoDriver, GAMEPAD_XBOX_X_BUTTON);
//	    	x_xBox_CoDriver.whenPressed(new Scissor_To_Setpoint(Robot.scissor.CLIMB_START,true));
//	    	//x_xBox_CoDriver.whileHeld(new Scissor_To_Setpoint(Robot.scissor.CLIMB_START,false));
//	    	
//	    	y_xBox_CoDriver = new JoystickButton(xBox_CoDriver, GAMEPAD_XBOX_Y_BUTTON);
//	    	y_xBox_CoDriver.whenPressed(new Scissor_To_Setpoint(Robot.scissor.SCALE,true));
//	    	//y_xBox_CoDriver.whileHeld(new Scissor_To_Setpoint(Robot.scissor.SCALE,false));
//    	}
    	
    	reset_xBox_CoDriver = new JoystickButton(xBox_CoDriver, GAMEPAD_XBOX_RESET_BUTTON);
    	reset_xBox_CoDriver.whenPressed(new Wrist_Up_CommandGroup());
    	
    	start_xBox_CoDriver = new JoystickButton(xBox_CoDriver, GAMEPAD_XBOX_START_BUTTON);
    	start_xBox_CoDriver.whenPressed(new Wrist_Down(1));
    	
    	lTrig_xBox_CoDriver = new JoystickAxisButton(xBox_CoDriver, GAMEPAD_XBOX_LEFT_TRIGGER);
    	lTrig_xBox_CoDriver.whileHeld(new Intake_Cube_n_Open());//Intake_Cube_n_Float());
    	lTrig_xBox_CoDriver.whenReleased(new Intake_Cube_End());
    	
    	lb_xBox_CoDriver = new JoystickButton(xBox_CoDriver, GAMEPAD_XBOX_LEFT_BUTTON);
    	lb_xBox_CoDriver.whileHeld(new Intake_Cube_n_Float());//Intake_Cube_n_Open());
    	lb_xBox_CoDriver.whenReleased(new Intake_Cube_End());
    	
    	rb_xBox_CoDriver = new JoystickButton(xBox_CoDriver, GAMEPAD_XBOX_RIGHT_BUTTON);
    	rb_xBox_CoDriver.whileHeld(new VisionHardware_LEDs_Off_On());
    	
    	rTrig_xBox_CoDriver = new JoystickAxisButton(xBox_CoDriver, GAMEPAD_XBOX_RIGHT_TRIGGER);
    	//rTrig_xBox_CoDriver.whileHeld(new Intake_Launch(-600));
    	rTrig_xBox_CoDriver.whileHeld(new Intake_Launch_Variable());
    	if(SCISSOR_DOWN_AFTER_LAUNCH) {
	    	rTrig_xBox_CoDriver.whenReleased(new CommandGroup() {
	    		{
	    			addParallel(	new Winch_Hooks_Retract());
	    			addSequential(	new Scissor_To_Setpoint(Robot.scissor.DOWN,SCISSOR_CONTINUTU_TO_SERVO));
	    		}
	    	});
    	}
    	
    	rb_xBox_CoDriver = new JoystickButton(xBox_CoDriver, GAMEPAD_XBOX_RIGHT_BUTTON);
    	//rb_xBox_CoDriver.whenPressed(new Scissor_To_Setpoint(Robot.scissor.DRIVE_WITH_CUBE,true));
    	
    	rJoystickUpDown_CoDriver = new JoystickAxisButton(xBox_CoDriver, GAMEPAD_XBOX_RIGHT_Y_AXIS);
    	rJoystickUpDown_CoDriver.whileHeld(new Scissor_Jog_MotionMagic(false));
    	
    	
    	povWest_xBox_CoDriver = new JoystickPOVButton(xBox_CoDriver, JoystickPOVButton.WEST);
    	//povWest_xBox_CoDriver.whileHeld(new Intake_SpinCube());  //Removed Spin Cube
    	
    	
    }
    
    private void setUp_Controler_LaunchPad(){
    	//launchPad = new Joystick(2);
    	
    	btn1_startClimb = new AndJoystickButton(launchPad, 1, launchPad, 10);
    	btn1_startClimb.whenPressed(new CLIMB_Lift_Robot());
    	
    	btn2_launchPad = new JoystickButton(launchPad, 2);
    	btn2_launchPad.whileHeld(new Winch_Unwind_Jog());
    	// Used to Flip Drive btn3_launchPad = new JoystickButton(launchPad, 3);
    	
    	btn4_prepaireScissor = new AndJoystickButton(launchPad, 4, launchPad, 10);
    	btn4_prepaireScissor.whenPressed(new CLIMB_0());
    	
    	btn5_exstendHooks = new AndJoystickButton(launchPad, 5, launchPad, 10);
    	btn5_exstendHooks.whenPressed(new Winch_Hooks_Extend());
    	
    	btn6_launchPad = new JoystickButton(launchPad, 6);
    	btn6_launchPad.whenPressed(new Winch_Hooks_Retract());
    	
    	btn7_launchPad = new JoystickButton(launchPad, 7);
    	//btn7_launchPad.whileHeld(new Intake_Launch(-800));
    	btn7_launchPad.whenPressed(new Intake_Set_LaunchSpeed_HI());
    	
//    	btn7_launchPad.whenReleased(new CommandGroup() {
//    		{
//    			addParallel(	new Winch_Hooks_Retract());
//    			addSequential(	new Scissor_To_Setpoint(Robot.scissor.DOWN,true));
//    		}
//    	});
    	
    	btn8_launchPad = new JoystickButton(launchPad, 8);
    	//btn8_launchPad.whileHeld(new Intake_Launch(-400));
    	btn8_launchPad.whenPressed(new Intake_Set_LaunchSpeed_Med());
    	
//    	btn8_launchPad.whenReleased(new CommandGroup() {
//    		{
//    			addParallel(	new Winch_Hooks_Retract());
//    			addSequential(	new Scissor_To_Setpoint(Robot.scissor.DOWN,true));
//    		}
//    	});
    	
    	btn9_launchPad = new JoystickButton(launchPad, 9);
    	//btn9_launchPad.whileHeld(new Intake_Launch(-200));
    	btn9_launchPad.whenPressed(new Intake_Set_LaunchSpeed_Low());
    	
//    	btn9_launchPad.whenReleased(new CommandGroup() {
//    		{
//    			addParallel(	new Winch_Hooks_Retract());
//    			addSequential(	new Scissor_To_Setpoint(Robot.scissor.DOWN,true));
//    		}
//    	});
    	
    	// And Joystick BTN btn10_launchPad = new JoystickButton(launchPad, 10);
    	btn10_launchPad = new JoystickButton(launchPad, 10);
    	btn10_launchPad.whenPressed(new CLIMB_0());
    	
    	btn11_launchPad = new JoystickButton(launchPad, 11);
    	btn11_launchPad.whenPressed(new CommandGroup() {
    		{
    			addParallel(	new Winch_Hooks_Retract());
    	    	addSequential(	new Scissor_Reference_CG());
    		}
    	});
    	
    }
    private void setUp_SmartDashboard_Buttons(){
    	//example = new InternalButton();
    	//example.whileHeld(new CMD());
    	//SmartDashboard.putData("Test Get Cube", new Auto_11_91_Get_Cube_1());
    	//SmartDashboard.putData("Intake Cube", new Intake_Cube_n_Float());
    	//SmartDashboard.putData("Intake Eject", new Intake_Launch());
    
    	SmartDashboard.putData("Scissor Reference", new Scissor_Reference_CG());
    	//SmartDashboard.putData("Scissor to CLIMB", new Scissor_To_Setpoint(Robot.scissor.CLIMB_START,true));
    	//SmartDashboard.putData("Scissor to SCALE", new Scissor_To_Setpoint(Robot.scissor.SCALE,true));
    	//SmartDashboard.putData("Scissor to SWITCH", new Scissor_To_Setpoint(Robot.scissor.SWITCH,true));
    	SmartDashboard.putData("Scissor to DOWN", new Scissor_To_Setpoint(Robot.scissor.DOWN,SCISSOR_CONTINUTU_TO_SERVO));
    	//SmartDashboard.putData("Scissor Hooked and Climb",new CLIMB_Lift_Robot());
    	
    	SmartDashboard.putData("Winch Unwind Jog",  new Winch_Unwind_Jog());
    	//SmartDashboard.putData("Winch Climb",  new Winch_Climb(Winch.WINCH_DISTANCE));
    	//SmartDashboard.putData("Extend Hooks", new Winch_Hooks_Extend());
    	//SmartDashboard.putData("Retract Hooks", new Winch_Hooks_Retract());
    	//SmartDashboard.putData("Winch Zero Encoder", new Winch_Zero_Encoder());
    	SmartDashboard.putData("Winch Take Up Slack", new Winch_To_Setpoint(Winch.Winch_TAKE_UP, false));
    	//SmartDashboard.putData("Winch Climb Setpoint", new Winch_To_Setpoint(Winch.WINCH_DISTANCE, true));
    	
    	SmartDashboard.putData("Wrist Up", new Wrist_Up_CommandGroup());//Wrist_Up(1));
    	SmartDashboard.putData("Wrist Down", new Wrist_Down(1));
    	
    	
    	SmartDashboard.putData("Rollers Open", new Intake_Open(1));
    	SmartDashboard.putData("Rollers Close", new Intake_Close(1));
    	SmartDashboard.putData("Rollers Float", new Intake_Float(1));
    	
    	//SmartDashboard.putData("Prep For Climb", new CLIMB_0());
    	//SmartDashboard.putData("Lift Robot", new CLIMB_Lift_Robot());
    	
    	//SmartDashboard.putData("Drive Turn To Target", new Drive_Tracking_Target());
    	
    	
    	
    }
    
    private void setUp_AND_Buttons(){
    	//scissor_Left_Motor_Jog = new AndJoystickButton(xBox_Driver, GAMEPAD_XBOX_A_BUTTON, xBox_Driver, GAMEPAD_XBOX_X_BUTTON);
    	//scissor_Left_Motor_Jog.whileHeld(new Scissor_Jog_Left_Motor());
    	
    	//scissor_Right_Motor_Jog = new AndJoystickButton(xBox_Driver, GAMEPAD_XBOX_A_BUTTON, xBox_Driver, GAMEPAD_XBOX_B_BUTTON);
    	//scissor_Right_Motor_Jog.whileHeld(new Scissor_Jog_Right_Motor());
    }
    private void setUp_OR_Buttons(){
    	scissor_Down = new OrJoystickButton(xBox_Driver, GAMEPAD_XBOX_A_BUTTON,xBox_CoDriver, GAMEPAD_XBOX_A_BUTTON);
    	scissor_Down.whenPressed(new CommandGroup() {
    		{
    			addParallel(	new Winch_Hooks_Retract());
    			addSequential(	new Scissor_To_Setpoint(Robot.scissor.DOWN,SCISSOR_CONTINUTU_TO_SERVO));
    		}
    	});
    	
    	scissor_Switch = new OrJoystickButton(xBox_Driver, GAMEPAD_XBOX_B_BUTTON, xBox_CoDriver, GAMEPAD_XBOX_B_BUTTON);
    	scissor_Switch.whenPressed(new Scissor_To_Setpoint(Robot.scissor.SWITCH,SCISSOR_CONTINUTU_TO_SERVO));
    	
    	scissor_Climb = new OrJoystickButton(xBox_Driver, GAMEPAD_XBOX_X_BUTTON, xBox_CoDriver, GAMEPAD_XBOX_X_BUTTON);
    	scissor_Climb.whenPressed(new Scissor_To_Setpoint(Robot.scissor.CLIMB_START,SCISSOR_CONTINUTU_TO_SERVO));
    	
    	
    	scissor_Scale = new OrJoystickButton(xBox_Driver, GAMEPAD_XBOX_Y_BUTTON, xBox_CoDriver, GAMEPAD_XBOX_Y_BUTTON);
    	scissor_Scale.whenPressed(new Scissor_To_Setpoint(Robot.scissor.SCALE,SCISSOR_CONTINUTU_TO_SERVO));
    	
    }
    
    private double stickClamp(double value, double min, double max){
    	if(value>max){
    		return max;
    	}else if(value < min){
    		return min;
    	}else{
    		return value;
    	}
    }
    private double stickDeadBand(double value, double deadband){
    	if(Math.abs(value)<deadband){
    		return 0;
    	}else{
    		return value;
    	}
    }
    public double driveX() {
    	if(!launchPad.getRawButton(3)) {
    		return(stickDeadBand(xBox_Driver.getRawAxis(GAMEPAD_XBOX_LEFT_X_AXIS),.2));
    	}else {
    		return(stickDeadBand(-xBox_Driver.getRawAxis(GAMEPAD_XBOX_LEFT_X_AXIS),.2));
    	}
    	
	}
	
    //Strife
	public double driveY() {
		// The driveY is the "Y" Axis of the Driver Gamepad.
		// However, the joysticks give -1.0 on the Y axis when pushed forward
		// This method reverses that, so that positive numbers are forward
		if(!launchPad.getRawButton(3)) {
			return (stickDeadBand(-xBox_Driver.getRawAxis(GAMEPAD_XBOX_LEFT_Y_AXIS),.2));
		}else {
			return (stickDeadBand(xBox_Driver.getRawAxis(GAMEPAD_XBOX_LEFT_Y_AXIS),.2));
		}
		
	}
	public double driveLTigger(){
		return xBox_Driver.getRawAxis(GAMEPAD_XBOX_LEFT_TRIGGER);
	}
	public double driveRotation() {
		return stickDeadBand(xBox_Driver.getRawAxis(GAMEPAD_XBOX_RIGHT_X_AXIS),.2);
	}

	public boolean driveTurboMode() {
		return(xBox_Driver.getRawButton(GAMEPAD_XBOX_LEFT_BUTTON) || xBox_Driver.getRawAxis(GAMEPAD_XBOX_LEFT_TRIGGER)>0.2);
		
	}
	public boolean crawlBackward() {
		if(CO_DRIVER_SCISSOR) {
			return(xBox_Driver.getRawButton(GAMEPAD_XBOX_A_BUTTON));
		}else {
			return(xBox_Driver.getPOV()==180);
		}
    }
	public boolean crawlForward() {
		if(CO_DRIVER_SCISSOR) {	
			return(xBox_Driver.getRawButton(GAMEPAD_XBOX_Y_BUTTON));
		}else {
			return(xBox_Driver.getPOV()==0);
		}
    }
    
    public boolean crawlLeft() {
    	if(CO_DRIVER_SCISSOR) {	
    		return(xBox_Driver.getRawButton(GAMEPAD_XBOX_B_BUTTON));
    	}else {
    		return(xBox_Driver.getPOV()==90);
    	}
    }
    
    public boolean crawlRight() {
    	if(CO_DRIVER_SCISSOR) {	
    		return(xBox_Driver.getRawButton(GAMEPAD_XBOX_X_BUTTON));
    	}else {
    		return(xBox_Driver.getPOV()==270);
    	}
    }
    
    public double co_driveLTigger(){
    	return xBox_CoDriver.getRawAxis(GAMEPAD_XBOX_LEFT_TRIGGER);
	}

    public double co_Driver_Right_AxisX() {
    	return xBox_CoDriver.getRawAxis(GAMEPAD_XBOX_RIGHT_X_AXIS);
    }
    
    /**
     * Return Positive Value when Pushed UP
     * @return Y axis Value -1 to 1
     */
    public double co_Driver_Right_AxisY() {
    	// The  "Y" Axis of the Co_Driver Gamepad.
    	// However, the joysticks give -1.0 on the Y axis when pushed forward
    	// This method reverses that, so that positive numbers are forward
    	return -xBox_CoDriver.getRawAxis(GAMEPAD_XBOX_RIGHT_Y_AXIS);
    }
    

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getxBox_Driver() {
        return xBox_Driver;
    }

    public Joystick getxBox_CoDriver() {
        return xBox_CoDriver;
    }

    public Joystick getlaunchPad() {
        return launchPad;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
