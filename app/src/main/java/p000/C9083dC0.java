package p000;

import android.util.SparseIntArray;

/* renamed from: dC0 */
/* loaded from: classes.dex */
public final class C9083dC0 {

    /* renamed from: a */
    public final C9211eC0 f25857a;

    /* renamed from: b */
    public final C7616Fv0 f25858b;

    /* renamed from: c */
    public final C9211eC0 f25859c;

    /* renamed from: d */
    public final C7564Ev0 f25860d;

    /* renamed from: e */
    public final C9211eC0 f25861e;

    /* renamed from: f */
    public final C7616Fv0 f25862f;

    /* renamed from: g */
    public final C9211eC0 f25863g;

    /* renamed from: h */
    public final C7616Fv0 f25864h;

    /* renamed from: i */
    public final String f25865i;

    /* renamed from: j */
    public final int f25866j;

    public C9083dC0(C11370v32 c11370v32) {
        AbstractC4250iZ.m19063b();
        this.f25857a = AbstractC1084RE.m6923a();
        this.f25858b = C7616Fv0.m2825u();
        int i = AbstractC7126xF.f45493a;
        int i2 = i * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i3 = 131072; i3 <= 4194304; i3 *= 2) {
            sparseIntArray.put(i3, i);
        }
        this.f25859c = new C9211eC0(4194304, i2, sparseIntArray, AbstractC7126xF.f45493a);
        this.f25860d = C7564Ev0.m2448i();
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
        this.f25861e = new C9211eC0(i4, iMin2 < 16777216 ? iMin2 / 2 : (iMin2 / 4) * 3, sparseIntArray2, -1);
        this.f25862f = C7616Fv0.m2825u();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.f25863g = new C9211eC0(81920, 1048576, sparseIntArray3, -1);
        this.f25864h = C7616Fv0.m2825u();
        this.f25865i = "legacy";
        this.f25866j = 4194304;
        AbstractC4250iZ.m19063b();
    }
}
