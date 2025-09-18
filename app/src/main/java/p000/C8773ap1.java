package p000;

import java.util.HashMap;
import java.util.Objects;

/* renamed from: ap1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8773ap1 {

    /* renamed from: a */
    public final C8342Tu0 f16608a;

    /* renamed from: b */
    public final HashMap f16609b = new HashMap();

    /* renamed from: c */
    public final HashMap f16610c = new HashMap();

    /* renamed from: d */
    public final Object f16611d = new Object();

    static {
        C1210TE.m7637M("WorkTimer");
    }

    public C8773ap1(C8342Tu0 c8342Tu0) {
        this.f16608a = c8342Tu0;
    }

    /* renamed from: a */
    public final void m10341a(C7551Eo1 c7551Eo1) {
        synchronized (this.f16611d) {
            try {
                if (((RunnableC8643Zo1) this.f16609b.remove(c7551Eo1)) != null) {
                    C1210TE c1210teM7634G = C1210TE.m7634G();
                    Objects.toString(c7551Eo1);
                    c1210teM7634G.getClass();
                    this.f16610c.remove(c7551Eo1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
