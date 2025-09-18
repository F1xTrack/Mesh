package com.huawei.hms.rn.push.receiver;

import android.content.Context;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.huawei.hms.rn.push.local.HmsLocalNotificationActionPublisher;
import defpackage.IJ0;
import defpackage.LK0;
import defpackage.QK0;
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
        final QK0 qk0A = ((MainApplication) ((IJ0) this.context.getApplicationContext())).a.a();
        ReactContext reactContextF = qk0A.f();
        if (reactContextF != null) {
            new HmsLocalNotificationActionPublisher(reactContextF).notifyNotificationAction(this.bundle);
            return;
        }
        qk0A.a(new LK0() { // from class: com.huawei.hms.rn.push.receiver.NotificationActionHandler.1
            @Override // defpackage.LK0
            public void onReactContextInitialized(ReactContext reactContext) {
                new HmsLocalNotificationActionPublisher(reactContext).notifyNotificationAction(NotificationActionHandler.this.bundle);
                qk0A.o(this);
            }
        });
        if (qk0A.s) {
            return;
        }
        qk0A.d();
    }
}
