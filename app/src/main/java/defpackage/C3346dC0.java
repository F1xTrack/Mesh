package defpackage;

import android.util.SparseIntArray;

/* renamed from: dC0 */
/* loaded from: classes.dex */
public final class C3346dC0 {
    public final C3536eC0 a;
    public final C0474Fv0 b;
    public final C3536eC0 c;
    public final C0396Ev0 d;
    public final C3536eC0 e;
    public final C0474Fv0 f;
    public final C3536eC0 g;
    public final C0474Fv0 h;
    public final String i;
    public final int j;

    public C3346dC0(C7532v32 c7532v32) {
        AbstractC4368iZ.b();
        this.a = RE.a();
        this.b = C0474Fv0.u();
        int i = AbstractC7946xF.a;
        int i2 = i * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i3 = 131072; i3 <= 4194304; i3 *= 2) {
            sparseIntArray.put(i3, i);
        }
        this.c = new C3536eC0(4194304, i2, sparseIntArray, AbstractC7946xF.a);
        this.d = C0396Ev0.i();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i4 = iMin < 16777216 ? 3145728 : iMin < 33554432 ? 6291456 : 12582912;
        int iMin2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.e = new C3536eC0(i4, iMin2 < 16777216 ? iMin2 / 2 : (iMin2 / 4) * 3, sparseIntArray2, -1);
        this.f = C0474Fv0.u();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.g = new C3536eC0(81920, 1048576, sparseIntArray3, -1);
        this.h = C0474Fv0.u();
        this.i = "legacy";
        this.j = 4194304;
        AbstractC4368iZ.b();
    }
}
