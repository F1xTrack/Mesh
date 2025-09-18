package io.sentry.protocol;

import io.sentry.C6059l1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.sentry.protocol.r */
/* loaded from: classes2.dex */
public final class C6102r implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34430a;

    /* renamed from: b */
    public String f34431b;

    /* renamed from: c */
    public CopyOnWriteArraySet f34432c;

    /* renamed from: d */
    public CopyOnWriteArraySet f34433d;

    /* renamed from: e */
    public HashMap f34434e;

    public C6102r(String str, String str2) {
        this.f34430a = str;
        this.f34431b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6102r.class != obj.getClass()) {
            return false;
        }
        C6102r c6102r = (C6102r) obj;
        return this.f34430a.equals(c6102r.f34430a) && this.f34431b.equals(c6102r.f34431b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34430a, this.f34431b});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("name").mo13811d(this.f34430a);
        interfaceC5749A0.mo13828u("version").mo13811d(this.f34431b);
        CopyOnWriteArraySet copyOnWriteArraySet = this.f34432c;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = (CopyOnWriteArraySet) C6059l1.m21830v().f34227b;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.f34433d;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = (CopyOnWriteArraySet) C6059l1.m21830v().f34226a;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            interfaceC5749A0.mo13828u("packages").mo13825r(iLogger, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            interfaceC5749A0.mo13828u("integrations").mo13825r(iLogger, copyOnWriteArraySet2);
        }
        HashMap map = this.f34434e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f34434e.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
