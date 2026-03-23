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

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        JLabel lRadiusLabel = new JLabel("Lg Radius:");
        add(lRadiusLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 0;
        lRadius = new JTextField("200");
        add(lRadius, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 1;
        JLabel sRadiusLabel = new JLabel("Sm Radius:");
        add(sRadiusLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 1;
        sRadius = new JTextField("75");
        add(sRadius, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 2;
        JLabel pdLabel = new JLabel("Pen Distance:");
        add(pdLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 2;
        penDistance = new JTextField("55");
        add(penDistance, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 3;
        JLabel stepsLabel = new JLabel("No. Steps:");
        add(stepsLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 3;
        numSteps = new JTextField("8000");
        add(numSteps, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 4;
        JLabel apsLabel = new JLabel("Angle Per Step:");
        add(apsLabel, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 4;
        anglePerStep = new JTextField("0.007");
        add(anglePerStep, constraints);

        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.NORTH;
        JButton button = new JButton("Draw");
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
