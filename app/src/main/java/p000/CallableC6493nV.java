package p000;

import java.util.concurrent.Callable;

/* renamed from: nV */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC6493nV implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f38351a;

    /* renamed from: b */
    public final /* synthetic */ C6621pV f38352b;

    public /* synthetic */ CallableC6493nV(C6621pV c6621pV, int i) {
        this.f38351a = i;
        this.f38352b = c6621pV;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f38351a) {
            case 0:
                C6621pV c6621pV = this.f38352b;
                c6621pV.f40118e.m26004b();
                c6621pV.f40117d.m26004b();
                c6621pV.f40119f.m26004b();
                C0877Nw c0877Nw = c6621pV.f40122i;
                synchronized (c0877Nw.f8137b) {
                    c0877Nw.f8136a.edit().clear().commit();
                }
                return null;
            default:
                return this.f38352b.m23807c();
        }
    }
}
