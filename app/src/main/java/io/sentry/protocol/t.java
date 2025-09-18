package io.sentry.protocol;

import io.sentry.A0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5141l0;
import java.nio.charset.Charset;
import java.util.UUID;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;

/* loaded from: classes2.dex */
public final class t implements InterfaceC5141l0 {
    public static final t b = new t(new UUID(0, 0));
    public final UUID a;

    public t(UUID uuid) {
        this.a = uuid == null ? UUID.randomUUID() : uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && t.class == obj.getClass() && this.a.compareTo(((t) obj).a) == 0;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // io.sentry.InterfaceC5141l0
    public final void serialize(A0 a0, ILogger iLogger) {
        a0.d(toString());
    }

    public final String toString() {
        String string = this.a.toString();
        Charset charset = io.sentry.util.h.a;
        if (string.equals("0000-0000")) {
            string = DeviceIdUtils.NULL_UUID;
        }
        return string.replace("-", "");
    }

    public t(String str) {
        Charset charset = io.sentry.util.h.a;
        str = str.equals("0000-0000") ? DeviceIdUtils.NULL_UUID : str;
        str = str.length() == 32 ? new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString() : str;
        if (str.length() == 36) {
            this.a = UUID.fromString(str);
            return;
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
    }
}
