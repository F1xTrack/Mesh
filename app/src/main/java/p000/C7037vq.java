package p000;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: vq */
/* loaded from: classes.dex */
public final class C7037vq extends C8760aj0 {

    /* renamed from: p */
    public final /* synthetic */ int f44551p;

    /* renamed from: q */
    public final /* synthetic */ Object f44552q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7037vq(Object obj, Context context, int i) {
        super(context);
        this.f44551p = i;
        this.f44552q = obj;
    }

    @Override // p000.C8760aj0
    /* renamed from: b */
    public int mo9790b(View view, int i) {
        switch (this.f44551p) {
            case 0:
                ((CarouselLayoutManager) this.f44552q).getClass();
                return 0;
            default:
                return super.mo9790b(view, i);
        }
    }

    @Override // p000.C8760aj0
    /* renamed from: c */
    public int mo9791c(View view, int i) {
        switch (this.f44551p) {
            case 0:
                ((CarouselLayoutManager) this.f44552q).getClass();
                return 0;
            default:
                return super.mo9791c(view, i);
        }
    }

    @Override // p000.C8760aj0
    /* renamed from: d */
    public float mo9792d(DisplayMetrics displayMetrics) {
        switch (this.f44551p) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo9792d(displayMetrics);
        }
    }

    @Override // p000.C8760aj0
    /* renamed from: e */
    public int mo9793e(int i) {
        switch (this.f44551p) {
            case 1:
                return Math.min(100, super.mo9793e(i));
            default:
                return super.mo9793e(i);
        }
    }

    @Override // p000.C8760aj0
    /* renamed from: f */
    public PointF mo9794f(int i) {
        switch (this.f44551p) {
            case 0:
                ((CarouselLayoutManager) this.f44552q).getClass();
                return null;
            default:
                return super.mo9794f(i);
        }
    }

    @Override // p000.C8760aj0
    /* renamed from: h */
    public void mo9796h(View view, C6224jE c6224jE) {
        switch (this.f44551p) {
            case 1:
                C8248Rz0 c8248Rz0 = (C8248Rz0) this.f44552q;
                int[] iArrM7139b = c8248Rz0.m7139b(c8248Rz0.f10511a.getLayoutManager(), view);
                int i = iArrM7139b[0];
                int i2 = iArrM7139b[1];
                int iCeil = (int) Math.ceil(mo9793e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (iCeil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f15645i;
                    c6224jE.f34989a = i;
                    c6224jE.f34990b = i2;
                    c6224jE.f34991c = iCeil;
                    c6224jE.f34994f = decelerateInterpolator;
                    c6224jE.f34993e = true;
                    break;
                }
                break;
            default:
                super.mo9796h(view, c6224jE);
                break;
        }
    }
}
