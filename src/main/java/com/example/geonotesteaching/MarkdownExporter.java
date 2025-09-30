package com.example.geonotesteaching;

import java.util.Comparator;
import java.util.stream.Collectors;

public non-sealed class MarkdownExporter extends AbstractExporter implements Exporter {
    private final Timeline timeline;

    public MarkdownExporter(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override
    public String export() {
        var notesList = timeline.getNotes().values().stream()
                .sorted(Comparator.comparing(Note::id))
                .map(note -> "- [ID %d] %s — (%f, %f) — %s".formatted(
                        note.id(),
                        note.title(),
                        note.location().lat(),
                        note.location().lon(),
                        note.createdAt()
                ))
                .collect(Collectors.joining("\n"));

        return """
                # GeoNotes
                %s
                """.formatted(notesList);
    }
}