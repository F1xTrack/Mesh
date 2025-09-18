package com.vk.push.common;

import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\bJ#\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\n\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000b\u0010\bJ#\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/vk/push/common/Logger;", "", "", "message", "", "throwable", "LTf1;", "verbose", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "debug", "info", "warn", "error", "tag", "createLogger", "(Ljava/lang/String;)Lcom/vk/push/common/Logger;", "any", "(Ljava/lang/Object;)Lcom/vk/push/common/Logger;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface Logger {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static Logger createLogger(Logger logger, Object obj) {
            O90.f(obj, "any");
            return logger.createLogger(obj.getClass().getSimpleName());
        }

        public static /* synthetic */ void debug$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.debug(str, th);
        }

        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.error(str, th);
        }

        public static /* synthetic */ void info$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.info(str, th);
        }

        public static /* synthetic */ void verbose$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.verbose(str, th);
        }

        public static /* synthetic */ void warn$default(Logger logger, String str, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
            }
            if ((i & 2) != 0) {
                th = null;
            }
            logger.warn(str, th);
        }
    }

    Logger createLogger(Object any);

    Logger createLogger(String tag);

    void debug(String message, Throwable throwable);

    void error(String message, Throwable throwable);

    void info(String message, Throwable throwable);

    void verbose(String message, Throwable throwable);

    void warn(String message, Throwable throwable);
}
