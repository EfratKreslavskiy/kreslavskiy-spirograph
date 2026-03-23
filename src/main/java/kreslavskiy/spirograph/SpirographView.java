package kreslavskiy.spirograph;

import javax.swing.*;
import java.awt.*;

public class SpirographView extends JComponent
{
    private SpirographModel sm = new SpirographModel(200, 75, 55,
                                                                  8000, 0.007);
    private double time;

    public void setSpirographModel(SpirographModel spirograph)
    {
        this.sm = spirograph;
        repaint();
    }

    public SpirographModel getSpirographModel()
    {
        return sm;
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
        g.translate(getWidth()/2, getHeight()/2); //moves origin to middle of page

        for(int i=0; i<sm.getNumSteps(); i++)
        {
            time = i * sm.getAnglePerStep();
            double lr = sm.getLargeRadius();
            double sr = sm.getSmallRadius();
            double x = (lr - sr) * Math.cos(time) + sm.getPenDistance()
                    * Math.cos((lr - sr) * time / sr);
            double y = (lr - sr) * Math.sin(time) - sm.getPenDistance()
                    * Math.sin((lr - sr) * time / sr);
            g.drawLine((int) x, (int) y, (int) x, (int) y);

        }
    }
}
