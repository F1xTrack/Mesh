package io.sentry.protocol;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import java.util.HashMap;
import java.util.List;

/* renamed from: io.sentry.protocol.G */
/* loaded from: classes2.dex */
public final class C6084G implements InterfaceC6058l0 {

    /* renamed from: a */
    public String f34300a;

    /* renamed from: b */
    public String f34301b;

    /* renamed from: c */
    public String f34302c;

    /* renamed from: d */
    public String f34303d;

    /* renamed from: e */
    public Double f34304e;

    /* renamed from: f */
    public Double f34305f;

    /* renamed from: g */
    public Double f34306g;

    /* renamed from: h */
    public Double f34307h;

    /* renamed from: i */
    public String f34308i;

    /* renamed from: j */
    public Double f34309j;

    /* renamed from: k */
    public List f34310k;

    /* renamed from: l */
    public HashMap f34311l;

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f34300a != null) {
            interfaceC5749A0.mo13828u("rendering_system").mo13811d(this.f34300a);
        }
        if (this.f34301b != null) {
            interfaceC5749A0.mo13828u("type").mo13811d(this.f34301b);
        }
        if (this.f34302c != null) {
            interfaceC5749A0.mo13828u("identifier").mo13811d(this.f34302c);
        }
        if (this.f34303d != null) {
            interfaceC5749A0.mo13828u("tag").mo13811d(this.f34303d);
        }
        if (this.f34304e != null) {
            interfaceC5749A0.mo13828u(Snapshot.WIDTH).mo13820m(this.f34304e);
        }
        if (this.f34305f != null) {
            interfaceC5749A0.mo13828u(Snapshot.HEIGHT).mo13820m(this.f34305f);
        }
        if (this.f34306g != null) {
            interfaceC5749A0.mo13828u("x").mo13820m(this.f34306g);
        }
        if (this.f34307h != null) {
            interfaceC5749A0.mo13828u("y").mo13820m(this.f34307h);
        }
        if (this.f34308i != null) {
            interfaceC5749A0.mo13828u("visibility").mo13811d(this.f34308i);
        }
        if (this.f34309j != null) {
            interfaceC5749A0.mo13828u("alpha").mo13820m(this.f34309j);
        }
        List list = this.f34310k;
        if (list != null && !list.isEmpty()) {
            interfaceC5749A0.mo13828u("children").mo13825r(iLogger, this.f34310k);
        }
        HashMap map = this.f34311l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f34311l.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
    }
}
