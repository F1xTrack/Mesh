package p000;

/* loaded from: classes.dex */
public final class WV1 extends AbstractRunnableC10008kQ1 {

    /* renamed from: b */
    public final /* synthetic */ int f13219b;

    /* renamed from: c */
    public final /* synthetic */ Object f13220c;

    public /* synthetic */ WV1(int i, Object obj) {
        this.f13219b = i;
        this.f13220c = obj;
    }

    @Override // p000.AbstractRunnableC10008kQ1
    /* renamed from: a */
    public final void mo8800a() {
        switch (this.f13219b) {
            case 0:
                C11364v12 c11364v12 = (C11364v12) this.f13220c;
                if (c11364v12.f44104m != null) {
                    c11364v12.f44093b.m24361q("Unbind from service.", new Object[0]);
                    c11364v12.f44092a.unbindService(c11364v12.f44103l);
                    c11364v12.f44098g = false;
                    c11364v12.f44104m = null;
                    c11364v12.f44103l = null;
                }
                c11364v12.m25307b();
                break;
            default:
                ZY0 zy0 = (ZY0) this.f13220c;
                C11364v12 c11364v122 = (C11364v12) zy0.f14965b;
                c11364v122.f44093b.m24361q("unlinkToDeath", new Object[0]);
                c11364v122.f44104m.asBinder().unlinkToDeath(c11364v122.f44101j, 0);
                C11364v12 c11364v123 = (C11364v12) zy0.f14965b;
                c11364v123.f44104m = null;
                c11364v123.f44098g = false;
                break;
        }
    }
}
