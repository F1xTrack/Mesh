package defpackage;

/* renamed from: sG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6998sG1 implements WG1 {
    public final WG1[] a;

    public C6998sG1(WG1... wg1Arr) {
        this.a = wg1Arr;
    }

    @Override // defpackage.WG1
    public final NH1 b(Class cls) {
        for (int i = 0; i < 2; i++) {
            WG1 wg1 = this.a[i];
            if (wg1.d(cls)) {
                return wg1.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.WG1
    public final boolean d(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].d(cls)) {
                return true;
            }
        }
        return false;
    }
}
