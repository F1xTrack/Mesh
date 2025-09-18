package io.sentry.rrweb;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: io.sentry.rrweb.j */
/* loaded from: classes2.dex */
public final class C6139j extends AbstractC6131b implements InterfaceC6058l0 {

    /* renamed from: c */
    public String f34580c;

    /* renamed from: d */
    public int f34581d;

    /* renamed from: e */
    public int f34582e;

    /* renamed from: f */
    public HashMap f34583f;

    public C6139j() {
        super(EnumC6132c.Meta);
        this.f34580c = "";
    }

    @Override // io.sentry.rrweb.AbstractC6131b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6139j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C6139j c6139j = (C6139j) obj;
        return this.f34581d == c6139j.f34581d && this.f34582e == c6139j.f34582e && AbstractC6003a.m21747f(this.f34580c, c6139j.f34580c);
    }

    @Override // io.sentry.rrweb.AbstractC6131b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f34580c, Integer.valueOf(this.f34581d), Integer.valueOf(this.f34582e)});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("type").mo13825r(iLogger, this.f34560a);
        interfaceC5749A0.mo13828u("timestamp").mo13809b(this.f34561b);
        interfaceC5749A0.mo13828u("data");
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("href").mo13811d(this.f34580c);
        interfaceC5749A0.mo13828u(Snapshot.HEIGHT).mo13809b(this.f34581d);
        interfaceC5749A0.mo13828u(Snapshot.WIDTH).mo13809b(this.f34582e);
        HashMap map = this.f34583f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f34583f.get(str);
                interfaceC5749A0.mo13828u(str);
                interfaceC5749A0.mo13825r(iLogger, obj);
            }
        }
        interfaceC5749A0.mo13817j();
        interfaceC5749A0.mo13817j();
    }
}
