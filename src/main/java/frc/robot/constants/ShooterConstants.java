package frc.robot.constants;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Rotation3d;

public class ShooterConstants {
    public static final double MAX_RPM = 6500;

    public static final double PASS_RPM = 4500;

    public static final int TOP_MOTOR_ID = 0;

    public static final int BOTTOM_MOTOR_ID = 0;

    public static final double SHOOTER_P = 5;

    public static final double SHOOTER_I = 0;

    public static final double SHOOTER_D = 0;

    public static final double SHOOTER_KS = 5;

    public static final double SHOOTER_KV = 0;

    public static final double SHOOTER_KA = 0;

    public static final double SHOOTER_WHEEL_DIAMETER = 0.07;
    // In meters
    public static final double SHOOTER_HEIGHT = 0.2;

    public static final double STAGE_HEIGHT = 2.3;

    public static final Pose3d SPEAKER_POSE_BLUE = new Pose3d(16.5, 5.5, 2.0, new Rotation3d(0.0, 0.0, 0.0));

    public static final Pose3d SPEAKER_POSE_RED = new Pose3d(0.0, 5.5, 2.0, new Rotation3d(0.0, 0.0, 0.0));

    public static final Pose2d PASS_POSE_RED = new Pose2d(16.5, 8.0, new Rotation2d(0.0)); //TODO: tune to actual values

    public static final Pose2d PASS_POSE_BLUE = new Pose2d(0.0, 8.0, new Rotation2d(0.0)); //TODO: tune to actual values

    public static final Pose2d AMP_POSE_RED = new Pose2d(16.5, 8.0, new Rotation2d(0.0)); //TODO: tune to actual values

    public static final Pose2d AMP_POSE_BLUE = new Pose2d(0.0, 8.0, new Rotation2d(0.0)); //TODO: tune to actual values

}
