package p000;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kM */
/* loaded from: classes.dex */
public final class C6295kM extends C10715py0 {

    /* renamed from: o */
    public int f36439o = -1;

    /* renamed from: p */
    public int f36440p = -1;

    /* renamed from: q */
    public final C6205iw f36441q;

    /* renamed from: r */
    public final C6205iw f36442r;

    public C6295kM(C6205iw c6205iw, C6205iw c6205iw2) {
        this.f36441q = c6205iw;
        this.f36442r = c6205iw2;
    }

    @Override // p000.C10715py0
    /* renamed from: f */
    public final C0607Jd mo22192f(C0149CM c0149cm, Map map) throws Throwable {
        C0607Jd c0607JdMo22192f = super.mo22192f(c0149cm, map);
        this.f36439o = AbstractC9055d00.m17458g();
        this.f36440p = AbstractC9055d00.m17458g();
        return c0607JdMo22192f;
    }

    /* renamed from: n */
    public final void m22193n(long j, Surface surface, T61 t61, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        AbstractC9055d00.m17455d((AtomicBoolean) this.f40464d, true);
        AbstractC9055d00.m17454c((Thread) this.f40466f);
        HashMap map = (HashMap) this.f40465e;
        AbstractC9104dM1.m17550i(map.containsKey(surface), "The surface is not registered.");
        C4003ee c4003eeM23908c = (C4003ee) map.get(surface);
        Objects.requireNonNull(c4003eeM23908c);
        if (c4003eeM23908c == AbstractC9055d00.f25759j) {
            c4003eeM23908c = m23908c(surface);
            if (c4003eeM23908c == null) {
                return;
            } else {
                map.put(surface, c4003eeM23908c);
            }
        }
        Surface surface2 = this.f40462b;
        EGLSurface eGLSurface = c4003eeM23908c.f26791a;
        if (surface != surface2) {
            m23911g(eGLSurface);
            this.f40462b = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        C4003ee c4003ee = c4003eeM23908c;
        m22194o(c4003ee, t61, surfaceTexture, this.f36441q, this.f36439o);
        m22194o(c4003ee, t61, surfaceTexture2, this.f36442r, this.f36440p);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f40467g, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f40467g, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        AbstractC7806Jm0.m4412f("DualOpenGlRenderer");
        m23914j(surface, false);
    }

    /* renamed from: o */
    public final void m22194o(C4003ee c4003ee, T61 t61, SurfaceTexture surfaceTexture, C6205iw c6205iw, int i) {
        m23917m(i);
        int i2 = c4003ee.f26792b;
        int i3 = c4003ee.f26793c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, t61.f11160e, 0);
        AbstractC8794b00 abstractC8794b00 = (AbstractC8794b00) this.f40473m;
        abstractC8794b00.getClass();
        if (abstractC8794b00 instanceof C8922c00) {
            GLES20.glUniformMatrix4fv(((C8922c00) abstractC8794b00).f17255f, 1, false, fArr2, 0);
            AbstractC9055d00.m17453b("glUniformMatrix4fv");
        }
        float fFloatValue = ((Float) c6205iw.f34808c.f15267a).floatValue();
        C8664Zz0 c8664Zz0 = c6205iw.f34808c;
        Size size = new Size((int) (fFloatValue * i2), (int) (((Float) c8664Zz0.f15268b).floatValue() * i3));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Object obj = c8664Zz0.f15267a;
        float fFloatValue2 = ((Float) obj).floatValue();
        Object obj2 = c8664Zz0.f15268b;
        if (fFloatValue2 != 0.0f || ((Float) obj2).floatValue() != 0.0f) {
            C8664Zz0 c8664Zz02 = c6205iw.f34807b;
            Matrix.translateM(fArr4, 0, ((Float) c8664Zz02.f15267a).floatValue() / ((Float) obj).floatValue(), ((Float) c8664Zz02.f15268b).floatValue() / ((Float) obj2).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(abstractC8794b00.f16701b, 1, false, fArr5, 0);
        AbstractC9055d00.m17453b("glUniformMatrix4fv");
        GLES20.glUniform1f(abstractC8794b00.f16702c, c6205iw.f34806a);
        AbstractC9055d00.m17453b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC9055d00.m17453b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
