package com.facebook.react.bridge;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractC0852NX;
import p000.AbstractC3929dS;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes.dex */
public class ReactSoftExceptionLogger {
    private static final List<ReactSoftExceptionListener> sListeners = new CopyOnWriteArrayList();

    public interface ReactSoftExceptionListener {
        void logSoftException(String str, Throwable th);
    }

    @InterfaceC0965PK
    public static void addListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        List<ReactSoftExceptionListener> list = sListeners;
        if (list.contains(reactSoftExceptionListener)) {
            return;
        }
        list.add(reactSoftExceptionListener);
    }

    @InterfaceC0965PK
    public static void clearListeners() {
        sListeners.clear();
    }

    @InterfaceC0965PK
    private static void logNoThrowSoftExceptionWithMessage(String str, String str2) {
        logSoftException(str, new ReactNoCrashSoftException(str2));
    }

    @InterfaceC0965PK
    public static void logSoftException(String str, Throwable th) {
        List<ReactSoftExceptionListener> list = sListeners;
        if (list.size() <= 0) {
            AbstractC3929dS.m17675h(str);
            return;
        }
        Iterator<ReactSoftExceptionListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().logSoftException(str, th);
        }
    }

    @InterfaceC0965PK
    public static void logSoftExceptionVerbose(String str, Throwable th) {
        StringBuilder sbM5762k = AbstractC0852NX.m5762k(str, HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sbM5762k.append(th.getClass().getSimpleName());
        sbM5762k.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sbM5762k.append(th.getMessage());
        logSoftException(sbM5762k.toString(), th);
    }

    @InterfaceC0965PK
    public static void removeListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        sListeners.remove(reactSoftExceptionListener);
    }
}
