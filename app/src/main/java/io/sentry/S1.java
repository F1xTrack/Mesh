package io.sentry;

import java.nio.charset.Charset;
import java.util.UUID;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;

/* loaded from: classes2.dex */
public final class S1 implements InterfaceC5141l0 {
    public static final S1 b = new S1(new UUID(0, 0));
    public final String a;

    public S1(String str) {
        io.sentry.config.a.D(str, "value is required");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((S1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.d(this.a);
    }

    public final String toString() {
        return this.a;
    }

    public S1() {
        this(UUID.randomUUID());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public S1(UUID uuid) {
        String string = uuid.toString();
        Charset charset = io.sentry.util.h.a;
        this((string.equals("0000-0000") ? DeviceIdUtils.NULL_UUID : string).replace("-", "").substring(0, 16));
    }
}
