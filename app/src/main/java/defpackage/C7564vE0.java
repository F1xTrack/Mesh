package defpackage;

import android.opengl.GLES20;

/* renamed from: vE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7564vE0 {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public J9 b;
    public C2359bc1 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public static boolean b(C7373uE0 c7373uE0) {
        J9[] j9Arr = c7373uE0.a.a;
        if (j9Arr.length != 1 || j9Arr[0].a != 0) {
            return false;
        }
        J9[] j9Arr2 = c7373uE0.b.a;
        return j9Arr2.length == 1 && j9Arr2[0].a == 0;
    }

    public final void a() {
        try {
            C2359bc1 c2359bc1 = new C2359bc1();
            this.c = c2359bc1;
            this.d = GLES20.glGetUniformLocation(c2359bc1.a, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.c.a, "uTexMatrix");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.c.a, "aPosition");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            F12.b();
            this.f = iGlGetAttribLocation;
            int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.c.a, "aTexCoords");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
            F12.b();
            this.g = iGlGetAttribLocation2;
            this.h = GLES20.glGetUniformLocation(this.c.a, "uTexture");
        } catch (C6758r10 unused) {
        }
    }
}
