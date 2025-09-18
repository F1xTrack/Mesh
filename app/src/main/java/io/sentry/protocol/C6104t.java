package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.InterfaceC5749A0;
import io.sentry.InterfaceC6058l0;
import io.sentry.util.AbstractC6175h;
import java.nio.charset.Charset;
import java.util.UUID;
import ru.p031ok.tracer.base.deviceid.DeviceIdUtils;

/* renamed from: io.sentry.protocol.t */
/* loaded from: classes2.dex */
public final class C6104t implements InterfaceC6058l0 {

    /* renamed from: b */
    public static final C6104t f34442b = new C6104t(new UUID(0, 0));

    /* renamed from: a */
    public final UUID f34443a;

    public C6104t(UUID uuid) {
        this.f34443a = uuid == null ? UUID.randomUUID() : uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C6104t.class == obj.getClass() && this.f34443a.compareTo(((C6104t) obj).f34443a) == 0;
    }

    public final int hashCode() {
        return this.f34443a.hashCode();
    }

    @Override // io.sentry.InterfaceC6058l0
    public final void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) {
        interfaceC5749A0.mo13811d(toString());
    }

    public final String toString() {
        String string = this.f34443a.toString();
        Charset charset = AbstractC6175h.f34667a;
        if (string.equals("0000-0000")) {
            string = DeviceIdUtils.NULL_UUID;
        }
        return string.replace("-", "");
    }

    public C6104t(String str) {
        Charset charset = AbstractC6175h.f34667a;
        str = str.equals("0000-0000") ? DeviceIdUtils.NULL_UUID : str;
        str = str.length() == 32 ? new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString() : str;
        if (str.length() == 36) {
            this.f34443a = UUID.fromString(str);
            return;
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
    }
}
