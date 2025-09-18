package defpackage;

import com.huawei.hms.rn.push.constants.Core;

/* loaded from: classes2.dex */
public abstract class Z30 {
    public static final C0674Ik a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        C0674Ik c0674Ik = C0674Ik.d;
        a = TE.D("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{Core.NotificationType.DATA, "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            O90.e(binaryString, "toBinaryString(it)");
            strArr[i] = D51.l(AbstractC0199Ch1.j("%8s", binaryString), ' ', '0');
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = AbstractC1705Vq.l(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = AbstractC1705Vq.l(sb, strArr3[i4], "|PADDED");
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r0 = 5
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 4
            r5 = 1
            java.lang.String[] r6 = defpackage.Z30.b
            int r7 = r6.length
            if (r13 >= r7) goto Le
            r6 = r6[r13]
            goto L1c
        Le:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r3] = r6
            java.lang.String r6 = "0x%02x"
            java.lang.String r6 = defpackage.AbstractC0199Ch1.j(r6, r7)
        L1c:
            if (r14 != 0) goto L21
            java.lang.String r13 = ""
            goto L6a
        L21:
            java.lang.String[] r7 = defpackage.Z30.d
            if (r13 == r2) goto L68
            if (r13 == r1) goto L68
            if (r13 == r4) goto L60
            r8 = 6
            if (r13 == r8) goto L60
            r8 = 7
            if (r13 == r8) goto L68
            r8 = 8
            if (r13 == r8) goto L68
            java.lang.String[] r8 = defpackage.Z30.c
            int r9 = r8.length
            if (r14 >= r9) goto L3e
            r7 = r8[r14]
            defpackage.O90.c(r7)
            goto L40
        L3e:
            r7 = r7[r14]
        L40:
            if (r13 != r0) goto L4f
            r8 = r14 & 4
            if (r8 == 0) goto L4f
            java.lang.String r13 = "PUSH_PROMISE"
            java.lang.String r14 = "HEADERS"
            java.lang.String r13 = defpackage.D51.m(r7, r14, r13)
            goto L6a
        L4f:
            if (r13 != 0) goto L5e
            r13 = r14 & 32
            if (r13 == 0) goto L5e
            java.lang.String r13 = "COMPRESSED"
            java.lang.String r14 = "PRIORITY"
            java.lang.String r13 = defpackage.D51.m(r7, r14, r13)
            goto L6a
        L5e:
            r13 = r7
            goto L6a
        L60:
            if (r14 != r5) goto L65
            java.lang.String r13 = "ACK"
            goto L6a
        L65:
            r13 = r7[r14]
            goto L6a
        L68:
            r13 = r7[r14]
        L6a:
            if (r10 == 0) goto L6f
            java.lang.String r10 = "<<"
            goto L71
        L6f:
            java.lang.String r10 = ">>"
        L71:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r14[r3] = r10
            r14[r5] = r11
            r14[r2] = r12
            r14[r1] = r6
            r14[r4] = r13
            java.lang.String r10 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r10 = defpackage.AbstractC0199Ch1.j(r10, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Z30.a(boolean, int, int, int, int):java.lang.String");
    }
}
