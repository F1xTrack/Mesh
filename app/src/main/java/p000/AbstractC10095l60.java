package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* renamed from: l60 */
/* loaded from: classes.dex */
public abstract class AbstractC10095l60 implements InterfaceC9713i70 {

    /* renamed from: a */
    public C0267EE f36892a;

    /* renamed from: b */
    public volatile int f36893b;

    /* renamed from: c */
    public volatile int f36894c;

    /* renamed from: e */
    public volatile boolean f36896e;

    /* renamed from: f */
    public volatile boolean f36897f;

    /* renamed from: g */
    public Executor f36898g;

    /* renamed from: h */
    public MU0 f36899h;

    /* renamed from: i */
    public ImageWriter f36900i;

    /* renamed from: n */
    public ByteBuffer f36905n;

    /* renamed from: o */
    public ByteBuffer f36906o;

    /* renamed from: p */
    public ByteBuffer f36907p;

    /* renamed from: q */
    public ByteBuffer f36908q;

    /* renamed from: d */
    public volatile int f36895d = 1;

    /* renamed from: j */
    public Rect f36901j = new Rect();

    /* renamed from: k */
    public Rect f36902k = new Rect();

    /* renamed from: l */
    public Matrix f36903l = new Matrix();

    /* renamed from: m */
    public Matrix f36904m = new Matrix();

    /* renamed from: r */
    public final Object f36909r = new Object();

    /* renamed from: s */
    public boolean f36910s = true;

    /* renamed from: a */
    public abstract InterfaceC9457g70 mo22356a(InterfaceC9841j70 interfaceC9841j70);

    /* JADX WARN: Removed duplicated region for block: B:109:0x006b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.InterfaceFutureC7800Jj0 m22357b(final p000.InterfaceC9457g70 r15) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC10095l60.m22357b(g70):Jj0");
    }

    /* renamed from: c */
    public abstract void mo22358c();

    /* renamed from: d */
    public final void m22359d(InterfaceC9457g70 interfaceC9457g70) {
        if (this.f36895d != 1) {
            if (this.f36895d == 2 && this.f36905n == null) {
                this.f36905n = ByteBuffer.allocateDirect(interfaceC9457g70.getHeight() * interfaceC9457g70.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.f36906o == null) {
            this.f36906o = ByteBuffer.allocateDirect(interfaceC9457g70.getHeight() * interfaceC9457g70.getWidth());
        }
        this.f36906o.position(0);
        if (this.f36907p == null) {
            this.f36907p = ByteBuffer.allocateDirect((interfaceC9457g70.getHeight() * interfaceC9457g70.getWidth()) / 4);
        }
        this.f36907p.position(0);
        if (this.f36908q == null) {
            this.f36908q = ByteBuffer.allocateDirect((interfaceC9457g70.getHeight() * interfaceC9457g70.getWidth()) / 4);
        }
        this.f36908q.position(0);
    }

    /* renamed from: e */
    public abstract void mo22360e(InterfaceC9457g70 interfaceC9457g70);

    /* renamed from: f */
    public final void m22361f(int i, int i2, int i3, int i4) {
        int i5 = this.f36893b;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = AbstractC11184tc1.f43173a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f36901j);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f36902k = rect;
        this.f36904m.setConcat(this.f36903l, matrix);
    }

    /* renamed from: g */
    public final void m22362g(InterfaceC9457g70 interfaceC9457g70, int i) {
        MU0 mu0 = this.f36899h;
        if (mu0 == null) {
            return;
        }
        mu0.m5386b();
        int width = interfaceC9457g70.getWidth();
        int height = interfaceC9457g70.getHeight();
        int iMo4039c = this.f36899h.mo4039c();
        int iMo4048l = this.f36899h.mo4048l();
        boolean z = i == 90 || i == 270;
        int i2 = z ? height : width;
        if (!z) {
            width = height;
        }
        this.f36899h = new MU0(AbstractC9575h22.m18702a(i2, width, iMo4039c, iMo4048l));
        if (this.f36895d == 1) {
            ImageWriter imageWriter = this.f36900i;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.f36900i = ImageWriter.newInstance(this.f36899h.mo4044h(), this.f36899h.mo4048l());
        }
    }

    /* renamed from: h */
    public final void m22363h(Executor executor, C0267EE c0267ee) {
        synchronized (this.f36909r) {
            this.f36892a = c0267ee;
            this.f36898g = executor;
        }
    }

    @Override // p000.InterfaceC9713i70
    /* renamed from: k */
    public final void mo504k(InterfaceC9841j70 interfaceC9841j70) {
        try {
            InterfaceC9457g70 interfaceC9457g70Mo22356a = mo22356a(interfaceC9841j70);
            if (interfaceC9457g70Mo22356a != null) {
                mo22360e(interfaceC9457g70Mo22356a);
            }
        } catch (IllegalStateException unused) {
            AbstractC7806Jm0.m4412f("ImageAnalysisAnalyzer");
        }
    }
}
