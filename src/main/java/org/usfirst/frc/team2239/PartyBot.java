package org.usfirst.frc.team2239;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 * Technocrat's game handler
 *
 * @author Technocrats
 */
public class PartyBot extends IterativeRobot {

    public static PartyBot instance;

    public PartyDrive drive;  // class that handles basic drive operations
    public Controller controller;  // set to ID 3 in DriverStation

    @Override
    /**
     *  Method robotInit declares all devices needed, and turns on the compressor.
     */
    public void robotInit() {
        instance = this;
        drive = new PartyDrive(new Talon(0), new VictorSP(1), new VictorSP(2), new Talon(3));
        drive.setExpiration(0.1);
        drive.setSafetyEnabled(true);
        controller = new Controller(0);
    }

    @Override
    /**
     * Called when teleOp period starts
     *  When drive.setSafetyEnabled is true it will send you errors that the robot is not
     * receiving commands.
     */
    public void teleopInit() {
        drive.setSafetyEnabled(true);
    }

    @Override
    /**
     * Manual control over the robot during the competition
     */
    public void teleopPeriodic() {
        double x = controller.getX(GenericHID.Hand.kLeft);
        double y = controller.getY(GenericHID.Hand.kLeft);
        drive.mecanumDrive_Cartesian(x, y, controller.getX(GenericHID.Hand.kRight), 0);
    }
}
