package p000;

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
public final class T31 implements InterfaceC9200e61 {

    /* renamed from: g */
    public static final Pattern f11133g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a */
    public final boolean f11134a;

    /* renamed from: b */
    public final S31 f11135b;

    /* renamed from: d */
    public LinkedHashMap f11137d;

    /* renamed from: e */
    public float f11138e = -3.4028235E38f;

    /* renamed from: f */
    public float f11139f = -3.4028235E38f;

    /* renamed from: c */
    public final C9591hA0 f11136c = new C9591hA0();

    public T31(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.f11134a = false;
            this.f11135b = null;
            return;
        }
        this.f11134a = true;
        String strM1830o = AbstractC7485Dh1.m1830o((byte[]) list.get(0));
        YN1.m9278c(strM1830o.startsWith("Format:"));
        S31 s31M7172b = S31.m7172b(strM1830o);
        s31M7172b.getClass();
        this.f11135b = s31M7172b;
        m7542b(new C9591hA0((byte[]) list.get(1)), AbstractC7227yr.f46511c);
    }

    /* renamed from: a */
    public static int m7540a(long j, ArrayList arrayList, ArrayList arrayList2) {
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

    /* renamed from: c */
    public static long m7541c(String str) {
        Matcher matcher = f11133g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = AbstractC7485Dh1.f2166a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // p000.InterfaceC9200e61
    /* renamed from: G */
    public final int mo4559G() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7542b(p000.C9591hA0 r37, java.nio.charset.Charset r38) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.T31.m7542b(hA0, java.nio.charset.Charset):void");
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
        Charset charset;
        C9591hA0 c9591hA0;
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
        int iM8657a;
        int i11;
        T31 t31 = this;
        C9072d61 c9072d612 = c9072d61;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C9591hA0 c9591hA02 = t31.f11136c;
        c9591hA02.m18739E(i + i2, bArr);
        c9591hA02.m18741G(i);
        Charset charsetM18737C = c9591hA02.m18737C();
        if (charsetM18737C == null) {
            charsetM18737C = AbstractC7227yr.f46511c;
        }
        boolean z = t31.f11134a;
        if (!z) {
            t31.m7542b(c9591hA02, charsetM18737C);
        }
        S31 s31M7172b = z ? t31.f11135b : null;
        while (true) {
            String strM18750h = c9591hA02.m18750h(charsetM18737C);
            if (strM18750h == null) {
                C9072d61 c9072d613 = c9072d612;
                long j = c9072d613.f25817b;
                ArrayList arrayList3 = (j == -9223372036854775807L || !c9072d613.f25816a) ? null : new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    List list = (List) arrayList.get(i12);
                    if (!list.isEmpty() || i12 == 0) {
                        if (i12 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i12)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i12 + 1)).longValue() - ((Long) arrayList2.get(i12)).longValue();
                        if (j == -9223372036854775807L || jLongValue >= j) {
                            interfaceC6587oy.mo4000b(new C7122xB(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new C7122xB(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        interfaceC6587oy.mo4000b((C7122xB) it.next());
                    }
                    return;
                }
                return;
            }
            if (strM18750h.startsWith("Format:")) {
                s31M7172b = S31.m7172b(strM18750h);
            } else if (strM18750h.startsWith("Dialogue:")) {
                if (s31M7172b == null) {
                    AbstractC10872rA1.m24175h("Skipping dialogue line before complete format: ".concat(strM18750h));
                } else {
                    YN1.m9278c(strM18750h.startsWith("Dialogue:"));
                    String strSubstring = strM18750h.substring(9);
                    int i13 = s31M7172b.f10565e;
                    String[] strArrSplit = strSubstring.split(StringUtils.COMMA, i13);
                    if (strArrSplit.length != i13) {
                        AbstractC10872rA1.m24175h("Skipping dialogue line with fewer columns than format: ".concat(strM18750h));
                    } else {
                        long jM7541c = m7541c(strArrSplit[s31M7172b.f10561a]);
                        if (jM7541c == -9223372036854775807L) {
                            AbstractC10872rA1.m24175h("Skipping invalid timing: ".concat(strM18750h));
                        } else {
                            charset = charsetM18737C;
                            long jM7541c2 = m7541c(strArrSplit[s31M7172b.f10562b]);
                            if (jM7541c2 == -9223372036854775807L) {
                                AbstractC10872rA1.m24175h("Skipping invalid timing: ".concat(strM18750h));
                                s31 = s31M7172b;
                                c9591hA0 = c9591hA02;
                                t31 = this;
                                c9072d612 = c9072d61;
                                charsetM18737C = charset;
                                s31M7172b = s31;
                                c9591hA02 = c9591hA0;
                            } else {
                                LinkedHashMap linkedHashMap = t31.f11137d;
                                W31 w31 = (linkedHashMap == null || (i11 = s31M7172b.f10563c) == -1) ? null : (W31) linkedHashMap.get(strArrSplit[i11].trim());
                                String str = strArrSplit[s31M7172b.f10564d];
                                Matcher matcher = V31.f12337a.matcher(str);
                                int i14 = -1;
                                PointF pointF = null;
                                while (matcher.find()) {
                                    S31 s312 = s31M7172b;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFM8288a = V31.m8288a(strGroup);
                                        if (pointFM8288a != null) {
                                            pointF = pointFM8288a;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = V31.f12340d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iM8657a = W31.m8657a(strGroup2);
                                        } else {
                                            iM8657a = -1;
                                        }
                                        if (iM8657a != -1) {
                                            i14 = iM8657a;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    s31M7172b = s312;
                                }
                                s31 = s31M7172b;
                                String strReplace = V31.f12337a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f7 = t31.f11138e;
                                float f8 = t31.f11139f;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (w31 != null) {
                                    Integer num2 = w31.f12947c;
                                    if (num2 != null) {
                                        c9591hA0 = c9591hA02;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        c9591hA0 = c9591hA02;
                                    }
                                    if (w31.f12954j == 3 && (num = w31.f12948d) != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f9 = w31.f12949e;
                                    if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                        f5 = -3.4028235E38f;
                                        i7 = Integer.MIN_VALUE;
                                    } else {
                                        f5 = f9 / f8;
                                        i7 = 1;
                                    }
                                    boolean z2 = w31.f12951g;
                                    boolean z3 = w31.f12950f;
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
                                    if (w31.f12952h) {
                                        spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                    }
                                    if (w31.f12953i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                    }
                                    f = f6;
                                    i3 = i8;
                                } else {
                                    c9591hA0 = c9591hA02;
                                    f = -3.4028235E38f;
                                    i3 = Integer.MIN_VALUE;
                                }
                                int i15 = -1;
                                if (i14 != -1) {
                                    i15 = i14;
                                } else if (w31 != null) {
                                    i15 = w31.f12946b;
                                }
                                switch (i15) {
                                    case 0:
                                    default:
                                        AbstractC0852NX.m5767p("Unknown alignment: ", i15);
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
                                        AbstractC0852NX.m5767p("Unknown alignment: ", i15);
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
                                        AbstractC0852NX.m5767p("Unknown alignment: ", i15);
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
                                C6933uB c6933uB = new C6933uB(spannableString, alignment2, null, null, f3, 0, i16, f4, i4, i3, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                int iM7540a = m7540a(jM7541c2, arrayList2, arrayList);
                                for (int iM7540a2 = m7540a(jM7541c, arrayList2, arrayList); iM7540a2 < iM7540a; iM7540a2++) {
                                    ((List) arrayList.get(iM7540a2)).add(c6933uB);
                                }
                                t31 = this;
                                c9072d612 = c9072d61;
                                charsetM18737C = charset;
                                s31M7172b = s31;
                                c9591hA02 = c9591hA0;
                            }
                        }
                    }
                }
                charset = charsetM18737C;
                s31 = s31M7172b;
                c9591hA0 = c9591hA02;
                t31 = this;
                c9072d612 = c9072d61;
                charsetM18737C = charset;
                s31M7172b = s31;
                c9591hA02 = c9591hA0;
            } else {
                charset = charsetM18737C;
                s31 = s31M7172b;
                c9591hA0 = c9591hA02;
                t31 = this;
                c9072d612 = c9072d61;
                charsetM18737C = charset;
                s31M7172b = s31;
                c9591hA02 = c9591hA0;
            }
        }
    }
}
