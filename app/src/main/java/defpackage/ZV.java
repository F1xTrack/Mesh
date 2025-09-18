package defpackage;

/* loaded from: classes2.dex */
public abstract class ZV {
    public static final WV A;
    public static final WV B;
    public static final WV C;
    public static final WV D;
    public static final WV E;
    public static final WV F;
    public static final WV G;
    public static final WV H;
    public static final WV I;
    public static final WV J;
    public static final WV K;
    public static final WV L;
    public static final WV M;
    public static final WV N;
    public static final WV a;
    public static final WV b;
    public static final WV c;
    public static final XV d;
    public static final XV e;
    public static final XV f;
    public static final WV g;
    public static final WV h;
    public static final WV i;
    public static final WV j;
    public static final WV k;
    public static final WV l;
    public static final WV m;
    public static final WV n;
    public static final WV o;
    public static final XV p;
    public static final WV q;
    public static final WV r;
    public static final WV s;
    public static final WV t;
    public static final WV u;
    public static final WV v;
    public static final WV w;
    public static final WV x;
    public static final WV y;
    public static final WV z;

    static {
        WV wvB = YV.b();
        a = wvB;
        b = YV.a(wvB);
        WV wvB2 = YV.b();
        c = wvB2;
        OF0[] of0ArrValues = OF0.values();
        int i2 = wvB2.a + wvB2.b;
        XV xv = new XV(i2, of0ArrValues);
        d = xv;
        EnumC5467kF0[] enumC5467kF0ArrValues = EnumC5467kF0.values();
        int i3 = i2 + xv.b;
        XV xv2 = new XV(i3, enumC5467kF0ArrValues);
        e = xv2;
        SE0[] se0ArrValues = SE0.values();
        int i4 = xv2.b;
        XV xv3 = new XV(i3 + i4, se0ArrValues);
        f = xv3;
        WV wvA = YV.a(xv3);
        g = wvA;
        WV wvA2 = YV.a(wvA);
        h = wvA2;
        WV wvA3 = YV.a(wvA2);
        i = wvA3;
        WV wvA4 = YV.a(wvA3);
        j = wvA4;
        WV wvA5 = YV.a(wvA4);
        k = wvA5;
        WV wvA6 = YV.a(wvA5);
        l = wvA6;
        m = YV.a(wvA6);
        WV wvA7 = YV.a(xv);
        n = wvA7;
        o = YV.a(wvA7);
        XV xv4 = new XV(i3 + i4, EnumC5276jF0.values());
        p = xv4;
        WV wvA8 = YV.a(xv4);
        q = wvA8;
        WV wvA9 = YV.a(wvA8);
        r = wvA9;
        WV wvA10 = YV.a(wvA9);
        s = wvA10;
        WV wvA11 = YV.a(wvA10);
        t = wvA11;
        WV wvA12 = YV.a(wvA11);
        u = wvA12;
        WV wvA13 = YV.a(wvA12);
        v = wvA13;
        WV wvA14 = YV.a(wvA13);
        w = wvA14;
        x = YV.a(wvA14);
        WV wvA15 = YV.a(xv4);
        y = wvA15;
        WV wvA16 = YV.a(wvA15);
        z = wvA16;
        WV wvA17 = YV.a(wvA16);
        A = wvA17;
        WV wvA18 = YV.a(wvA17);
        B = wvA18;
        WV wvA19 = YV.a(wvA18);
        C = wvA19;
        WV wvA20 = YV.a(wvA19);
        D = wvA20;
        WV wvA21 = YV.a(wvA20);
        E = wvA21;
        WV wvA22 = YV.a(wvA21);
        F = wvA22;
        G = YV.a(wvA22);
        WV wvA23 = YV.a(wvB2);
        H = wvA23;
        WV wvA24 = YV.a(wvA23);
        I = wvA24;
        J = YV.a(wvA24);
        WV wvA25 = YV.a(xv2);
        K = wvA25;
        WV wvA26 = YV.a(wvA25);
        L = wvA26;
        M = YV.a(wvA26);
        N = YV.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L2b
            if (r5 == r3) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L2f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ZV.a(int):void");
    }
}
