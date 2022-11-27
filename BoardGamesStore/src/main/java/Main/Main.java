package Main;

import Controller.AvatarBuilder;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        testAvatarBuild();
    }

    public static void testAvatarBuild() {
        AvatarBuilder test = new AvatarBuilder();
        test.avatarBuildWelcome();
        System.out.print(test.avatarOrder);
    }
}
