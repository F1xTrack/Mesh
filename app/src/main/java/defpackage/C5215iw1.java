package defpackage;

/* renamed from: iw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5215iw1 extends AbstractRunnableC0865Kv1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C5215iw1(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.AbstractRunnableC0865Kv1
    public final void b() {
        switch (this.b) {
            case 0:
                C0244Cw1 c0244Cw1 = (C0244Cw1) this.c;
                if (c0244Cw1.m != null) {
                    c0244Cw1.b.a("Unbind from service.", new Object[0]);
                    c0244Cw1.a.unbindService(c0244Cw1.l);
                    c0244Cw1.g = false;
                    c0244Cw1.m = null;
                    c0244Cw1.l = null;
                }
                c0244Cw1.b();
                break;
            default:
                ZY0 zy0 = (ZY0) this.c;
                C0244Cw1 c0244Cw12 = (C0244Cw1) zy0.b;
                c0244Cw12.b.a("unlinkToDeath", new Object[0]);
                c0244Cw12.m.asBinder().unlinkToDeath(c0244Cw12.j, 0);
                C0244Cw1 c0244Cw13 = (C0244Cw1) zy0.b;
                c0244Cw13.m = null;
                c0244Cw13.g = false;
                break;
        }
    }
}
