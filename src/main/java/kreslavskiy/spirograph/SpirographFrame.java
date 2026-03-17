package kreslavskiy.spirograph;

import javax.swing.*;
import java.awt.*;

public class SpirographFrame extends JFrame
{
    private final JTextField lRadius;
    private final JTextField sRadius;
    private final JTextField penDistance;
    private final JTextField numSteps;
    private final JTextField anglePerStep;


    public SpirographFrame()
    {
        setSize(800, 600);
        setTitle("Spirograph Frames");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());

        GridBagConstraints constraints;

        lRadius = new JTextField("LgRadius: 200");
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(lRadius, constraints);

        sRadius = new JTextField("SmRadius: 75");
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(sRadius, constraints);

        penDistance = new JTextField("PenDistance: 55");
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 2;
        add(penDistance, constraints);

        numSteps = new JTextField("NumSteps: 8000");
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 3;
        add(numSteps, constraints);

        anglePerStep = new JTextField("AnglePerStep: 0.007");
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 4;
        add(anglePerStep, constraints);

        SpirographView spirographView = new SpirographView();
        constraints = new GridBagConstraints();
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridheight = 6; //not sure if this height is correct
        constraints.weightx = 1;    //dont know what these two do :)
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.BOTH;
        add(spirographView, constraints);

        SpirographController spirographController = new SpirographController(spirographView, lRadius, sRadius,
                                                                                penDistance, numSteps, anglePerStep);
        //can add a Runnable later to animate it

    }
    static void main(String[] args)
    {
        SpirographFrame frame = new SpirographFrame();
        frame.setVisible(true);
    }
}
