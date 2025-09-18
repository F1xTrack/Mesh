package io.sentry.android.ndk;

import io.sentry.C6017f;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC6058l0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6082E;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.android.ndk.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5919b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33867a;

    /* renamed from: b */
    public final /* synthetic */ C5921d f33868b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6058l0 f33869c;

    public /* synthetic */ RunnableC5919b(C5921d c5921d, InterfaceC6058l0 interfaceC6058l0, int i) {
        this.f33867a = i;
        this.f33868b = c5921d;
        this.f33869c = interfaceC6058l0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33867a) {
            case 0:
                C5921d c5921d = this.f33868b;
                SentryAndroidOptions sentryAndroidOptions = c5921d.f33874a;
                C6017f c6017f = (C6017f) this.f33869c;
                EnumC6069n1 enumC6069n1 = c6017f.f34150h;
                String strMo21457a = null;
                String lowerCase = enumC6069n1 != null ? enumC6069n1.name().toLowerCase(Locale.ROOT) : null;
                String strM21759s = AbstractC6003a.m21759s(c6017f.m21777a());
                try {
                    ConcurrentHashMap concurrentHashMap = c6017f.f34147e;
                    if (!concurrentHashMap.isEmpty()) {
                        strMo21457a = sentryAndroidOptions.getSerializer().mo21457a(concurrentHashMap);
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().mo21405c(EnumC6069n1.ERROR, th, "Breadcrumb data is not serializable.", new Object[0]);
                }
                String str = strMo21457a;
                String str2 = c6017f.f34145c;
                String str3 = c6017f.f34148f;
                String str4 = c6017f.f34146d;
                ((NativeScope) c5921d.f33875b).getClass();
                NativeScope.nativeAddBreadcrumb(lowerCase, str2, str3, str4, strM21759s, str);
                break;
            default:
                InterfaceC5918a interfaceC5918a = this.f33868b.f33875b;
                C6082E c6082e = (C6082E) this.f33869c;
                if (c6082e != null) {
                    String str5 = c6082e.f34289b;
                    String str6 = c6082e.f34288a;
                    String str7 = c6082e.f34292e;
                    String str8 = c6082e.f34290c;
                    ((NativeScope) interfaceC5918a).getClass();
                    NativeScope.nativeSetUser(str5, str6, str7, str8);
                    break;
                } else {
                    ((NativeScope) interfaceC5918a).getClass();
                    NativeScope.nativeRemoveUser();
                    break;
                }
        }
    }
}
