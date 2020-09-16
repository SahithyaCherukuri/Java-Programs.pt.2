class Sphere extends Shape
{
    double radius;
    protected double calArea(double r)
    {
        double area;
        area=4*3.1416*r*r;
        return(area);
    }
    protected double calVolume(double r)
    {
        double vol;
        vol=(4*3.1416*r*r*r)/3;
        return(vol);
    }
}