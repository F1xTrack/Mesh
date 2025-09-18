package defpackage;

/* renamed from: j91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5259j91 {
    public boolean a = true;
    public float b = Float.NaN;
    public float c = Float.NaN;
    public float d = Float.NaN;
    public float e = Float.NaN;
    public float f = Float.NaN;
    public int g = 5;

    public final int a() {
        float f = !Float.isNaN(this.b) ? this.b : 14.0f;
        return (int) (this.a ? Math.ceil(AbstractC7586vL1.c(f, d())) : Math.ceil(AbstractC7586vL1.b(f)));
    }

    public final float b() {
        if (Float.isNaN(this.d)) {
            return Float.NaN;
        }
        return (this.a ? AbstractC7586vL1.c(this.d, d()) : AbstractC7586vL1.b(this.d)) / a();
    }

    public final float c() {
        if (Float.isNaN(this.c)) {
            return Float.NaN;
        }
        float fC = this.a ? AbstractC7586vL1.c(this.c, d()) : AbstractC7586vL1.b(this.c);
        if (Float.isNaN(this.f)) {
            return fC;
        }
        float f = this.f;
        return f > fC ? f : fC;
    }

    public final float d() {
        if (Float.isNaN(this.e)) {
            return 0.0f;
        }
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextAttributes {\n  getAllowFontScaling(): ");
        sb.append(this.a);
        sb.append("\n  getFontSize(): ");
        sb.append(this.b);
        sb.append("\n  getEffectiveFontSize(): ");
        sb.append(a());
        sb.append("\n  getHeightOfTallestInlineViewOrImage(): ");
        sb.append(this.f);
        sb.append("\n  getLetterSpacing(): ");
        sb.append(this.d);
        sb.append("\n  getEffectiveLetterSpacing(): ");
        sb.append(b());
        sb.append("\n  getLineHeight(): ");
        sb.append(this.c);
        sb.append("\n  getEffectiveLineHeight(): ");
        sb.append(c());
        sb.append("\n  getTextTransform(): ");
        int i = this.g;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNSET" : "CAPITALIZE" : "LOWERCASE" : "UPPERCASE" : "NONE");
        sb.append("\n  getMaxFontSizeMultiplier(): ");
        sb.append(this.e);
        sb.append("\n  getEffectiveMaxFontSizeMultiplier(): ");
        sb.append(d());
        sb.append("\n}");
        return sb.toString();
    }
}
