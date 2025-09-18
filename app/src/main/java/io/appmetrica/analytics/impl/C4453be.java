package io.appmetrica.analytics.impl;

import defpackage.AbstractC8449zu;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.be, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4453be {
    public final J9 a;

    public C4453be(J9 j9) {
        this.a = j9;
    }

    public final Mm a(PluginErrorDetails pluginErrorDetails) {
        ArrayList arrayList;
        String exceptionClass = pluginErrorDetails.getExceptionClass();
        String message = pluginErrorDetails.getMessage();
        List<StackTraceItem> stacktrace = pluginErrorDetails.getStacktrace();
        String platform = pluginErrorDetails.getPlatform();
        String virtualMachineVersion = pluginErrorDetails.getVirtualMachineVersion();
        Map<String, String> pluginEnvironment = pluginErrorDetails.getPluginEnvironment();
        String str = (String) this.a.a.a();
        Boolean bool = (Boolean) this.a.b.a();
        if (stacktrace != null) {
            arrayList = new ArrayList(AbstractC8449zu.k(stacktrace));
            for (StackTraceItem stackTraceItem : stacktrace) {
                arrayList.add(new Ek(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), null));
            }
        } else {
            arrayList = null;
        }
        return new Mm(new Cm(exceptionClass, message, arrayList, null, null), null, null, platform, virtualMachineVersion, pluginEnvironment, str, bool);
    }
}
