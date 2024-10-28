public class Q029 {

    public interface Rectangle {
        default double calculateRectangleArea(double length, double width) {
            return length * width;
        }
    }

    public interface Ellipse {
        default double calculateEllipseArea(double majorR, double minorR) {
            return Math.PI * majorR * minorR;
        }
    }

    public class Cylinder implements Rectangle, Ellipse {
        // 使用 Rectangle 接口的方法
        @Override
        public double calculateRectangleArea(double length, double width) {
            return Rectangle.super.calculateRectangleArea(length, width);
        }

        // 使用 Ellipse 接口的方法
        @Override
        public double calculateEllipseArea(double majorR, double minorR) {
            return Ellipse.super.calculateEllipseArea(majorR, minorR);
        }

        // 計算圓柱的總表面積
        public double calculateTotalSurfaceArea(double length, double width, double majorR, double minorR) {
            double rectArea = calculateRectangleArea(length, width); // 矩形面積
            double ellipseArea = calculateEllipseArea(majorR, minorR); // 橢圓面積
            return rectArea + ellipseArea * 2; // 返回總表面積
        }
    }

    public static void main(String[] args) {
        Q029 outerClass = new Q029(); // 創建 Q029 的實例
        Cylinder cylinder = outerClass.new Cylinder(); // 使用 Q029 的實例來創建 Cylinder 的實例
        double surfaceArea = cylinder.calculateTotalSurfaceArea(5, 3, 4, 2); // 計算總表面積
        System.out.println("Surface Area of the Cylinder: " + surfaceArea);
    }
}
/*
What prevents this code from compiling?
A. The calculateSurfaceArea method within Cylinder must be declared default.
B. Cylinder is not properly calling the Rectangle and Ellipse interfaces’ calculateSurfaceArea methods.
C. Cylinder requires an implementation of calculateSurfaceArea with two parameters. Cylinder 類需要提供一個接受兩個參數的 calculateSurfaceArea 方法的實現。
D. The calculateSurfaceArea method within Rectangle and Ellipse requires a public access modifier
*/