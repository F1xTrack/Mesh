package p000;

/* renamed from: sG1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11012sG1 implements WG1 {

    /* renamed from: a */
    public final WG1[] f42351a;

    public C11012sG1(WG1... wg1Arr) {
        this.f42351a = wg1Arr;
    }

    @Override // p000.WG1
    /* renamed from: b */
    public final NH1 mo8738b(Class cls) {
        for (int i = 0; i < 2; i++) {
            WG1 wg1 = this.f42351a[i];
            if (wg1.mo8739d(cls)) {
                return wg1.mo8738b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.WG1
    /* renamed from: d */
    public final boolean mo8739d(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.f42351a[i].mo8739d(cls)) {
                return true;
            }
        }
        return false;
    }
}
