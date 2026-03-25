package kreslavskiy.spirograph;

import javax.swing.*;

public class SpirographController
{
    private final SpirographView spirographView;
    private final JTextField lRadius;
    private final JTextField sRadius;
    private final JTextField penDistance;
    private final JTextField numSteps;
    private final JTextField anglePerStep;

    public SpirographController(SpirographView spirographView, JTextField lRadius, JTextField sRadius,
                                JTextField penDistance, JTextField numSteps, JTextField anglePerStep)
    {
        this.spirographView = spirographView;
        this.lRadius = lRadius;
        this.sRadius = sRadius;
        this.penDistance = penDistance;
        this.numSteps = numSteps;
        this.anglePerStep = anglePerStep;
    }

    public void updateSpirograph(double lgRad, double smRad, double penDist, double steps, double angle)
    {
        SpirographModel spiro = new SpirographModel(lgRad, smRad, penDist, steps, angle);
        spirographView.setSpirographModel(spiro);

        spirographView.repaint();
    }
}
