package org.kleimyonov.Logger;

import org.apache.logging.log4j.LogManager;

public class LOGTrainee {
    public static final LOGTrainee logger = (LOGTrainee) LogManager.getLogger(LOGTrainee.class);

    public LOGTrainee() {
        System.out.println("Logger was Born!");
    }

    public static void main(String[] args) {



    }
}
