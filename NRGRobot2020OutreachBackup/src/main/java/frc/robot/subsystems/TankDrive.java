package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants.DriveConstants;
import edu.wpi.first.math.filter.SlewRateLimiter;

public class TankDrive extends SubsystemBase {

  private final SlewRateLimiter leftSlewLimit = new SlewRateLimiter(DriveConstants.kDriveSlewRate);
  private final SlewRateLimiter rightSlewLimit = new SlewRateLimiter(DriveConstants.kDriveSlewRate);

  //copy pasted from 2020 948 robot code

  private MotorController leftMotor1 = new VictorSP(DriveConstants.kLeftDriveMotor1);
  private MotorController leftMotor2 = new VictorSP(DriveConstants.kLeftDriveMotor2);
  private MotorController rightMotor1 = new VictorSP(DriveConstants.kRightDriveMotor1);
  private MotorController rightMotor2 = new VictorSP(DriveConstants.kRightDriveMotor2);

  private MotorControllerGroup leftMotors = new MotorControllerGroup(leftMotor1,leftMotor2);
  private MotorControllerGroup rightMotors = new MotorControllerGroup(rightMotor1,rightMotor2);

  private final DifferentialDrive diffDrive = new DifferentialDrive(leftMotors, rightMotors);

  public void diffDrive(double leftspeed,double rightspeed) {
    leftMotors.setInverted(true);
    diffDrive.tankDrive(leftSlewLimit.calculate(leftspeed),rightSlewLimit.calculate(rightspeed));
  }

  public void setMaxOutput(double maxOutput) {
    diffDrive.setMaxOutput(maxOutput);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  
  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
