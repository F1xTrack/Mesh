package com.huawei.hms.rn.push.services;

import android.content.Intent;
import com.huawei.hms.push.RemoteMessage;
import com.huawei.hms.rn.push.utils.RemoteMessageUtils;
import defpackage.M20;
import defpackage.Q20;

/* loaded from: classes.dex */
public class MessagingHeadlessService extends Q20 {
    private static final String TASK = "HMSPushHeadlessTask";

    @Override // defpackage.Q20
    public M20 getTaskConfig(Intent intent) {
        RemoteMessage remoteMessage;
        if (intent.getExtras() == null || (remoteMessage = (RemoteMessage) intent.getParcelableExtra("msg")) == null) {
            return null;
        }
        return new M20(TASK, RemoteMessageUtils.toWritableMap(remoteMessage), 60000L);
    }
}
