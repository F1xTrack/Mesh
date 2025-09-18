package p000;

/* renamed from: sk0 */
/* loaded from: classes.dex */
public final class C11071sk0 extends AbstractC8375Uk1 {

    /* renamed from: f */
    public static final C6370lY f42581f = new C6370lY(1);

    /* renamed from: d */
    public final C8932c31 f42582d = new C8932c31();

    /* renamed from: e */
    public boolean f42583e = false;

    @Override // p000.AbstractC8375Uk1
    /* renamed from: b */
    public final void mo8138b() {
        C8932c31 c8932c31 = this.f42582d;
        int i = c8932c31.f17276c;
        for (int i2 = 0; i2 < i; i2++) {
            C10943rk0 c10943rk0 = (C10943rk0) c8932c31.f17275b[i2];
            C11354ux1 c11354ux1 = c10943rk0.f41839l;
            c11354ux1.m24163a();
            c11354ux1.f41359d = true;
            C0926Oi c0926Oi = c10943rk0.f41841n;
            if (c0926Oi != null) {
                c10943rk0.mo10135i(c0926Oi);
            }
            C10943rk0 c10943rk02 = c11354ux1.f41356a;
            if (c10943rk02 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (c10943rk02 != c10943rk0) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            c11354ux1.f41356a = null;
            if (c0926Oi != null) {
                boolean z = c0926Oi.f8575b;
            }
            c11354ux1.f41360e = true;
            c11354ux1.f41358c = false;
            c11354ux1.f41359d = false;
            c11354ux1.f41361f = false;
            c11354ux1.f41362g = false;
        }
        int i3 = c8932c31.f17276c;
        Object[] objArr = c8932c31.f17275b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        c8932c31.f17276c = 0;
    }
}
