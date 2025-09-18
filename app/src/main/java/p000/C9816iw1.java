package p000;

/* renamed from: iw1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9816iw1 extends AbstractRunnableC7877Kv1 {

    /* renamed from: b */
    public final /* synthetic */ int f34809b;

    /* renamed from: c */
    public final /* synthetic */ Object f34810c;

    public /* synthetic */ C9816iw1(int i, Object obj) {
        this.f34809b = i;
        this.f34810c = obj;
    }

    @Override // p000.AbstractRunnableC7877Kv1
    /* renamed from: b */
    public final void mo4779b() {
        switch (this.f34809b) {
            case 0:
                C7463Cw1 c7463Cw1 = (C7463Cw1) this.f34810c;
                if (c7463Cw1.f1779m != null) {
                    c7463Cw1.f1768b.m409a("Unbind from service.", new Object[0]);
                    c7463Cw1.f1767a.unbindService(c7463Cw1.f1778l);
                    c7463Cw1.f1773g = false;
                    c7463Cw1.f1779m = null;
                    c7463Cw1.f1778l = null;
                }
                c7463Cw1.m1478b();
                break;
            default:
                ZY0 zy0 = (ZY0) this.f34810c;
                C7463Cw1 c7463Cw12 = (C7463Cw1) zy0.f14965b;
                c7463Cw12.f1768b.m409a("unlinkToDeath", new Object[0]);
                c7463Cw12.f1779m.asBinder().unlinkToDeath(c7463Cw12.f1776j, 0);
                C7463Cw1 c7463Cw13 = (C7463Cw1) zy0.f14965b;
                c7463Cw13.f1779m = null;
                c7463Cw13.f1773g = false;
                break;
        }
    }
}
