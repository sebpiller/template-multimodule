package ch.sebpiller.template;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TempTest {

    @Test
    void test_java() {
        Assertions.assertThat(new TempJ().add(2, 3)).isEqualTo(5);
    }

    @Test
    void test_kotlin() {
        Assertions.assertThat(new TempK().add(2, 3)).isEqualTo(5);
    }
}
