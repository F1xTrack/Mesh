package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class T3 implements S3 {
    public static volatile T3 c;
    public final C3866fw1 a;
    public final ConcurrentHashMap b;

    public T3(C3866fw1 c3866fw1) {
        Preconditions.checkNotNull(c3866fw1);
        this.a = c3866fw1;
        this.b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (AbstractC6420pE1.d(str) && AbstractC6420pE1.a(bundle, str2) && AbstractC6420pE1.c(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            CG1 cg1 = (CG1) this.a.b;
            cg1.getClass();
            cg1.f(new LG1(cg1, str, str2, bundle, true, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OJ1 b(String str, N8 n8) {
        C6446pN0 c6446pN0;
        Preconditions.checkNotNull(n8);
        if (!AbstractC6420pE1.d(str)) {
            return null;
        }
        boolean zIsEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.b;
        if (!zIsEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            return null;
        }
        boolean zEquals = "fiam".equals(str);
        C3866fw1 c3866fw1 = this.a;
        if (zEquals) {
            ES1 es1 = new ES1(28, false);
            es1.c = n8;
            c3866fw1.i(new C2489cI1(0, es1));
            es1.b = new HashSet();
            c6446pN0 = es1;
        } else if ("clx".equals(str)) {
            C6446pN0 c6446pN02 = new C6446pN0(16);
            c6446pN02.b = n8;
            c3866fw1.i(new C2489cI1(1, c6446pN02));
            c6446pN0 = c6446pN02;
        } else {
            c6446pN0 = null;
        }
        if (c6446pN0 == null) {
            return null;
        }
        concurrentHashMap.put(str, c6446pN0);
        return new OJ1(7);
    }
}
