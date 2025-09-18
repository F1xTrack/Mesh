package com.p019vk.push.core.remote.config.omicron.segment;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public class SegmentsHolder {

    /* renamed from: a */
    public static SegmentsProvider f20572a;

    public static synchronized void clearProvider() {
        f20572a = null;
    }

    public static synchronized Map<String, String> getSegments() {
        SegmentsProvider segmentsProvider = f20572a;
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
        f20572a = segmentsProvider;
    }
}
