package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: Am1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0058Am1 {
    public final WeakReference a;
    public final int b;

    public C0058Am1(ClassLoader classLoader) {
        this.a = new WeakReference(classLoader);
        this.b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0058Am1) && this.a.get() == ((C0058Am1) obj).a.get();
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
