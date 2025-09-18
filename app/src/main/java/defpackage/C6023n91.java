package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: n91, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6023n91 {
    public float c;
    public final WeakReference e;
    public C4101h91 f;
    public final TextPaint a = new TextPaint(1);
    public final C0773Jr b = new C0773Jr(1, this);
    public boolean d = true;

    public C6023n91(C1084Nr c1084Nr) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(c1084Nr);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.c;
    }
}
