package p000;

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
public class C10715py0 {

    /* renamed from: a */
    public final /* synthetic */ int f40461a;

    /* renamed from: b */
    public Surface f40462b;

    /* renamed from: c */
    public int f40463c;

    /* renamed from: d */
    public final Object f40464d;

    /* renamed from: e */
    public final Object f40465e;

    /* renamed from: f */
    public Object f40466f;

    /* renamed from: g */
    public Object f40467g;

    /* renamed from: h */
    public Object f40468h;

    /* renamed from: i */
    public Object f40469i;

    /* renamed from: j */
    public Object f40470j;

    /* renamed from: k */
    public Object f40471k;

    /* renamed from: l */
    public Object f40472l;

    /* renamed from: m */
    public Object f40473m;

    /* renamed from: n */
    public Object f40474n;

    public C10715py0() {
        this.f40461a = 0;
        this.f40464d = new AtomicBoolean(false);
        this.f40465e = new HashMap();
        this.f40467g = EGL14.EGL_NO_DISPLAY;
        this.f40468h = EGL14.EGL_NO_CONTEXT;
        this.f40469i = AbstractC9055d00.f25750a;
        this.f40471k = EGL14.EGL_NO_SURFACE;
        this.f40472l = Collections.emptyMap();
        this.f40473m = null;
        this.f40474n = EnumC8666a00.f15275a;
        this.f40463c = -1;
    }

    /* renamed from: a */
    public void m23906a() {
        int iM26247x = AbstractC7222ym.m26247x(this.f40463c);
        if (iM26247x == 0 || iM26247x == 1) {
            m23916l();
            return;
        }
        if (iM26247x == 2 || iM26247x == 3) {
            AbstractC7806Jm0.m4412f("VideoEncoderSession");
            this.f40463c = 3;
        } else {
            if (iM26247x == 4) {
                AbstractC7806Jm0.m4412f("VideoEncoderSession");
                return;
            }
            throw new IllegalStateException("State " + F91.m2516F(this.f40463c) + " is not handled");
        }
    }

    /* renamed from: b */
    public void m23907b(C0149CM c0149cm, C8071Oo1 c8071Oo1) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f40467g = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.f40467g, iArr, 0, iArr, 1)) {
            this.f40467g = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (c8071Oo1 != null) {
            String str = iArr[0] + "." + iArr[1];
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            c8071Oo1.f8628b = str;
        }
        int i = c0149cm.m1146a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f40467g, new int[]{12324, i, 12323, i, 12322, i, 12321, c0149cm.m1146a() ? 2 : 8, 12325, 0, 12326, 0, 12352, c0149cm.m1146a() ? 64 : 4, 12610, c0149cm.m1146a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f40467g, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c0149cm.m1146a() ? 3 : 2, 12344}, 0);
        AbstractC9055d00.m17452a("eglCreateContext");
        this.f40470j = eGLConfig;
        this.f40468h = eGLContextEglCreateContext;
        EGL14.eglQueryContext((EGLDisplay) this.f40467g, eGLContextEglCreateContext, 12440, new int[1], 0);
    }

    /* renamed from: c */
    public C4003ee m23908c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f40467g;
            EGLConfig eGLConfig = (EGLConfig) this.f40470j;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceM17459h = AbstractC9055d00.m17459h(eGLDisplay, eGLConfig, surface, (int[]) this.f40469i);
            EGLDisplay eGLDisplay2 = (EGLDisplay) this.f40467g;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceM17459h, 12375, iArr, 0);
            int i = iArr[0];
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceM17459h, 12374, iArr2, 0);
            Size size = new Size(i, iArr2[0]);
            return new C4003ee(eGLSurfaceM17459h, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            e.getMessage();
            AbstractC7806Jm0.m4412f("OpenGlRenderer");
            return null;
        }
    }

    /* renamed from: d */
    public void m23909d() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f40467g;
        EGLConfig eGLConfig = (EGLConfig) this.f40470j;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = AbstractC9055d00.f25750a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        AbstractC9055d00.m17452a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.f40471k = eGLSurfaceEglCreatePbufferSurface;
    }

    /* renamed from: e */
    public C8664Zz0 m23910e(C0149CM c0149cm) {
        AbstractC9055d00.m17455d((AtomicBoolean) this.f40464d, false);
        try {
            m23907b(c0149cm, null);
            m23909d();
            m23911g((EGLSurface) this.f40471k);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.f40467g, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new C8664Zz0(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            e.getMessage();
            AbstractC7806Jm0.m4412f("OpenGlRenderer");
            return new C8664Zz0("", "");
        } finally {
            m23913i();
        }
    }

    /* renamed from: f */
    public C0607Jd mo22192f(C0149CM c0149cm, Map map) throws Throwable {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f40464d;
        AbstractC9055d00.m17455d(atomicBoolean, false);
        C8071Oo1 c8071Oo1 = new C8071Oo1();
        c8071Oo1.f8627a = "0.0";
        c8071Oo1.f8628b = "0.0";
        c8071Oo1.f8629c = "";
        c8071Oo1.f8630d = "";
        try {
            if (c0149cm.m1146a()) {
                C8664Zz0 c8664Zz0M23910e = m23910e(c0149cm);
                String str = (String) c8664Zz0M23910e.f15267a;
                str.getClass();
                String str2 = (String) c8664Zz0M23910e.f15268b;
                str2.getClass();
                if (!str.contains("GL_EXT_YUV_target")) {
                    AbstractC7806Jm0.m4412f("OpenGlRenderer");
                    c0149cm = C0149CM.f1329d;
                }
                int[] iArr = AbstractC9055d00.f25750a;
                if (c0149cm.f1336a == 3) {
                    if (str2.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                        iArr = AbstractC9055d00.f25751b;
                    } else {
                        AbstractC7806Jm0.m4412f("GLUtils");
                    }
                }
                this.f40469i = iArr;
                c8071Oo1.f8629c = str;
                c8071Oo1.f8630d = str2;
            }
            m23907b(c0149cm, c8071Oo1);
            m23909d();
            m23911g((EGLSurface) this.f40471k);
            String strM17460i = AbstractC9055d00.m17460i();
            if (strM17460i == null) {
                throw new NullPointerException("Null glVersion");
            }
            c8071Oo1.f8627a = strM17460i;
            this.f40472l = AbstractC9055d00.m17457f(c0149cm, map);
            int iM17458g = AbstractC9055d00.m17458g();
            this.f40463c = iM17458g;
            m23917m(iM17458g);
            this.f40466f = Thread.currentThread();
            atomicBoolean.set(true);
            String strM26232i = ((String) c8071Oo1.f8627a) == null ? " glVersion" : "";
            if (((String) c8071Oo1.f8628b) == null) {
                strM26232i = strM26232i.concat(" eglVersion");
            }
            if (((String) c8071Oo1.f8629c) == null) {
                strM26232i = AbstractC7222ym.m26232i(strM26232i, " glExtensions");
            }
            if (((String) c8071Oo1.f8630d) == null) {
                strM26232i = AbstractC7222ym.m26232i(strM26232i, " eglExtensions");
            }
            if (strM26232i.isEmpty()) {
                return new C0607Jd((String) c8071Oo1.f8627a, (String) c8071Oo1.f8628b, (String) c8071Oo1.f8629c, (String) c8071Oo1.f8630d);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM26232i));
        } catch (IllegalArgumentException e) {
            e = e;
            m23913i();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            m23913i();
            throw e;
        }
    }

    /* renamed from: g */
    public void m23911g(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f40467g).getClass();
        ((EGLContext) this.f40468h).getClass();
        if (!EGL14.eglMakeCurrent((EGLDisplay) this.f40467g, eGLSurface, eGLSurface, (EGLContext) this.f40468h)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    /* renamed from: h */
    public void m23912h(Surface surface) {
        AbstractC9055d00.m17455d((AtomicBoolean) this.f40464d, true);
        AbstractC9055d00.m17454c((Thread) this.f40466f);
        HashMap map = (HashMap) this.f40465e;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, AbstractC9055d00.f25759j);
    }

    /* renamed from: i */
    public void m23913i() {
        Iterator it = ((Map) this.f40472l).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((AbstractC8794b00) it.next()).f16700a);
        }
        this.f40472l = Collections.emptyMap();
        this.f40473m = null;
        if (!Objects.equals((EGLDisplay) this.f40467g, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f40467g;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            HashMap map = (HashMap) this.f40465e;
            for (C4003ee c4003ee : map.values()) {
                if (!Objects.equals(c4003ee.f26791a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f40467g, c4003ee.f26791a)) {
                    try {
                        AbstractC9055d00.m17452a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        e.toString();
                        AbstractC7806Jm0.m4412f("GLUtils");
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.f40471k, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f40467g, (EGLSurface) this.f40471k);
                this.f40471k = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.f40468h, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f40467g, (EGLContext) this.f40468h);
                this.f40468h = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f40467g);
            this.f40467g = EGL14.EGL_NO_DISPLAY;
        }
        this.f40470j = null;
        this.f40463c = -1;
        this.f40474n = EnumC8666a00.f15275a;
        this.f40462b = null;
        this.f40466f = null;
    }

    /* renamed from: j */
    public void m23914j(Surface surface, boolean z) {
        if (this.f40462b == surface) {
            this.f40462b = null;
            m23911g((EGLSurface) this.f40471k);
        }
        HashMap map = (HashMap) this.f40465e;
        C4003ee c4003ee = z ? (C4003ee) map.remove(surface) : (C4003ee) map.put(surface, AbstractC9055d00.f25759j);
        if (c4003ee == null || c4003ee == AbstractC9055d00.f25759j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.f40467g, c4003ee.f26791a);
        } catch (RuntimeException e) {
            e.getMessage();
            AbstractC7806Jm0.m4412f("OpenGlRenderer");
        }
    }

    /* renamed from: k */
    public void m23915k(long j, float[] fArr, Surface surface) {
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
            int i = c4003eeM23908c.f26792b;
            int i2 = c4003eeM23908c.f26793c;
            GLES20.glViewport(0, 0, i, i2);
            GLES20.glScissor(0, 0, i, i2);
        }
        AbstractC8794b00 abstractC8794b00 = (AbstractC8794b00) this.f40473m;
        abstractC8794b00.getClass();
        if (abstractC8794b00 instanceof C8922c00) {
            GLES20.glUniformMatrix4fv(((C8922c00) abstractC8794b00).f17255f, 1, false, fArr, 0);
            AbstractC9055d00.m17453b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        AbstractC9055d00.m17453b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f40467g, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f40467g, eGLSurface)) {
            return;
        }
        Integer.toHexString(EGL14.eglGetError());
        AbstractC7806Jm0.m4412f("OpenGlRenderer");
        m23914j(surface, false);
    }

    /* renamed from: l */
    public void m23916l() {
        int iM26247x = AbstractC7222ym.m26247x(this.f40463c);
        if (iM26247x == 0) {
            this.f40463c = 5;
            return;
        }
        if (iM26247x != 1 && iM26247x != 2 && iM26247x != 3) {
            if (iM26247x == 4) {
                AbstractC7806Jm0.m4412f("VideoEncoderSession");
                return;
            }
            throw new IllegalStateException("State " + F91.m2516F(this.f40463c) + " is not handled");
        }
        this.f40463c = 5;
        ((C0300El) this.f40474n).m2375b((C6820sO) this.f40467g);
        this.f40468h = null;
        C6820sO c6820sO = (C6820sO) this.f40467g;
        if (c6820sO == null) {
            AbstractC7806Jm0.m4412f("VideoEncoderSession");
            ((C0300El) this.f40472l).m2375b(null);
            return;
        }
        Objects.toString(c6820sO);
        AbstractC7806Jm0.m4412f("VideoEncoderSession");
        C6820sO c6820sO2 = (C6820sO) this.f40467g;
        c6820sO2.getClass();
        c6820sO2.f42398h.execute(new RunnableC4239iO(c6820sO2, 4));
        ((C6820sO) this.f40467g).f42399i.mo2494d(new N61(10, this), (ExecutorC10151lY0) this.f40465e);
        this.f40467g = null;
    }

    /* renamed from: m */
    public void m23917m(int i) {
        AbstractC8794b00 abstractC8794b00 = (AbstractC8794b00) ((Map) this.f40472l).get((EnumC8666a00) this.f40474n);
        if (abstractC8794b00 == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + ((EnumC8666a00) this.f40474n));
        }
        if (((AbstractC8794b00) this.f40473m) != abstractC8794b00) {
            this.f40473m = abstractC8794b00;
            abstractC8794b00.mo10400b();
            Objects.toString((EnumC8666a00) this.f40474n);
            Objects.toString((AbstractC8794b00) this.f40473m);
        }
        GLES20.glActiveTexture(33984);
        AbstractC9055d00.m17453b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        AbstractC9055d00.m17453b("glBindTexture");
    }

    public String toString() {
        switch (this.f40461a) {
            case 1:
                return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString((Z61) this.f40468h, "SURFACE_REQUEST_NOT_CONFIGURED");
            default:
                return super.toString();
        }
    }

    public C10715py0(C1686an c1686an, ExecutorC10151lY0 executorC10151lY0, Executor executor) {
        this.f40461a = 1;
        this.f40467g = null;
        this.f40462b = null;
        this.f40468h = null;
        this.f40469i = null;
        this.f40470j = null;
        this.f40463c = 1;
        this.f40471k = new F70(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.f40472l = null;
        this.f40473m = new F70(1, new IllegalStateException("Cannot close the encoder before configuring."));
        this.f40474n = null;
        this.f40464d = executor;
        this.f40465e = executorC10151lY0;
        this.f40466f = c1686an;
    }
}
