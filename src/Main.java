//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Point taskas = new Point(3, 4);
    IO.println(taskas.distanceFromOrigin());

    taskas.translate(2, 1);
    IO.println(taskas.getX() + ";" + taskas.getY());

    IO.println(taskas.toString());

    Point kitas = new Point(8, 9);
    IO.println(taskas.distance(kitas));

    taskas.setLocation(1, 2);
    IO.println(taskas);

    Point pradzia = new Point(0, 0);
    Point pabaiga = new Point(3, 4);
    Line linija = new Line(pradzia, pabaiga);

    IO.println(linija.toString());
    IO.println(linija.length());
    }

