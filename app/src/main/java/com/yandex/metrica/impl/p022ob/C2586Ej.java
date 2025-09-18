package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.Ej */
/* loaded from: classes2.dex */
public class C2586Ej {

    /* renamed from: a */
    private final InterfaceC2536Cj f21132a;

    /* renamed from: b */
    private final C3139an f21133b;

    /* renamed from: c */
    private final C2636Gj f21134c;

    /* renamed from: d */
    private final InterfaceC2561Dj f21135d;

    public C2586Ej(InterfaceC2536Cj interfaceC2536Cj, InterfaceC2561Dj interfaceC2561Dj, C3139an c3139an, C2636Gj c2636Gj) {
        this.f21132a = interfaceC2536Cj;
        this.f21135d = interfaceC2561Dj;
        this.f21133b = c3139an;
        this.f21134c = c2636Gj;
    }

    /* renamed from: a */
    public C3273g1 m14045a() {
        String strM14204a;
        try {
            this.f21133b.m15622a();
            strM14204a = this.f21134c.m14204a();
            try {
                if (TextUtils.isEmpty(strM14204a)) {
                    strM14204a = this.f21132a.mo13970a();
                    if (!TextUtils.isEmpty(strM14204a) || this.f21135d.mo13936a()) {
                        strM14204a = this.f21134c.m14205a(strM14204a);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            strM14204a = null;
        }
        this.f21133b.m15623b();
        return strM14204a == null ? new C3273g1(null, EnumC3221e1.UNKNOWN, "Uuid must be obtained via async API YandexMetricaInternal#requestStartupIdentifiers(@NonNull Context context, @NonNull IIdentifierCallback callback,@NonNull String... identifiers)") : new C3273g1(strM14204a, EnumC3221e1.OK, null);
    }
}
