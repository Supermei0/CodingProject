package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class ProgramServo extends LinearOpMode {
    public Servo claw;
    @Override
    public void runOpMode() throws InterruptedException {
        claw = hardwareMap.get(Servo.class, "claw");
        claw.setPosition(.38);
        waitForStart();
        while(opModeIsActive()) {
            //servo position is from 0-1

            if (gamepad1.left_bumper) {
                claw.setPosition(.38);
            }
            if (gamepad1.right_bumper) {
                claw.setPosition(.28);
            }
        }
    }
}
