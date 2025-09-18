package defpackage;

/* loaded from: classes.dex */
public final class S31 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.S31 b(java.lang.String r10) {
        /*
            r0 = 1
            java.lang.String r1 = "Format:"
            boolean r1 = r10.startsWith(r1)
            defpackage.YN1.c(r1)
            r1 = 7
            java.lang.String r10 = r10.substring(r1)
            java.lang.String r1 = ","
            java.lang.String[] r10 = android.text.TextUtils.split(r10, r1)
            r1 = -1
            r2 = 0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r3 = r2
        L1c:
            int r8 = r10.length
            if (r3 >= r8) goto L6d
            r8 = r10[r3]
            java.lang.String r8 = r8.trim()
            java.lang.String r8 = defpackage.PN1.c(r8)
            r8.getClass()
            int r9 = r8.hashCode()
            switch(r9) {
                case 100571: goto L56;
                case 3556653: goto L4b;
                case 109757538: goto L40;
                case 109780401: goto L35;
                default: goto L33;
            }
        L33:
            r8 = r1
            goto L60
        L35:
            java.lang.String r9 = "style"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L3e
            goto L33
        L3e:
            r8 = 3
            goto L60
        L40:
            java.lang.String r9 = "start"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L49
            goto L33
        L49:
            r8 = 2
            goto L60
        L4b:
            java.lang.String r9 = "text"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L54
            goto L33
        L54:
            r8 = r0
            goto L60
        L56:
            java.lang.String r9 = "end"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L5f
            goto L33
        L5f:
            r8 = r2
        L60:
            switch(r8) {
                case 0: goto L6a;
                case 1: goto L68;
                case 2: goto L66;
                case 3: goto L64;
                default: goto L63;
            }
        L63:
            goto L6b
        L64:
            r7 = r3
            goto L6b
        L66:
            r4 = r3
            goto L6b
        L68:
            r6 = r3
            goto L6b
        L6a:
            r5 = r3
        L6b:
            int r3 = r3 + r0
            goto L1c
        L6d:
            if (r4 == r1) goto L84
            if (r5 == r1) goto L84
            if (r6 == r1) goto L84
            S31 r0 = new S31
            int r10 = r10.length
            r0.<init>()
            r0.a = r4
            r0.b = r5
            r0.c = r7
            r0.d = r6
            r0.e = r10
            goto L85
        L84:
            r0 = 0
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.S31.b(java.lang.String):S31");
    }

    public boolean a() {
        int i = this.a;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.d;
            int i4 = this.b;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.d;
            int i6 = this.c;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.e;
            int i8 = this.b;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.e;
            int i10 = this.c;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
