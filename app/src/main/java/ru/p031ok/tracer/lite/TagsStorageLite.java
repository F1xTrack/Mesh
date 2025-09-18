package ru.p031ok.tracer.lite;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC11374v51;
import p000.AbstractC7230yu;
import p000.C10685pj0;
import p000.O90;

@Metadata(m22266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m22267d2 = {"Lru/ok/tracer/lite/TagsStorageLite;", "", "<init>", "()V", "", "rawKey", "rawValue", "LTf1;", "setKey", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "mutableTags", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getTags", "()Ljava/util/List;", "tags", "Companion", "tracer-lite-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TagsStorageLite {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ConcurrentHashMap<String, String> mutableTags = new ConcurrentHashMap<>();

    @Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m22267d2 = {"Lru/ok/tracer/lite/TagsStorageLite$Companion;", "", "()V", "get", "Lru/ok/tracer/lite/TagsStorageLite;", "tracer", "Lru/ok/tracer/lite/TracerLite;", "tracer-lite-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TagsStorageLite get(TracerLite tracer) {
            O90.m5968f(tracer, "tracer");
            return tracer.getTagsStorage();
        }

        private Companion() {
        }
    }

    public final List<String> getTags() {
        C10685pj0 c10685pj0M26272c = AbstractC7230yu.m26272c();
        synchronized (this.mutableTags) {
            for (Map.Entry<String, String> entry : this.mutableTags.entrySet()) {
                c10685pj0M26272c.add(entry.getKey() + '=' + entry.getValue());
            }
        }
        return AbstractC7230yu.m26271b(c10685pj0M26272c);
    }

    public final void setKey(String rawKey, String rawValue) {
        O90.m5968f(rawKey, "rawKey");
        String strM25349X = AbstractC11374v51.m25349X(31, rawKey);
        String strM25349X2 = rawValue != null ? AbstractC11374v51.m25349X(31, rawValue) : null;
        synchronized (this.mutableTags) {
            String strRemove = this.mutableTags.remove(strM25349X);
            if (strM25349X2 != null) {
                this.mutableTags.put(strM25349X, strM25349X2);
                if (strRemove == null && this.mutableTags.size() > 63) {
                    this.mutableTags.entrySet().iterator().remove();
                }
            }
        }
    }
}
