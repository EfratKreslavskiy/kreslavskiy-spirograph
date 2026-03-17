package kreslavskiy.spirograph;

import javax.swing.*;

public class SpirographView extends JComponent
{
    private SpirographModel spirographModel = new SpirographModel(200, 75, 55,
                                                                  8000, 0.007);

    public SpirographModel getSpirographModel()
    {
        return spirographModel;
    }

    void setSpirographModel (SpirographModel spirograph)
    {
        this.spirographModel = spirograph;
        repaint();
    }

    //need method: paintComponent(Graphics g)
}
