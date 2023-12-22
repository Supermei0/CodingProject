package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp
public class arm extends LinearOpMode {
    public DcMotor arm;
    @Override
    public void runOpMode() throws InterruptedException {
        arm = hardwareMap.get (DcMotor.class, "arm");

        waitForStart();
        while(opModeIsActive())
        {
            arm.setPower(gamepad1.left_stick_y);
        }
    }
}
