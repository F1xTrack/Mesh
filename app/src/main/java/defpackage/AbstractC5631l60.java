package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: l60 */
/* loaded from: classes.dex */
public abstract class AbstractC5631l60 implements InterfaceC4285i70 {
    public EE a;
    public volatile int b;
    public volatile int c;
    public volatile boolean e;
    public volatile boolean f;
    public Executor g;
    public MU0 h;
    public ImageWriter i;
    public ByteBuffer n;
    public ByteBuffer o;
    public ByteBuffer p;
    public ByteBuffer q;
    public volatile int d = 1;
    public Rect j = new Rect();
    public Rect k = new Rect();
    public Matrix l = new Matrix();
    public Matrix m = new Matrix();
    public final Object r = new Object();
    public boolean s = true;

    public abstract InterfaceC3903g70 a(InterfaceC5252j70 interfaceC5252j70);

    /* JADX WARN: Removed duplicated region for block: B:109:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceFutureC0750Jj0 b(final defpackage.InterfaceC3903g70 r15) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5631l60.b(g70):Jj0");
    }

    public abstract void c();

    public final void d(InterfaceC3903g70 interfaceC3903g70) {
        if (this.d != 1) {
            if (this.d == 2 && this.n == null) {
                this.n = ByteBuffer.allocateDirect(interfaceC3903g70.getHeight() * interfaceC3903g70.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.o == null) {
            this.o = ByteBuffer.allocateDirect(interfaceC3903g70.getHeight() * interfaceC3903g70.getWidth());
        }
        this.o.position(0);
        if (this.p == null) {
            this.p = ByteBuffer.allocateDirect((interfaceC3903g70.getHeight() * interfaceC3903g70.getWidth()) / 4);
        }
        this.p.position(0);
        if (this.q == null) {
            this.q = ByteBuffer.allocateDirect((interfaceC3903g70.getHeight() * interfaceC3903g70.getWidth()) / 4);
        }
        this.q.position(0);
    }

    public abstract void e(InterfaceC3903g70 interfaceC3903g70);

    public final void f(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = AbstractC7255tc1.a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.j);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.k = rect;
        this.m.setConcat(this.l, matrix);
    }

    public final void g(InterfaceC3903g70 interfaceC3903g70, int i) {
        MU0 mu0 = this.h;
        if (mu0 == null) {
            return;
        }
        mu0.b();
        int width = interfaceC3903g70.getWidth();
        int height = interfaceC3903g70.getHeight();
        int iC = this.h.c();
        int iL = this.h.l();
        boolean z = i == 90 || i == 270;
        int i2 = z ? height : width;
        if (!z) {
            width = height;
        }
        this.h = new MU0(AbstractC4079h22.a(i2, width, iC, iL));
        if (this.d == 1) {
            ImageWriter imageWriter = this.i;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.i = ImageWriter.newInstance(this.h.h(), this.h.l());
        }
    }

    public final void h(Executor executor, EE ee) {
        synchronized (this.r) {
            this.a = ee;
            this.g = executor;
        }
    }

    @Override // defpackage.InterfaceC4285i70
    public final void k(InterfaceC5252j70 interfaceC5252j70) {
        try {
            InterfaceC3903g70 interfaceC3903g70A = a(interfaceC5252j70);
            if (interfaceC3903g70A != null) {
                e(interfaceC3903g70A);
            }
        } catch (IllegalStateException unused) {
            AbstractC0759Jm0.f("ImageAnalysisAnalyzer");
        }
    }
}
