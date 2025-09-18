package io.sentry;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class F1 extends V0 implements InterfaceC5141l0 {
    public File p;
    public int t;
    public Date v;
    public HashMap z;
    public io.sentry.protocol.t s = new io.sentry.protocol.t((UUID) null);
    public String q = "replay_event";
    public E1 r = E1.SESSION;
    public List x = new ArrayList();
    public List y = new ArrayList();
    public List w = new ArrayList();
    public Date u = io.sentry.config.a.k();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F1.class != obj.getClass()) {
            return false;
        }
        F1 f1 = (F1) obj;
        return this.t == f1.t && io.sentry.config.a.f(this.q, f1.q) && this.r == f1.r && io.sentry.config.a.f(this.s, f1.s) && io.sentry.config.a.f(this.w, f1.w) && io.sentry.config.a.f(this.x, f1.x) && io.sentry.config.a.f(this.y, f1.y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.q, this.r, this.s, Integer.valueOf(this.t), this.w, this.x, this.y});
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.q();
        a0.u("type").d(this.q);
        a0.u("replay_type").r(iLogger, this.r);
        a0.u("segment_id").b(this.t);
        a0.u("timestamp").r(iLogger, this.u);
        if (this.s != null) {
            a0.u("replay_id").r(iLogger, this.s);
        }
        if (this.v != null) {
            a0.u("replay_start_timestamp").r(iLogger, this.v);
        }
        if (this.w != null) {
            a0.u("urls").r(iLogger, this.w);
        }
        if (this.x != null) {
            a0.u("error_ids").r(iLogger, this.x);
        }
        if (this.y != null) {
            a0.u("trace_ids").r(iLogger, this.y);
        }
        io.sentry.config.a.E(this, a0, iLogger);
        HashMap map = this.z;
        if (map != null) {
            for (String str : map.keySet()) {
                a0.u(str).r(iLogger, this.z.get(str));
            }
        }
        a0.j();
    }
}
