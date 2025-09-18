package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: rV0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10913rV0 extends C7081wX {

    /* renamed from: d */
    public InterfaceC11297uV0 f41687d;

    /* renamed from: e */
    public PointF f41688e;

    /* renamed from: f */
    public int f41689f;

    /* renamed from: g */
    public int f41690g;

    /* renamed from: h */
    public Matrix f41691h;

    /* renamed from: i */
    public Matrix f41692i;

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f44934a;
        if (drawable != null && (this.f41689f != drawable.getIntrinsicWidth() || this.f41690g != drawable.getIntrinsicHeight())) {
            m24393v();
        }
        if (this.f41691h == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f41691h);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p000.C7081wX, p000.InterfaceC10416nc1
    /* renamed from: e */
    public final void mo8644e(Matrix matrix) {
        m25643t(matrix);
        Drawable drawable = this.f44934a;
        if (drawable != null && (this.f41689f != drawable.getIntrinsicWidth() || this.f41690g != drawable.getIntrinsicHeight())) {
            m24393v();
        }
        Matrix matrix2 = this.f41691h;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        m24393v();
    }

    @Override // p000.C7081wX
    /* renamed from: u */
    public final Drawable mo24392u(Drawable drawable) {
        Drawable drawableMo24392u = super.mo24392u(drawable);
        m24393v();
        return drawableMo24392u;
    }

    /* renamed from: v */
    public final void m24393v() {
        Drawable drawable = this.f44934a;
        if (drawable == null) {
            this.f41690g = 0;
            this.f41689f = 0;
            this.f41691h = null;
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.f41689f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f41690g = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.f41691h = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            drawable.setBounds(bounds);
            this.f41691h = null;
        } else {
            if (this.f41687d == C11041sV0.f42464g) {
                drawable.setBounds(bounds);
                this.f41691h = null;
                return;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            InterfaceC11297uV0 interfaceC11297uV0 = this.f41687d;
            Matrix matrix = this.f41692i;
            PointF pointF = this.f41688e;
            ((AbstractC10522oR1) interfaceC11297uV0).m23403b(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.f41691h = matrix;
        }
    }
}
