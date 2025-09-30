package com.example.geonotesteaching;

public sealed interface Exporter permits AbstractExporter, JsonExporter, MarkdownExporter, Timeline.Render { String export(); }