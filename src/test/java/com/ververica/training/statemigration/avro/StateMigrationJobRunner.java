package com.ververica.training.statemigration.avro;

import org.junit.Test;

public class StateMigrationJobRunner {

    @Test
    public void run() throws Exception {
        String[] args = {"--local", "true"};
        StateMigrationJob.main(args);
    }
}
