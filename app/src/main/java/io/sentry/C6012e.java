package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6104t;
import io.sentry.vendor.gson.stream.EnumC6185b;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC7222ym;

/* renamed from: io.sentry.e */
/* loaded from: classes2.dex */
public final class C6012e implements InterfaceC5826a0 {

    /* renamed from: a */
    public final /* synthetic */ int f34132a;

    public /* synthetic */ C6012e(int i) {
        this.f34132a = i;
    }

    /* renamed from: b */
    public static C5798Q1 m21774b(C6055k0 c6055k0, ILogger iLogger) throws IOException {
        String strM21813h0;
        c6055k0.m21817n();
        String strM21820o0 = null;
        C6104t c6104t = null;
        C5803S1 c5803s1 = null;
        C5803S1 c5803s12 = null;
        ConcurrentHashMap concurrentHashMap = null;
        String strM21820o02 = null;
        EnumC5809U1 enumC5809U1 = null;
        String strM21820o03 = null;
        ConcurrentHashMap concurrentHashMapM21732A = null;
        while (c6055k0.m21825s0() == EnumC6185b.NAME) {
            strM21813h0 = c6055k0.m21813h0();
            strM21813h0.getClass();
            switch (strM21813h0) {
                case "span_id":
                    c5803s1 = new C5803S1(c6055k0.m21820o0());
                    break;
                case "parent_span_id":
                    c5803s12 = (C5803S1) c6055k0.m21818n0(iLogger, new C6012e(15));
                    break;
                case "description":
                    strM21820o02 = c6055k0.m21820o0();
                    break;
                case "origin":
                    strM21820o03 = c6055k0.m21820o0();
                    break;
                case "status":
                    enumC5809U1 = (EnumC5809U1) c6055k0.m21818n0(iLogger, new C6012e(16));
                    break;
                case "op":
                    strM21820o0 = c6055k0.m21820o0();
                    break;
                case "tags":
                    concurrentHashMapM21732A = AbstractC6003a.m21732A((Map) c6055k0.m21816m0());
                    break;
                case "trace_id":
                    c6104t = new C6104t(c6055k0.m21820o0());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    c6055k0.m21823q0(iLogger, concurrentHashMap, strM21813h0);
                    break;
            }
        }
        if (c6104t == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            iLogger.mo21406d(EnumC6069n1.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (c5803s1 == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            iLogger.mo21406d(EnumC6069n1.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        C5798Q1 c5798q1 = new C5798Q1(c6104t, c5803s1, strM21820o0 == null ? "" : strM21820o0, c5803s12, null);
        c5798q1.f33384f = strM21820o02;
        c5798q1.f33385g = enumC5809U1;
        c5798q1.f33387i = strM21820o03;
        if (concurrentHashMapM21732A != null) {
            c5798q1.f33386h = concurrentHashMapM21732A;
        }
        c5798q1.f33388j = concurrentHashMap;
        c6055k0.m21819o();
        return c5798q1;
    }

    /* renamed from: c */
    public static IllegalStateException m21775c(String str, ILogger iLogger) {
        String strM26234k = AbstractC7222ym.m26234k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM26234k);
        iLogger.mo21406d(EnumC6069n1.ERROR, strM26234k, illegalStateException);
        return illegalStateException;
    }

    /* renamed from: d */
    public static IllegalStateException m21776d(String str, ILogger iLogger) {
        String strM26234k = AbstractC7222ym.m26234k("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strM26234k);
        iLogger.mo21406d(EnumC6069n1.ERROR, strM26234k, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1619:0x0441, code lost:
    
        r15.m21909o();
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
    @Override // io.sentry.InterfaceC5826a0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo21493a(io.sentry.C6055k0 r56, io.sentry.ILogger r57) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 5180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C6012e.mo21493a(io.sentry.k0, io.sentry.ILogger):java.lang.Object");
    }
}
