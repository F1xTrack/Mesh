package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p000.AbstractC7293zu;

/* renamed from: io.appmetrica.analytics.impl.be */
/* loaded from: classes2.dex */
public final class C5023be {

    /* renamed from: a */
    public final C4586J9 f31317a;

    public C5023be(C4586J9 c4586j9) {
        this.f31317a = c4586j9;
    }

    /* renamed from: a */
    public final C4671Mm m20190a(PluginErrorDetails pluginErrorDetails) {
        ArrayList arrayList;
        String exceptionClass = pluginErrorDetails.getExceptionClass();
        String message = pluginErrorDetails.getMessage();
        List<StackTraceItem> stacktrace = pluginErrorDetails.getStacktrace();
        String platform = pluginErrorDetails.getPlatform();
        String virtualMachineVersion = pluginErrorDetails.getVirtualMachineVersion();
        Map<String, String> pluginEnvironment = pluginErrorDetails.getPluginEnvironment();
        String str = (String) this.f31317a.f30357a.m19817a();
        Boolean bool = (Boolean) this.f31317a.f30358b.m19817a();
        if (stacktrace != null) {
            arrayList = new ArrayList(AbstractC7293zu.m26586k(stacktrace));
            for (StackTraceItem stackTraceItem : stacktrace) {
                arrayList.add(new C4477Ek(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), null));
            }
        } else {
            arrayList = null;
        }
        return new C4671Mm(new C4429Cm(exceptionClass, message, arrayList, null, null), null, null, platform, virtualMachineVersion, pluginEnvironment, str, bool);
    }
}
