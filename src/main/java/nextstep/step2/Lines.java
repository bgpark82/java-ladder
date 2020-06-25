package nextstep.step2;

import java.util.ArrayList;
import java.util.List;

public class Lines {

    private final List<Line> lines;

    public static Lines of(int numberOfPeople) {
        return new Lines(numberOfPeople);
    }

    private Lines(int numberOfPeople) {
        this.lines = createLines(numberOfPeople);
    }

    public List<Line> createLines(int numberOfPeople) {
         return addLine(new ArrayList<>(), numberOfPeople);
    }

    private List<Line> addLine(ArrayList<Line> lines, int numberOfPeople) {
        Line line = Line.first();
        for (int i = 1; i < numberOfPeople; i++) {
            lines.add(line);
            line = line.next();
        }
        return lines;
    }

    public List<Line> getLines() {
        return lines;
    }

    @Override
    public String toString() {
        return "Lines{" +
                ", lines=" + lines +
                '}';
    }

}
