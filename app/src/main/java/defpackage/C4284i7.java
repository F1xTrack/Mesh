package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: i7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4284i7 extends EQ1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ C6206o7 d;

    public C4284i7(C6206o7 c6206o7, int i, int i2, WeakReference weakReference) {
        this.d = c6206o7;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.EQ1
    public final void d(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = AbstractC6015n7.a(typeface, i, (this.b & 2) != 0);
        }
        C6206o7 c6206o7 = this.d;
        if (c6206o7.m) {
            c6206o7.l = typeface;
            TextView textView = (TextView) this.c.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC5251j7(textView, typeface, c6206o7.j, 0));
                } else {
                    textView.setTypeface(typeface, c6206o7.j);
                }
            }
        }
    }

    @Override // defpackage.EQ1
    public final void c(int i) {
    }
}
