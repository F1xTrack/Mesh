package p000;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: uB */
/* loaded from: classes.dex */
public final class C6933uB {

    /* renamed from: A */
    public static final String f43547A;

    /* renamed from: B */
    public static final String f43548B;

    /* renamed from: C */
    public static final String f43549C;

    /* renamed from: D */
    public static final String f43550D;

    /* renamed from: E */
    public static final String f43551E;

    /* renamed from: F */
    public static final String f43552F;

    /* renamed from: G */
    public static final String f43553G;

    /* renamed from: H */
    public static final String f43554H;

    /* renamed from: I */
    public static final String f43555I;

    /* renamed from: J */
    public static final String f43556J;

    /* renamed from: r */
    public static final String f43557r;

    /* renamed from: s */
    public static final String f43558s;

    /* renamed from: t */
    public static final String f43559t;

    /* renamed from: u */
    public static final String f43560u;

    /* renamed from: v */
    public static final String f43561v;

    /* renamed from: w */
    public static final String f43562w;

    /* renamed from: x */
    public static final String f43563x;

    /* renamed from: y */
    public static final String f43564y;

    /* renamed from: z */
    public static final String f43565z;

    /* renamed from: a */
    public final CharSequence f43566a;

    /* renamed from: b */
    public final Layout.Alignment f43567b;

    /* renamed from: c */
    public final Layout.Alignment f43568c;

    /* renamed from: d */
    public final Bitmap f43569d;

    /* renamed from: e */
    public final float f43570e;

    /* renamed from: f */
    public final int f43571f;

    /* renamed from: g */
    public final int f43572g;

    /* renamed from: h */
    public final float f43573h;

    /* renamed from: i */
    public final int f43574i;

    /* renamed from: j */
    public final float f43575j;

    /* renamed from: k */
    public final float f43576k;

    /* renamed from: l */
    public final boolean f43577l;

    /* renamed from: m */
    public final int f43578m;

    /* renamed from: n */
    public final int f43579n;

    /* renamed from: o */
    public final float f43580o;

    /* renamed from: p */
    public final int f43581p;

    /* renamed from: q */
    public final float f43582q;

    static {
        new C6933uB("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i = AbstractC7485Dh1.f2166a;
        f43557r = Integer.toString(0, 36);
        f43558s = Integer.toString(17, 36);
        f43559t = Integer.toString(1, 36);
        f43560u = Integer.toString(2, 36);
        f43561v = Integer.toString(3, 36);
        f43562w = Integer.toString(18, 36);
        f43563x = Integer.toString(4, 36);
        f43564y = Integer.toString(5, 36);
        f43565z = Integer.toString(6, 36);
        f43547A = Integer.toString(7, 36);
        f43548B = Integer.toString(8, 36);
        f43549C = Integer.toString(9, 36);
        f43550D = Integer.toString(10, 36);
        f43551E = Integer.toString(11, 36);
        f43552F = Integer.toString(12, 36);
        f43553G = Integer.toString(13, 36);
        f43554H = Integer.toString(14, 36);
        f43555I = Integer.toString(15, 36);
        f43556J = Integer.toString(16, 36);
    }

    public C6933uB(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            YN1.m9278c(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f43566a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f43566a = charSequence.toString();
        } else {
            this.f43566a = null;
        }
        this.f43567b = alignment;
        this.f43568c = alignment2;
        this.f43569d = bitmap;
        this.f43570e = f;
        this.f43571f = i;
        this.f43572g = i2;
        this.f43573h = f2;
        this.f43574i = i3;
        this.f43575j = f4;
        this.f43576k = f5;
        this.f43577l = z;
        this.f43578m = i5;
        this.f43579n = i4;
        this.f43580o = f3;
        this.f43581p = i6;
        this.f43582q = f6;
    }

    /* renamed from: a */
    public final C6870tB m25128a() {
        C6870tB c6870tB = new C6870tB();
        c6870tB.f42901a = this.f43566a;
        c6870tB.f42902b = this.f43569d;
        c6870tB.f42903c = this.f43567b;
        c6870tB.f42904d = this.f43568c;
        c6870tB.f42905e = this.f43570e;
        c6870tB.f42906f = this.f43571f;
        c6870tB.f42907g = this.f43572g;
        c6870tB.f42908h = this.f43573h;
        c6870tB.f42909i = this.f43574i;
        c6870tB.f42910j = this.f43579n;
        c6870tB.f42911k = this.f43580o;
        c6870tB.f42912l = this.f43575j;
        c6870tB.f42913m = this.f43576k;
        c6870tB.f42914n = this.f43577l;
        c6870tB.f42915o = this.f43578m;
        c6870tB.f42916p = this.f43581p;
        c6870tB.f42917q = this.f43582q;
        return c6870tB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6933uB.class != obj.getClass()) {
            return false;
        }
        C6933uB c6933uB = (C6933uB) obj;
        if (TextUtils.equals(this.f43566a, c6933uB.f43566a) && this.f43567b == c6933uB.f43567b && this.f43568c == c6933uB.f43568c) {
            Bitmap bitmap = c6933uB.f43569d;
            Bitmap bitmap2 = this.f43569d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f43570e == c6933uB.f43570e && this.f43571f == c6933uB.f43571f && this.f43572g == c6933uB.f43572g && this.f43573h == c6933uB.f43573h && this.f43574i == c6933uB.f43574i && this.f43575j == c6933uB.f43575j && this.f43576k == c6933uB.f43576k && this.f43577l == c6933uB.f43577l && this.f43578m == c6933uB.f43578m && this.f43579n == c6933uB.f43579n && this.f43580o == c6933uB.f43580o && this.f43581p == c6933uB.f43581p && this.f43582q == c6933uB.f43582q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f43566a, this.f43567b, this.f43568c, this.f43569d, Float.valueOf(this.f43570e), Integer.valueOf(this.f43571f), Integer.valueOf(this.f43572g), Float.valueOf(this.f43573h), Integer.valueOf(this.f43574i), Float.valueOf(this.f43575j), Float.valueOf(this.f43576k), Boolean.valueOf(this.f43577l), Integer.valueOf(this.f43578m), Integer.valueOf(this.f43579n), Float.valueOf(this.f43580o), Integer.valueOf(this.f43581p), Float.valueOf(this.f43582q)});
    }
}
