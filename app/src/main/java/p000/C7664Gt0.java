package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Gt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7664Gt0 {

    /* renamed from: a */
    public final Map f3944a;

    /* renamed from: b */
    public final AtomicBoolean f3945b;

    public C7664Gt0(Map map, boolean z) {
        O90.m5968f(map, "preferencesMap");
        this.f3944a = map;
        this.f3945b = new AtomicBoolean(z);
    }

    /* renamed from: a */
    public final Map m3185a() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f3944a);
        O90.m5967e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    /* renamed from: b */
    public final Object m3186b(LC0 lc0) {
        O90.m5968f(lc0, "key");
        return this.f3944a.get(lc0);
    }

    /* renamed from: c */
    public final void m3187c(LC0 lc0) {
        O90.m5968f(lc0, "key");
        if (this.f3945b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        this.f3944a.remove(lc0);
    }

    /* renamed from: d */
    public final void m3188d(LC0 lc0, Object obj) {
        O90.m5968f(lc0, "key");
        if (this.f3945b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        if (obj == null) {
            m3187c(lc0);
            return;
        }
        boolean z = obj instanceof Set;
        Map map = this.f3944a;
        if (!z) {
            map.put(lc0, obj);
            return;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(AbstractC7167xu.m25987g0((Iterable) obj));
        O90.m5967e(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(lc0, setUnmodifiableSet);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7664Gt0)) {
            return false;
        }
        return O90.m5963a(this.f3944a, ((C7664Gt0) obj).f3944a);
    }

    public final int hashCode() {
        return this.f3944a.hashCode();
    }

    public final String toString() {
        return AbstractC7167xu.m25962H(this.f3944a.entrySet(), ",\n", "{\n", "\n}", C9393fd0.f27290p, 24);
    }

    public /* synthetic */ C7664Gt0(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
