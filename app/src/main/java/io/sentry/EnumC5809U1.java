package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* renamed from: io.sentry.U1 */
/* loaded from: classes2.dex */
public enum EnumC5809U1 implements InterfaceC6058l0 {
    OK(200, 299),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    EnumC5809U1(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    public static EnumC5809U1 fromHttpStatusCode(int i) {
        for (EnumC5809U1 enumC5809U1 : values()) {
            if (enumC5809U1.matches(i)) {
                return enumC5809U1;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }

    @Override // io.sentry.InterfaceC6058l0
    public void serialize(InterfaceC5749A0 interfaceC5749A0, ILogger iLogger) throws IOException {
        interfaceC5749A0.mo13811d(name().toLowerCase(Locale.ROOT));
    }

    public static EnumC5809U1 fromHttpStatusCode(Integer num, EnumC5809U1 enumC5809U1) {
        EnumC5809U1 enumC5809U1FromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : enumC5809U1;
        return enumC5809U1FromHttpStatusCode != null ? enumC5809U1FromHttpStatusCode : enumC5809U1;
    }

    EnumC5809U1(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }
}
