package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Sarthak on 9/17/2016.
 */
@TeleOp(name="PushBot Drive Teleop", group = "PushBot")

public class PushbotOutreachTeleOp extends OpMode {
    DcMotor leftFront, rightFront;



    @Override
    public void init() {
        leftFront = this.hardwareMap.dcMotor.get("left_drive");
        rightFront = this.hardwareMap.dcMotor.get("right_drive");

        rightFront.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {

        leftFront.setPower(-gamepad1.left_stick_y);
        rightFront.setPower(-gamepad1.right_stick_y);

    }
}
