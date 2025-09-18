package p000;

/* loaded from: classes.dex */
public final class Y21 {

    /* renamed from: e */
    public static final int[] f14120e = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};

    /* renamed from: a */
    public final float f14121a;

    /* renamed from: b */
    public final float[] f14122b;

    /* renamed from: c */
    public int f14123c;

    /* renamed from: d */
    public boolean f14124d;

    public Y21(float f, float[] fArr) {
        this.f14121a = f;
        this.f14122b = fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m9207a(int r6) {
        /*
            r5 = this;
            r0 = 4
            if (r6 == r0) goto Lc
            r0 = 5
            if (r6 == r0) goto Lc
            switch(r6) {
                case 9: goto Lc;
                case 10: goto Lc;
                case 11: goto Lc;
                default: goto L9;
            }
        L9:
            float r0 = r5.f14121a
            goto Le
        Lc:
            r0 = 2143289344(0x7fc00000, float:NaN)
        Le:
            int r1 = r5.f14123c
            if (r1 != 0) goto L13
            return r0
        L13:
            int[] r2 = p000.Y21.f14120e
            r3 = r2[r6]
            r3 = r3 & r1
            float[] r4 = r5.f14122b
            if (r3 == 0) goto L1f
            r6 = r4[r6]
            return r6
        L1f:
            boolean r3 = r5.f14124d
            if (r3 == 0) goto L3e
            r3 = 1
            if (r6 == r3) goto L2b
            r3 = 3
            if (r6 == r3) goto L2b
            r6 = 6
            goto L2c
        L2b:
            r6 = 7
        L2c:
            r3 = r2[r6]
            r3 = r3 & r1
            if (r3 == 0) goto L34
            r6 = r4[r6]
            return r6
        L34:
            r6 = 8
            r2 = r2[r6]
            r1 = r1 & r2
            if (r1 == 0) goto L3e
            r6 = r4[r6]
            return r6
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.Y21.m9207a(int):float");
    }

    /* renamed from: b */
    public final void m9208b(float f, int i) {
        float[] fArr = this.f14122b;
        if (AbstractC9828j12.m21957a(fArr[i], f)) {
            return;
        }
        fArr[i] = f;
        boolean zM25735a = AbstractC11619x12.m25735a(f);
        int[] iArr = f14120e;
        int i2 = zM25735a ? this.f14123c & (~iArr[i]) : this.f14123c | iArr[i];
        this.f14123c = i2;
        this.f14124d = ((iArr[8] & i2) == 0 && (iArr[7] & i2) == 0 && (iArr[6] & i2) == 0 && (i2 & iArr[9]) == 0) ? false : true;
    }

    public Y21(float f) {
        this(f, new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN});
    }
}
