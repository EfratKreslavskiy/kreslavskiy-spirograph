package kreslavskiy.spirograph;

public class SpirographModel
{
    private int largeRadius;
    private int smallRadius;
    private int penDistance;
    private int numSteps;
    private double anglePerStep;

    SpirographModel(int largeRadius, int smallRadius, int penDistance, int numSteps, double anglePerStep)
    {
        this.largeRadius = largeRadius;
        this.smallRadius = smallRadius;
        this.penDistance = penDistance;
        this.numSteps = numSteps;
        this.anglePerStep = anglePerStep;
    }

    public int getLargeRadius()
    {
        return largeRadius;
    }

    public int getSmallRadius()
    {
        return smallRadius;
    }

    public double getPenDistance()
    {
        return penDistance;
    }

    public int getNumSteps()
    {
        return numSteps;
    }

    public double getAnglePerStep()
    {
        return anglePerStep;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        SpirographModel spiro = (SpirographModel) o;
        return largeRadius  == spiro.largeRadius
            && smallRadius  == spiro.smallRadius
            && penDistance  == spiro.penDistance
            && numSteps     == spiro.numSteps
            && Double.compare(anglePerStep,  spiro.anglePerStep) == 0;

    }
}
