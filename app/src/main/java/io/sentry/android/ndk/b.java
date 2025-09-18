package io.sentry.android.ndk;

import io.sentry.C5122f;
import io.sentry.EnumC5148n1;
import io.sentry.InterfaceC5141l0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.E;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ InterfaceC5141l0 c;

    public /* synthetic */ b(d dVar, InterfaceC5141l0 interfaceC5141l0, int i) {
        this.a = i;
        this.b = dVar;
        this.c = interfaceC5141l0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d dVar = this.b;
                SentryAndroidOptions sentryAndroidOptions = dVar.a;
                C5122f c5122f = (C5122f) this.c;
                EnumC5148n1 enumC5148n1 = c5122f.h;
                String strA = null;
                String lowerCase = enumC5148n1 != null ? enumC5148n1.name().toLowerCase(Locale.ROOT) : null;
                String strS = io.sentry.config.a.s(c5122f.a());
                try {
                    ConcurrentHashMap concurrentHashMap = c5122f.e;
                    if (!concurrentHashMap.isEmpty()) {
                        strA = sentryAndroidOptions.getSerializer().a(concurrentHashMap);
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().c(EnumC5148n1.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
                }
                String str = strA;
                String str2 = c5122f.c;
                String str3 = c5122f.f;
                String str4 = c5122f.d;
                ((NativeScope) dVar.b).getClass();
                NativeScope.nativeAddBreadcrumb(lowerCase, str2, str3, str4, strS, str);
                break;
            default:
                a aVar = this.b.b;
                E e = (E) this.c;
                if (e != null) {
                    String str5 = e.b;
                    String str6 = e.a;
                    String str7 = e.e;
                    String str8 = e.c;
                    ((NativeScope) aVar).getClass();
                    NativeScope.nativeSetUser(str5, str6, str7, str8);
                    break;
                } else {
                    ((NativeScope) aVar).getClass();
                    NativeScope.nativeRemoveUser();
                    break;
                }
        }
    }
}
