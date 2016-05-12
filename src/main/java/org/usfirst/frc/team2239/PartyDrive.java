package org.usfirst.frc.team2239;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * description
 *
 * @author Dean B
 */
public class PartyDrive extends RobotDrive {
    public PartyDrive(SpeedController frontLeftMotor, SpeedController rearLeftMotor,
                      SpeedController frontRightMotor, SpeedController rearRightMotor) {
        super(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
    }
}
