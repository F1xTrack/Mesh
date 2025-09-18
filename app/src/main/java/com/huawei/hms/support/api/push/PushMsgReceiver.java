package com.huawei.hms.support.api.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.push.C2223i;
import com.huawei.hms.push.C2234t;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* loaded from: classes2.dex */
public class PushMsgReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private static void m12586a(Context context, Intent intent) {
        if (intent.hasExtra("selfshow_info")) {
            if (!C2223i.m12451a(context)) {
                HMSLog.m12622i("PushMsgReceiver", context.getPackageName() + " disable display notification.");
                if (!intent.hasExtra("selfshow_event_id")) {
                    return;
                }
            }
            C2234t.m12522a(context, intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        HMSLog.m12622i("PushMsgReceiver", "push receive broadcast message, Intent:" + intent.getAction() + " pkgName:" + context.getPackageName());
        try {
            intent.getStringExtra("TestIntent");
            String action = intent.getAction();
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context.getApplicationContext());
            }
            if ("com.huawei.intent.action.PUSH_DELAY_NOTIFY".equals(action) || ("com.huawei.intent.action.PUSH".equals(action) && HwBuildEx.VERSION.EMUI_SDK_INT < 10)) {
                m12586a(context, intent);
            } else {
                HMSLog.m12622i("PushMsgReceiver", "message can't be recognised.");
            }
        } catch (Exception unused) {
            HMSLog.m12620e("PushMsgReceiver", "intent has some error");
        }
    }
}
