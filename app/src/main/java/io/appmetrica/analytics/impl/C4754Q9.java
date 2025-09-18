package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p000.C6838sg;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.Q9 */
/* loaded from: classes2.dex */
public final class C4754Q9 {

    /* renamed from: a */
    public final C4860Uk f30658a = new C4860Uk();

    /* renamed from: b */
    public C4801S9 f30659b = new C4801S9();

    /* renamed from: a */
    public final synchronized void m19742a(C4801S9 c4801s9) {
        this.f30659b = c4801s9;
    }

    /* renamed from: a */
    public final synchronized void m19743a(List list, HashMap map) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (O90.m5963a((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.f30659b.f30731a) != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    C4801S9 c4801s9 = this.f30659b;
                    IdentifierStatus identifierStatus = c4801s9.f30732b;
                    String str2 = c4801s9.f30733c;
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new C6838sg();
                        }
                        str = "false";
                    }
                    map.put("appmetrica_lib_ssl_enabled", this.f30658a.m19894a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
