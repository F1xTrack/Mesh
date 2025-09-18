package p000;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class B12 {
    /* renamed from: a */
    public static void m464a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m465b(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0) {
        boolean z = false;
        if (!interfaceFutureC7800Jj0.isDone()) {
            throw new IllegalStateException(AbstractC9886jT1.m22040f("Future was expected to be done: %s", interfaceFutureC7800Jj0));
        }
        while (true) {
            try {
                interfaceFutureC7800Jj0.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
