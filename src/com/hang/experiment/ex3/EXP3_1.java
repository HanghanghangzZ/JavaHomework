package com.hang.experiment.ex3;

public class EXP3_1 {
    public static void main(String[] args) {
        EXP3_1 car = new EXP3_1("成龙", 200f, 25f);
        System.out.println("车主姓名: " + car.getOwnerName());
        System.out.println("当前车速: " + car.getCurSpeed());
        System.out.println("当前转向角度: " + car.getCurDirInDegree());
        car.changeSpeed(80);
        System.out.println("在调用changeSpeed(80)后,车速变为: " + car.getCurSpeed());
        car.stop();
        System.out.println("在调用stop()后, 车速变为: " + car.getCurSpeed());
    }

    private String ownerName; //车主姓名
    private float curSpeed; //当前车速
    private float curDirInDegree; //当前方向盘转向角度

    public EXP3_1() {
    }

    public EXP3_1(String ownerName) {
        this.ownerName = ownerName;
    }

    public EXP3_1(String ownerName, float speed, float dirInDegree) {
        this(ownerName);
        this.curSpeed = speed;
        this.curDirInDegree = dirInDegree;
    }

    public String getOwnerName() { //提供对车主姓名的访问
        return ownerName;
    }

    public float getCurDirInDegree() { //提供对当前方向盘转向角度的访问
        return curDirInDegree;
    }

    public float getCurSpeed() { //提供对当前车速的访问
        return curSpeed;
    }

    public void changeSpeed(float curSpeed) { //提供改变当前的车速
        this.curSpeed = curSpeed;
    }

    public void stop() { //提供停车
        this.curSpeed = 0;
    }
}
