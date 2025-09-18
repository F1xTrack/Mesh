package defpackage;

/* loaded from: classes.dex */
public final class WV1 extends AbstractRunnableC5501kQ1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ WV1(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.AbstractRunnableC5501kQ1
    public final void a() {
        switch (this.b) {
            case 0:
                C7524v12 c7524v12 = (C7524v12) this.c;
                if (c7524v12.m != null) {
                    c7524v12.b.q("Unbind from service.", new Object[0]);
                    c7524v12.a.unbindService(c7524v12.l);
                    c7524v12.g = false;
                    c7524v12.m = null;
                    c7524v12.l = null;
                }
                c7524v12.b();
                break;
            default:
                ZY0 zy0 = (ZY0) this.c;
                C7524v12 c7524v122 = (C7524v12) zy0.b;
                c7524v122.b.q("unlinkToDeath", new Object[0]);
                c7524v122.m.asBinder().unlinkToDeath(c7524v122.j, 0);
                C7524v12 c7524v123 = (C7524v12) zy0.b;
                c7524v123.m = null;
                c7524v123.g = false;
                break;
        }
    }
}
