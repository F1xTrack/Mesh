package io.sentry.react;

import io.sentry.C5782L0;
import io.sentry.InterfaceC5785M0;
import io.sentry.InterfaceC5793P;
import io.sentry.InterfaceC6145s1;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.react.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6118b implements InterfaceC5785M0, InterfaceC6145s1 {

    /* renamed from: a */
    public final /* synthetic */ int f34514a;

    /* renamed from: b */
    public final /* synthetic */ String f34515b;

    /* renamed from: c */
    public final /* synthetic */ String f34516c;

    public /* synthetic */ C6118b(String str, String str2, int i) {
        this.f34514a = i;
        this.f34515b = str;
        this.f34516c = str2;
    }

    @Override // io.sentry.InterfaceC5785M0
    /* renamed from: b */
    public void mo3170b(C5782L0 c5782l0) {
        switch (this.f34514a) {
            case 0:
                ConcurrentHashMap concurrentHashMap = c5782l0.f33312h;
                String str = this.f34515b;
                String str2 = this.f34516c;
                concurrentHashMap.put(str, str2);
                for (InterfaceC5793P interfaceC5793P : c5782l0.f33314j.getScopeObservers()) {
                    interfaceC5793P.mo21440a(str, str2);
                    interfaceC5793P.mo21445g(concurrentHashMap);
                }
                break;
            default:
                ConcurrentHashMap concurrentHashMap2 = c5782l0.f33311g;
                String str3 = this.f34515b;
                String str4 = this.f34516c;
                concurrentHashMap2.put(str3, str4);
                for (InterfaceC5793P interfaceC5793P2 : c5782l0.f33314j.getScopeObservers()) {
                    interfaceC5793P2.mo21448j(str3, str4);
                    interfaceC5793P2.mo21442c(concurrentHashMap2);
                }
                break;
        }
    }
}
