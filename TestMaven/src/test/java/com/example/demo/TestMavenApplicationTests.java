package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestMavenApplicationTests
{

    @Test
    void contextLoads()
    {
        assertThat(true);
    }

    @Test
    void contextLoads1()
    {

        assertThat(new Hoang(1).getId() == 1);

    }

}
