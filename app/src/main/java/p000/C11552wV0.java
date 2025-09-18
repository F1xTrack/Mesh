package p000;

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
public final class C11552wV0 implements InterfaceC11581wj1, InterfaceC0114Bo {

    /* renamed from: i */
    public int f44921i;

    /* renamed from: j */
    public SurfaceTexture f44922j;

    /* renamed from: m */
    public byte[] f44925m;

    /* renamed from: a */
    public final AtomicBoolean f44913a = new AtomicBoolean();

    /* renamed from: b */
    public final AtomicBoolean f44914b = new AtomicBoolean(true);

    /* renamed from: c */
    public final C11391vE0 f44915c = new C11391vE0();

    /* renamed from: d */
    public final C1338VG f44916d = new C1338VG(3, (byte) 0);

    /* renamed from: e */
    public final C0577J9 f44917e = new C0577J9();

    /* renamed from: f */
    public final C0577J9 f44918f = new C0577J9();

    /* renamed from: g */
    public final float[] f44919g = new float[16];

    /* renamed from: h */
    public final float[] f44920h = new float[16];

    /* renamed from: k */
    public volatile int f44923k = 0;

    /* renamed from: l */
    public int f44924l = -1;

    @Override // p000.InterfaceC0114Bo
    /* renamed from: a */
    public final void mo880a(long j, float[] fArr) {
        ((C0577J9) this.f44916d.f12477e).m4221a(j, fArr);
    }

    @Override // p000.InterfaceC0114Bo
    /* renamed from: b */
    public final void mo881b() {
        this.f44917e.m4222b();
        C1338VG c1338vg = this.f44916d;
        ((C0577J9) c1338vg.f12477e).m4222b();
        c1338vg.f12474b = false;
        this.f44914b.set(true);
    }

    @Override // p000.InterfaceC11581wj1
    /* renamed from: c */
    public final void mo8438c(long j, long j2, C6686qX c6686qX, MediaFormat mediaFormat) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayListM26378a;
        int iM18749g;
        int i5 = 1;
        this.f44917e.m4221a(j2, Long.valueOf(j));
        byte[] bArr = c6686qX.f40985x;
        int i6 = c6686qX.f40986y;
        byte[] bArr2 = this.f44925m;
        int i7 = this.f44924l;
        this.f44925m = bArr;
        if (i6 == -1) {
            i6 = this.f44923k;
        }
        this.f44924l = i6;
        if (i7 == i6 && Arrays.equals(bArr2, this.f44925m)) {
            return;
        }
        byte[] bArr3 = this.f44925m;
        C11263uE0 c11263uE0 = null;
        if (bArr3 != null) {
            int i8 = this.f44924l;
            C9591hA0 c9591hA0 = new C9591hA0(bArr3);
            try {
                c9591hA0.m18742H(4);
                iM18749g = c9591hA0.m18749g();
                c9591hA0.m18741G(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iM18749g == 1886547818) {
                c9591hA0.m18742H(8);
                int i9 = c9591hA0.f28294b;
                int i10 = c9591hA0.f28295c;
                while (i9 < i10) {
                    int iM18749g2 = c9591hA0.m18749g() + i9;
                    if (iM18749g2 > i9 && iM18749g2 <= i10) {
                        int iM18749g3 = c9591hA0.m18749g();
                        if (iM18749g3 != 2037673328 && iM18749g3 != 1836279920) {
                            c9591hA0.m18741G(iM18749g2);
                            i9 = iM18749g2;
                        }
                        c9591hA0.m18740F(iM18749g2);
                        arrayListM26378a = AbstractC11916zM1.m26378a(c9591hA0);
                        break;
                    }
                    break;
                }
                arrayListM26378a = null;
            } else {
                arrayListM26378a = AbstractC11916zM1.m26378a(c9591hA0);
            }
            if (arrayListM26378a != null) {
                int size = arrayListM26378a.size();
                if (size == 1) {
                    C11135tE0 c11135tE0 = (C11135tE0) arrayListM26378a.get(0);
                    c11263uE0 = new C11263uE0(c11135tE0, c11135tE0, i8);
                } else if (size == 2) {
                    c11263uE0 = new C11263uE0((C11135tE0) arrayListM26378a.get(0), (C11135tE0) arrayListM26378a.get(1), i8);
                }
            }
        }
        if (c11263uE0 == null || !C11391vE0.m25373b(c11263uE0)) {
            int i11 = this.f44924l;
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
            C0577J9[] c0577j9Arr = new C0577J9[i5];
            c0577j9Arr[0] = new C0577J9(0, fArr, fArr2, i5);
            C11135tE0 c11135tE02 = new C11135tE0(c0577j9Arr);
            c11263uE0 = new C11263uE0(c11135tE02, c11135tE02, i30);
        }
        this.f44918f.m4221a(j2, c11263uE0);
    }

    /* renamed from: d */
    public final void m25641d(float[] fArr) {
        Object objM4225o;
        GLES20.glClear(16384);
        try {
            F12.m2485b();
        } catch (C10850r10 e) {
            AbstractC10872rA1.m24172e("Failed to draw a frame", e);
        }
        if (this.f44913a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f44922j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                F12.m2485b();
            } catch (C10850r10 e2) {
                AbstractC10872rA1.m24172e("Failed to draw a frame", e2);
            }
            if (this.f44914b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f44919g, 0);
            }
            long timestamp = this.f44922j.getTimestamp();
            C0577J9 c0577j9 = this.f44917e;
            synchronized (c0577j9) {
                objM4225o = c0577j9.m4225o(timestamp, false);
            }
            Long l = (Long) objM4225o;
            if (l != null) {
                C1338VG c1338vg = this.f44916d;
                float[] fArr2 = this.f44919g;
                float[] fArr3 = (float[]) ((C0577J9) c1338vg.f12477e).m4227q(l.longValue());
                if (fArr3 != null) {
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    float[] fArr4 = (float[]) c1338vg.f12476d;
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!c1338vg.f12474b) {
                        C1338VG.m8339f((float[]) c1338vg.f12475c, (float[]) c1338vg.f12476d);
                        c1338vg.f12474b = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) c1338vg.f12475c, 0, (float[]) c1338vg.f12476d, 0);
                }
            }
            C11263uE0 c11263uE0 = (C11263uE0) this.f44918f.m4227q(timestamp);
            if (c11263uE0 != null) {
                C11391vE0 c11391vE0 = this.f44915c;
                c11391vE0.getClass();
                if (C11391vE0.m25373b(c11263uE0)) {
                    c11391vE0.f44284a = c11263uE0.f43605c;
                    c11391vE0.f44285b = new C0577J9(c11263uE0.f43603a.f42961a[0]);
                    if (!c11263uE0.f43606d) {
                        new C0577J9(c11263uE0.f43604b.f42961a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(this.f44920h, 0, fArr, 0, this.f44919g, 0);
        C11391vE0 c11391vE02 = this.f44915c;
        int i = this.f44921i;
        float[] fArr5 = this.f44920h;
        C0577J9 c0577j92 = c11391vE02.f44285b;
        if (c0577j92 == null) {
            return;
        }
        int i2 = c11391vE02.f44284a;
        GLES20.glUniformMatrix3fv(c11391vE02.f44288e, 1, false, i2 == 1 ? C11391vE0.f44282j : i2 == 2 ? C11391vE0.f44283k : C11391vE0.f44281i, 0);
        GLES20.glUniformMatrix4fv(c11391vE02.f44287d, 1, false, fArr5, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(c11391vE02.f44291h, 0);
        try {
            F12.m2485b();
        } catch (C10850r10 unused) {
        }
        GLES20.glVertexAttribPointer(c11391vE02.f44289f, 3, 5126, false, 12, (Buffer) c0577j92.f5359c);
        try {
            F12.m2485b();
        } catch (C10850r10 unused2) {
        }
        GLES20.glVertexAttribPointer(c11391vE02.f44290g, 2, 5126, false, 8, (Buffer) c0577j92.f5360d);
        try {
            F12.m2485b();
        } catch (C10850r10 unused3) {
        }
        GLES20.glDrawArrays(c0577j92.f5358b, 0, c0577j92.f5357a);
        try {
            F12.m2485b();
        } catch (C10850r10 unused4) {
        }
    }

    /* renamed from: e */
    public final SurfaceTexture m25642e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            F12.m2485b();
            this.f44915c.m25374a();
            F12.m2485b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            F12.m2485b();
            int i = iArr[0];
            GLES20.glBindTexture(36197, i);
            F12.m2485b();
            GLES20.glTexParameteri(36197, 10240, 9729);
            F12.m2485b();
            GLES20.glTexParameteri(36197, 10241, 9729);
            F12.m2485b();
            GLES20.glTexParameteri(36197, 10242, 33071);
            F12.m2485b();
            GLES20.glTexParameteri(36197, 10243, 33071);
            F12.m2485b();
            this.f44921i = i;
        } catch (C10850r10 e) {
            AbstractC10872rA1.m24172e("Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f44921i);
        this.f44922j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: vV0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f44392a.f44913a.set(true);
            }
        });
        return this.f44922j;
    }
}
