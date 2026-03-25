package kreslavskiy.spirograph;

public class SpirographModel
{
    private double largeRadius;
    private double smallRadius;
    private double penDistance;
    private double numSteps;
    private double anglePerStep;

    SpirographModel(double largeRadius, double smallRadius, double penDistance, double numSteps, double anglePerStep)
    {
        this.largeRadius = largeRadius;
        this.smallRadius = smallRadius;
        this.penDistance = penDistance;
        this.numSteps = numSteps;
        this.anglePerStep = anglePerStep;
    }

    public double getLargeRadius()
    {
        return largeRadius;
    }

    public double getSmallRadius()
    {
        return smallRadius;
    }

    public double getPenDistance()
    {
        return penDistance;
    }

    public double getNumSteps()
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
