package io.sentry.protocol;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class G implements InterfaceC5141l0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;
    public String i;
    public Double j;
    public List k;
    public HashMap l;

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        if (this.a != null) {
            a0.u("rendering_system").d(this.a);
        }
        if (this.b != null) {
            a0.u("type").d(this.b);
        }
        if (this.c != null) {
            a0.u("identifier").d(this.c);
        }
        if (this.d != null) {
            a0.u("tag").d(this.d);
        }
        if (this.e != null) {
            a0.u(Snapshot.WIDTH).m(this.e);
        }
        if (this.f != null) {
            a0.u(Snapshot.HEIGHT).m(this.f);
        }
        if (this.g != null) {
            a0.u("x").m(this.g);
        }
        if (this.h != null) {
            a0.u("y").m(this.h);
        }
        if (this.i != null) {
            a0.u("visibility").d(this.i);
        }
        if (this.j != null) {
            a0.u("alpha").m(this.j);
        }
        List list = this.k;
        if (list != null && !list.isEmpty()) {
            a0.u("children").r(iLogger, this.k);
        }
        HashMap map = this.l;
        if (map != null) {
            for (String str : map.keySet()) {
                a0.u(str).r(iLogger, this.l.get(str));
            }
        }
        a0.j();
    }
}
