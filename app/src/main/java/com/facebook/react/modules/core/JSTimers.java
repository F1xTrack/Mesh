package com.facebook.react.modules.core;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes.dex */
public interface JSTimers extends JavaScriptModule {
    void callIdleCallbacks(double d);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
