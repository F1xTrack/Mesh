package io.sentry.react;

import io.sentry.InterfaceC5169s1;
import io.sentry.L0;
import io.sentry.M0;
import io.sentry.P;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements M0, InterfaceC5169s1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ b(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // io.sentry.M0
    public void b(L0 l0) {
        switch (this.a) {
            case 0:
                ConcurrentHashMap concurrentHashMap = l0.h;
                String str = this.b;
                String str2 = this.c;
                concurrentHashMap.put(str, str2);
                for (P p : l0.j.getScopeObservers()) {
                    p.a(str, str2);
                    p.g(concurrentHashMap);
                }
                break;
            default:
                ConcurrentHashMap concurrentHashMap2 = l0.g;
                String str3 = this.b;
                String str4 = this.c;
                concurrentHashMap2.put(str3, str4);
                for (P p2 : l0.j.getScopeObservers()) {
                    p2.j(str3, str4);
                    p2.c(concurrentHashMap2);
                }
                break;
        }
    }
}
