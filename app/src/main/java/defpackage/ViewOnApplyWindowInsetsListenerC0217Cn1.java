package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: Cn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0217Cn1 implements View.OnApplyWindowInsetsListener {
    public final AbstractC0061An1 a;
    public C1698Vn1 b;

    public ViewOnApplyWindowInsetsListenerC0217Cn1(View view, AbstractC0061An1 abstractC0061An1) {
        C1698Vn1 c1698Vn1B;
        this.a = abstractC0061An1;
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        C1698Vn1 c1698Vn1A = AbstractC4212hk1.a(view);
        if (c1698Vn1A != null) {
            int i = Build.VERSION.SDK_INT;
            c1698Vn1B = (i >= 30 ? new C0919Ln1(c1698Vn1A) : i >= 29 ? new C0841Kn1(c1698Vn1A) : new C0763Jn1(c1698Vn1A)).b();
        } else {
            c1698Vn1B = null;
        }
        this.b = c1698Vn1B;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1464Sn1 c1464Sn1;
        if (!view.isLaidOut()) {
            this.b = C1698Vn1.h(view, windowInsets);
            return C0295Dn1.i(view, windowInsets);
        }
        C1698Vn1 c1698Vn1H = C1698Vn1.h(view, windowInsets);
        if (this.b == null) {
            WeakHashMap weakHashMap = AbstractC6897rk1.a;
            this.b = AbstractC4212hk1.a(view);
        }
        if (this.b == null) {
            this.b = c1698Vn1H;
            return C0295Dn1.i(view, windowInsets);
        }
        AbstractC0061An1 abstractC0061An1J = C0295Dn1.j(view);
        if (abstractC0061An1J != null && Objects.equals(abstractC0061An1J.mDispachedInsets, windowInsets)) {
            return C0295Dn1.i(view, windowInsets);
        }
        C1698Vn1 c1698Vn1 = this.b;
        int i = 1;
        int i2 = 0;
        while (true) {
            c1464Sn1 = c1698Vn1H.a;
            if (i > 256) {
                break;
            }
            if (!c1464Sn1.f(i).equals(c1698Vn1.a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return C0295Dn1.i(view, windowInsets);
        }
        C1698Vn1 c1698Vn12 = this.b;
        C0607Hn1 c0607Hn1 = new C0607Hn1(i2, (i2 & 8) != 0 ? c1464Sn1.f(8).d > c1698Vn12.a.f(8).d ? C0295Dn1.e : C0295Dn1.f : C0295Dn1.g, 160L);
        c0607Hn1.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0607Hn1.a.a());
        J80 j80F = c1464Sn1.f(i2);
        J80 j80F2 = c1698Vn12.a.f(i2);
        int iMin = Math.min(j80F.a, j80F2.a);
        int i3 = j80F.b;
        int i4 = j80F2.b;
        int iMin2 = Math.min(i3, i4);
        int i5 = j80F.c;
        int i6 = j80F2.c;
        int iMin3 = Math.min(i5, i6);
        int i7 = j80F.d;
        int i8 = i2;
        int i9 = j80F2.d;
        C8430zn1 c8430zn1 = new C8430zn1(J80.b(iMin, iMin2, iMin3, Math.min(i7, i9)), J80.b(Math.max(j80F.a, j80F2.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        C0295Dn1.f(view, c0607Hn1, windowInsets, false);
        duration.addUpdateListener(new C0139Bn1(c0607Hn1, c1698Vn1H, c1698Vn12, i8, view));
        duration.addListener(new C0184Cc1(c0607Hn1, view, 2));
        ViewTreeObserverOnPreDrawListenerC5411jy0.a(view, new RunnableC6720qp(view, c0607Hn1, c8430zn1, duration, 4));
        this.b = c1698Vn1H;
        return C0295Dn1.i(view, windowInsets);
    }
}
