package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: Gl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523Gl1 extends C0445Fl1 {
    @Override // defpackage.T02
    public final float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.T02
    public final void c(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.C0445Fl1, defpackage.T02
    public final void d(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.C0445Fl1
    public final void e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.C0445Fl1
    public final void f(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.C0445Fl1
    public final void g(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
