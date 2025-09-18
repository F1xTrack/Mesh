package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: i7 */
/* loaded from: classes.dex */
public final class C4222i7 extends EQ1 {

    /* renamed from: a */
    public final /* synthetic */ int f28826a;

    /* renamed from: b */
    public final /* synthetic */ int f28827b;

    /* renamed from: c */
    public final /* synthetic */ WeakReference f28828c;

    /* renamed from: d */
    public final /* synthetic */ C6532o7 f28829d;

    public C4222i7(C6532o7 c6532o7, int i, int i2, WeakReference weakReference) {
        this.f28829d = c6532o7;
        this.f28826a = i;
        this.f28827b = i2;
        this.f28828c = weakReference;
    }

    @Override // p000.EQ1
    /* renamed from: d */
    public final void mo2268d(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f28826a) != -1) {
            typeface = AbstractC6469n7.m23079a(typeface, i, (this.f28827b & 2) != 0);
        }
        C6532o7 c6532o7 = this.f28829d;
        if (c6532o7.f38817m) {
            c6532o7.f38816l = typeface;
            TextView textView = (TextView) this.f28828c.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC6217j7(textView, typeface, c6532o7.f38814j, 0));
                } else {
                    textView.setTypeface(typeface, c6532o7.f38814j);
                }
            }
        }
    }

    @Override // p000.EQ1
    /* renamed from: c */
    public final void mo2267c(int i) {
    }
}
