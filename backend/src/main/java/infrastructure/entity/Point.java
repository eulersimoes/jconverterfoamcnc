package infrastructure.entity;

public class Point {
    private Long id;
    private double x;
    private double y;
    private double u; // X AXIS OF SECOND CARRIER
    private double z; // Y AXIS OF SECOND CARRIER

    public Point() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getU() {
        return this.u;
    }

    public void setU(double u) {
        this.u = u;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

}
