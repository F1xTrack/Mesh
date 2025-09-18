package p000;

import android.opengl.GLES20;
import android.opengl.GLU;

/* loaded from: classes.dex */
public abstract class F12 {
    /* renamed from: a */
    public static final Q81 m2484a(AbstractC8926c11 abstractC8926c11) {
        Q81 q81 = new Q81();
        K81 k81 = new K81(q81);
        q81.m6584a(new C9552gs1(AbstractC10396nS1.m23145a(abstractC8926c11, new C10320ms1(k81, 2), new C10320ms1(k81, 3)), 1), null);
        return q81;
    }

    /* renamed from: b */
    public static void m2485b() {
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
            throw new C10850r10(sb.toString());
        }
    }

    /* renamed from: c */
    public static void m2486c(String str, boolean z) {
        if (!z) {
            throw new C10850r10(str);
        }
    }
}
