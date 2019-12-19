package com.summer.design.patterns.structural.bridge;

public class Test {
    public static void main(String[] args) {
        APhone huawei = new PhoneHuaWei();
        huawei.setMemory(new Memory4g());
        huawei.buyPhone();

        APhone xiaomi = new PhoneXiaoMi();
        xiaomi.setMemory(new Memory6g());
        xiaomi.buyPhone();
    }
}
