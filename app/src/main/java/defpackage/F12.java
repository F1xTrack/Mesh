package defpackage;

import android.opengl.GLES20;
import android.opengl.GLU;

/* loaded from: classes.dex */
public abstract class F12 {
    public static final Q81 a(AbstractC2435c11 abstractC2435c11) {
        Q81 q81 = new Q81();
        K81 k81 = new K81(q81);
        q81.a(new C4045gs1(AbstractC6080nS1.a(abstractC2435c11, new C5967ms1(k81, 2), new C5967ms1(k81, 3)), 1), null);
        return q81;
    }

    public static void b() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new C6758r10(sb.toString());
        }
    }

    public static void c(String str, boolean z) {
        if (!z) {
            throw new C6758r10(str);
        }
    }
}
