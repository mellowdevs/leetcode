package Recursion1.RecurrenceRelation;
public class PascalsTriangle{
    public List<Integer> getRow(int rowIndex) {
    List<Integer> result = new ArrayList<>();
    result.add(1);
    if (rowIndex == 0) {
        return result;
    }
    List<Integer> prevRow = getRow(rowIndex - 1);
    for (int i = 1; i < prevRow.size(); i++) {
        result.add(prevRow.get(i - 1) + prevRow.get(i));
    }
    result.add(1);
    return result;
}
}