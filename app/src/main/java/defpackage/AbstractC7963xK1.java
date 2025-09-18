package defpackage;

import android.graphics.Path;

/* renamed from: xK1 */
/* loaded from: classes.dex */
public abstract class AbstractC7963xK1 {
    public static final C0240Cv0 a = new C0240Cv0(25);

    public static boolean a(C7361uA0[] c7361uA0Arr, C7361uA0[] c7361uA0Arr2) {
        if (c7361uA0Arr == null || c7361uA0Arr2 == null || c7361uA0Arr.length != c7361uA0Arr2.length) {
            return false;
        }
        for (int i = 0; i < c7361uA0Arr.length; i++) {
            C7361uA0 c7361uA0 = c7361uA0Arr[i];
            char c = c7361uA0.a;
            C7361uA0 c7361uA02 = c7361uA0Arr2[i];
            if (c != c7361uA02.a || c7361uA0.b.length != c7361uA02.b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C7361uA0[] c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7963xK1.c(java.lang.String):uA0[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            C7361uA0.b(c(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    public static C7361uA0[] e(C7361uA0[] c7361uA0Arr) {
        C7361uA0[] c7361uA0Arr2 = new C7361uA0[c7361uA0Arr.length];
        for (int i = 0; i < c7361uA0Arr.length; i++) {
            c7361uA0Arr2[i] = new C7361uA0(c7361uA0Arr[i]);
        }
        return c7361uA0Arr2;
    }
}
