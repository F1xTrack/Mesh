package p000;

import java.lang.ref.WeakReference;

/* renamed from: Am1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7339Am1 {

    /* renamed from: a */
    public final WeakReference f367a;

    /* renamed from: b */
    public final int f368b;

    public C7339Am1(ClassLoader classLoader) {
        this.f367a = new WeakReference(classLoader);
        this.f368b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7339Am1) && this.f367a.get() == ((C7339Am1) obj).f367a.get();
    }

    public final int hashCode() {
        return this.f368b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f367a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
