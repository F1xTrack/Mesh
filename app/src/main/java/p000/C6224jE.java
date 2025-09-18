package p000;

import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: jE */
/* loaded from: classes.dex */
public final class C6224jE {

    /* renamed from: b */
    public int f34990b;

    /* renamed from: c */
    public int f34991c;

    /* renamed from: e */
    public boolean f34993e = true;

    /* renamed from: a */
    public int f34989a = 65536;

    /* renamed from: d */
    public int f34992d = 0;

    /* renamed from: f */
    public Object f34994f = new C0822N3[100];

    /* renamed from: a */
    public void m22006a(RecyclerView recyclerView) {
        int i = this.f34992d;
        if (i >= 0) {
            this.f34992d = -1;
            recyclerView.m10249Q(i);
            this.f34993e = false;
        } else if (this.f34993e) {
            BaseInterpolator baseInterpolator = (BaseInterpolator) this.f34994f;
            if (baseInterpolator != null && this.f34991c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.f34991c;
            if (i2 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.f16503e0.m5670c(this.f34989a, this.f34990b, i2, baseInterpolator);
            this.f34993e = false;
        }
    }

    /* renamed from: b */
    public synchronized void m22007b(int i) {
        boolean z = i < this.f34990b;
        this.f34990b = i;
        if (z) {
            m22008c();
        }
    }

    /* renamed from: c */
    public synchronized void m22008c() {
        int iMax = Math.max(0, AbstractC7485Dh1.m1822g(this.f34990b, this.f34989a) - this.f34991c);
        int i = this.f34992d;
        if (iMax >= i) {
            return;
        }
        Arrays.fill((C0822N3[]) this.f34994f, iMax, i, (Object) null);
        this.f34992d = iMax;
    }
}
