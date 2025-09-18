package io.sentry;

import io.sentry.config.AbstractC6003a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: io.sentry.J0 */
/* loaded from: classes2.dex */
public final class C5776J0 implements InterfaceC6058l0 {

    /* renamed from: a */
    public Integer f33299a;

    /* renamed from: b */
    public List f33300b;

    /* renamed from: c */
    public HashMap f33301c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5776J0.class != obj.getClass()) {
            return false;
        }
        C5776J0 c5776j0 = (C5776J0) obj;
        return AbstractC6003a.m21747f(this.f33299a, c5776j0.f33299a) && AbstractC6003a.m21747f(this.f33300b, c5776j0.f33300b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33299a, this.f33300b});
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13824q();
        if (this.f33299a != null) {
            interfaceC5749A0.mo13828u("segment_id").mo13820m(this.f33299a);
        }
        HashMap map = this.f33301c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5749A0.mo13828u(str).mo13825r(iLogger, this.f33301c.get(str));
            }
        }
        interfaceC5749A0.mo13817j();
        interfaceC5749A0.mo13813f(true);
        if (this.f33299a != null) {
            interfaceC5749A0.mo13821n();
        }
        List list = this.f33300b;
        if (list != null) {
            interfaceC5749A0.mo13825r(iLogger, list);
        }
        interfaceC5749A0.mo13813f(false);
    }
}
