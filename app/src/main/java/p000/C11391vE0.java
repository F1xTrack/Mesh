package p000;

import android.opengl.GLES20;

/* renamed from: vE0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11391vE0 {

    /* renamed from: i */
    public static final float[] f44281i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j */
    public static final float[] f44282j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final float[] f44283k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a */
    public int f44284a;

    /* renamed from: b */
    public C0577J9 f44285b;

    /* renamed from: c */
    public C8875bc1 f44286c;

    /* renamed from: d */
    public int f44287d;

    /* renamed from: e */
    public int f44288e;

    /* renamed from: f */
    public int f44289f;

    /* renamed from: g */
    public int f44290g;

    /* renamed from: h */
    public int f44291h;

    /* renamed from: b */
    public static boolean m25373b(C11263uE0 c11263uE0) {
        C0577J9[] c0577j9Arr = c11263uE0.f43603a.f42961a;
        if (c0577j9Arr.length != 1 || c0577j9Arr[0].f5357a != 0) {
            return false;
        }
        C0577J9[] c0577j9Arr2 = c11263uE0.f43604b.f42961a;
        return c0577j9Arr2.length == 1 && c0577j9Arr2[0].f5357a == 0;
    }

    /* renamed from: a */
    public final void m25374a() {
        try {
            C8875bc1 c8875bc1 = new C8875bc1();
            this.f44286c = c8875bc1;
            this.f44287d = GLES20.glGetUniformLocation(c8875bc1.f17088a, "uMvpMatrix");
            this.f44288e = GLES20.glGetUniformLocation(this.f44286c.f17088a, "uTexMatrix");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f44286c.f17088a, "aPosition");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            F12.m2485b();
            this.f44289f = iGlGetAttribLocation;
            int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f44286c.f17088a, "aTexCoords");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
            F12.m2485b();
            this.f44290g = iGlGetAttribLocation2;
            this.f44291h = GLES20.glGetUniformLocation(this.f44286c.f17088a, "uTexture");
        } catch (C10850r10 unused) {
        }
    }
}
