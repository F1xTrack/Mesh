package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: Gt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546Gt0 {
    public final Map a;
    public final AtomicBoolean b;

    public C0546Gt0(Map map, boolean z) {
        O90.f(map, "preferencesMap");
        this.a = map;
        this.b = new AtomicBoolean(z);
    }

    public final Map a() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.a);
        O90.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    public final Object b(LC0 lc0) {
        O90.f(lc0, "key");
        return this.a.get(lc0);
    }

    public final void c(LC0 lc0) {
        O90.f(lc0, "key");
        if (this.b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        this.a.remove(lc0);
    }

    public final void d(LC0 lc0, Object obj) {
        O90.f(lc0, "key");
        if (this.b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
        if (obj == null) {
            c(lc0);
            return;
        }
        boolean z = obj instanceof Set;
        Map map = this.a;
        if (!z) {
            map.put(lc0, obj);
            return;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(AbstractC8069xu.g0((Iterable) obj));
        O90.e(setUnmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(lc0, setUnmodifiableSet);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0546Gt0)) {
            return false;
        }
        return O90.a(this.a, ((C0546Gt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC8069xu.H(this.a.entrySet(), ",\n", "{\n", "\n}", C3808fd0.p, 24);
    }

    public /* synthetic */ C0546Gt0(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
