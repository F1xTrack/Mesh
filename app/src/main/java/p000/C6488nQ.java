package p000;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* renamed from: nQ */
/* loaded from: classes.dex */
public final class C6488nQ implements Enumeration {

    /* renamed from: a */
    public final Enumeration f38307a;

    public C6488nQ(C6551oQ c6551oQ) {
        this.f38307a = Collections.enumeration(c6551oQ.f38994a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f38307a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.f38307a.nextElement());
    }
}
