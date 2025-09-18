package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;

/* renamed from: Gz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0563Gz {
    public static final Collection a;

    static {
        try {
            a = AbstractC4175hY0.n(AbstractC4175hY0.d(Arrays.asList(new C6006n4()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
