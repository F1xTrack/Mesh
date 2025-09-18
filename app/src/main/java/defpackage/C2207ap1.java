package defpackage;

import java.util.HashMap;
import java.util.Objects;

/* renamed from: ap1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2207ap1 {
    public final C1562Tu0 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    static {
        TE.M("WorkTimer");
    }

    public C2207ap1(C1562Tu0 c1562Tu0) {
        this.a = c1562Tu0;
    }

    public final void a(C0376Eo1 c0376Eo1) {
        synchronized (this.d) {
            try {
                if (((RunnableC2013Zo1) this.b.remove(c0376Eo1)) != null) {
                    TE teG = TE.G();
                    Objects.toString(c0376Eo1);
                    teG.getClass();
                    this.c.remove(c0376Eo1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
