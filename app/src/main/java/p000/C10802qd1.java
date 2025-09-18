package p000;

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
public final class C10802qd1 implements InterfaceC9200e61 {

    /* renamed from: a */
    public final C9591hA0 f41070a = new C9591hA0();

    /* renamed from: b */
    public final boolean f41071b;

    /* renamed from: c */
    public final int f41072c;

    /* renamed from: d */
    public final int f41073d;

    /* renamed from: e */
    public final String f41074e;

    /* renamed from: f */
    public final float f41075f;

    /* renamed from: g */
    public final int f41076g;

    public C10802qd1(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f41072c = 0;
            this.f41073d = -1;
            this.f41074e = "sans-serif";
            this.f41071b = false;
            this.f41075f = 0.85f;
            this.f41076g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f41072c = bArr[24];
        this.f41073d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f41074e = "Serif".equals(new String(bArr, 43, bArr.length - 43, AbstractC7227yr.f46511c)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f41076g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f41071b = z;
        if (z) {
            this.f41075f = AbstractC7485Dh1.m1824i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f41075f = 0.85f;
        }
    }

    /* renamed from: a */
    public static void m24030a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: b */
    public static void m24031b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
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

    @Override // p000.InterfaceC9200e61
    /* renamed from: G */
    public final int mo4559G() {
        return 2;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC9200e61
    /* renamed from: m */
    public final void mo4562m(byte[] bArr, int i, int i2, C9072d61 c9072d61, InterfaceC6587oy interfaceC6587oy) {
        String strM18761s;
        C9591hA0 c9591hA0 = this.f41070a;
        c9591hA0.m18739E(i + i2, bArr);
        c9591hA0.m18741G(i);
        int i3 = 2;
        int i4 = 0;
        YN1.m9278c(c9591hA0.m18743a() >= 2);
        int iM18735A = c9591hA0.m18735A();
        if (iM18735A == 0) {
            strM18761s = "";
        } else {
            int i5 = c9591hA0.f28294b;
            Charset charsetM18737C = c9591hA0.m18737C();
            int i6 = iM18735A - (c9591hA0.f28294b - i5);
            if (charsetM18737C == null) {
                charsetM18737C = AbstractC7227yr.f46511c;
            }
            strM18761s = c9591hA0.m18761s(i6, charsetM18737C);
        }
        if (strM18761s.isEmpty()) {
            N70 n70 = P70.f8867b;
            interfaceC6587oy.mo4000b(new C7122xB(C9367fQ0.f27184e, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM18761s);
        m24031b(spannableStringBuilder, this.f41072c, 0, 0, spannableStringBuilder.length(), 16711680);
        m24030a(spannableStringBuilder, this.f41073d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f41074e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fM1824i = this.f41075f;
        while (c9591hA0.m18743a() >= 8) {
            int i7 = c9591hA0.f28294b;
            int iM18749g = c9591hA0.m18749g();
            int iM18749g2 = c9591hA0.m18749g();
            if (iM18749g2 == 1937013100) {
                YN1.m9278c(c9591hA0.m18743a() >= i3 ? 1 : i4);
                int iM18735A2 = c9591hA0.m18735A();
                int i8 = i4;
                while (i8 < iM18735A2) {
                    YN1.m9278c(c9591hA0.m18743a() >= 12 ? 1 : i4);
                    int iM18735A3 = c9591hA0.m18735A();
                    int iM18735A4 = c9591hA0.m18735A();
                    c9591hA0.m18742H(i3);
                    int iM18763u = c9591hA0.m18763u();
                    c9591hA0.m18742H(1);
                    int iM18749g3 = c9591hA0.m18749g();
                    if (iM18735A4 > spannableStringBuilder.length()) {
                        StringBuilder sbM26237n = AbstractC7222ym.m26237n(iM18735A4, "Truncating styl end (", ") to cueText.length() (");
                        sbM26237n.append(spannableStringBuilder.length());
                        sbM26237n.append(").");
                        AbstractC10872rA1.m24175h(sbM26237n.toString());
                        iM18735A4 = spannableStringBuilder.length();
                    }
                    if (iM18735A3 >= iM18735A4) {
                        AbstractC10872rA1.m24175h("Ignoring styl with start (" + iM18735A3 + ") >= end (" + iM18735A4 + ").");
                    } else {
                        int i9 = iM18735A4;
                        m24031b(spannableStringBuilder, iM18763u, this.f41072c, iM18735A3, i9, 0);
                        m24030a(spannableStringBuilder, iM18749g3, this.f41073d, iM18735A3, i9, 0);
                    }
                    i8++;
                    i3 = 2;
                    i4 = 0;
                }
            } else if (iM18749g2 == 1952608120 && this.f41071b) {
                i3 = 2;
                YN1.m9278c(c9591hA0.m18743a() >= 2);
                fM1824i = AbstractC7485Dh1.m1824i(c9591hA0.m18735A() / this.f41076g, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            c9591hA0.m18741G(i7 + iM18749g);
            i4 = 0;
        }
        interfaceC6587oy.mo4000b(new C7122xB(P70.m6229B(new C6933uB(spannableStringBuilder, null, null, null, fM1824i, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f)), -9223372036854775807L, -9223372036854775807L));
    }
}
