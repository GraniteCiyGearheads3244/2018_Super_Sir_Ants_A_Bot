// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3244.SuberSirAntsABot2.autonomousroutines;


import org.usfirst.frc3244.SuperSirAntsABot2.Robot;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.ConditionalCommand;


/**
 *
 */
public class Auto_12_3_0_Conditional_Approach_Left_Scale extends ConditionalCommand {

    public Auto_12_3_0_Conditional_Approach_Left_Scale() {
      super(new Auto_12_3_1_Deliver_Left_Scale_90_To_Plate(), new Auto_12_3_2_Deliver_Left_Scale_45_To_Plate());
    }

    @Override
    protected boolean condition(){
    	Integer approachChoice = (Integer) Robot.SwichApproachChooser.getSelected();
    	DriverStation.reportError("RUNING: Auto_12_3_0_Conditional_Approach_Left_Scale()", false);
    	
    	if(approachChoice != null) {
    		if(approachChoice == 0){
    		DriverStation.reportError("Approack Scale @90", false);
    			return true;
    		}else{
    			DriverStation.reportError("Approach Scale @45", false);
    			return false;
    		}
        }else {
        	DriverStation.reportError("Approach Chooser Null", false);
        	return false;
        }
    }
}
