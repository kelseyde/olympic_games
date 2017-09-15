package com.example.kelseyde.olympicgames;
import org.junit.Test;
import org.mockito.Mockito;
import static junit.framework.Assert.assertEquals;

public class ResultGeneratorTest {

    @Test
    public void canGenerateResult() {
        NumberGenerating resultGenerator;
        resultGenerator = Mockito.mock(NumberGenerating.class);
        Mockito.when(resultGenerator.generate(Mockito.anyInt()))
                .thenReturn(4);
        assertEquals(4, resultGenerator.generate(9));
    }

}