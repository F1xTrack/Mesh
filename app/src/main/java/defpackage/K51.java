package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class K51 implements InterfaceC3519e61 {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final C4103hA0 c = new C4103hA0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C7363uB a(android.text.Spanned r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K51.a(android.text.Spanned, java.lang.String):uB");
    }

    public static long b(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    @Override // defpackage.InterfaceC3519e61
    public final int G() {
        return 1;
    }

    @Override // defpackage.InterfaceC3519e61
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.InterfaceC3519e61
    public final /* synthetic */ U51 g(byte[] bArr, int i, int i2) {
        return AbstractC7209tN0.h(this, bArr, i2);
    }

    @Override // defpackage.InterfaceC3519e61
    public final void m(byte[] bArr, int i, int i2, C3329d61 c3329d61, InterfaceC6365oy interfaceC6365oy) throws NumberFormatException {
        InterfaceC6365oy interfaceC6365oy2;
        String strH;
        String str;
        K51 k51 = this;
        InterfaceC6365oy interfaceC6365oy3 = interfaceC6365oy;
        C4103hA0 c4103hA0 = k51.c;
        c4103hA0.E(i + i2, bArr);
        c4103hA0.G(i);
        Charset charsetC = c4103hA0.C();
        if (charsetC == null) {
            charsetC = AbstractC8250yr.c;
        }
        long j = c3329d61.b;
        ArrayList arrayList = (j == -9223372036854775807L || !c3329d61.a) ? null : new ArrayList();
        while (true) {
            String strH2 = c4103hA0.h(charsetC);
            if (strH2 == null) {
                break;
            }
            if (strH2.length() != 0) {
                try {
                    Integer.parseInt(strH2);
                    strH = c4103hA0.h(charsetC);
                } catch (NumberFormatException unused) {
                    interfaceC6365oy2 = interfaceC6365oy3;
                    AbstractC6789rA1.h("Skipping invalid index: ".concat(strH2));
                }
                if (strH == null) {
                    AbstractC6789rA1.h("Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(strH);
                if (matcher.matches()) {
                    long jB = b(matcher, 1);
                    long jB2 = b(matcher, 6);
                    StringBuilder sb = k51.a;
                    sb.setLength(0);
                    ArrayList arrayList2 = k51.b;
                    arrayList2.clear();
                    for (String strH3 = c4103hA0.h(charsetC); !TextUtils.isEmpty(strH3); strH3 = c4103hA0.h(charsetC)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strH3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = e.matcher(strTrim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            String strGroup = matcher2.group();
                            arrayList2.add(strGroup);
                            Matcher matcher3 = matcher2;
                            int iStart = matcher2.start() - i3;
                            int length = strGroup.length();
                            sb2.replace(iStart, iStart + length, "");
                            i3 += length;
                            matcher2 = matcher3;
                            jB2 = jB2;
                        }
                        sb.append(sb2.toString());
                        jB2 = jB2;
                    }
                    long j2 = jB2;
                    Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i4);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (j == -9223372036854775807L || jB >= j) {
                        C7934xB c7934xB = new C7934xB(P70.B(a(spannedFromHtml, str)), jB, j2 - jB);
                        interfaceC6365oy2 = interfaceC6365oy;
                        interfaceC6365oy2.b(c7934xB);
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new C7934xB(P70.B(a(spannedFromHtml, str)), jB, j2 - jB));
                        }
                        interfaceC6365oy2 = interfaceC6365oy;
                    }
                } else {
                    interfaceC6365oy2 = interfaceC6365oy3;
                    AbstractC6789rA1.h("Skipping invalid timing: ".concat(strH));
                }
                interfaceC6365oy3 = interfaceC6365oy2;
                k51 = this;
            }
        }
        InterfaceC6365oy interfaceC6365oy4 = interfaceC6365oy3;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC6365oy4.b((C7934xB) it.next());
            }
        }
    }
}
