package defpackage;

import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: Zr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2022Zr1 {
    public static final Pattern a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    public static final String[] b;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        b = strArr;
        Arrays.sort(strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        r11 = r1.c;
        r8 = new java.lang.String(r10, r11, r1.d - r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0135, code lost:
    
        r1.d = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0368 A[EDGE_INSN: B:251:0x0368->B:198:0x0368 BREAK  A[LOOP:10: B:154:0x02bf->B:257:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[LOOP:10: B:154:0x02bf->B:257:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.security.cert.X509Certificate r17, java.lang.String r18) throws javax.net.ssl.SSLException, java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2022Zr1.a(java.security.cert.X509Certificate, java.lang.String):void");
    }
}
