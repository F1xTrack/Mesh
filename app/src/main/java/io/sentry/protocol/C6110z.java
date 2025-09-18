package io.sentry.protocol;

import com.huawei.hms.p015rn.push.constants.NotificationConstants;
import io.sentry.AbstractC6008d;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.z */
/* loaded from: classes2.dex */
public final class C6110z implements InterfaceC6058l0 {

    /* renamed from: a */
    public Long f34487a;

    /* renamed from: b */
    public Integer f34488b;

    /* renamed from: c */
    public String f34489c;

    /* renamed from: d */
    public String f34490d;

    /* renamed from: e */
    public Boolean f34491e;

    /* renamed from: f */
    public Boolean f34492f;

    /* renamed from: g */
    public Boolean f34493g;

    /* renamed from: h */
    public Boolean f34494h;

    /* renamed from: i */
    public C6109y f34495i;

    /* renamed from: j */
    public Map f34496j;

    /* renamed from: k */
    public ConcurrentHashMap f34497k;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34487a != null) {
            interfaceC5749A0.mo13828u(NotificationConstants.f19487ID).mo13820m(this.f34487a);
        }
        if (this.f34488b != null) {
            interfaceC5749A0.mo13828u("priority").mo13820m(this.f34488b);
        }
        if (this.f34489c != null) {
            interfaceC5749A0.mo13828u("name").mo13811d(this.f34489c);
        }
        if (this.f34490d != null) {
            interfaceC5749A0.mo13828u("state").mo13811d(this.f34490d);
        }
        if (this.f34491e != null) {
            interfaceC5749A0.mo13828u("crashed").mo13826s(this.f34491e);
        }
        if (this.f34492f != null) {
            interfaceC5749A0.mo13828u("current").mo13826s(this.f34492f);
        }
        if (this.f34493g != null) {
            interfaceC5749A0.mo13828u("daemon").mo13826s(this.f34493g);
        }
        if (this.f34494h != null) {
            interfaceC5749A0.mo13828u("main").mo13826s(this.f34494h);
        }
        if (this.f34495i != null) {
            interfaceC5749A0.mo13828u("stacktrace").mo13825r(iLogger, this.f34495i);
        }
        if (this.f34496j != null) {
            interfaceC5749A0.mo13828u("held_locks").mo13825r(iLogger, this.f34496j);
        }
        ConcurrentHashMap concurrentHashMap = this.f34497k;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC6008d.m21773c(this.f34497k, str, interfaceC5749A0, str, iLogger);
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
