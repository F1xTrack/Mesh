package io.sentry;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public enum U1 implements InterfaceC5141l0 {
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

    U1(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    public static U1 fromHttpStatusCode(int i) {
        for (U1 u1 : values()) {
            if (u1.matches(i)) {
                return u1;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }

    @Override // io.sentry.InterfaceC5141l0
    public void serialize(A0 a0, ILogger iLogger) throws IOException {
        a0.d(name().toLowerCase(Locale.ROOT));
    }

    public static U1 fromHttpStatusCode(Integer num, U1 u1) {
        U1 u1FromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : u1;
        return u1FromHttpStatusCode != null ? u1FromHttpStatusCode : u1;
    }

    U1(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }
}
