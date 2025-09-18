package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: Bn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7393Bn1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C7705Hn1 f1027a;

    /* renamed from: b */
    public final /* synthetic */ C8433Vn1 f1028b;

    /* renamed from: c */
    public final /* synthetic */ C8433Vn1 f1029c;

    /* renamed from: d */
    public final /* synthetic */ int f1030d;

    /* renamed from: e */
    public final /* synthetic */ View f1031e;

    public C7393Bn1(C7705Hn1 c7705Hn1, C8433Vn1 c8433Vn1, C8433Vn1 c8433Vn12, int i, View view) {
        this.f1027a = c7705Hn1;
        this.f1028b = c8433Vn1;
        this.f1029c = c8433Vn12;
        this.f1030d = i;
        this.f1031e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        C7705Hn1 c7705Hn1;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C7705Hn1 c7705Hn12 = this.f1027a;
        c7705Hn12.f4508a.mo2781d(animatedFraction);
        float fMo2779b = c7705Hn12.f4508a.mo2779b();
        PathInterpolator pathInterpolator = C7497Dn1.f2252e;
        int i = Build.VERSION.SDK_INT;
        C8433Vn1 c8433Vn1 = this.f1028b;
        AbstractC7965Mn1 c7913Ln1 = i >= 30 ? new C7913Ln1(c8433Vn1) : i >= 29 ? new C7861Kn1(c8433Vn1) : new C7809Jn1(c8433Vn1);
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.f1030d & i2;
            C8277Sn1 c8277Sn1 = c8433Vn1.f12756a;
            if (i3 == 0) {
                c7913Ln1.mo5106c(i2, c8277Sn1.mo5837f(i2));
                f = fMo2779b;
                c7705Hn1 = c7705Hn12;
            } else {
                J80 j80Mo5837f = c8277Sn1.mo5837f(i2);
                J80 j80Mo5837f2 = this.f1029c.f12756a.mo5837f(i2);
                int i4 = (int) (((j80Mo5837f.f5352a - j80Mo5837f2.f5352a) * r10) + 0.5d);
                int i5 = (int) (((j80Mo5837f.f5353b - j80Mo5837f2.f5353b) * r10) + 0.5d);
                f = fMo2779b;
                int i6 = (int) (((j80Mo5837f.f5354c - j80Mo5837f2.f5354c) * r10) + 0.5d);
                float f2 = (j80Mo5837f.f5355d - j80Mo5837f2.f5355d) * (1.0f - fMo2779b);
                c7705Hn1 = c7705Hn12;
                c7913Ln1.mo5106c(i2, C8433Vn1.m8550e(j80Mo5837f, i4, i5, i6, (int) (f2 + 0.5d)));
            }
            i2 <<= 1;
            fMo2779b = f;
            c7705Hn12 = c7705Hn1;
        }
        C7497Dn1.m1894g(this.f1031e, c7913Ln1.mo4414b(), Collections.singletonList(c7705Hn12));
    }
}
