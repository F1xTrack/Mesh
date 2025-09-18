package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* renamed from: iD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4303iD0 {
    public Size a;
    public Rect b;
    public int c;
    public Matrix d;
    public int e;
    public boolean f;
    public boolean g;
    public EnumC5461kD0 h;

    public final Matrix a(Size size, int i, Rect rect) {
        Matrix matrix = null;
        if (!f()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (f()) {
            matrix = new Matrix(this.d);
            matrix.postConcat(c(size, i));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    public final Size b() {
        return AbstractC7255tc1.c(this.c) ? new Size(this.b.height(), this.b.width()) : new Size(this.b.width(), this.b.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Matrix c(android.util.Size r8, int r9) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4303iD0.c(android.util.Size, int):android.graphics.Matrix");
    }

    public final Matrix d() {
        AbstractC3377dM1.i(f(), null);
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        return AbstractC7255tc1.a(rectF, rectF, !this.g ? this.c : -AbstractC4346iR1.d(this.e), false);
    }

    public final RectF e(Size size, int i) {
        AbstractC3377dM1.i(f(), null);
        Matrix matrixC = c(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        matrixC.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.b == null || this.a == null || !(!this.g || this.e != -1)) ? false : true;
    }
}
