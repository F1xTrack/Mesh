package defpackage;

/* renamed from: sk0 */
/* loaded from: classes.dex */
public final class C7087sk0 extends AbstractC1611Uk1 {
    public static final C5714lY f = new C5714lY(1);
    public final C2443c31 d = new C2443c31();
    public boolean e = false;

    @Override // defpackage.AbstractC1611Uk1
    public final void b() {
        C2443c31 c2443c31 = this.d;
        int i = c2443c31.c;
        for (int i2 = 0; i2 < i; i2++) {
            C6896rk0 c6896rk0 = (C6896rk0) c2443c31.b[i2];
            C7509ux1 c7509ux1 = c6896rk0.l;
            c7509ux1.a();
            c7509ux1.d = true;
            C1135Oi c1135Oi = c6896rk0.n;
            if (c1135Oi != null) {
                c6896rk0.i(c1135Oi);
            }
            C6896rk0 c6896rk02 = c7509ux1.a;
            if (c6896rk02 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (c6896rk02 != c6896rk0) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            c7509ux1.a = null;
            if (c1135Oi != null) {
                boolean z = c1135Oi.b;
            }
            c7509ux1.e = true;
            c7509ux1.c = false;
            c7509ux1.d = false;
            c7509ux1.f = false;
            c7509ux1.g = false;
        }
        int i3 = c2443c31.c;
        Object[] objArr = c2443c31.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        c2443c31.c = 0;
    }
}
