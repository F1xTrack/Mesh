package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class C40 {
    public String a;
    public String d;
    public final ArrayList f;
    public ArrayList g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;

    public C40() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    public final void a(String str) {
        h(str, 0, str.length(), false, false);
    }

    public final void b(String str) {
        int i = 0;
        do {
            int iF = AbstractC0199Ch1.f(i, str, str.length(), "/\\");
            h(str, i, iF, iF < str.length(), false);
            i = iF + 1;
        } while (i <= str.length());
    }

    public final D40 c() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strH = C0084Av0.H(this.b, 0, false, 0, 7);
        String strH2 = C0084Av0.H(this.c, 0, false, 0, 7);
        String str2 = this.d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iD = d();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(C0084Av0.H((String) it.next(), 0, false, 0, 7));
        }
        ArrayList<String> arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(AbstractC8449zu.k(arrayList4));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? C0084Av0.H(str3, 0, true, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new D40(str, strH, strH2, str2, iD, arrayList3, arrayList, str4 != null ? C0084Av0.H(str4, 0, false, 0, 7) : null, toString());
    }

    public final int d() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        O90.c(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final void e(String str) {
        O90.f(str, "host");
        String strB = M12.b(C0084Av0.H(str, 0, false, 0, 7));
        if (strB == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        this.d = strB;
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x013e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.D40 r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C40.f(D40, java.lang.String):void");
    }

    public final void g(int i) {
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "unexpected port: ").toString());
        }
        this.e = i;
    }

    public final void h(String str, int i, int i2, boolean z, boolean z2) {
        String strV = C0084Av0.v(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, 240);
        if (strV.equals(".") || strV.equalsIgnoreCase("%2e")) {
            return;
        }
        boolean zEquals = strV.equals("..");
        ArrayList arrayList = this.f;
        if (zEquals || strV.equalsIgnoreCase("%2e.") || strV.equalsIgnoreCase(".%2e") || strV.equalsIgnoreCase("%2e%2e")) {
            if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                arrayList.add("");
                return;
            } else {
                arrayList.set(arrayList.size() - 1, "");
                return;
            }
        }
        if (((CharSequence) AbstractC8235ym.e(1, arrayList)).length() == 0) {
            arrayList.set(arrayList.size() - 1, strV);
        } else {
            arrayList.add(strV);
        }
        if (z) {
            arrayList.add("");
        }
    }

    public final void i(String str) {
        O90.f(str, "scheme");
        if (str.equalsIgnoreCase("http")) {
            this.a = "http";
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.a = "https";
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
            java.lang.String r1 = r6.a
            if (r1 == 0) goto L12
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L17
        L12:
            java.lang.String r1 = "//"
            r0.append(r1)
        L17:
            java.lang.String r1 = r6.b
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L22
            goto L2a
        L22:
            java.lang.String r1 = r6.c
            int r1 = r1.length()
            if (r1 <= 0) goto L44
        L2a:
            java.lang.String r1 = r6.b
            r0.append(r1)
            java.lang.String r1 = r6.c
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            r0.append(r2)
            java.lang.String r1 = r6.c
            r0.append(r1)
        L3f:
            r1 = 64
            r0.append(r1)
        L44:
            java.lang.String r1 = r6.d
            if (r1 == 0) goto L63
            boolean r1 = defpackage.AbstractC7538v51.q(r1, r2)
            if (r1 == 0) goto L5e
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r6.d
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L63
        L5e:
            java.lang.String r1 = r6.d
            r0.append(r1)
        L63:
            int r1 = r6.e
            r3 = -1
            if (r1 != r3) goto L6c
            java.lang.String r1 = r6.a
            if (r1 == 0) goto L91
        L6c:
            int r1 = r6.d()
            java.lang.String r4 = r6.a
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
            java.util.ArrayList r1 = r6.f
            java.lang.String r2 = "<this>"
            defpackage.O90.f(r1, r2)
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
            java.util.ArrayList r1 = r6.g
            if (r1 == 0) goto Lc1
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r6.g
            defpackage.O90.c(r1)
            defpackage.C0084Av0.J(r1, r0)
        Lc1:
            java.lang.String r1 = r6.h
            if (r1 == 0) goto Lcf
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r6.h
            r0.append(r1)
        Lcf:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            defpackage.O90.e(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C40.toString():java.lang.String");
    }
}
