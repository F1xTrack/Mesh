package p000;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: n91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10358n91 {

    /* renamed from: c */
    public float f38151c;

    /* renamed from: e */
    public final WeakReference f38153e;

    /* renamed from: f */
    public C9590h91 f38154f;

    /* renamed from: a */
    public final TextPaint f38149a = new TextPaint(1);

    /* renamed from: b */
    public final C0621Jr f38150b = new C0621Jr(1, this);

    /* renamed from: d */
    public boolean f38152d = true;

    public C10358n91(C0872Nr c0872Nr) {
        this.f38153e = new WeakReference(null);
        this.f38153e = new WeakReference(c0872Nr);
    }

    /* renamed from: a */
    public final float m23094a(String str) {
        if (!this.f38152d) {
            return this.f38151c;
        }
        TextPaint textPaint = this.f38149a;
        this.f38151c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f38152d = false;
        return this.f38151c;
    }
}
