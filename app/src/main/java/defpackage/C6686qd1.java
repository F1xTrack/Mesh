package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: qd1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6686qd1 implements InterfaceC3519e61 {
    public final C4103hA0 a = new C4103hA0();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public C6686qd1(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, AbstractC8250yr.c)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = AbstractC0277Dh1.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    @Override // defpackage.InterfaceC3519e61
    public final int G() {
        return 2;
    }

    @Override // defpackage.InterfaceC3519e61
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.InterfaceC3519e61
    public final /* synthetic */ U51 g(byte[] bArr, int i, int i2) {
        return AbstractC7209tN0.h(this, bArr, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC3519e61
    public final void m(byte[] bArr, int i, int i2, C3329d61 c3329d61, InterfaceC6365oy interfaceC6365oy) {
        String strS;
        C4103hA0 c4103hA0 = this.a;
        c4103hA0.E(i + i2, bArr);
        c4103hA0.G(i);
        int i3 = 2;
        int i4 = 0;
        YN1.c(c4103hA0.a() >= 2);
        int iA = c4103hA0.A();
        if (iA == 0) {
            strS = "";
        } else {
            int i5 = c4103hA0.b;
            Charset charsetC = c4103hA0.C();
            int i6 = iA - (c4103hA0.b - i5);
            if (charsetC == null) {
                charsetC = AbstractC8250yr.c;
            }
            strS = c4103hA0.s(i6, charsetC);
        }
        if (strS.isEmpty()) {
            N70 n70 = P70.b;
            interfaceC6365oy.b(new C7934xB(C3769fQ0.e, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        b(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.f;
        while (c4103hA0.a() >= 8) {
            int i7 = c4103hA0.b;
            int iG = c4103hA0.g();
            int iG2 = c4103hA0.g();
            if (iG2 == 1937013100) {
                YN1.c(c4103hA0.a() >= i3 ? 1 : i4);
                int iA2 = c4103hA0.A();
                int i8 = i4;
                while (i8 < iA2) {
                    YN1.c(c4103hA0.a() >= 12 ? 1 : i4);
                    int iA3 = c4103hA0.A();
                    int iA4 = c4103hA0.A();
                    c4103hA0.H(i3);
                    int iU = c4103hA0.u();
                    c4103hA0.H(1);
                    int iG3 = c4103hA0.g();
                    if (iA4 > spannableStringBuilder.length()) {
                        StringBuilder sbN = AbstractC8235ym.n(iA4, "Truncating styl end (", ") to cueText.length() (");
                        sbN.append(spannableStringBuilder.length());
                        sbN.append(").");
                        AbstractC6789rA1.h(sbN.toString());
                        iA4 = spannableStringBuilder.length();
                    }
                    if (iA3 >= iA4) {
                        AbstractC6789rA1.h("Ignoring styl with start (" + iA3 + ") >= end (" + iA4 + ").");
                    } else {
                        int i9 = iA4;
                        b(spannableStringBuilder, iU, this.c, iA3, i9, 0);
                        a(spannableStringBuilder, iG3, this.d, iA3, i9, 0);
                    }
                    i8++;
                    i3 = 2;
                    i4 = 0;
                }
            } else if (iG2 == 1952608120 && this.b) {
                i3 = 2;
                YN1.c(c4103hA0.a() >= 2);
                fI = AbstractC0277Dh1.i(c4103hA0.A() / this.g, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            c4103hA0.G(i7 + iG);
            i4 = 0;
        }
        interfaceC6365oy.b(new C7934xB(P70.B(new C7363uB(spannableStringBuilder, null, null, null, fI, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }
}
