package defpackage;

/* renamed from: vz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7705vz0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final C1475Sr0 e;

    public C7705vz0(String str, String str2, String str3, String str4, C1475Sr0 c1475Sr0) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = c1475Sr0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<vz0> r2 = defpackage.C7705vz0.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            java.lang.String r1 = "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.data.dto.RemoteMetricsEventDto"
            defpackage.O90.d(r5, r1)
            vz0 r5 = (defpackage.C7705vz0) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.O90.a(r1, r3)
            if (r1 != 0) goto L28
            return r2
        L28:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.O90.a(r1, r3)
            if (r1 != 0) goto L33
            return r2
        L33:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = defpackage.O90.a(r1, r3)
            if (r1 != 0) goto L3e
            return r2
        L3e:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            if (r1 != 0) goto L48
            if (r3 != 0) goto L4a
            r1 = r0
            goto L50
        L48:
            if (r3 != 0) goto L4c
        L4a:
            r1 = r2
            goto L50
        L4c:
            boolean r1 = r1.equals(r3)
        L50:
            if (r1 != 0) goto L53
            return r2
        L53:
            Sr0 r1 = r4.e
            Sr0 r5 = r5.e
            boolean r5 = defpackage.O90.a(r1, r5)
            if (r5 != 0) goto L5e
            return r2
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7705vz0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iE = AbstractC1705Vq.e(AbstractC1705Vq.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        C5397jt1 c5397jt1 = str != null ? new C5397jt1(str) : null;
        return this.e.hashCode() + ((iE + (c5397jt1 != null ? c5397jt1.a.hashCode() : 0)) * 31);
    }
}
