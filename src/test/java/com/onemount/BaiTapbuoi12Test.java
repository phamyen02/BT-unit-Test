package com.onemount;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BaiTapbuoi12Test {
    @Test
    @DisplayName("Test email")
    void email() {
        String email = "abc@gmail.com";
        assertThat(email).isNotNull()
                .contains("@")
                .endsWith(".com")
                .containsPattern("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
    }

    @Test
    @DisplayName("Test cân nặng")
    void weight() {
        double weigth = 43.5;
            assertThat(weigth).isNotNull()
                    .isGreaterThan(0);

    }
    @Test
    @DisplayName("Test CMT")
    void identity(){
        String[] iden = new String[]{"123454345","123432345","123434222","323432343","232123454"};
        for (int i=0; i<iden.length;i++){
            assertThat(iden[i]).isNotEmpty()
                    .hasSize(9)
                    .containsOnlyDigits();

        }
    }

}