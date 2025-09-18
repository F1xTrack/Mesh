package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class C40 {

    /* renamed from: a */
    public String f1169a;

    /* renamed from: d */
    public String f1172d;

    /* renamed from: f */
    public final ArrayList f1174f;

    /* renamed from: g */
    public ArrayList f1175g;

    /* renamed from: h */
    public String f1176h;

    /* renamed from: b */
    public String f1170b = "";

    /* renamed from: c */
    public String f1171c = "";

    /* renamed from: e */
    public int f1173e = -1;

    public C40() {
        ArrayList arrayList = new ArrayList();
        this.f1174f = arrayList;
        arrayList.add("");
    }

    /* renamed from: a */
    public final void m968a(String str) {
        m975h(str, 0, str.length(), false, false);
    }

    /* renamed from: b */
    public final void m969b(String str) {
        int i = 0;
        do {
            int iM1277f = AbstractC7433Ch1.m1277f(i, str, str.length(), "/\\");
            m975h(str, i, iM1277f, iM1277f < str.length(), false);
            i = iM1277f + 1;
        } while (i <= str.length());
    }

    /* renamed from: c */
    public final D40 m970c() {
        ArrayList arrayList;
        String str = this.f1169a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strM378H = C7356Av0.m378H(this.f1170b, 0, false, 0, 7);
        String strM378H2 = C7356Av0.m378H(this.f1171c, 0, false, 0, 7);
        String str2 = this.f1172d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iM971d = m971d();
        ArrayList arrayList2 = this.f1174f;
        ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C7356Av0.m378H((String) it.next(), 0, false, 0, 7));
        }
        ArrayList<String> arrayList4 = this.f1175g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC7293zu.m26586k(arrayList4));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? C7356Av0.m378H(str3, 0, true, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f1176h;
        return new D40(str, strM378H, strM378H2, str2, iM971d, arrayList3, arrayList, str4 != null ? C7356Av0.m378H(str4, 0, false, 0, 7) : null, toString());
    }

    /* renamed from: d */
    public final int m971d() {
        int i = this.f1173e;
        if (i != -1) {
            return i;
        }
        String str = this.f1169a;
        O90.m5965c(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: e */
    public final void m972e(String str) {
        O90.m5968f(str, "host");
        String strM5214b = M12.m5214b(C7356Av0.m378H(str, 0, false, 0, 7));
        if (strM5214b == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        this.f1172d = strM5214b;
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x013e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m973f(p000.D40 r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C40.m973f(D40, java.lang.String):void");
    }

    /* renamed from: g */
    public final void m974g(int i) {
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "unexpected port: ").toString());
        }
        this.f1173e = i;
    }

    /* renamed from: h */
    public final void m975h(String str, int i, int i2, boolean z, boolean z2) {
        String strM381v = C7356Av0.m381v(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, 240);
        if (strM381v.equals(".") || strM381v.equalsIgnoreCase("%2e")) {
            return;
        }
        boolean zEquals = strM381v.equals("..");
        ArrayList arrayList = this.f1174f;
        if (zEquals || strM381v.equalsIgnoreCase("%2e.") || strM381v.equalsIgnoreCase(".%2e") || strM381v.equalsIgnoreCase("%2e%2e")) {
            if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                arrayList.add("");
                return;
            } else {
                arrayList.set(arrayList.size() - 1, "");
                return;
            }
        }
        if (((CharSequence) AbstractC7222ym.m26228e(1, arrayList)).length() == 0) {
            arrayList.set(arrayList.size() - 1, strM381v);
        } else {
            arrayList.add(strM381v);
        }
        if (z) {
            arrayList.add("");
        }
    }

    /* renamed from: i */
    public final void m976i(String str) {
        O90.m5968f(str, "scheme");
        if (str.equalsIgnoreCase("http")) {
            this.f1169a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.f1169a = "https";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.f1169a
            if (r1 == 0) goto L12
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L17
        L12:
            java.lang.String r1 = "//"
            r0.append(r1)
        L17:
            java.lang.String r1 = r6.f1170b
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L22
            goto L2a
        L22:
            java.lang.String r1 = r6.f1171c
            int r1 = r1.length()
            if (r1 <= 0) goto L44
        L2a:
            java.lang.String r1 = r6.f1170b
            r0.append(r1)
            java.lang.String r1 = r6.f1171c
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            r0.append(r2)
            java.lang.String r1 = r6.f1171c
            r0.append(r1)
        L3f:
            r1 = 64
            r0.append(r1)
        L44:
            java.lang.String r1 = r6.f1172d
            if (r1 == 0) goto L63
            boolean r1 = p000.AbstractC11374v51.m25352q(r1, r2)
            if (r1 == 0) goto L5e
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r6.f1172d
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L63
        L5e:
            java.lang.String r1 = r6.f1172d
            r0.append(r1)
        L63:
            int r1 = r6.f1173e
            r3 = -1
            if (r1 != r3) goto L6c
            java.lang.String r1 = r6.f1169a
            if (r1 == 0) goto L91
        L6c:
            int r1 = r6.m971d()
            java.lang.String r4 = r6.f1169a
            if (r4 == 0) goto L8b
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L7f
            r3 = 80
            goto L89
        L7f:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L89
            r3 = 443(0x1bb, float:6.21E-43)
        L89:
            if (r1 == r3) goto L91
        L8b:
            r0.append(r2)
            r0.append(r1)
        L91:
            java.util.ArrayList r1 = r6.f1174f
            java.lang.String r2 = "<this>"
            p000.O90.m5968f(r1, r2)
            int r2 = r1.size()
            r3 = 0
        L9d:
            if (r3 >= r2) goto Lb0
            r4 = 47
            r0.append(r4)
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            int r3 = r3 + 1
            goto L9d
        Lb0:
            java.util.ArrayList r1 = r6.f1175g
            if (r1 == 0) goto Lc1
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r6.f1175g
            p000.O90.m5965c(r1)
            p000.C7356Av0.m380J(r1, r0)
        Lc1:
            java.lang.String r1 = r6.f1176h
            if (r1 == 0) goto Lcf
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r6.f1176h
            r0.append(r1)
        Lcf:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            p000.O90.m5967e(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C40.toString():java.lang.String");
    }
}
