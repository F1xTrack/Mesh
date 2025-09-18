package p000;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class T61 implements Closeable {

    /* renamed from: b */
    public final Surface f11157b;

    /* renamed from: c */
    public final int f11158c;

    /* renamed from: d */
    public final Size f11159d;

    /* renamed from: e */
    public final float[] f11160e;

    /* renamed from: f */
    public InterfaceC6650py f11161f;

    /* renamed from: g */
    public C20 f11162g;

    /* renamed from: j */
    public final C0489Hl f11165j;

    /* renamed from: k */
    public C0300El f11166k;

    /* renamed from: a */
    public final Object f11156a = new Object();

    /* renamed from: h */
    public boolean f11163h = false;

    /* renamed from: i */
    public boolean f11164i = false;

    public T61(Surface surface, int i, Size size, C0671Ke c0671Ke, C0671Ke c0671Ke2) {
        float[] fArr = new float[16];
        this.f11160e = fArr;
        this.f11157b = surface;
        this.f11158c = i;
        this.f11159d = size;
        m7548a(fArr, new float[16], c0671Ke);
        m7548a(new float[16], new float[16], c0671Ke2);
        this.f11165j = AbstractC11797yQ1.m26149b(new C8450Vw0(21, this));
    }

    /* renamed from: a */
    public static void m7548a(float[] fArr, float[] fArr2, C0671Ke c0671Ke) {
        Matrix.setIdentityM(fArr, 0);
        if (c0671Ke == null) {
            return;
        }
        AbstractC8041Nz1.m5918c(fArr);
        int i = c0671Ke.f6241d;
        AbstractC8041Nz1.m5917b(i, fArr);
        boolean z = c0671Ke.f6242e;
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeM24953g = AbstractC11184tc1.m24953g(c0671Ke.f6238a, i);
        float f = 0;
        android.graphics.Matrix matrixM24947a = AbstractC11184tc1.m24947a(new RectF(f, f, r6.getWidth(), r6.getHeight()), new RectF(f, f, sizeM24953g.getWidth(), sizeM24953g.getHeight()), i, z);
        RectF rectF = new RectF(c0671Ke.f6239b);
        matrixM24947a.mapRect(rectF);
        float width = rectF.left / sizeM24953g.getWidth();
        float height = ((sizeM24953g.getHeight() - rectF.height()) - rectF.top) / sizeM24953g.getHeight();
        float fWidth = rectF.width() / sizeM24953g.getWidth();
        float fHeight = rectF.height() / sizeM24953g.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        Matrix.setIdentityM(fArr2, 0);
        AbstractC8041Nz1.m5918c(fArr2);
        InterfaceC6972uo interfaceC6972uo = c0671Ke.f6240c;
        if (interfaceC6972uo != null) {
            AbstractC9104dM1.m17550i(interfaceC6972uo.mo1339m(), "Camera has no transform.");
            AbstractC8041Nz1.m5917b(interfaceC6972uo.mo1328b().mo2391c(), fArr2);
            if (interfaceC6972uo.mo1331e()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    /* renamed from: c */
    public final Surface m7549c(C20 c20, InterfaceC6650py interfaceC6650py) {
        boolean z;
        synchronized (this.f11156a) {
            this.f11162g = c20;
            this.f11161f = interfaceC6650py;
            z = this.f11163h;
        }
        if (z) {
            m7550m();
        }
        return this.f11157b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f11156a) {
            try {
                if (!this.f11164i) {
                    this.f11164i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11166k.m2375b(null);
    }

    /* renamed from: m */
    public final void m7550m() {
        C20 c20;
        InterfaceC6650py interfaceC6650py;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f11156a) {
            try {
                if (this.f11162g == null || (interfaceC6650py = this.f11161f) == null) {
                    this.f11163h = true;
                } else if (!this.f11164i) {
                    atomicReference.set(interfaceC6650py);
                    c20 = this.f11162g;
                    this.f11163h = false;
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
                AbstractC7806Jm0.m4412f("SurfaceOutputImpl");
            }
        }
    }
}
