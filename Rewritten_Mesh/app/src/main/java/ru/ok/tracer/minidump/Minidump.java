package ru.ok.tracer.minidump;

/* loaded from: classes2.dex */
public final class Minidump {
    private static final Minidump INSTANCE = new Minidump();
    private boolean installedMinidumpWriter;
    private final Object lock = new Object();

    private Minidump() {
        System.loadLibrary("minidump");
    }

    public static Minidump getInstance() {
        return INSTANCE;
    }

    private native void installMinidumpWriterImpl(String str);

    private native void uninstallMinidumpWriterImpl();

    public void installMinidumpWriter(String str) {
        synchronized (this.lock) {
            try {
                if (this.installedMinidumpWriter) {
                    uninstallMinidumpWriterImpl();
                }
                installMinidumpWriterImpl(str);
                this.installedMinidumpWriter = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void uninstallMinidumpWriter() {
        synchronized (this.lock) {
            try {
                if (this.installedMinidumpWriter) {
                    uninstallMinidumpWriterImpl();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
