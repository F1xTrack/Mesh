package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* renamed from: iD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9725iD0 {

    /* renamed from: a */
    public Size f28960a;

    /* renamed from: b */
    public Rect f28961b;

    /* renamed from: c */
    public int f28962c;

    /* renamed from: d */
    public Matrix f28963d;

    /* renamed from: e */
    public int f28964e;

    /* renamed from: f */
    public boolean f28965f;

    /* renamed from: g */
    public boolean f28966g;

    /* renamed from: h */
    public EnumC9981kD0 f28967h;

    /* renamed from: a */
    public final Matrix m18981a(Size size, int i, Rect rect) {
        Matrix matrix = null;
        if (!m18986f()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (m18986f()) {
            matrix = new Matrix(this.f28963d);
            matrix.postConcat(m18983c(size, i));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    /* renamed from: b */
    public final Size m18982b() {
        return AbstractC11184tc1.m24949c(this.f28962c) ? new Size(this.f28961b.height(), this.f28961b.width()) : new Size(this.f28961b.width(), this.f28961b.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Matrix m18983c(android.util.Size r8, int r9) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9725iD0.m18983c(android.util.Size, int):android.graphics.Matrix");
    }

    /* renamed from: d */
    public final Matrix m18984d() {
        AbstractC9104dM1.m17550i(m18986f(), null);
        RectF rectF = new RectF(0.0f, 0.0f, this.f28960a.getWidth(), this.f28960a.getHeight());
        return AbstractC11184tc1.m24947a(rectF, rectF, !this.f28966g ? this.f28962c : -AbstractC9754iR1.m19040d(this.f28964e), false);
    }

    /* renamed from: e */
    public final RectF m18985e(Size size, int i) {
        AbstractC9104dM1.m17550i(m18986f(), null);
        Matrix matrixM18983c = m18983c(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.f28960a.getWidth(), this.f28960a.getHeight());
        matrixM18983c.mapRect(rectF);
        return rectF;
    }

    /* renamed from: f */
    public final boolean m18986f() {
        return (this.f28961b == null || this.f28960a == null || !(!this.f28966g || this.f28964e != -1)) ? false : true;
    }
}
