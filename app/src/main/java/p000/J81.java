package p000;

/* loaded from: classes.dex */
public final class J81 implements InterfaceC1256Ty {

    /* renamed from: a */
    public final /* synthetic */ RunnableC1192Sx f5356a;

    public J81(RunnableC1192Sx runnableC1192Sx) {
        this.f5356a = runnableC1192Sx;
    }

    @Override // p000.InterfaceC1256Ty
    /* renamed from: a */
    public final Object mo2126a(N81 n81) {
        boolean z;
        synchronized (n81.f7527a) {
            z = n81.f7529c;
        }
        RunnableC1192Sx runnableC1192Sx = this.f5356a;
        if (z) {
            ((C10909rT0) runnableC1192Sx.f11081d).m24355e();
            return null;
        }
        if (n81.m5574g()) {
            ((C10909rT0) runnableC1192Sx.f11081d).m24356g(n81.m5571d());
            return null;
        }
        ((C10909rT0) runnableC1192Sx.f11081d).m24357i(n81.m5572e());
        return null;
    }
}
