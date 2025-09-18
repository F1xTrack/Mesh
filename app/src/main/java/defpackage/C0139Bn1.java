package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: Bn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139Bn1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0607Hn1 a;
    public final /* synthetic */ C1698Vn1 b;
    public final /* synthetic */ C1698Vn1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public C0139Bn1(C0607Hn1 c0607Hn1, C1698Vn1 c1698Vn1, C1698Vn1 c1698Vn12, int i, View view) {
        this.a = c0607Hn1;
        this.b = c1698Vn1;
        this.c = c1698Vn12;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        C0607Hn1 c0607Hn1;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0607Hn1 c0607Hn12 = this.a;
        c0607Hn12.a.d(animatedFraction);
        float fB = c0607Hn12.a.b();
        PathInterpolator pathInterpolator = C0295Dn1.e;
        int i = Build.VERSION.SDK_INT;
        C1698Vn1 c1698Vn1 = this.b;
        AbstractC0996Mn1 c0919Ln1 = i >= 30 ? new C0919Ln1(c1698Vn1) : i >= 29 ? new C0841Kn1(c1698Vn1) : new C0763Jn1(c1698Vn1);
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.d & i2;
            C1464Sn1 c1464Sn1 = c1698Vn1.a;
            if (i3 == 0) {
                c0919Ln1.c(i2, c1464Sn1.f(i2));
                f = fB;
                c0607Hn1 = c0607Hn12;
            } else {
                J80 j80F = c1464Sn1.f(i2);
                J80 j80F2 = this.c.a.f(i2);
                int i4 = (int) (((j80F.a - j80F2.a) * r10) + 0.5d);
                int i5 = (int) (((j80F.b - j80F2.b) * r10) + 0.5d);
                f = fB;
                int i6 = (int) (((j80F.c - j80F2.c) * r10) + 0.5d);
                float f2 = (j80F.d - j80F2.d) * (1.0f - fB);
                c0607Hn1 = c0607Hn12;
                c0919Ln1.c(i2, C1698Vn1.e(j80F, i4, i5, i6, (int) (f2 + 0.5d)));
            }
            i2 <<= 1;
            fB = f;
            c0607Hn12 = c0607Hn1;
        }
        C0295Dn1.g(this.e, c0919Ln1.b(), Collections.singletonList(c0607Hn12));
    }
}
