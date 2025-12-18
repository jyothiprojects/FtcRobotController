package org.firstinspires.ftc.teamcode.testcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class DcMotorTestCode extends OpMode {

    public DcMotor motor;

    
    double speed = 0.25;

    @Override
    public void init (){
        motor = hardwareMap.get(DcMotor.class, "single_motor");
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    @Override
    public void loop() {
       motor.setPower(speed);

    }
}
