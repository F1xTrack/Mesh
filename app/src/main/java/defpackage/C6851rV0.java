package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: rV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6851rV0 extends C7810wX {
    public InterfaceC7424uV0 d;
    public PointF e;
    public int f;
    public int g;
    public Matrix h;
    public Matrix i;

    @Override // defpackage.C7810wX, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null && (this.f != drawable.getIntrinsicWidth() || this.g != drawable.getIntrinsicHeight())) {
            v();
        }
        if (this.h == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.h);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.C7810wX, defpackage.InterfaceC6110nc1
    public final void e(Matrix matrix) {
        t(matrix);
        Drawable drawable = this.a;
        if (drawable != null && (this.f != drawable.getIntrinsicWidth() || this.g != drawable.getIntrinsicHeight())) {
            v();
        }
        Matrix matrix2 = this.h;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // defpackage.C7810wX, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        v();
    }

    @Override // defpackage.C7810wX
    public final Drawable u(Drawable drawable) {
        Drawable drawableU = super.u(drawable);
        v();
        return drawableU;
    }

    public final void v() {
        Drawable drawable = this.a;
        if (drawable == null) {
            this.g = 0;
            this.f = 0;
            this.h = null;
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.g = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.h = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            drawable.setBounds(bounds);
            this.h = null;
        } else {
            if (this.d == C7042sV0.g) {
                drawable.setBounds(bounds);
                this.h = null;
                return;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            InterfaceC7424uV0 interfaceC7424uV0 = this.d;
            Matrix matrix = this.i;
            PointF pointF = this.e;
            ((AbstractC6268oR1) interfaceC7424uV0).b(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.h = matrix;
        }
    }
}
