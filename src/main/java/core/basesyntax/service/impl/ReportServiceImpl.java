package core.basesyntax.service.impl;

import core.basesyntax.service.ReportService;
import core.basesyntax.storage.Storage;
import java.util.stream.Collectors;

public class ReportServiceImpl implements ReportService {
    @Override
    public String getReport() {
        return Storage.getStorage().entrySet().stream()
                .map(n -> n.getKey() + "," + n.getValue() + System.lineSeparator())
                .collect(Collectors.joining());
    }
}