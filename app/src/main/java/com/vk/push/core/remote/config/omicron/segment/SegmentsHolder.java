package com.vk.push.core.remote.config.omicron.segment;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class SegmentsHolder {
    public static SegmentsProvider a;

    public static synchronized void clearProvider() {
        a = null;
    }

    public static synchronized Map<String, String> getSegments() {
        SegmentsProvider segmentsProvider = a;
        if (segmentsProvider == null) {
            return Collections.emptyMap();
        }
        Map<String, String> segments = segmentsProvider.getSegments();
        if (segments == null) {
            segments = Collections.emptyMap();
        }
        return segments;
    }

    public static synchronized void registerProvider(SegmentsProvider segmentsProvider) {
        a = segmentsProvider;
    }
}
