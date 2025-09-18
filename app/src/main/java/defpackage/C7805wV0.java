package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wV0 */
/* loaded from: classes.dex */
public final class C7805wV0 implements InterfaceC7848wj1, InterfaceC0140Bo {
    public int i;
    public SurfaceTexture j;
    public byte[] m;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final C7564vE0 c = new C7564vE0();
    public final VG d = new VG(3, (byte) 0);
    public final J9 e = new J9();
    public final J9 f = new J9();
    public final float[] g = new float[16];
    public final float[] h = new float[16];
    public volatile int k = 0;
    public int l = -1;

    @Override // defpackage.InterfaceC0140Bo
    public final void a(long j, float[] fArr) {
        ((J9) this.d.e).a(j, fArr);
    }

    @Override // defpackage.InterfaceC0140Bo
    public final void b() {
        this.e.b();
        VG vg = this.d;
        ((J9) vg.e).b();
        vg.b = false;
        this.b.set(true);
    }

    @Override // defpackage.InterfaceC7848wj1
    public final void c(long j, long j2, C6666qX c6666qX, MediaFormat mediaFormat) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayListA;
        int iG;
        int i5 = 1;
        this.e.a(j2, Long.valueOf(j));
        byte[] bArr = c6666qX.x;
        int i6 = c6666qX.y;
        byte[] bArr2 = this.m;
        int i7 = this.l;
        this.m = bArr;
        if (i6 == -1) {
            i6 = this.k;
        }
        this.l = i6;
        if (i7 == i6 && Arrays.equals(bArr2, this.m)) {
            return;
        }
        byte[] bArr3 = this.m;
        C7373uE0 c7373uE0 = null;
        if (bArr3 != null) {
            int i8 = this.l;
            C4103hA0 c4103hA0 = new C4103hA0(bArr3);
            try {
                c4103hA0.H(4);
                iG = c4103hA0.g();
                c4103hA0.G(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iG == 1886547818) {
                c4103hA0.H(8);
                int i9 = c4103hA0.b;
                int i10 = c4103hA0.c;
                while (i9 < i10) {
                    int iG2 = c4103hA0.g() + i9;
                    if (iG2 > i9 && iG2 <= i10) {
                        int iG3 = c4103hA0.g();
                        if (iG3 != 2037673328 && iG3 != 1836279920) {
                            c4103hA0.G(iG2);
                            i9 = iG2;
                        }
                        c4103hA0.F(iG2);
                        arrayListA = AbstractC8349zM1.a(c4103hA0);
                        break;
                    }
                    break;
                }
                arrayListA = null;
            } else {
                arrayListA = AbstractC8349zM1.a(c4103hA0);
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    C7182tE0 c7182tE0 = (C7182tE0) arrayListA.get(0);
                    c7373uE0 = new C7373uE0(c7182tE0, c7182tE0, i8);
                } else if (size == 2) {
                    c7373uE0 = new C7373uE0((C7182tE0) arrayListA.get(0), (C7182tE0) arrayListA.get(1), i8);
                }
            }
        }
        if (c7373uE0 == null || !C7564vE0.b(c7373uE0)) {
            int i11 = this.l;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 36; i12 < i15; i15 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i12 * f) - f3;
                int i16 = i12 + 1;
                float f5 = (i16 * f) - f3;
                int i17 = 0;
                while (i17 < 73) {
                    float f6 = f5;
                    float f7 = f4;
                    int i18 = i16;
                    int i19 = i13;
                    int i20 = i14;
                    int i21 = 0;
                    int i22 = 2;
                    while (i21 < i22) {
                        float f8 = i17 * f2;
                        float f9 = f2;
                        int i23 = i17;
                        float f10 = radians;
                        double d = 50.0f;
                        int i24 = i11;
                        double d2 = (3.1415927f + f8) - (radians2 / 2.0f);
                        double d3 = i21 == 0 ? f7 : f6;
                        int i25 = i21;
                        float f11 = f;
                        fArr[i19] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        int i26 = i12;
                        float[] fArr3 = fArr2;
                        fArr[i19 + 1] = (float) (Math.sin(d3) * d);
                        int i27 = i19 + 3;
                        fArr[i19 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr3[i20] = f8 / radians2;
                        int i28 = i20 + 2;
                        fArr3[i20 + 1] = ((i26 + i25) * f11) / f10;
                        if (i23 == 0 && i25 == 0) {
                            i2 = i25;
                            i = i23;
                            i3 = 3;
                        } else {
                            i = i23;
                            i2 = i25;
                            i3 = 3;
                            if (i != 72 || i2 != 1) {
                                i4 = 2;
                                i20 = i28;
                                i19 = i27;
                            }
                            int i29 = i2 + 1;
                            i17 = i;
                            fArr2 = fArr3;
                            i22 = i4;
                            f2 = f9;
                            radians = f10;
                            i11 = i24;
                            i12 = i26;
                            f = f11;
                            i21 = i29;
                        }
                        System.arraycopy(fArr, i19, fArr, i27, i3);
                        i19 += 6;
                        i4 = 2;
                        System.arraycopy(fArr3, i20, fArr3, i28, 2);
                        i20 += 4;
                        int i292 = i2 + 1;
                        i17 = i;
                        fArr2 = fArr3;
                        i22 = i4;
                        f2 = f9;
                        radians = f10;
                        i11 = i24;
                        i12 = i26;
                        f = f11;
                        i21 = i292;
                    }
                    i17++;
                    i14 = i20;
                    i13 = i19;
                    f4 = f7;
                    i16 = i18;
                    radians = radians;
                    i11 = i11;
                    f = f;
                    f5 = f6;
                }
                i12 = i16;
                i5 = 1;
            }
            int i30 = i11;
            J9[] j9Arr = new J9[i5];
            j9Arr[0] = new J9(0, fArr, fArr2, i5);
            C7182tE0 c7182tE02 = new C7182tE0(j9Arr);
            c7373uE0 = new C7373uE0(c7182tE02, c7182tE02, i30);
        }
        this.f.a(j2, c7373uE0);
    }

    public final void d(float[] fArr) {
        Object objO;
        GLES20.glClear(16384);
        try {
            F12.b();
        } catch (C6758r10 e) {
            AbstractC6789rA1.e("Failed to draw a frame", e);
        }
        if (this.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                F12.b();
            } catch (C6758r10 e2) {
                AbstractC6789rA1.e("Failed to draw a frame", e2);
            }
            if (this.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.g, 0);
            }
            long timestamp = this.j.getTimestamp();
            J9 j9 = this.e;
            synchronized (j9) {
                objO = j9.o(timestamp, false);
            }
            Long l = (Long) objO;
            if (l != null) {
                VG vg = this.d;
                float[] fArr2 = this.g;
                float[] fArr3 = (float[]) ((J9) vg.e).q(l.longValue());
                if (fArr3 != null) {
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    float[] fArr4 = (float[]) vg.d;
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!vg.b) {
                        VG.f((float[]) vg.c, (float[]) vg.d);
                        vg.b = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) vg.c, 0, (float[]) vg.d, 0);
                }
            }
            C7373uE0 c7373uE0 = (C7373uE0) this.f.q(timestamp);
            if (c7373uE0 != null) {
                C7564vE0 c7564vE0 = this.c;
                c7564vE0.getClass();
                if (C7564vE0.b(c7373uE0)) {
                    c7564vE0.a = c7373uE0.c;
                    c7564vE0.b = new J9(c7373uE0.a.a[0]);
                    if (!c7373uE0.d) {
                        new J9(c7373uE0.b.a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(this.h, 0, fArr, 0, this.g, 0);
        C7564vE0 c7564vE02 = this.c;
        int i = this.i;
        float[] fArr5 = this.h;
        J9 j92 = c7564vE02.b;
        if (j92 == null) {
            return;
        }
        int i2 = c7564vE02.a;
        GLES20.glUniformMatrix3fv(c7564vE02.e, 1, false, i2 == 1 ? C7564vE0.j : i2 == 2 ? C7564vE0.k : C7564vE0.i, 0);
        GLES20.glUniformMatrix4fv(c7564vE02.d, 1, false, fArr5, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(c7564vE02.h, 0);
        try {
            F12.b();
        } catch (C6758r10 unused) {
        }
        GLES20.glVertexAttribPointer(c7564vE02.f, 3, 5126, false, 12, (Buffer) j92.c);
        try {
            F12.b();
        } catch (C6758r10 unused2) {
        }
        GLES20.glVertexAttribPointer(c7564vE02.g, 2, 5126, false, 8, (Buffer) j92.d);
        try {
            F12.b();
        } catch (C6758r10 unused3) {
        }
        GLES20.glDrawArrays(j92.b, 0, j92.a);
        try {
            F12.b();
        } catch (C6758r10 unused4) {
        }
    }

    public final SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            F12.b();
            this.c.a();
            F12.b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            F12.b();
            int i = iArr[0];
            GLES20.glBindTexture(36197, i);
            F12.b();
            GLES20.glTexParameteri(36197, 10240, 9729);
            F12.b();
            GLES20.glTexParameteri(36197, 10241, 9729);
            F12.b();
            GLES20.glTexParameteri(36197, 10242, 33071);
            F12.b();
            GLES20.glTexParameteri(36197, 10243, 33071);
            F12.b();
            this.i = i;
        } catch (C6758r10 e) {
            AbstractC6789rA1.e("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: vV0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.a.a.set(true);
            }
        });
        return this.j;
    }
}
