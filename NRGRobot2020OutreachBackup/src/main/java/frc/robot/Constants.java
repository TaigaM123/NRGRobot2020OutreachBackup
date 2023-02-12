// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveConstants {
    //PWM ports
    public static final int kLeftDriveMotor1 = 2;
    public static final int kLeftDriveMotor2 = 3;
    public static final int kRightDriveMotor1 = 0;
    public static final int kRightDriveMotor2 = 1;

    public static final double kSlowModePower = 0.75; //percent
    public static final double kDriveSlewRate = 0.75; // x percent increase per second
    public static final double kFullSpeedRateLimit = 0.01; //Increase (percentage of 1) per 20ms
  }
}

