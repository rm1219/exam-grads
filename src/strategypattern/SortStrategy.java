package strategypattern;

import java.util.*;

public interface SortStrategy {
    List<BookInformation> SortBook(List<BookInformation> bookInformationList);
}