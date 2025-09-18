package defpackage;

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

/* renamed from: kM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5487kM extends C6557py0 {
    public int o = -1;
    public int p = -1;
    public final C5213iw q;
    public final C5213iw r;

    public C5487kM(C5213iw c5213iw, C5213iw c5213iw2) {
        this.q = c5213iw;
        this.r = c5213iw2;
    }

    @Override // defpackage.C6557py0
    public final C0731Jd f(CM cm, Map map) throws Throwable {
        C0731Jd c0731JdF = super.f(cm, map);
        this.o = AbstractC3306d00.g();
        this.p = AbstractC3306d00.g();
        return c0731JdF;
    }

    public final void n(long j, Surface surface, T61 t61, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        AbstractC3306d00.d((AtomicBoolean) this.d, true);
        AbstractC3306d00.c((Thread) this.f);
        HashMap map = (HashMap) this.e;
        AbstractC3377dM1.i(map.containsKey(surface), "The surface is not registered.");
        C3619ee c3619eeC = (C3619ee) map.get(surface);
        Objects.requireNonNull(c3619eeC);
        if (c3619eeC == AbstractC3306d00.j) {
            c3619eeC = c(surface);
            if (c3619eeC == null) {
                return;
            } else {
                map.put(surface, c3619eeC);
            }
        }
        Surface surface2 = this.b;
        EGLSurface eGLSurface = c3619eeC.a;
        if (surface != surface2) {
            g(eGLSurface);
            this.b = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        C3619ee c3619ee = c3619eeC;
        o(c3619ee, t61, surfaceTexture, this.q, this.o);
        o(c3619ee, t61, surfaceTexture2, this.r, this.p);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.g, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.g, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        AbstractC0759Jm0.f("DualOpenGlRenderer");
        j(surface, false);
    }

    public final void o(C3619ee c3619ee, T61 t61, SurfaceTexture surfaceTexture, C5213iw c5213iw, int i) {
        m(i);
        int i2 = c3619ee.b;
        int i3 = c3619ee.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, t61.e, 0);
        AbstractC2240b00 abstractC2240b00 = (AbstractC2240b00) this.m;
        abstractC2240b00.getClass();
        if (abstractC2240b00 instanceof C2430c00) {
            GLES20.glUniformMatrix4fv(((C2430c00) abstractC2240b00).f, 1, false, fArr2, 0);
            AbstractC3306d00.b("glUniformMatrix4fv");
        }
        float fFloatValue = ((Float) c5213iw.c.a).floatValue();
        C2045Zz0 c2045Zz0 = c5213iw.c;
        Size size = new Size((int) (fFloatValue * i2), (int) (((Float) c2045Zz0.b).floatValue() * i3));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Object obj = c2045Zz0.a;
        float fFloatValue2 = ((Float) obj).floatValue();
        Object obj2 = c2045Zz0.b;
        if (fFloatValue2 != 0.0f || ((Float) obj2).floatValue() != 0.0f) {
            C2045Zz0 c2045Zz02 = c5213iw.b;
            Matrix.translateM(fArr4, 0, ((Float) c2045Zz02.a).floatValue() / ((Float) obj).floatValue(), ((Float) c2045Zz02.b).floatValue() / ((Float) obj2).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(abstractC2240b00.b, 1, false, fArr5, 0);
        AbstractC3306d00.b("glUniformMatrix4fv");
        GLES20.glUniform1f(abstractC2240b00.c, c5213iw.a);
        AbstractC3306d00.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC3306d00.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
