package p000;

/* loaded from: classes2.dex */
public final class K81 {

    /* renamed from: a */
    public final /* synthetic */ Q81 f5918a;

    public K81(Q81 q81) {
        this.f5918a = q81;
    }

    /* renamed from: a */
    public final void m4568a(Throwable th) {
        O90.m5968f(th, "error");
        Q81 q81 = this.f5918a;
        synchronized (q81) {
            if (q81.f9496c != null) {
                return;
            }
            q81.f9496c = new PS0(RQ1.m7015b(th));
            AbstractC8731aU1.m9752a(q81.f9494a, new C10115lG0(q81, th, 9));
            AbstractC8731aU1.m9752a(q81.f9495b, new C4027f1(q81, 14, th));
        }
    }

    /* renamed from: b */
    public final void m4569b(Object obj) {
        Q81 q81 = this.f5918a;
        synchronized (q81) {
            if (q81.f9496c != null) {
                return;
            }
            q81.f9496c = new PS0(obj);
            AbstractC8731aU1.m9752a(q81.f9494a, new C10115lG0(q81, obj, 8));
            AbstractC8731aU1.m9752a(q81.f9495b, new C4027f1(q81, 14, null));
        }
    }
}
