package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class T31 implements InterfaceC3519e61 {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final S31 b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final C4103hA0 c = new C4103hA0();

    public T31(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String strO = AbstractC0277Dh1.o((byte[]) list.get(0));
        YN1.c(strO.startsWith("Format:"));
        S31 s31B = S31.b(strO);
        s31B.getClass();
        this.b = s31B;
        b(new C4103hA0((byte[]) list.get(1)), AbstractC8250yr.c);
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long c(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = AbstractC0277Dh1.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // defpackage.InterfaceC3519e61
    public final int G() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.C4103hA0 r37, java.nio.charset.Charset r38) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T31.b(hA0, java.nio.charset.Charset):void");
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
        Charset charset;
        C4103hA0 c4103hA0;
        S31 s31;
        float f;
        int i3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i4;
        int i5;
        int i6;
        float f2;
        float f3;
        float f4;
        float f5;
        int i7;
        int i8;
        float f6;
        int i9;
        int i10;
        Integer num;
        int iA;
        int i11;
        T31 t31 = this;
        C3329d61 c3329d612 = c3329d61;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C4103hA0 c4103hA02 = t31.c;
        c4103hA02.E(i + i2, bArr);
        c4103hA02.G(i);
        Charset charsetC = c4103hA02.C();
        if (charsetC == null) {
            charsetC = AbstractC8250yr.c;
        }
        boolean z = t31.a;
        if (!z) {
            t31.b(c4103hA02, charsetC);
        }
        S31 s31B = z ? t31.b : null;
        while (true) {
            String strH = c4103hA02.h(charsetC);
            if (strH == null) {
                C3329d61 c3329d613 = c3329d612;
                long j = c3329d613.b;
                ArrayList arrayList3 = (j == -9223372036854775807L || !c3329d613.a) ? null : new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    List list = (List) arrayList.get(i12);
                    if (!list.isEmpty() || i12 == 0) {
                        if (i12 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i12)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i12 + 1)).longValue() - ((Long) arrayList2.get(i12)).longValue();
                        if (j == -9223372036854775807L || jLongValue >= j) {
                            interfaceC6365oy.b(new C7934xB(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new C7934xB(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC6365oy.b((C7934xB) it.next());
                    }
                    return;
                }
                return;
            }
            if (strH.startsWith("Format:")) {
                s31B = S31.b(strH);
            } else if (strH.startsWith("Dialogue:")) {
                if (s31B == null) {
                    AbstractC6789rA1.h("Skipping dialogue line before complete format: ".concat(strH));
                } else {
                    YN1.c(strH.startsWith("Dialogue:"));
                    String strSubstring = strH.substring(9);
                    int i13 = s31B.e;
                    String[] strArrSplit = strSubstring.split(StringUtils.COMMA, i13);
                    if (strArrSplit.length != i13) {
                        AbstractC6789rA1.h("Skipping dialogue line with fewer columns than format: ".concat(strH));
                    } else {
                        long jC = c(strArrSplit[s31B.a]);
                        if (jC == -9223372036854775807L) {
                            AbstractC6789rA1.h("Skipping invalid timing: ".concat(strH));
                        } else {
                            charset = charsetC;
                            long jC2 = c(strArrSplit[s31B.b]);
                            if (jC2 == -9223372036854775807L) {
                                AbstractC6789rA1.h("Skipping invalid timing: ".concat(strH));
                                s31 = s31B;
                                c4103hA0 = c4103hA02;
                                t31 = this;
                                c3329d612 = c3329d61;
                                charsetC = charset;
                                s31B = s31;
                                c4103hA02 = c4103hA0;
                            } else {
                                LinkedHashMap linkedHashMap = t31.d;
                                W31 w31 = (linkedHashMap == null || (i11 = s31B.c) == -1) ? null : (W31) linkedHashMap.get(strArrSplit[i11].trim());
                                String str = strArrSplit[s31B.d];
                                Matcher matcher = V31.a.matcher(str);
                                int i14 = -1;
                                PointF pointF = null;
                                while (matcher.find()) {
                                    S31 s312 = s31B;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = V31.a(strGroup);
                                        if (pointFA != null) {
                                            pointF = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = V31.d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = W31.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i14 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    s31B = s312;
                                }
                                s31 = s31B;
                                String strReplace = V31.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f7 = t31.e;
                                float f8 = t31.f;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (w31 != null) {
                                    Integer num2 = w31.c;
                                    if (num2 != null) {
                                        c4103hA0 = c4103hA02;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        c4103hA0 = c4103hA02;
                                    }
                                    if (w31.j == 3 && (num = w31.d) != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f9 = w31.e;
                                    if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                        f5 = -3.4028235E38f;
                                        i7 = Integer.MIN_VALUE;
                                    } else {
                                        f5 = f9 / f8;
                                        i7 = 1;
                                    }
                                    boolean z2 = w31.g;
                                    boolean z3 = w31.f;
                                    if (z3 && z2) {
                                        i8 = i7;
                                        f6 = f5;
                                        i9 = 0;
                                        i10 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        i8 = i7;
                                        f6 = f5;
                                        i9 = 0;
                                        i10 = 33;
                                        if (z3) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z2) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (w31.h) {
                                        spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                    }
                                    if (w31.i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                    }
                                    f = f6;
                                    i3 = i8;
                                } else {
                                    c4103hA0 = c4103hA02;
                                    f = -3.4028235E38f;
                                    i3 = Integer.MIN_VALUE;
                                }
                                int i15 = -1;
                                if (i14 != -1) {
                                    i15 = i14;
                                } else if (w31 != null) {
                                    i15 = w31.b;
                                }
                                switch (i15) {
                                    case 0:
                                    default:
                                        NX.p("Unknown alignment: ", i15);
                                    case -1:
                                        alignment2 = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        alignment2 = alignment;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        alignment2 = alignment;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        alignment2 = alignment;
                                        break;
                                }
                                int i16 = Integer.MIN_VALUE;
                                switch (i15) {
                                    case 0:
                                    default:
                                        NX.p("Unknown alignment: ", i15);
                                    case -1:
                                        i4 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        i4 = 0;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i4 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i4 = 2;
                                        break;
                                }
                                switch (i15) {
                                    case -1:
                                        break;
                                    case 0:
                                    default:
                                        NX.p("Unknown alignment: ", i15);
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        i16 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        i16 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i16 = 0;
                                        break;
                                }
                                if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                    if (i4 != 0) {
                                        i5 = 1;
                                        if (i4 != 1) {
                                            i6 = 2;
                                            f2 = i4 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i6 = 2;
                                            f2 = 0.5f;
                                        }
                                    } else {
                                        i5 = 1;
                                        i6 = 2;
                                        f2 = 0.05f;
                                    }
                                    f3 = i16 != 0 ? i16 != i5 ? i16 != i6 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                    f4 = f2;
                                } else {
                                    f4 = pointF.x / f7;
                                    f3 = pointF.y / f8;
                                }
                                C7363uB c7363uB = new C7363uB(spannableString, alignment2, null, null, f3, 0, i16, f4, i4, i3, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iA2 = a(jC2, arrayList2, arrayList);
                                for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                    ((List) arrayList.get(iA3)).add(c7363uB);
                                }
                                t31 = this;
                                c3329d612 = c3329d61;
                                charsetC = charset;
                                s31B = s31;
                                c4103hA02 = c4103hA0;
                            }
                        }
                    }
                }
                charset = charsetC;
                s31 = s31B;
                c4103hA0 = c4103hA02;
                t31 = this;
                c3329d612 = c3329d61;
                charsetC = charset;
                s31B = s31;
                c4103hA02 = c4103hA0;
            } else {
                charset = charsetC;
                s31 = s31B;
                c4103hA0 = c4103hA02;
                t31 = this;
                c3329d612 = c3329d61;
                charsetC = charset;
                s31B = s31;
                c4103hA02 = c4103hA0;
            }
        }
    }
}
