package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kc */
/* loaded from: classes2.dex */
public final class C4669kc {
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final io.appmetrica.analytics.impl.C4977x9 a(io.appmetrica.analytics.impl.C4669kc r5, io.appmetrica.analytics.impl.G9 r6, java.util.Map r7) {
        /*
            r5.getClass()
            io.appmetrica.analytics.impl.x9 r5 = new io.appmetrica.analytics.impl.x9
            r5.<init>()
            int r6 = r6.ordinal()
            switch(r6) {
                case 0: goto L21;
                case 1: goto L1f;
                case 2: goto L1d;
                case 3: goto L1b;
                case 4: goto L19;
                case 5: goto L17;
                case 6: goto L15;
                default: goto Lf;
            }
        Lf:
            sg r5 = new sg
            r5.<init>()
            throw r5
        L15:
            r6 = 6
            goto L22
        L17:
            r6 = 5
            goto L22
        L19:
            r6 = 4
            goto L22
        L1b:
            r6 = 3
            goto L22
        L1d:
            r6 = 2
            goto L22
        L1f:
            r6 = 1
            goto L22
        L21:
            r6 = 0
        L22:
            r5.a = r6
            io.appmetrica.analytics.impl.kc r6 = io.appmetrica.analytics.impl.C4693lc.b
            r6.getClass()
            java.util.Set r6 = r7.entrySet()
            int r7 = defpackage.AbstractC8449zu.k(r6)
            int r7 = defpackage.AbstractC7287tn0.b(r7)
            r0 = 16
            if (r7 >= r0) goto L3a
            r7 = r0
        L3a:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r7)
            java.util.Iterator r6 = r6.iterator()
        L43:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L86
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r1 = r7.getKey()
            java.lang.Object r2 = r7.getValue()
            boolean r2 = r2 instanceof java.lang.Number
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r7.getValue()
            if (r2 == 0) goto L76
            java.lang.Number r2 = (java.lang.Number) r2
            double r2 = r2.doubleValue()
            boolean r4 = java.lang.Double.isInfinite(r2)
            if (r4 != 0) goto L74
            boolean r2 = java.lang.Double.isNaN(r2)
            if (r2 != 0) goto L74
            goto L7e
        L74:
            r7 = 0
            goto L82
        L76:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Number"
            r5.<init>(r6)
            throw r5
        L7e:
            java.lang.Object r7 = r7.getValue()
        L82:
            r0.put(r1, r7)
            goto L43
        L86:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>(r0)
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L99
            java.nio.charset.Charset r7 = defpackage.AbstractC7680vr.a
            byte[] r6 = r6.getBytes(r7)
            r5.b = r6
        L99:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4669kc.a(io.appmetrica.analytics.impl.kc, io.appmetrica.analytics.impl.G9, java.util.Map):io.appmetrica.analytics.impl.x9");
    }
}
