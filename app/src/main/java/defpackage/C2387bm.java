package defpackage;

import android.graphics.Color;

/* renamed from: bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2387bm {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public C2387bm(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public static C2387bm a(int i) {
        C0679Il1 c0679Il1 = C0679Il1.k;
        float fE = AbstractC3795fZ.e(Color.red(i));
        float fE2 = AbstractC3795fZ.e(Color.green(i));
        float fE3 = AbstractC3795fZ.e(Color.blue(i));
        float[][] fArr = AbstractC3795fZ.f;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fE3) + (fArr2[1] * fE2) + (fArr2[0] * fE);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fE3) + (fArr3[1] * fE2) + (fArr3[0] * fE);
        float[] fArr4 = fArr[2];
        float f3 = (fE3 * fArr4[2]) + (fE2 * fArr4[1]) + (fE * fArr4[0]);
        float[][] fArr5 = AbstractC3795fZ.c;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = c0679Il1.g;
        float f7 = fArr9[0] * f4;
        float f8 = fArr9[1] * f5;
        float f9 = fArr9[2] * f6;
        float fAbs = Math.abs(f7);
        float f10 = c0679Il1.h;
        float fPow = (float) Math.pow((fAbs * f10) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f8) * f10) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f9) * f10) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f7) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f8) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f9) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f11 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d)) / 11.0f;
        float f12 = ((float) ((fSignum + fSignum2) - (d * 2.0d))) / 9.0f;
        float f13 = fSignum2 * 20.0f;
        float f14 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f13)) / 20.0f;
        float f15 = (((fSignum * 40.0f) + f13) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f16 = fAtan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float f18 = f15 * c0679Il1.b;
        float f19 = c0679Il1.a;
        float f20 = c0679Il1.d;
        float fPow4 = ((float) Math.pow(f18 / f19, c0679Il1.j * f20)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f21 = f19 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0679Il1.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f16) < 20.14d ? 360.0f + f16 : f16) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0679Il1.e) * c0679Il1.c) * ((float) Math.sqrt((f12 * f12) + (f11 * f11)))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float f22 = c0679Il1.i * fPow5;
        Math.sqrt((r3 * f20) / f21);
        float f23 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f17;
        return new C2387bm(f16, fPow5, fPow4, f23, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static C2387bm b(float f, float f2, float f3) {
        C0679Il1 c0679Il1 = C0679Il1.k;
        float f4 = c0679Il1.d;
        Math.sqrt(f / 100.0d);
        float f5 = c0679Il1.a + 4.0f;
        float f6 = c0679Il1.i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * c0679Il1.d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new C2387bm(f3, f2, f, f7, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.C0679Il1 r17) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2387bm.c(Il1):int");
    }
}
