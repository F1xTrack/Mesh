package io.sentry;

import io.sentry.config.AbstractC6003a;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class ShutdownHookIntegration implements InterfaceC5819Y, Closeable {

    /* renamed from: a */
    public final Runtime f33396a;

    /* renamed from: b */
    public Thread f33397b;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        AbstractC6003a.m21735D(runtime, "Runtime is required");
        this.f33396a = runtime;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f33397b != null) {
            try {
                this.f33396a.removeShutdownHook(this.f33397b);
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e;
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        if (!c5759d1.isEnableShutdownHook()) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.f33397b = new Thread(new RunnableC5794P0(c5759d1, 3));
        try {
            this.f33396a.addShutdownHook(this.f33397b);
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            AbstractC6003a.m21742a("ShutdownHook");
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e;
            }
        }
    }
}
