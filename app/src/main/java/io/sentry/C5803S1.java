package io.sentry;

import io.sentry.config.AbstractC6003a;
import io.sentry.util.AbstractC6175h;
import java.nio.charset.Charset;
import java.util.UUID;
import ru.p031ok.tracer.base.deviceid.DeviceIdUtils;

/* renamed from: io.sentry.S1 */
/* loaded from: classes2.dex */
public final class C5803S1 implements InterfaceC6058l0 {

    /* renamed from: b */
    public static final C5803S1 f33394b = new C5803S1(new UUID(0, 0));

    /* renamed from: a */
    public final String f33395a;

    public C5803S1(String str) {
        AbstractC6003a.m21735D(str, "value is required");
        this.f33395a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5803S1.class != obj.getClass()) {
            return false;
        }
        return this.f33395a.equals(((C5803S1) obj).f33395a);
    }

    public final int hashCode() {
        return this.f33395a.hashCode();
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13811d(this.f33395a);
    }

    public final String toString() {
        return this.f33395a;
    }

    public C5803S1() {
        this(UUID.randomUUID());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C5803S1(UUID uuid) {
        String string = uuid.toString();
        Charset charset = AbstractC6175h.f34667a;
        this((string.equals("0000-0000") ? DeviceIdUtils.NULL_UUID : string).replace("-", "").substring(0, 16));
    }
}
