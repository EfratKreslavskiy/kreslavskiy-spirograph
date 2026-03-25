package kreslavskiy.spirograph;

import javax.swing.*;
import java.awt.*;

public class SpirographView extends JComponent
{
    private SpirographModel model = new SpirographModel(200, 75, 55,
                                                                  8000, 0.007);
    private double time;

    public void setSpirographModel(SpirographModel spirograph)
    {
        this.model = spirograph;
        repaint();
    }

    public SpirographModel getSpirographModel()
    {
        return model;
    }

    public void setTime(double time)
    {
        this.time = time;
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.MAGENTA);
        g.translate(getWidth() / 2, getHeight() / 2); //moves origin to middle of page

        for (int i = 0; i < model.getNumSteps(); i++)
        {
            time = i * model.getAnglePerStep();
            double largeRadius = model.getLargeRadius();
            double smallRadius = model.getSmallRadius();
            double x = (largeRadius - smallRadius) * Math.cos(time) + model.getPenDistance()
                                 * Math.cos((largeRadius - smallRadius) * time / smallRadius);
            double y = (largeRadius - smallRadius) * Math.sin(time) - model.getPenDistance()
                                 * Math.sin((largeRadius - smallRadius) * time / smallRadius);
            g.drawLine((int) x, (int) y, (int) x, (int) y);

        }
    }
}
