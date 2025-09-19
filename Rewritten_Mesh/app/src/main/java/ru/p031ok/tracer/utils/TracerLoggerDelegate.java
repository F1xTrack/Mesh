package ru.p031ok.tracer.utils;

import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m22267d2 = {"Lru/ok/tracer/utils/TracerLoggerDelegate;", "", "", "priority", "", "msg", "", "tr", "LTf1;", "println", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "getMinLogPriority", "()I", "minLogPriority", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface TracerLoggerDelegate {

    @Metadata(m22268k = 3, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class DefaultImpls {
        public static int getMinLogPriority(TracerLoggerDelegate tracerLoggerDelegate) {
            return 3;
        }

        public static /* synthetic */ void println$default(TracerLoggerDelegate tracerLoggerDelegate, int i, String str, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: println");
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            tracerLoggerDelegate.println(i, str, th);
        }
    }

    int getMinLogPriority();

    void println(int priority, String msg, Throwable tr);
}
