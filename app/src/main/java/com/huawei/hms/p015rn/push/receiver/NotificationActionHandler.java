package com.huawei.hms.p015rn.push.receiver;

import android.content.Context;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.huawei.hms.p015rn.push.local.HmsLocalNotificationActionPublisher;
import p000.IJ0;
import p000.LK0;
import p000.QK0;
import ru.mes.dnevnik.MainApplication;

/* loaded from: classes.dex */
public class NotificationActionHandler implements Runnable {
    Bundle bundle;
    Context context;

    public NotificationActionHandler(Context context, Bundle bundle) {
        this.context = context;
        this.bundle = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        final QK0 qk0M6302a = ((MainApplication) ((IJ0) this.context.getApplicationContext())).f41951a.m6302a();
        ReactContext reactContextM6636f = qk0M6302a.m6636f();
        if (reactContextM6636f != null) {
            new HmsLocalNotificationActionPublisher(reactContextM6636f).notifyNotificationAction(this.bundle);
            return;
        }
        qk0M6302a.m6632a(new LK0() { // from class: com.huawei.hms.rn.push.receiver.NotificationActionHandler.1
            @Override // p000.LK0
            public void onReactContextInitialized(ReactContext reactContext) {
                new HmsLocalNotificationActionPublisher(reactContext).notifyNotificationAction(NotificationActionHandler.this.bundle);
                qk0M6302a.m6644o(this);
            }
        });
        if (qk0M6302a.f9583s) {
            return;
        }
        qk0M6302a.m6635d();
    }
}
