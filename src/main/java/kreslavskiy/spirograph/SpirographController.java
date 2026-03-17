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

    public void updateSpirograph(int lgRad, int smRad, int penDist, int steps, double angle)
    {
        SpirographModel spiro = new SpirographModel(lgRad, smRad, penDist, steps, angle);
        spirographView.setSpirographModel(spiro);
        lRadius.setText("LgRadius: "          + String.valueOf(lgRad));
        sRadius.setText("SmRadius: "          + String.valueOf(smRad));
        penDistance.setText("PenDistance: "   + String.valueOf(penDist));
        numSteps.setText("NumSteps: "         + String.valueOf(steps));
        anglePerStep.setText("AnglePerStep: " + String.valueOf(angle));

        spirographView.repaint();
    }
}
