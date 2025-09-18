package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.identifiers.impl.j */
/* loaded from: classes2.dex */
public final class C4344j implements InterfaceC4336b {

    /* renamed from: a */
    public final C4340f f29826a;

    public C4344j(C4340f c4340f) {
        this.f29826a = c4340f;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.InterfaceC4336b
    /* renamed from: a */
    public final C4337c mo19171a(Context context) {
        C4337c c4337c;
        C4340f c4340f;
        try {
            try {
                try {
                    C4347m c4347m = (C4347m) ((InterfaceC4349o) this.f29826a.m19173a(context));
                    c4337c = new C4337c(IdentifierStatus.OK, new C4335a("huawei", c4347m.m19176a(), Boolean.valueOf(c4347m.m19177b())), null, 4);
                    c4340f = this.f29826a;
                } finally {
                    c4340f.m19174b(context);
                }
            } catch (C4341g e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown exception during binding huawei services";
                }
                c4337c = new C4337c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message);
                c4340f = this.f29826a;
            }
            c4340f.m19174b(context);
            return c4337c;
        } catch (Throwable th) {
            try {
                this.f29826a.m19174b(context);
            } catch (Throwable unused) {
            }
        }
    }

    public C4344j() {
        this(new C4340f(AbstractC4345k.f29827a, C4343i.f29825a, "huawei"));
    }
}
