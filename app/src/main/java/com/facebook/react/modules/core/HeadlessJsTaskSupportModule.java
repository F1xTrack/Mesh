package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import p000.AbstractC3929dS;
import p000.InterfaceC9101dL0;
import p000.M20;
import p000.N20;
import p000.UN1;

@InterfaceC9101dL0(name = NativeHeadlessJsTaskSupportSpec.NAME)
/* loaded from: classes.dex */
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskFinished(double d) {
        int i = (int) d;
        N20 n20M5523c = N20.m5523c(getReactApplicationContext());
        if (n20M5523c.m5526d(i)) {
            n20M5523c.m5525b(i);
        } else {
            AbstractC3929dS.m17682o(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskRetry(double d, Promise promise) {
        int i = (int) d;
        N20 n20M5523c = N20.m5523c(getReactApplicationContext());
        if (!n20M5523c.m5526d(i)) {
            AbstractC3929dS.m17682o(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i));
            promise.resolve(Boolean.FALSE);
            return;
        }
        synchronized (n20M5523c) {
            M20 m20 = (M20) n20M5523c.f7473e.get(Integer.valueOf(i));
            UN1.m7998b(m20 != null, "Tried to retrieve non-existent task config with id " + i + ".");
            m20.f6976e.getClass();
        }
        promise.resolve(Boolean.FALSE);
    }
}
