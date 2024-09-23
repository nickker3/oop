public class Point {

    //fields
    private int x;
    private int y;

    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //getter and setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //code

    public void moveX(int Dx) {
        this.x += Dx;  // Update x
    }

    public void moveY(int Dy) {
        this.y += Dy;  // Update y
    }

    public void moveXY(int Dx, int Dy) {
        this.x += Dx;  // Update x
        this.y += Dy;  // Update y
    }

    @Override
    public String toString() {
        return x + " " + y;
    }

    @Override
    public boolean equals(Object obj)
    {
        Point that = (Point) obj;
        if(obj == null)
        {
        return false;
        }
        if (!(obj instanceof Point))
        {
            return false;
        }
        if(this == obj)
        {
            return true;
        }

        if ((this.x != that.x) || (this.y != that.y))
        {
           return false;
        }
        else
            return true;

    }
}
