package p000;

/* renamed from: vz0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11485vz0 {

    /* renamed from: a */
    public final String f44623a;

    /* renamed from: b */
    public final String f44624b;

    /* renamed from: c */
    public final String f44625c;

    /* renamed from: d */
    public final String f44626d;

    /* renamed from: e */
    public final C8284Sr0 f44627e;

    public C11485vz0(String str, String str2, String str3, String str4, C8284Sr0 c8284Sr0) {
        this.f44623a = str;
        this.f44624b = str2;
        this.f44625c = str3;
        this.f44626d = str4;
        this.f44627e = c8284Sr0;
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
            java.lang.Class<vz0> r2 = p000.C11485vz0.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            java.lang.String r1 = "null cannot be cast to non-null type ru.rustore.sdk.metrics.internal.data.dto.RemoteMetricsEventDto"
            p000.O90.m5966d(r5, r1)
            vz0 r5 = (p000.C11485vz0) r5
            java.lang.String r1 = r4.f44623a
            java.lang.String r3 = r5.f44623a
            boolean r1 = p000.O90.m5963a(r1, r3)
            if (r1 != 0) goto L28
            return r2
        L28:
            java.lang.String r1 = r4.f44624b
            java.lang.String r3 = r5.f44624b
            boolean r1 = p000.O90.m5963a(r1, r3)
            if (r1 != 0) goto L33
            return r2
        L33:
            java.lang.String r1 = r4.f44625c
            java.lang.String r3 = r5.f44625c
            boolean r1 = p000.O90.m5963a(r1, r3)
            if (r1 != 0) goto L3e
            return r2
        L3e:
            java.lang.String r1 = r4.f44626d
            java.lang.String r3 = r5.f44626d
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
            Sr0 r1 = r4.f44627e
            Sr0 r5 = r5.f44627e
            boolean r5 = p000.O90.m5963a(r1, r5)
            if (r5 != 0) goto L5e
            return r2
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11485vz0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iM8586e = AbstractC1374Vq.m8586e(AbstractC1374Vq.m8586e(this.f44623a.hashCode() * 31, 31, this.f44624b), 31, this.f44625c);
        String str = this.f44626d;
        C9938jt1 c9938jt1 = str != null ? new C9938jt1(str) : null;
        return this.f44627e.hashCode() + ((iM8586e + (c9938jt1 != null ? c9938jt1.f35445a.hashCode() : 0)) * 31);
    }
}
