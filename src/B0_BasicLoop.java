public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.pausetime =0;
        plane.isTrail=true;
        plane.trailWidth = 5;
        for(int row=0;row<20;row=row+1)
        {
            for(int col=0;col<20;col=col+1) {


                int a = (int) (Math.random() * 10) + 1;
                System.out.println(a);
                plane.teleport(50 * col, row*30);
                plane.setColor(10*row, 12*col, 150);
                house(10);
            }
        }


    }

    public void house(int c) {

        square(c);
        equitriangle(c);
    }

    public void equitriangle(int b) {
        plane.turn(90);
        plane.move(b);
        plane.turn(120);
        plane.move(b);
        plane.turn(120);
        plane.move(b);
        plane.turn(120);
    }
    public void square(int a) {
        plane.startingAngle(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
        plane.move(a);
        plane.turn(90);
    }
}
