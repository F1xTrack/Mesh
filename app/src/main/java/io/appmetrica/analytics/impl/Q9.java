package io.appmetrica.analytics.impl;

import defpackage.C7074sg;
import defpackage.O90;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Q9 {
    public final Uk a = new Uk();
    public S9 b = new S9();

    public final synchronized void a(S9 s9) {
        this.b = s9;
    }

    public final synchronized void a(List list, HashMap map) {
        Boolean bool;
        String str;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (O90.a((String) it.next(), "appmetrica_lib_ssl_enabled") && (bool = this.b.a) != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    S9 s9 = this.b;
                    IdentifierStatus identifierStatus = s9.b;
                    String str2 = s9.c;
                    if (zBooleanValue) {
                        str = "true";
                    } else {
                        if (zBooleanValue) {
                            throw new C7074sg();
                        }
                        str = "false";
                    }
                    map.put("appmetrica_lib_ssl_enabled", this.a.a(new IdentifiersResult(str, identifierStatus, str2)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
