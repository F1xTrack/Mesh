package p000;

/* renamed from: Ys */
/* loaded from: classes.dex */
public final class C1565Ys implements InterfaceC9979kC0 {

    /* renamed from: b */
    public int f14563b = 0;

    /* renamed from: a */
    public final Object[] f14562a = new Object[1024];

    /* renamed from: a */
    public final synchronized void m9387a() {
        for (int i = 0; i < this.f14563b; i++) {
            try {
                this.f14562a[i] = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14563b = 0;
    }

    @Override // p000.InterfaceC9979kC0
    /* renamed from: d */
    public final synchronized boolean mo4580d(Object obj) {
        int i = this.f14563b;
        Object[] objArr = this.f14562a;
        if (i == objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.f14563b = i + 1;
        return true;
    }

    @Override // p000.InterfaceC9979kC0
    /* renamed from: i */
    public final synchronized Object mo4581i() {
        int i = this.f14563b;
        if (i == 0) {
            return null;
        }
        int i2 = i - 1;
        this.f14563b = i2;
        Object[] objArr = this.f14562a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }
}
