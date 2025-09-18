package p000;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: T3 */
/* loaded from: classes.dex */
public final class C1199T3 implements InterfaceC1136S3 {

    /* renamed from: c */
    public static volatile C1199T3 f11129c;

    /* renamed from: a */
    public final C9432fw1 f11130a;

    /* renamed from: b */
    public final ConcurrentHashMap f11131b;

    public C1199T3(C9432fw1 c9432fw1) {
        Preconditions.checkNotNull(c9432fw1);
        this.f11130a = c9432fw1;
        this.f11131b = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public final void m7538a(String str, String str2, Bundle bundle) {
        if (AbstractC10624pE1.m23664d(str) && AbstractC10624pE1.m23661a(bundle, str2) && AbstractC10624pE1.m23663c(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            CG1 cg1 = (CG1) this.f11130a.f27505b;
            cg1.getClass();
            cg1.m1136f(new LG1(cg1, str, str2, bundle, true, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final OJ1 m7539b(String str, C0827N8 c0827n8) {
        C10641pN0 c10641pN0;
        Preconditions.checkNotNull(c0827n8);
        if (!AbstractC10624pE1.m23664d(str)) {
            return null;
        }
        boolean zIsEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f11131b;
        if (!zIsEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            return null;
        }
        boolean zEquals = "fiam".equals(str);
        C9432fw1 c9432fw1 = this.f11130a;
        if (zEquals) {
            ES1 es1 = new ES1(28, false);
            es1.f2709c = c0827n8;
            c9432fw1.m18337i(new C8963cI1(0, es1));
            es1.f2708b = new HashSet();
            c10641pN0 = es1;
        } else if ("clx".equals(str)) {
            C10641pN0 c10641pN02 = new C10641pN0(16);
            c10641pN02.f40042b = c0827n8;
            c9432fw1.m18337i(new C8963cI1(1, c10641pN02));
            c10641pN0 = c10641pN02;
        } else {
            c10641pN0 = null;
        }
        if (c10641pN0 == null) {
            return null;
        }
        concurrentHashMap.put(str, c10641pN0);
        return new OJ1(7);
    }
}
