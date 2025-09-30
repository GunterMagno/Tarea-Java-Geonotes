package com.example.geonotesteaching;

public abstract sealed class AbstractExporter implements Exporter permits JsonExporter, MarkdownExporter, Timeline.Render { public abstract String export(); }