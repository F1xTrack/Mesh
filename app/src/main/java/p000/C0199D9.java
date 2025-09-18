package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: D9 */
/* loaded from: classes.dex */
public final class C0199D9 extends AbstractC0325F9 {

    /* renamed from: c */
    public final long f1861c;

    /* renamed from: d */
    public final ArrayList f1862d;

    /* renamed from: e */
    public final ArrayList f1863e;

    public C0199D9(int i, long j) {
        super(i, 0);
        this.f1861c = j;
        this.f1862d = new ArrayList();
        this.f1863e = new ArrayList();
    }

    /* renamed from: t */
    public final C0199D9 m1563t(int i) {
        ArrayList arrayList = this.f1863e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0199D9 c0199d9 = (C0199D9) arrayList.get(i2);
            if (c0199d9.f3082b == i) {
                return c0199d9;
            }
        }
        return null;
    }

    @Override // p000.AbstractC0325F9
    public final String toString() {
        return AbstractC0325F9.m2496e(this.f3082b) + " leaves: " + Arrays.toString(this.f1862d.toArray()) + " containers: " + Arrays.toString(this.f1863e.toArray());
    }

    /* renamed from: u */
    public final C0262E9 m1564u(int i) {
        ArrayList arrayList = this.f1862d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0262E9 c0262e9 = (C0262E9) arrayList.get(i2);
            if (c0262e9.f3082b == i) {
                return c0262e9;
            }
        }
        return null;
    }
}
