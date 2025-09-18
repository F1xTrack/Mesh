package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: Vy0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8454Vy0 extends C7081wX {

    /* renamed from: d */
    public final Matrix f12888d;

    /* renamed from: e */
    public final int f12889e;

    /* renamed from: f */
    public final int f12890f;

    /* renamed from: g */
    public final Matrix f12891g;

    /* renamed from: h */
    public final RectF f12892h;

    public C8454Vy0(BitmapDrawable bitmapDrawable, int i, int i2) {
        super(bitmapDrawable);
        this.f12891g = new Matrix();
        this.f12892h = new RectF();
        this.f12888d = new Matrix();
        this.f12889e = i - (i % 90);
        this.f12890f = (i2 < 0 || i2 > 8) ? 0 : i2;
    }

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (this.f12889e <= 0 && ((i = this.f12890f) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f12888d);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // p000.C7081wX, p000.InterfaceC10416nc1
    /* renamed from: e */
    public final void mo8644e(Matrix matrix) {
        m25643t(matrix);
        Matrix matrix2 = this.f12888d;
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.f12890f;
        return (i == 5 || i == 7 || this.f12889e % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.f12890f;
        return (i == 5 || i == 7 || this.f12889e % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // p000.C7081wX, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f44934a;
        int i = this.f12890f;
        int i2 = this.f12889e;
        if (i2 <= 0 && (i == 0 || i == 1)) {
            drawable.setBounds(rect);
            return;
        }
        Matrix matrix = this.f12888d;
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i == 7) {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(-1.0f, 1.0f);
        } else if (i == 4) {
            matrix.setScale(1.0f, -1.0f);
        } else if (i != 5) {
            matrix.setRotate(i2, rect.centerX(), rect.centerY());
        } else {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(1.0f, -1.0f);
        }
        Matrix matrix2 = this.f12891g;
        matrix2.reset();
        matrix.invert(matrix2);
        RectF rectF = this.f12892h;
        rectF.set(rect);
        matrix2.mapRect(rectF);
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
