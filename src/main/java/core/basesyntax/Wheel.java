package core.basesyntax;

import java.util.Objects;

public class Wheel implements Cloneable {
    private int radius;

    public Wheel(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(Wheel.class)) {
            Wheel wheel = (Wheel) obj;
            return radius == wheel.radius;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public Wheel clone() {
        try {
            return (Wheel) super.clone();
        } catch (RuntimeException | CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Wheel{"
            + "radius=" + radius
            + '}';
    }
}
