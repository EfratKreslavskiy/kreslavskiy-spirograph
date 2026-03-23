package kreslavskiy.spirograph;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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

        JLabel lRadiusLabel = new JLabel("Lg Radius:");
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(lRadiusLabel, constraints);

        lRadius = new JTextField("200");
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 0;
        add(lRadius, constraints);

        JLabel sRadiusLabel = new JLabel("Sm Radius:");
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(sRadiusLabel, constraints);

        sRadius = new JTextField("75");
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 1;
        add(sRadius, constraints);

        JLabel pdLabel = new JLabel("Pen Distance:");
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 2;
        add(pdLabel, constraints);

        penDistance = new JTextField("55");
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 2;
        add(penDistance, constraints);

        JLabel stepsLabel = new JLabel("No. Steps:");
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 3;
        add(stepsLabel, constraints);

        numSteps = new JTextField("8000");
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 3;
        add(numSteps, constraints);

        JLabel apsLabel = new JLabel("Angle Per Step:");
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 4;
        add(apsLabel, constraints);

        anglePerStep = new JTextField("0.007");
        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 4;
        add(anglePerStep, constraints);

        JButton button = new JButton("Draw");
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.NORTH;
        add(button, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridheight = 6; //not sure if this height is correct
        constraints.weightx = 1;    //dont know what these two do :)
        constraints.weighty = 1;
        constraints.fill = GridBagConstraints.BOTH;
        SpirographView spirographView = new SpirographView();
        add(spirographView, constraints);

        SpirographController spirographController = new SpirographController(spirographView, lRadius, sRadius,
                                                                                penDistance, numSteps, anglePerStep);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               spirographController.updateSpirograph(Integer.parseInt(lRadius.getText()),
                                                     Integer.parseInt(sRadius.getText()),
                                                     Integer.parseInt(penDistance.getText()),
                                                     Integer.parseInt(numSteps.getText()),
                                                     Double.parseDouble(anglePerStep.getText()));
            }

        });

        //can add a Runnable later to animate it

    }

    static void main(String[] args)
    {
        SpirographFrame frame = new SpirographFrame();
        frame.setVisible(true);
    }
}
