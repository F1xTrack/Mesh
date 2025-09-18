package io.sentry.rrweb;

import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.HashMap;

/* renamed from: io.sentry.rrweb.g */
/* loaded from: classes2.dex */
public final class C6136g extends AbstractC6134e implements InterfaceC6058l0 {

    /* renamed from: d */
    public EnumC6135f f34563d;

    /* renamed from: e */
    public int f34564e;

    /* renamed from: f */
    public float f34565f;

    /* renamed from: g */
    public float f34566g;

    /* renamed from: h */
    public int f34567h;

    /* renamed from: i */
    public int f34568i;

    /* renamed from: j */
    public HashMap f34569j;

    /* renamed from: k */
    public HashMap f34570k;

    public C6136g() {
        super(EnumC6133d.MouseInteraction);
        this.f34567h = 2;
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("type").mo13825r(iLogger, this.f34560a);
        interfaceC5749A0.mo13828u("timestamp").mo13809b(this.f34561b);
        interfaceC5749A0.mo13828u("data");
        interfaceC5749A0.mo13824q();
        interfaceC5749A0.mo13828u("source").mo13825r(iLogger, this.f34562c);
        interfaceC5749A0.mo13828u("type").mo13825r(iLogger, this.f34563d);
        interfaceC5749A0.mo13828u(NotificationConstants.f19487ID).mo13809b(this.f34564e);
        interfaceC5749A0.mo13828u("x").mo13810c(this.f34565f);
        interfaceC5749A0.mo13828u("y").mo13810c(this.f34566g);
        interfaceC5749A0.mo13828u("pointerType").mo13809b(this.f34567h);
        interfaceC5749A0.mo13828u("pointerId").mo13809b(this.f34568i);
        HashMap map = this.f34570k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f34570k.get(str);
                interfaceC5749A0.mo13828u(str);
                interfaceC5749A0.mo13825r(iLogger, obj);
            }
        }
        interfaceC5749A0.mo13817j();
        HashMap map2 = this.f34569j;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                Object obj2 = this.f34569j.get(str2);
                interfaceC5749A0.mo13828u(str2);
                interfaceC5749A0.mo13825r(iLogger, obj2);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
