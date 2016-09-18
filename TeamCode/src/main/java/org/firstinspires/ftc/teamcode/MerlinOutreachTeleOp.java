package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Sarthak on 9/17/2016.
 */
@TeleOp(name="Outreach Teleop", group = "Merlin")

public class MerlinOutreachTeleOp extends OpMode {
    DcMotor leftFront, leftBack, rightFront, rightBack;

    public void setPowerAll(double leftPower, double rightPower){
        leftFront.setPower(leftPower);
        leftBack.setPower(leftPower);
        rightFront.setPower(rightPower);
        rightBack.setPower(rightPower);
    }

    @Override
    public void init() {
        leftFront = this.hardwareMap.dcMotor.get("left_front");
        leftBack = this.hardwareMap.dcMotor.get("left_back");
        rightBack = this.hardwareMap.dcMotor.get("right_back");
        rightFront = this.hardwareMap.dcMotor.get("right_front");

        leftBack.setDirection(DcMotorSimple.Direction.REVERSE);
        leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void loop() {

        leftFront.setPower(-gamepad1.left_stick_y);
        leftBack.setPower(-gamepad1.left_stick_y);
        rightFront.setPower(-gamepad1.right_stick_y);
        rightBack.setPower(-gamepad1.right_stick_y);

    }
}
