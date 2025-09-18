package defpackage;

import java.util.concurrent.Callable;

/* renamed from: nV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC6087nV implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C6469pV b;

    public /* synthetic */ CallableC6087nV(C6469pV c6469pV, int i) {
        this.a = i;
        this.b = c6469pV;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                C6469pV c6469pV = this.b;
                c6469pV.e.b();
                c6469pV.d.b();
                c6469pV.f.b();
                C1099Nw c1099Nw = c6469pV.i;
                synchronized (c1099Nw.b) {
                    c1099Nw.a.edit().clear().commit();
                }
                return null;
            default:
                return this.b.c();
        }
    }
}
