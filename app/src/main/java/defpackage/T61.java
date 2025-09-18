package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class T61 implements Closeable {
    public final Surface b;
    public final int c;
    public final Size d;
    public final float[] e;
    public InterfaceC6556py f;
    public C20 g;
    public final C0599Hl j;
    public C0365El k;
    public final Object a = new Object();
    public boolean h = false;
    public boolean i = false;

    public T61(Surface surface, int i, Size size, C0812Ke c0812Ke, C0812Ke c0812Ke2) {
        float[] fArr = new float[16];
        this.e = fArr;
        this.b = surface;
        this.c = i;
        this.d = size;
        a(fArr, new float[16], c0812Ke);
        a(new float[16], new float[16], c0812Ke2);
        this.j = AbstractC8171yQ1.b(new C1724Vw0(21, this));
    }

    public static void a(float[] fArr, float[] fArr2, C0812Ke c0812Ke) {
        Matrix.setIdentityM(fArr, 0);
        if (c0812Ke == null) {
            return;
        }
        AbstractC1110Nz1.c(fArr);
        int i = c0812Ke.d;
        AbstractC1110Nz1.b(i, fArr);
        boolean z = c0812Ke.e;
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeG = AbstractC7255tc1.g(c0812Ke.a, i);
        float f = 0;
        android.graphics.Matrix matrixA = AbstractC7255tc1.a(new RectF(f, f, r6.getWidth(), r6.getHeight()), new RectF(f, f, sizeG.getWidth(), sizeG.getHeight()), i, z);
        RectF rectF = new RectF(c0812Ke.b);
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeG.getWidth();
        float height = ((sizeG.getHeight() - rectF.height()) - rectF.top) / sizeG.getHeight();
        float fWidth = rectF.width() / sizeG.getWidth();
        float fHeight = rectF.height() / sizeG.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        Matrix.setIdentityM(fArr2, 0);
        AbstractC1110Nz1.c(fArr2);
        InterfaceC7480uo interfaceC7480uo = c0812Ke.c;
        if (interfaceC7480uo != null) {
            AbstractC3377dM1.i(interfaceC7480uo.m(), "Camera has no transform.");
            AbstractC1110Nz1.b(interfaceC7480uo.b().c(), fArr2);
            if (interfaceC7480uo.e()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public final Surface c(C20 c20, InterfaceC6556py interfaceC6556py) {
        boolean z;
        synchronized (this.a) {
            this.g = c20;
            this.f = interfaceC6556py;
            z = this.h;
        }
        if (z) {
            m();
        }
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.i) {
                    this.i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.k.b(null);
    }

    public final void m() {
        C20 c20;
        InterfaceC6556py interfaceC6556py;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                if (this.g == null || (interfaceC6556py = this.f) == null) {
                    this.h = true;
                } else if (!this.i) {
                    atomicReference.set(interfaceC6556py);
                    c20 = this.g;
                    this.h = false;
                }
                c20 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c20 != null) {
            try {
                c20.execute(new MD0(this, 25, atomicReference));
            } catch (RejectedExecutionException unused) {
                AbstractC0759Jm0.f("SurfaceOutputImpl");
            }
        }
    }
}
