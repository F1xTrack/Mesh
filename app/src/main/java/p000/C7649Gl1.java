package p000;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: Gl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7649Gl1 extends C7597Fl1 {
    @Override // p000.T02
    /* renamed from: b */
    public final float mo3150b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p000.T02
    /* renamed from: c */
    public final void mo3151c(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p000.C7597Fl1, p000.T02
    /* renamed from: d */
    public final void mo2766d(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p000.C7597Fl1
    /* renamed from: e */
    public final void mo2767e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p000.C7597Fl1
    /* renamed from: f */
    public final void mo2768f(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p000.C7597Fl1
    /* renamed from: g */
    public final void mo2769g(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
