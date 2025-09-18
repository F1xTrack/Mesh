package defpackage;

import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: jE */
/* loaded from: classes.dex */
public final class C5272jE {
    public int b;
    public int c;
    public boolean e = true;
    public int a = 65536;
    public int d = 0;
    public Object f = new N3[100];

    public void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.Q(i);
            this.e = false;
        } else if (this.e) {
            BaseInterpolator baseInterpolator = (BaseInterpolator) this.f;
            if (baseInterpolator != null && this.c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.c;
            if (i2 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.e0.c(this.a, this.b, i2, baseInterpolator);
            this.e = false;
        }
    }

    public synchronized void b(int i) {
        boolean z = i < this.b;
        this.b = i;
        if (z) {
            c();
        }
    }

    public synchronized void c() {
        int iMax = Math.max(0, AbstractC0277Dh1.g(this.b, this.a) - this.c);
        int i = this.d;
        if (iMax >= i) {
            return;
        }
        Arrays.fill((N3[]) this.f, iMax, i, (Object) null);
        this.d = iMax;
    }
}
