package io.legere.pdfiumandroid;

import kotlin.Metadata;
import p000.O90;
import ru.p031ok.tracer.base.ucum.UcumUtils;

@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, m22267d2 = {"Lio/legere/pdfiumandroid/Logger;", "Lio/legere/pdfiumandroid/LoggerInterface;", "<init>", "()V", "", "tag", "message", "LTf1;", UcumUtils.UCUM_DAYS, "(Ljava/lang/String;Ljava/lang/String;)V", "", "t", "e", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "logger", "setLogger", "(Lio/legere/pdfiumandroid/LoggerInterface;)V", "Lio/legere/pdfiumandroid/LoggerInterface;", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class Logger implements LoggerInterface {
    public static final Logger INSTANCE = new Logger();
    private static LoggerInterface logger;

    private Logger() {
    }

    @Override // io.legere.pdfiumandroid.LoggerInterface
    /* renamed from: d */
    public void mo21354d(String tag, String message) {
        O90.m5968f(tag, "tag");
        LoggerInterface loggerInterface = logger;
        if (loggerInterface != null) {
            loggerInterface.mo21354d(tag, message);
        }
    }

    @Override // io.legere.pdfiumandroid.LoggerInterface
    /* renamed from: e */
    public void mo21355e(String tag, Throwable t, String message) {
        O90.m5968f(tag, "tag");
        LoggerInterface loggerInterface = logger;
        if (loggerInterface != null) {
            loggerInterface.mo21355e(tag, t, message);
        }
    }

    public final void setLogger(LoggerInterface logger2) {
        O90.m5968f(logger2, "logger");
        logger = logger2;
    }
}
