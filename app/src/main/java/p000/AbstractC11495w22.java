package p000;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import java.lang.reflect.InvocationTargetException;

/* renamed from: w22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11495w22 {
    /* renamed from: a */
    public static CallInvokerHolderImpl m25551a(ReactApplicationContext reactApplicationContext) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            try {
                return (CallInvokerHolderImpl) reactApplicationContext.getClass().getMethod("getJSCallInvokerHolder", null).invoke(reactApplicationContext, null);
            } catch (Exception unused) {
                Object objInvoke = reactApplicationContext.getClass().getMethod("getCatalystInstance", null).invoke(reactApplicationContext, null);
                return (CallInvokerHolderImpl) objInvoke.getClass().getMethod("getJSCallInvokerHolder", null).invoke(objInvoke, null);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to get JSCallInvokerHolder", e);
        }
    }

    /* renamed from: b */
    public static void m25552b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws DH1 {
        if (!m25556f(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m25556f(b3) && !m25556f(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw new DH1("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m25553c(byte r2, byte r3, byte r4, char[] r5, int r6) throws p000.DH1 {
        /*
            boolean r0 = m25556f(r3)
            if (r0 != 0) goto L2c
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L2c
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L2c
            r2 = r1
        L16:
            boolean r0 = m25556f(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            DH1 r2 = new DH1
            java.lang.String r3 = "Protocol message had invalid UTF-8."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC11495w22.m25553c(byte, byte, byte, char[], int):void");
    }

    /* renamed from: d */
    public static void m25554d(byte b, byte b2, char[] cArr, int i) throws DH1 {
        if (b < -62 || m25556f(b2)) {
            throw new DH1("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ boolean m25555e(byte b) {
        return b >= 0;
    }

    /* renamed from: f */
    public static boolean m25556f(byte b) {
        return b > -65;
    }
}
