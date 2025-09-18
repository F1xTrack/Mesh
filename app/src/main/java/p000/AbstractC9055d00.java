package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: d00 */
/* loaded from: classes.dex */
public abstract class AbstractC9055d00 {

    /* renamed from: a */
    public static final int[] f25750a = {12344};

    /* renamed from: b */
    public static final int[] f25751b = {12445, 13632, 12344};

    /* renamed from: c */
    public static final String f25752c;

    /* renamed from: d */
    public static final String f25753d;

    /* renamed from: e */
    public static final C1546YZ f25754e;

    /* renamed from: f */
    public static final C1546YZ f25755f;

    /* renamed from: g */
    public static final C1546YZ f25756g;

    /* renamed from: h */
    public static final FloatBuffer f25757h;

    /* renamed from: i */
    public static final FloatBuffer f25758i;

    /* renamed from: j */
    public static final C4003ee f25759j;

    static {
        Locale locale = Locale.US;
        f25752c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f25753d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f25754e = new C1546YZ(0);
        f25755f = new C1546YZ(1);
        f25756g = new C1546YZ(2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f25757h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        f25758i = floatBufferAsFloatBuffer2;
        f25759j = new C4003ee(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    /* renamed from: a */
    public static void m17452a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str, ": EGL error: 0x");
        sbM5762k.append(Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sbM5762k.toString());
    }

    /* renamed from: b */
    public static void m17453b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str, ": GL error 0x");
        sbM5762k.append(Integer.toHexString(iGlGetError));
        throw new IllegalStateException(sbM5762k.toString());
    }

    /* renamed from: c */
    public static void m17454c(Thread thread) {
        AbstractC9104dM1.m17550i(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    /* renamed from: d */
    public static void m17455d(AtomicBoolean atomicBoolean, boolean z) {
        AbstractC9104dM1.m17550i(z == atomicBoolean.get(), z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    /* renamed from: e */
    public static void m17456e(int i, String str) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC7222ym.m26234k("Unable to locate '", str, "' in program"));
        }
    }

    /* renamed from: f */
    public static HashMap m17457f(C0149CM c0149cm, Map map) {
        Object c8922c00;
        EnumC8666a00 enumC8666a00;
        HashMap map2 = new HashMap();
        EnumC8666a00[] enumC8666a00ArrValues = EnumC8666a00.values();
        int length = enumC8666a00ArrValues.length;
        for (int i = 0; i < length; i++) {
            EnumC8666a00 enumC8666a002 = enumC8666a00ArrValues[i];
            C1546YZ c1546yz = (C1546YZ) map.get(enumC8666a002);
            if (c1546yz != null) {
                c8922c00 = new C8922c00(c0149cm, c1546yz);
            } else if (enumC8666a002 == EnumC8666a00.f15277c || enumC8666a002 == (enumC8666a00 = EnumC8666a00.f15276b)) {
                c8922c00 = new C8922c00(c0149cm, enumC8666a002);
            } else {
                AbstractC9104dM1.m17550i(enumC8666a002 == EnumC8666a00.f15275a, "Unhandled input format: " + enumC8666a002);
                if (c0149cm.m1146a()) {
                    c8922c00 = new C1609ZZ("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    C1546YZ c1546yz2 = (C1546YZ) map.get(enumC8666a00);
                    c8922c00 = c1546yz2 != null ? new C8922c00(c0149cm, c1546yz2) : new C8922c00(c0149cm, enumC8666a00);
                }
            }
            Objects.toString(enumC8666a002);
            c8922c00.toString();
            map2.put(enumC8666a002, c8922c00);
        }
        return map2;
    }

    /* renamed from: g */
    public static int m17458g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m17453b("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        m17453b("glBindTexture " + i);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m17453b("glTexParameter");
        return i;
    }

    /* renamed from: h */
    public static EGLSurface m17459h(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        m17452a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* renamed from: i */
    public static String m17460i() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return AbstractC1374Vq.m8589h(strGroup, ".", strGroup2);
    }

    /* renamed from: j */
    public static int m17461j(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m17453b("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        AbstractC7806Jm0.m4412f("GLUtils");
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i + StringUtils.PROCESS_POSTFIX_DELIMITER + strGlGetShaderInfoLog);
    }
}
