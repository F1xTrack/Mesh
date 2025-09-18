package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.HashMap;
import java.util.List;

/* renamed from: io.sentry.rrweb.i */
/* loaded from: classes2.dex */
public final class C6138i extends AbstractC6134e implements InterfaceC6058l0 {

    /* renamed from: d */
    public int f34576d;

    /* renamed from: e */
    public List f34577e;

    /* renamed from: f */
    public HashMap f34578f;

    /* renamed from: g */
    public HashMap f34579g;

    public C6138i() {
        super(EnumC6133d.TouchMove);
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("type").mo13825r(iLogger, this.f34560a);
        interfaceC5749A0.mo13828u("timestamp").mo13809b(this.f34561b);
        interfaceC5749A0.mo13828u("data");
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("source").mo13825r(iLogger, this.f34562c);
        List list = this.f34577e;
        if (list != null && !list.isEmpty()) {
            interfaceC5749A0.mo13828u("positions").mo13825r(iLogger, this.f34577e);
        }
        interfaceC5749A0.mo13828u("pointerId").mo13809b(this.f34576d);
        HashMap map = this.f34579g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f34579g.get(str);
                interfaceC5749A0.mo13828u(str);
                interfaceC5749A0.mo13825r(iLogger, obj);
            }
        }
        interfaceC5749A0.mo13817j();
        HashMap map2 = this.f34578f;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                Object obj2 = this.f34578f.get(str2);
                interfaceC5749A0.mo13828u(str2);
                interfaceC5749A0.mo13825r(iLogger, obj2);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
