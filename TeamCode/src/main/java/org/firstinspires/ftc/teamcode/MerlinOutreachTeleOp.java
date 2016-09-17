package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Sarthak on 9/17/2016.
 */
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
    }

    @Override
    public void loop() {
        double leftPower = gamepad1.left_stick_y;
        double rightPower = gamepad1.right_stick_y;

        setPowerAll(leftPower, rightPower);

        if (gamepad1.dpad_up){
            setPowerAll(.35, .35);
        }
        else if (gamepad1.dpad_down){
            setPowerAll(-.35, -.35);
        }
        else if (gamepad1.dpad_left){
            setPowerAll(-.35, .35);
        }
        else if (gamepad1.dpad_right){
            setPowerAll(-.35, .35);
        }
        else{
            setPowerAll(0, 0);
        }

    }
}
