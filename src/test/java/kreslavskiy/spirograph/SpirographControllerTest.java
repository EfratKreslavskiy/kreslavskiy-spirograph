package kreslavskiy.spirograph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;
import static org.mockito.Mockito.*;

class SpirographControllerTest
{

    @Test
    void updateSpirograph()
    {
        //given
        SpirographView spiroView = mock();
        JTextField lRadius = mock();
        JTextField sRadius = mock();
        JTextField penDistance = mock();
        JTextField numSteps = mock();
        JTextField anglePerStep = mock();

        SpirographController spiroController = new SpirographController(spiroView, lRadius, sRadius, penDistance,
                                                                        numSteps, anglePerStep);

        //when
        spiroController.updateSpirograph(200, 75, 55, 8000, 0.007);

        //then
        verify(spiroView).setSpirographModel(new SpirographModel(200, 75, 55,
                 8000, 0.007));
    }
}