package defpackage;

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
public abstract class AbstractC3306d00 {
    public static final int[] a = {12344};
    public static final int[] b = {12445, 13632, 12344};
    public static final String c;
    public static final String d;
    public static final YZ e;
    public static final YZ f;
    public static final YZ g;
    public static final FloatBuffer h;
    public static final FloatBuffer i;
    public static final C3619ee j;

    static {
        Locale locale = Locale.US;
        c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        e = new YZ(0);
        f = new YZ(1);
        g = new YZ(2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        h = floatBufferAsFloatBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer2.position(0);
        i = floatBufferAsFloatBuffer2;
        j = new C3619ee(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbK = NX.k(str, ": EGL error: 0x");
        sbK.append(Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sbK.toString());
    }

    public static void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbK = NX.k(str, ": GL error 0x");
        sbK.append(Integer.toHexString(iGlGetError));
        throw new IllegalStateException(sbK.toString());
    }

    public static void c(Thread thread) {
        AbstractC3377dM1.i(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z) {
        AbstractC3377dM1.i(z == atomicBoolean.get(), z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void e(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalStateException(AbstractC8235ym.k("Unable to locate '", str, "' in program"));
        }
    }

    public static HashMap f(CM cm, Map map) {
        Object c2430c00;
        EnumC2049a00 enumC2049a00;
        HashMap map2 = new HashMap();
        EnumC2049a00[] enumC2049a00ArrValues = EnumC2049a00.values();
        int length = enumC2049a00ArrValues.length;
        for (int i2 = 0; i2 < length; i2++) {
            EnumC2049a00 enumC2049a002 = enumC2049a00ArrValues[i2];
            YZ yz = (YZ) map.get(enumC2049a002);
            if (yz != null) {
                c2430c00 = new C2430c00(cm, yz);
            } else if (enumC2049a002 == EnumC2049a00.c || enumC2049a002 == (enumC2049a00 = EnumC2049a00.b)) {
                c2430c00 = new C2430c00(cm, enumC2049a002);
            } else {
                AbstractC3377dM1.i(enumC2049a002 == EnumC2049a00.a, "Unhandled input format: " + enumC2049a002);
                if (cm.a()) {
                    c2430c00 = new ZZ("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    YZ yz2 = (YZ) map.get(enumC2049a00);
                    c2430c00 = yz2 != null ? new C2430c00(cm, yz2) : new C2430c00(cm, enumC2049a00);
                }
            }
            Objects.toString(enumC2049a002);
            c2430c00.toString();
            map2.put(enumC2049a002, c2430c00);
        }
        return map2;
    }

    public static int g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        b("glBindTexture " + i2);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i2;
    }

    public static EGLSurface h(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static String i() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return AbstractC1705Vq.h(strGroup, ".", strGroup2);
    }

    public static int j(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        b("glCreateShader type=" + i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        AbstractC0759Jm0.f("GLUtils");
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i2 + StringUtils.PROCESS_POSTFIX_DELIMITER + strGlGetShaderInfoLog);
    }
}
