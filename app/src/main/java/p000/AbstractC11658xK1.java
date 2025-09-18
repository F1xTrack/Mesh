package p000;

import android.graphics.Path;

/* renamed from: xK1 */
/* loaded from: classes.dex */
public abstract class AbstractC11658xK1 {

    /* renamed from: a */
    public static final C7460Cv0 f45551a = new C7460Cv0(25);

    /* renamed from: a */
    public static boolean m25837a(C11255uA0[] c11255uA0Arr, C11255uA0[] c11255uA0Arr2) {
        if (c11255uA0Arr == null || c11255uA0Arr2 == null || c11255uA0Arr.length != c11255uA0Arr2.length) {
            return false;
        }
        for (int i = 0; i < c11255uA0Arr.length; i++) {
            C11255uA0 c11255uA0 = c11255uA0Arr[i];
            char c = c11255uA0.f43543a;
            C11255uA0 c11255uA02 = c11255uA0Arr2[i];
            if (c != c11255uA02.f43543a || c11255uA0.f43544b.length != c11255uA02.f43544b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static float[] m25838b(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:108:0x0068->B:127:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:105:0x0054, B:108:0x0068, B:110:0x006e, B:114:0x007a, B:127:0x0096, B:129:0x009c, B:135:0x00b1, B:136:0x00b4), top: B:151:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:105:0x0054, B:108:0x0068, B:110:0x006e, B:114:0x007a, B:127:0x0096, B:129:0x009c, B:135:0x00b1, B:136:0x00b4), top: B:151:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:105:0x0054, B:108:0x0068, B:110:0x006e, B:114:0x007a, B:127:0x0096, B:129:0x009c, B:135:0x00b1, B:136:0x00b4), top: B:151:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0095 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.C11255uA0[] m25839c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11658xK1.m25839c(java.lang.String):uA0[]");
    }

    /* renamed from: d */
    public static Path m25840d(String str) {
        Path path = new Path();
        try {
            C11255uA0.m25125b(m25839c(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    /* renamed from: e */
    public static C11255uA0[] m25841e(C11255uA0[] c11255uA0Arr) {
        C11255uA0[] c11255uA0Arr2 = new C11255uA0[c11255uA0Arr.length];
        for (int i = 0; i < c11255uA0Arr.length; i++) {
            c11255uA0Arr2[i] = new C11255uA0(c11255uA0Arr[i]);
        }
        return c11255uA0Arr2;
    }
}
