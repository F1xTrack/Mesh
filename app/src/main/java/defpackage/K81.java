package defpackage;

/* loaded from: classes2.dex */
public final class K81 {
    public final /* synthetic */ Q81 a;

    public K81(Q81 q81) {
        this.a = q81;
    }

    public final void a(Throwable th) {
        O90.f(th, "error");
        Q81 q81 = this.a;
        synchronized (q81) {
            if (q81.c != null) {
                return;
            }
            q81.c = new PS0(RQ1.b(th));
            AbstractC2144aU1.a(q81.a, new C5661lG0(q81, th, 9));
            AbstractC2144aU1.a(q81.b, new C3690f1(q81, 14, th));
        }
    }

    public final void b(Object obj) {
        Q81 q81 = this.a;
        synchronized (q81) {
            if (q81.c != null) {
                return;
            }
            q81.c = new PS0(obj);
            AbstractC2144aU1.a(q81.a, new C5661lG0(q81, obj, 8));
            AbstractC2144aU1.a(q81.b, new C3690f1(q81, 14, null));
        }
    }
}
