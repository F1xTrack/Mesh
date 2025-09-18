package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class LP0 extends QP1 {
    @Override // defpackage.QP1
    public final Method a(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // defpackage.QP1
    public final Constructor b(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // defpackage.QP1
    public final String[] c(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // defpackage.QP1
    public final boolean d(Class cls) {
        return false;
    }
}
