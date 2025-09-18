package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class Ej {
    private final Cj a;
    private final C2638an b;
    private final Gj c;
    private final Dj d;

    public Ej(Cj cj, Dj dj, C2638an c2638an, Gj gj) {
        this.a = cj;
        this.d = dj;
        this.b = c2638an;
        this.c = gj;
    }

    public C2766g1 a() {
        String strA;
        try {
            this.b.a();
            strA = this.c.a();
            try {
                if (TextUtils.isEmpty(strA)) {
                    strA = this.a.a();
                    if (!TextUtils.isEmpty(strA) || this.d.a()) {
                        strA = this.c.a(strA);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            strA = null;
        }
        this.b.b();
        return strA == null ? new C2766g1(null, EnumC2716e1.UNKNOWN, "Uuid must be obtained via async API YandexMetricaInternal#requestStartupIdentifiers(@NonNull Context context, @NonNull IIdentifierCallback callback,@NonNull String... identifiers)") : new C2766g1(strA, EnumC2716e1.OK, null);
    }
}
