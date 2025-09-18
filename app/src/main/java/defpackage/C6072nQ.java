package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: nQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6072nQ implements Enumeration {
    public final Enumeration a;

    public C6072nQ(C6263oQ c6263oQ) {
        this.a = Collections.enumeration(c6263oQ.a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.a.nextElement());
    }
}
