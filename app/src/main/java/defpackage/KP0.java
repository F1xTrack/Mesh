package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class KP0 extends NP1 {
    @Override // defpackage.NP1
    public final Method b(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // defpackage.NP1
    public final Constructor c(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // defpackage.NP1
    public final String[] d(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // defpackage.NP1
    public final boolean e(Class cls) {
        return false;
    }
}
