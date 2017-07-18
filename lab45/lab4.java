import java.util.*;

class guessName{
    private char [][] a = {
            '李','王','张','刘','陈','杨','黄','赵','周','吴','徐','孙','朱','马','胡','郭','林','何','高','梁','郑','罗','宋','谢',　
            '唐','韩','曹','许','邓','萧','冯','曾','程','蔡','彭','潘','袁','于','董','余','苏','叶','吕','魏','蒋','田','杜','丁',
            '沈','姜','范','江','傅','钟','卢','汪','戴','崔','任','陆','廖','姚','方','金','邱','夏','谭','韦','贾','邹','石','熊',
            '孟','秦','阎','薛','侯','雷','白','龙','段','郝','孔','邵','史','毛','常','万','顾','赖','武','康','贺','严','尹','钱',
            '施','牛','洪','龚','汤','陶','黎','温','莫','易','樊','乔','文','安','殷','颜','章','鲁','倪','庞','邢','俞','翟','蓝',
            '聂','齐','向','申','葛','岳','伍','覃','骆','关','焦','柳','欧','祝','纪','尚','毕','耿','芦','左','季','管','符','辛',
            '苗','詹','曲','靳','祁','路','涂','兰','甘','裴','梅','童','翁','霍','游','阮','尤','舒','柯','牟','滕','谷','柴','满',
            '卜','成','饶','宁','凌','盛','查','单','冉','鲍','华','包','屈','房','喻','解','蒲','卫','简','时','连','车','项','闵',
            '邬','吉','党','阳','司','费','蒙','席','晏','隋','古','强','穆','姬','宫','景','米','麦','谈','柏','瞿','艾','沙','冀',
            '鄢','桂','窦','郁','缪','畅','巩','卓','褚','栾','戚','全','娄','甄','郎','池','丛','边','岑','农','苟','迟','保','商',
            '臧','佘','卞','虞','刁','冷','应','匡','栗','仇','练','楚','揭','师','官','佟','封','燕','桑','巫','敖','原','植','邝',
            '仲','荆','储','宗','楼','干','苑','寇','盖','南','屠','鞠','荣','井','乐','银','奚','明','麻','雍','花','闻','冼','木',

};
private int ROW = 12;
private int COL = 24;

public void printRow(){
        for(int i = 0; i < ROW; i++){
        for(int j = 0; j < COL; j++){
        if(j % 3 == 0){
        System.out.println(" ");
        }
        System.out.print(a[i][j]);
        }
        System.out.println(" ");
        }
        }

public guessName(){
        }

public void printCol(){
        for(int i = 0; i < ROW; i++){
        for(int j = 0; j < COL; j++){
        if(j % 3 == 0){
        System.out.println(" ");
        }
        System.out.print(a[i][j]);
        }
        System.out.println(" ");
        }
        }

public void getName(int i, int j){
        if(i <= 0 || j <= 0){
        System.out.println("wrong");
        }
        System.out.println("your name is :" + a[i-1][j-1]);
        }
        }


class Lineart{
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public Lineart(double a,double b,double c, double d,double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getD(){
        return d;
    }
    public double getE(){
        return e;
    }
    public double getF(){
        return f;
    }

    public boolean isSolvable(){
        if((a * b - c * d) == 0){
            return false;
        }
        return true;
    }

    public double getX(){
        return (e*d - b*f)/(a*d - b*c);
    }
    public double getY(){
        return (a*f - e*c)/(a*d - b*c);
    }
}

class Quadratict {
    private double a;
    private double b;
    private double c;

    public Quadratict(double newA, double newB, double newC) {
        a = newA;
        b = newB;
        c = newC;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }

    double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    double getRoot1() {
        if (getDiscriminant() < 0)
            return 0;
        else {
            return (-b + getDiscriminant()) / (2 * a);
        }
    }

    double getRoot2() {
        if (getDiscriminant() < 0)
            return 0;
        else {
            return (-b - getDiscriminant()) / (2 * a);
        }
    }
}

class RegularPolygon{
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon(){
    }

    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter(){
        return n * side;
    }

    public double getArea(){
        return n * side * side / Math.tan(Math.PI / n) / 4;
    }
}


public class lab4{
    //8_9
    /*
    public static void main(String[] args){
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("p1: " + p1.getPerimeter());
        System.out.println("p1: " + p1.getArea());
        System.out.println("p2: " + p2.getPerimeter());
        System.out.println("p2: " + p2.getArea());
        System.out.println("p3: " + p3.getPerimeter());
        System.out.println("p3: " + p3.getArea());

    }
    */

    //8_10
    /*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        Quadratict t = new Quadratict(a, b, c);
        double discriminant = t.getDiscriminant();

        if (discriminant < 0) {
            System.out.println("The t has no roots");
        }
        else if (discriminant == 0)
        {
            System.out.println("The root is " + t.getRoot1());
        }
        else
        {
            System.out.println("The roots are " + t.getRoot1()
                    + " and " + t.getRoot2());
        }
    }
    */

    //8_12
    /*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = (y1 - y2);
        double b = (-x1 + x2);
        double c = (y3 - y4);
        double d = (-x3 + x4);
        double e = -y1 * (x1 - x2) + (y1 - y2) * x1;
        double f = -y3 * (x3 - x4) + (y3 - y4) * x3;

        Lineart t = new Lineart(a, b, c, d, e, f);

        if (t.isSolvable()) {
            System.out.println("The intersecting point is: (" +
                    t.getX() + ", " + t.getY() + ")");
        }
        else {
            System.out.println("The two lines do not cross ");
        }
    }
    */

    //8_11
    /*
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        Lineart t = new Lineart(a, b, c, d, e, f);
        if(!t.isSolvable()){
            System.out.println("the t has no solution.");
        }
        else{
            System.out.println(t.getX());
            System.out.println(t.getY());
        }
    }
    */

    //附加

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        guessName t = new guessName();

        t.printRow();

        System.out.print("input the list1 number: ");
        int i = scanner.nextInt();

        t.printRow();

        System.out.print("input the list2 number: ");
        int j = scanner.nextInt();

        t.getName(i, j);
    }

}

