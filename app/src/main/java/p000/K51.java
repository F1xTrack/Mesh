package p000;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class K51 implements InterfaceC9200e61 {

    /* renamed from: d */
    public static final Pattern f5903d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e */
    public static final Pattern f5904e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a */
    public final StringBuilder f5905a = new StringBuilder();

    /* renamed from: b */
    public final ArrayList f5906b = new ArrayList();

    /* renamed from: c */
    public final C9591hA0 f5907c = new C9591hA0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fc  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C6933uB m4557a(android.text.Spanned r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.K51.m4557a(android.text.Spanned, java.lang.String):uB");
    }

    /* renamed from: b */
    public static long m4558b(Matcher matcher, int i) {
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

    @Override // p000.InterfaceC9200e61
    /* renamed from: G */
    public final int mo4559G() {
        return 1;
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: d */
    public final /* synthetic */ void mo4560d() {
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: g */
    public final /* synthetic */ U51 mo4561g(byte[] bArr, int i, int i2) {
        return AbstractC11153tN0.m24896h(this, bArr, i2);
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: m */
    public final void mo4562m(byte[] bArr, int i, int i2, C9072d61 c9072d61, InterfaceC6587oy interfaceC6587oy) throws NumberFormatException {
        InterfaceC6587oy interfaceC6587oy2;
        String strM18750h;
        String str;
        K51 k51 = this;
        InterfaceC6587oy interfaceC6587oy3 = interfaceC6587oy;
        C9591hA0 c9591hA0 = k51.f5907c;
        c9591hA0.m18739E(i + i2, bArr);
        c9591hA0.m18741G(i);
        Charset charsetM18737C = c9591hA0.m18737C();
        if (charsetM18737C == null) {
            charsetM18737C = AbstractC7227yr.f46511c;
        }
        long j = c9072d61.f25817b;
        ArrayList arrayList = (j == -9223372036854775807L || !c9072d61.f25816a) ? null : new ArrayList();
        while (true) {
            String strM18750h2 = c9591hA0.m18750h(charsetM18737C);
            if (strM18750h2 == null) {
                break;
            }
            if (strM18750h2.length() != 0) {
                try {
                    Integer.parseInt(strM18750h2);
                    strM18750h = c9591hA0.m18750h(charsetM18737C);
                } catch (NumberFormatException unused) {
                    interfaceC6587oy2 = interfaceC6587oy3;
                    AbstractC10872rA1.m24175h("Skipping invalid index: ".concat(strM18750h2));
                }
                if (strM18750h == null) {
                    AbstractC10872rA1.m24175h("Unexpected end");
                    break;
                }
                Matcher matcher = f5903d.matcher(strM18750h);
                if (matcher.matches()) {
                    long jM4558b = m4558b(matcher, 1);
                    long jM4558b2 = m4558b(matcher, 6);
                    StringBuilder sb = k51.f5905a;
                    sb.setLength(0);
                    ArrayList arrayList2 = k51.f5906b;
                    arrayList2.clear();
                    for (String strM18750h3 = c9591hA0.m18750h(charsetM18737C); !TextUtils.isEmpty(strM18750h3); strM18750h3 = c9591hA0.m18750h(charsetM18737C)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String strTrim = strM18750h3.trim();
                        StringBuilder sb2 = new StringBuilder(strTrim);
                        Matcher matcher2 = f5904e.matcher(strTrim);
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
                            jM4558b2 = jM4558b2;
                        }
                        sb.append(sb2.toString());
                        jM4558b2 = jM4558b2;
                    }
                    long j2 = jM4558b2;
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
                    if (j == -9223372036854775807L || jM4558b >= j) {
                        C7122xB c7122xB = new C7122xB(P70.m6229B(m4557a(spannedFromHtml, str)), jM4558b, j2 - jM4558b);
                        interfaceC6587oy2 = interfaceC6587oy;
                        interfaceC6587oy2.mo4000b(c7122xB);
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new C7122xB(P70.m6229B(m4557a(spannedFromHtml, str)), jM4558b, j2 - jM4558b));
                        }
                        interfaceC6587oy2 = interfaceC6587oy;
                    }
                } else {
                    interfaceC6587oy2 = interfaceC6587oy3;
                    AbstractC10872rA1.m24175h("Skipping invalid timing: ".concat(strM18750h));
                }
                interfaceC6587oy3 = interfaceC6587oy2;
                k51 = this;
            }
        }
        InterfaceC6587oy interfaceC6587oy4 = interfaceC6587oy3;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC6587oy4.mo4000b((C7122xB) it.next());
            }
        }
    }
}
