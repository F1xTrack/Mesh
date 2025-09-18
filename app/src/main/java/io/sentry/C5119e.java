package io.sentry;

import defpackage.AbstractC8235ym;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.e */
/* loaded from: classes2.dex */
public final class C5119e implements InterfaceC5082a0 {
    public final /* synthetic */ int a;

    public /* synthetic */ C5119e(int i) {
        this.a = i;
    }

    public static Q1 b(C5138k0 c5138k0, ILogger iLogger) throws IOException {
        String strH0;
        c5138k0.n();
        String strO0 = null;
        io.sentry.protocol.t tVar = null;
        S1 s1 = null;
        S1 s12 = null;
        ConcurrentHashMap concurrentHashMap = null;
        String strO02 = null;
        U1 u1 = null;
        String strO03 = null;
        ConcurrentHashMap concurrentHashMapA = null;
        while (c5138k0.s0() == io.sentry.vendor.gson.stream.b.NAME) {
            strH0 = c5138k0.h0();
            strH0.getClass();
            switch (strH0) {
                case "span_id":
                    s1 = new S1(c5138k0.o0());
                    break;
                case "parent_span_id":
                    s12 = (S1) c5138k0.n0(iLogger, new C5119e(15));
                    break;
                case "description":
                    strO02 = c5138k0.o0();
                    break;
                case "origin":
                    strO03 = c5138k0.o0();
                    break;
                case "status":
                    u1 = (U1) c5138k0.n0(iLogger, new C5119e(16));
                    break;
                case "op":
                    strO0 = c5138k0.o0();
                    break;
                case "tags":
                    concurrentHashMapA = io.sentry.config.a.A((Map) c5138k0.m0());
                    break;
                case "trace_id":
                    tVar = new io.sentry.protocol.t(c5138k0.o0());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c5138k0.q0(iLogger, concurrentHashMap, strH0);
                    break;
            }
        }
        if (tVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            iLogger.d(EnumC5148n1.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (s1 == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            iLogger.d(EnumC5148n1.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        Q1 q1 = new Q1(tVar, s1, strO0 == null ? "" : strO0, s12, null);
        q1.f = strO02;
        q1.g = u1;
        q1.i = strO03;
        if (concurrentHashMapA != null) {
            q1.h = concurrentHashMapA;
        }
        q1.j = concurrentHashMap;
        c5138k0.o();
        return q1;
    }

    public static IllegalStateException c(String str, ILogger iLogger) {
        String strK = AbstractC8235ym.k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strK);
        iLogger.d(EnumC5148n1.ERROR, strK, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException d(String str, ILogger iLogger) {
        String strK = AbstractC8235ym.k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strK);
        iLogger.d(EnumC5148n1.ERROR, strK, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1619:0x0441, code lost:
    
        r15.o();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:1617:0x0439. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1338:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:1388:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:1455:0x0221 A[PHI: r10
  0x0221: PHI (r10v13 java.lang.String) = (r10v12 java.lang.String), (r10v15 java.lang.String) binds: [B:1450:0x0214, B:1453:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1473:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:1529:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:1627:0x046a A[LOOP:5: B:1551:0x0384->B:1627:0x046a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:1674:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:1743:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:1784:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:1848:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:1889:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:1922:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:2014:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:2055:0x0c70  */
    /* JADX WARN: Removed duplicated region for block: B:2116:0x0d94  */
    /* JADX WARN: Removed duplicated region for block: B:2221:0x0ef2 A[PHI: r6
  0x0ef2: PHI (r6v22 java.lang.Object) = 
  (r6v8 java.lang.Object)
  (r6v9 java.lang.Object)
  (r6v10 java.lang.Object)
  (r6v11 java.lang.Object)
  (r6v12 java.lang.Object)
  (r6v13 java.lang.Object)
  (r6v14 java.lang.Object)
  (r6v15 java.lang.Object)
  (r6v16 java.lang.Object)
  (r6v17 java.lang.Object)
  (r6v18 java.lang.Object)
  (r6v19 java.lang.Object)
  (r6v20 java.lang.Object)
  (r6v21 java.lang.Object)
  (r6v23 java.lang.Object)
 binds: [B:2220:0x0ef0, B:2216:0x0ee3, B:2212:0x0ed6, B:2208:0x0ec9, B:2204:0x0ebc, B:2200:0x0eae, B:2196:0x0ea1, B:2192:0x0e92, B:2188:0x0e83, B:2184:0x0e74, B:2180:0x0e64, B:2176:0x0e54, B:2172:0x0e45, B:2168:0x0e35, B:2164:0x0e25] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:2314:0x104f  */
    /* JADX WARN: Removed duplicated region for block: B:2436:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r56v0, types: [io.sentry.k0] */
    /* JADX WARN: Type inference failed for: r57v0, types: [io.sentry.ILogger] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // io.sentry.InterfaceC5082a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(io.sentry.C5138k0 r56, io.sentry.ILogger r57) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 5180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C5119e.a(io.sentry.k0, io.sentry.ILogger):java.lang.Object");
    }
}
