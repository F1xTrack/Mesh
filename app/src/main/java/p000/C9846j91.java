package p000;

/* renamed from: j91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9846j91 {

    /* renamed from: a */
    public boolean f34946a = true;

    /* renamed from: b */
    public float f34947b = Float.NaN;

    /* renamed from: c */
    public float f34948c = Float.NaN;

    /* renamed from: d */
    public float f34949d = Float.NaN;

    /* renamed from: e */
    public float f34950e = Float.NaN;

    /* renamed from: f */
    public float f34951f = Float.NaN;

    /* renamed from: g */
    public int f34952g = 5;

    /* renamed from: a */
    public final int m21976a() {
        float f = !Float.isNaN(this.f34947b) ? this.f34947b : 14.0f;
        return (int) (this.f34946a ? Math.ceil(AbstractC11406vL1.m25404c(f, m21979d())) : Math.ceil(AbstractC11406vL1.m25403b(f)));
    }

    /* renamed from: b */
    public final float m21977b() {
        if (Float.isNaN(this.f34949d)) {
            return Float.NaN;
        }
        return (this.f34946a ? AbstractC11406vL1.m25404c(this.f34949d, m21979d()) : AbstractC11406vL1.m25403b(this.f34949d)) / m21976a();
    }

    /* renamed from: c */
    public final float m21978c() {
        if (Float.isNaN(this.f34948c)) {
            return Float.NaN;
        }
        float fM25404c = this.f34946a ? AbstractC11406vL1.m25404c(this.f34948c, m21979d()) : AbstractC11406vL1.m25403b(this.f34948c);
        if (Float.isNaN(this.f34951f)) {
            return fM25404c;
        }
        float f = this.f34951f;
        return f > fM25404c ? f : fM25404c;
    }

    /* renamed from: d */
    public final float m21979d() {
        if (Float.isNaN(this.f34950e)) {
            return 0.0f;
        }
        return this.f34950e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextAttributes {\n  getAllowFontScaling(): ");
        sb.append(this.f34946a);
        sb.append("\n  getFontSize(): ");
        sb.append(this.f34947b);
        sb.append("\n  getEffectiveFontSize(): ");
        sb.append(m21976a());
        sb.append("\n  getHeightOfTallestInlineViewOrImage(): ");
        sb.append(this.f34951f);
        sb.append("\n  getLetterSpacing(): ");
        sb.append(this.f34949d);
        sb.append("\n  getEffectiveLetterSpacing(): ");
        sb.append(m21977b());
        sb.append("\n  getLineHeight(): ");
        sb.append(this.f34948c);
        sb.append("\n  getEffectiveLineHeight(): ");
        sb.append(m21978c());
        sb.append("\n  getTextTransform(): ");
        int i = this.f34952g;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNSET" : "CAPITALIZE" : "LOWERCASE" : "UPPERCASE" : "NONE");
        sb.append("\n  getMaxFontSizeMultiplier(): ");
        sb.append(this.f34950e);
        sb.append("\n  getEffectiveMaxFontSizeMultiplier(): ");
        sb.append(m21979d());
        sb.append("\n}");
        return sb.toString();
    }
}
