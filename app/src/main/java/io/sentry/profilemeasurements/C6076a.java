package io.sentry.profilemeasurements;

import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.profilemeasurements.a */
/* loaded from: classes2.dex */
public final class C6076a implements InterfaceC6058l0 {

    /* renamed from: a */
    public ConcurrentHashMap f34271a;

    /* renamed from: b */
    public String f34272b;

    /* renamed from: c */
    public Collection f34273c;

    public C6076a(String str, AbstractCollection abstractCollection) {
        this.f34272b = str;
        this.f34273c = abstractCollection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6076a.class != obj.getClass()) {
            return false;
        }
        C6076a c6076a = (C6076a) obj;
        return AbstractC6003a.m21747f(this.f34271a, c6076a.f34271a) && this.f34272b.equals(c6076a.f34272b) && new ArrayList(this.f34273c).equals(new ArrayList(c6076a.f34273c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34271a, this.f34272b, this.f34273c});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("unit").mo13825r(iLogger, this.f34272b);
        interfaceC5749A0.mo13828u("values").mo13825r(iLogger, this.f34273c);
        ConcurrentHashMap concurrentHashMap = this.f34271a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34271a, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
