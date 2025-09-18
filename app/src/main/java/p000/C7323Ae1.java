package p000;

/* renamed from: Ae1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7323Ae1 extends AbstractC0522IH {

    /* renamed from: b */
    public final String f300b;

    public C7323Ae1(String str) {
        this.f300b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m248i0(int r9) {
        /*
            r0 = 4
            r1 = 1
            if (r9 == r1) goto L9
            if (r9 == r0) goto L9
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lb
        L9:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lb:
            r3 = 3
            r4 = 2
            if (r9 == r1) goto L13
            if (r9 == r0) goto L13
            r5 = r3
            goto L14
        L13:
            r5 = r4
        L14:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
            r7 = 0
            if (r9 == r1) goto L30
            if (r9 == r4) goto L2b
            if (r9 == r3) goto L26
            if (r9 == r0) goto L30
            java.lang.String r8 = "newAttributes"
            r5[r7] = r8
            goto L32
        L26:
            java.lang.String r8 = "kotlinTypeRefiner"
            r5[r7] = r8
            goto L32
        L2b:
            java.lang.String r8 = "delegate"
            r5[r7] = r8
            goto L32
        L30:
            r5[r7] = r6
        L32:
            java.lang.String r7 = "refine"
            if (r9 == r1) goto L3e
            if (r9 == r0) goto L3b
            r5[r1] = r6
            goto L42
        L3b:
            r5[r1] = r7
            goto L42
        L3e:
            java.lang.String r6 = "toString"
            r5[r1] = r6
        L42:
            if (r9 == r1) goto L56
            if (r9 == r4) goto L52
            if (r9 == r3) goto L4f
            if (r9 == r0) goto L56
            java.lang.String r3 = "replaceAttributes"
            r5[r4] = r3
            goto L56
        L4f:
            r5[r4] = r7
            goto L56
        L52:
            java.lang.String r3 = "replaceDelegate"
            r5[r4] = r3
        L56:
            java.lang.String r2 = java.lang.String.format(r2, r5)
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7323Ae1.m248i0(int):void");
    }

    @Override // p000.AbstractC0522IH, p000.AbstractC7742Ig0
    /* renamed from: I */
    public final AbstractC7742Ig0 mo251R(C8054Og0 c8054Og0) {
        if (c8054Og0 != null) {
            return this;
        }
        m248i0(3);
        throw null;
    }

    @Override // p000.X01, p000.AbstractC8315Tg1
    /* renamed from: P */
    public final /* bridge */ /* synthetic */ AbstractC8315Tg1 mo250P(boolean z) {
        mo250P(z);
        throw null;
    }

    @Override // p000.AbstractC0522IH, p000.AbstractC8315Tg1
    /* renamed from: R */
    public final AbstractC8315Tg1 mo249I(C8054Og0 c8054Og0) {
        if (c8054Og0 != null) {
            return this;
        }
        m248i0(3);
        throw null;
    }

    @Override // p000.X01, p000.AbstractC8315Tg1
    /* renamed from: T */
    public final /* bridge */ /* synthetic */ AbstractC8315Tg1 mo252T(C7789Jd1 c7789Jd1) {
        mo252T(c7789Jd1);
        throw null;
    }

    @Override // p000.X01
    /* renamed from: U */
    public final X01 mo250P(boolean z) {
        throw new IllegalStateException(this.f300b);
    }

    @Override // p000.X01
    /* renamed from: a0 */
    public final X01 mo252T(C7789Jd1 c7789Jd1) {
        if (c7789Jd1 != null) {
            throw new IllegalStateException(this.f300b);
        }
        m248i0(0);
        throw null;
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: b0 */
    public final X01 mo255b0() {
        throw new IllegalStateException(this.f300b);
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: e0 */
    public final X01 mo249I(C8054Og0 c8054Og0) {
        if (c8054Og0 != null) {
            return this;
        }
        m248i0(3);
        throw null;
    }

    @Override // p000.AbstractC0522IH
    /* renamed from: h0 */
    public final AbstractC0522IH mo257h0(X01 x01) {
        throw new IllegalStateException(this.f300b);
    }

    @Override // p000.X01
    public final String toString() {
        String str = this.f300b;
        if (str != null) {
            return str;
        }
        m248i0(1);
        throw null;
    }
}
