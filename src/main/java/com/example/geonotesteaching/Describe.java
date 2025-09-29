package com.example.geonotesteaching;

final class Describe {
    public static String describeAttachment(Attachment a) {
        return switch (a) {
            case Photo p when p.width() > 1920 -> "📷 Foto en alta definición (%d x %d)".formatted(p.width(), p.height());
            case Photo p -> "📷 Foto";
            case Audio au when au.duration() > 300 -> {
                var mins = au.duration() / 60;
                yield " Audio (" + mins + " min)";
            }
            case Audio audio -> "🎵 Audio";
            case Link l -> "🔗 %s".formatted((l.label() == null || l.label().isEmpty()) ? l.url() : l.label());
            case Video v when v.seconds() > 120 -> {
                var mins = v.seconds() / 60;
                yield " Video (" + mins + " min)";
            }
            case Video v -> "Video";
        };
    }
}