package com.huawei.hms.p015rn.push.services;

import android.content.Intent;
import com.huawei.hms.p015rn.push.utils.RemoteMessageUtils;
import com.huawei.hms.push.RemoteMessage;
import p000.M20;
import p000.Q20;

/* loaded from: classes.dex */
public class MessagingHeadlessService extends Q20 {
    private static final String TASK = "HMSPushHeadlessTask";

    @Override // p000.Q20
    public M20 getTaskConfig(Intent intent) {
        RemoteMessage remoteMessage;
        if (intent.getExtras() == null || (remoteMessage = (RemoteMessage) intent.getParcelableExtra("msg")) == null) {
            return null;
        }
        return new M20(TASK, RemoteMessageUtils.toWritableMap(remoteMessage), 60000L);
    }
}
