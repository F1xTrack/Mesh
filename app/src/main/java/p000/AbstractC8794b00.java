package p000;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* renamed from: b00, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8794b00 {

    /* renamed from: a */
    public final int f16700a;

    /* renamed from: b */
    public int f16701b = -1;

    /* renamed from: c */
    public int f16702c = -1;

    /* renamed from: d */
    public int f16703d = -1;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC8794b00(java.lang.String r8, java.lang.String r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "glAttachShader"
            java.lang.String r1 = "Could not link program: "
            r7.<init>()
            r2 = -1
            r7.f16701b = r2
            r7.f16702c = r2
            r7.f16703d = r2
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r8 = p000.AbstractC9055d00.m17461j(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalStateException -> L71
            r3 = 35632(0x8b30, float:4.9931E-41)
            int r9 = p000.AbstractC9055d00.m17461j(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L67 java.lang.IllegalStateException -> L6b
            int r3 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L62 java.lang.IllegalStateException -> L65
            java.lang.String r4 = "glCreateProgram"
            p000.AbstractC9055d00.m17453b(r4)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glAttachShader(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            p000.AbstractC9055d00.m17453b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glAttachShader(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            p000.AbstractC9055d00.m17453b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            android.opengl.GLES20.glLinkProgram(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r0 = 1
            int[] r4 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r5 = 35714(0x8b82, float:5.0046E-41)
            r6 = 0
            android.opengl.GLES20.glGetProgramiv(r3, r5, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r4 = r4[r6]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            if (r4 != r0) goto L4c
            r7.f16700a = r3     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r7.m10399a()
            return
        L48:
            r0 = move-exception
            goto L73
        L4a:
            r0 = move-exception
            goto L73
        L4c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r4.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r4.append(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            java.lang.String r1 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            throw r0     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
        L62:
            r0 = move-exception
        L63:
            r3 = r2
            goto L73
        L65:
            r0 = move-exception
            goto L63
        L67:
            r0 = move-exception
        L68:
            r9 = r2
        L69:
            r3 = r9
            goto L73
        L6b:
            r0 = move-exception
            goto L68
        L6d:
            r0 = move-exception
        L6e:
            r8 = r2
            r9 = r8
            goto L69
        L71:
            r0 = move-exception
            goto L6e
        L73:
            if (r8 == r2) goto L78
            android.opengl.GLES20.glDeleteShader(r8)
        L78:
            if (r9 == r2) goto L7d
            android.opengl.GLES20.glDeleteShader(r9)
        L7d:
            if (r3 == r2) goto L82
            android.opengl.GLES20.glDeleteProgram(r3)
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC8794b00.<init>(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void m10399a() {
        int i = this.f16700a;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.f16703d = iGlGetAttribLocation;
        AbstractC9055d00.m17456e(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.f16701b = iGlGetUniformLocation;
        AbstractC9055d00.m17456e(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.f16702c = iGlGetUniformLocation2;
        AbstractC9055d00.m17456e(iGlGetUniformLocation2, "uAlphaScale");
    }

    /* renamed from: b */
    public void mo10400b() {
        GLES20.glUseProgram(this.f16700a);
        AbstractC9055d00.m17453b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.f16703d);
        AbstractC9055d00.m17453b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f16703d, 2, 5126, false, 0, (Buffer) AbstractC9055d00.f25757h);
        AbstractC9055d00.m17453b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.f16701b, 1, false, fArr, 0);
        AbstractC9055d00.m17453b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.f16702c, 1.0f);
        AbstractC9055d00.m17453b("glUniform1f");
    }
}
