package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: py0 */
/* loaded from: classes.dex */
public class C6557py0 {
    public final /* synthetic */ int a;
    public Surface b;
    public int c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public C6557py0() {
        this.a = 0;
        this.d = new AtomicBoolean(false);
        this.e = new HashMap();
        this.g = EGL14.EGL_NO_DISPLAY;
        this.h = EGL14.EGL_NO_CONTEXT;
        this.i = AbstractC3306d00.a;
        this.k = EGL14.EGL_NO_SURFACE;
        this.l = Collections.emptyMap();
        this.m = null;
        this.n = EnumC2049a00.a;
        this.c = -1;
    }

    public void a() {
        int iX = AbstractC8235ym.x(this.c);
        if (iX == 0 || iX == 1) {
            l();
            return;
        }
        if (iX == 2 || iX == 3) {
            AbstractC0759Jm0.f("VideoEncoderSession");
            this.c = 3;
        } else {
            if (iX == 4) {
                AbstractC0759Jm0.f("VideoEncoderSession");
                return;
            }
            throw new IllegalStateException("State " + F91.F(this.c) + " is not handled");
        }
    }

    public void b(CM cm, C1155Oo1 c1155Oo1) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.g = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.g, iArr, 0, iArr, 1)) {
            this.g = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (c1155Oo1 != null) {
            String str = iArr[0] + "." + iArr[1];
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            c1155Oo1.b = str;
        }
        int i = cm.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.g, new int[]{12324, i, 12323, i, 12322, i, 12321, cm.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, cm.a() ? 64 : 4, 12610, cm.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.g, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, cm.a() ? 3 : 2, 12344}, 0);
        AbstractC3306d00.a("eglCreateContext");
        this.j = eGLConfig;
        this.h = eGLContextEglCreateContext;
        EGL14.eglQueryContext((EGLDisplay) this.g, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    public C3619ee c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = (EGLDisplay) this.g;
            EGLConfig eGLConfig = (EGLConfig) this.j;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceH = AbstractC3306d00.h(eGLDisplay, eGLConfig, surface, (int[]) this.i);
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.g;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceH, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return new C3619ee(eGLSurfaceH, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            e.getMessage();
            AbstractC0759Jm0.f("OpenGlRenderer");
            return null;
        }
    }

    public void d() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.g;
        EGLConfig eGLConfig = (EGLConfig) this.j;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = AbstractC3306d00.a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        AbstractC3306d00.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.k = eGLSurfaceEglCreatePbufferSurface;
    }

    public C2045Zz0 e(CM cm) {
        AbstractC3306d00.d((AtomicBoolean) this.d, false);
        try {
            b(cm, null);
            d();
            g((EGLSurface) this.k);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.g, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new C2045Zz0(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            e.getMessage();
            AbstractC0759Jm0.f("OpenGlRenderer");
            return new C2045Zz0("", "");
        } finally {
            i();
        }
    }

    public C0731Jd f(CM cm, Map map) throws Throwable {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.d;
        AbstractC3306d00.d(atomicBoolean, false);
        C1155Oo1 c1155Oo1 = new C1155Oo1();
        c1155Oo1.a = "0.0";
        c1155Oo1.b = "0.0";
        c1155Oo1.c = "";
        c1155Oo1.d = "";
        try {
            if (cm.a()) {
                C2045Zz0 c2045Zz0E = e(cm);
                String str = (String) c2045Zz0E.a;
                str.getClass();
                String str2 = (String) c2045Zz0E.b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    AbstractC0759Jm0.f("OpenGlRenderer");
                    cm = CM.d;
                }
                int[] iArr = AbstractC3306d00.a;
                if (cm.a == 3) {
                    if (str2.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                        iArr = AbstractC3306d00.b;
                    } else {
                        AbstractC0759Jm0.f("GLUtils");
                    }
                }
                this.i = iArr;
                c1155Oo1.c = str;
                c1155Oo1.d = str2;
            }
            b(cm, c1155Oo1);
            d();
            g((EGLSurface) this.k);
            String strI = AbstractC3306d00.i();
            if (strI == null) {
                throw new NullPointerException("Null glVersion");
            }
            c1155Oo1.a = strI;
            this.l = AbstractC3306d00.f(cm, map);
            int iG = AbstractC3306d00.g();
            this.c = iG;
            m(iG);
            this.f = Thread.currentThread();
            atomicBoolean.set(true);
            String strI2 = ((String) c1155Oo1.a) == null ? " glVersion" : "";
            if (((String) c1155Oo1.b) == null) {
                strI2 = strI2.concat(" eglVersion");
            }
            if (((String) c1155Oo1.c) == null) {
                strI2 = AbstractC8235ym.i(strI2, " glExtensions");
            }
            if (((String) c1155Oo1.d) == null) {
                strI2 = AbstractC8235ym.i(strI2, " eglExtensions");
            }
            if (strI2.isEmpty()) {
                return new C0731Jd((String) c1155Oo1.a, (String) c1155Oo1.b, (String) c1155Oo1.c, (String) c1155Oo1.d);
            }
            throw new IllegalStateException("Missing required properties:".concat(strI2));
        } catch (IllegalArgumentException e) {
            e = e;
            i();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            i();
            throw e;
        }
    }

    public void g(EGLSurface eGLSurface) {
        ((EGLDisplay) this.g).getClass();
        ((EGLContext) this.h).getClass();
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.g, eGLSurface, eGLSurface, (EGLContext) this.h)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void h(Surface surface) {
        AbstractC3306d00.d((AtomicBoolean) this.d, true);
        AbstractC3306d00.c((Thread) this.f);
        HashMap map = (HashMap) this.e;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, AbstractC3306d00.j);
    }

    public void i() {
        Iterator it = ((Map) this.l).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((AbstractC2240b00) it.next()).a);
        }
        this.l = Collections.emptyMap();
        this.m = null;
        if (!Objects.equals((EGLDisplay) this.g, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.g;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = (HashMap) this.e;
            for (C3619ee c3619ee : map.values()) {
                if (!Objects.equals(c3619ee.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.g, c3619ee.a)) {
                    try {
                        AbstractC3306d00.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        e.toString();
                        AbstractC0759Jm0.f("GLUtils");
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.k, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.g, (EGLSurface) this.k);
                this.k = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.h, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.g, (EGLContext) this.h);
                this.h = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.g);
            this.g = EGL14.EGL_NO_DISPLAY;
        }
        this.j = null;
        this.c = -1;
        this.n = EnumC2049a00.a;
        this.b = null;
        this.f = null;
    }

    public void j(Surface surface, boolean z) {
        if (this.b == surface) {
            this.b = null;
            g((EGLSurface) this.k);
        }
        HashMap map = (HashMap) this.e;
        C3619ee c3619ee = z ? (C3619ee) map.remove(surface) : (C3619ee) map.put(surface, AbstractC3306d00.j);
        if (c3619ee == null || c3619ee == AbstractC3306d00.j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.g, c3619ee.a);
        } catch (RuntimeException e) {
            e.getMessage();
            AbstractC0759Jm0.f("OpenGlRenderer");
        }
    }

    public void k(long j, float[] fArr, Surface surface) {
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
            int i = c3619eeC.b;
            int i2 = c3619eeC.c;
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glScissor(0, 0, i, i2);
        }
        AbstractC2240b00 abstractC2240b00 = (AbstractC2240b00) this.m;
        abstractC2240b00.getClass();
        if (abstractC2240b00 instanceof C2430c00) {
            GLES20.glUniformMatrix4fv(((C2430c00) abstractC2240b00).f, 1, false, fArr, 0);
            AbstractC3306d00.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC3306d00.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.g, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.g, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        AbstractC0759Jm0.f("OpenGlRenderer");
        j(surface, false);
    }

    public void l() {
        int iX = AbstractC8235ym.x(this.c);
        if (iX == 0) {
            this.c = 5;
            return;
        }
        if (iX != 1 && iX != 2 && iX != 3) {
            if (iX == 4) {
                AbstractC0759Jm0.f("VideoEncoderSession");
                return;
            }
            throw new IllegalStateException("State " + F91.F(this.c) + " is not handled");
        }
        this.c = 5;
        ((C0365El) this.n).b((C7020sO) this.g);
        this.h = null;
        C7020sO c7020sO = (C7020sO) this.g;
        if (c7020sO == null) {
            AbstractC0759Jm0.f("VideoEncoderSession");
            ((C0365El) this.l).b(null);
            return;
        }
        Objects.toString(c7020sO);
        AbstractC0759Jm0.f("VideoEncoderSession");
        C7020sO c7020sO2 = (C7020sO) this.g;
        c7020sO2.getClass();
        c7020sO2.h.execute(new RunnableC4335iO(c7020sO2, 4));
        ((C7020sO) this.g).i.d(new N61(10, this), (ExecutorC5715lY0) this.e);
        this.g = null;
    }

    public void m(int i) {
        AbstractC2240b00 abstractC2240b00 = (AbstractC2240b00) ((Map) this.l).get((EnumC2049a00) this.n);
        if (abstractC2240b00 == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + ((EnumC2049a00) this.n));
        }
        if (((AbstractC2240b00) this.m) != abstractC2240b00) {
            this.m = abstractC2240b00;
            abstractC2240b00.b();
            Objects.toString((EnumC2049a00) this.n);
            Objects.toString((AbstractC2240b00) this.m);
        }
        GLES20.glActiveTexture(33984);
        AbstractC3306d00.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        AbstractC3306d00.b("glBindTexture");
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((Z61) this.h, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }

    public C6557py0(C2199an c2199an, ExecutorC5715lY0 executorC5715lY0, Executor executor) {
        this.a = 1;
        this.g = null;
        this.b = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.c = 1;
        this.k = new F70(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.l = null;
        this.m = new F70(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.n = null;
        this.d = executor;
        this.e = executorC5715lY0;
        this.f = c2199an;
    }
}
