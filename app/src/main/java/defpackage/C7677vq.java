package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: vq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7677vq extends C2188aj0 {
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7677vq(Object obj, Context context, int i) {
        super(context);
        this.p = i;
        this.q = obj;
    }

    @Override // defpackage.C2188aj0
    public int b(View view, int i) {
        switch (this.p) {
            case 0:
                ((CarouselLayoutManager) this.q).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.C2188aj0
    public int c(View view, int i) {
        switch (this.p) {
            case 0:
                ((CarouselLayoutManager) this.q).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // defpackage.C2188aj0
    public float d(DisplayMetrics displayMetrics) {
        switch (this.p) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // defpackage.C2188aj0
    public int e(int i) {
        switch (this.p) {
            case 1:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // defpackage.C2188aj0
    public PointF f(int i) {
        switch (this.p) {
            case 0:
                ((CarouselLayoutManager) this.q).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // defpackage.C2188aj0
    public void h(View view, C5272jE c5272jE) {
        switch (this.p) {
            case 1:
                C1421Rz0 c1421Rz0 = (C1421Rz0) this.q;
                int[] iArrB = c1421Rz0.b(c1421Rz0.a.getLayoutManager(), view);
                int i = iArrB[0];
                int i2 = iArrB[1];
                int iCeil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.i;
                    c5272jE.a = i;
                    c5272jE.b = i2;
                    c5272jE.c = iCeil;
                    c5272jE.f = decelerateInterpolator;
                    c5272jE.e = true;
                    break;
                }
                break;
            default:
                super.h(view, c5272jE);
                break;
        }
    }
}
