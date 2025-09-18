package com.huawei.hms.push;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.push.utils.PluginUtil;
import com.huawei.hms.support.log.HMSLog;
import java.net.URISyntaxException;

/* renamed from: com.huawei.hms.push.t */
/* loaded from: classes.dex */
public class C2234t {
    /* renamed from: a */
    public static void m12522a(Context context, Intent intent) {
        try {
            if (context == null || intent == null) {
                HMSLog.m12617d("PushSelfShowLog", "enter SelfShowReceiver receiver, context or intent is null");
                return;
            }
            String action = intent.getAction();
            if (!"com.huawei.intent.action.PUSH".equals(action) && !"com.huawei.push.msg.NOTIFY_MSG".equals(action) && !"com.huawei.intent.action.PUSH_DELAY_NOTIFY".equals(action)) {
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("selfshow_info");
            byte[] byteArrayExtra2 = intent.getByteArrayExtra("selfshow_token");
            if (byteArrayExtra != null && byteArrayExtra2 != null && byteArrayExtra.length != 0 && byteArrayExtra2.length != 0) {
                m12525a(context, intent, byteArrayExtra, byteArrayExtra2);
                return;
            }
            HMSLog.m12622i("PushSelfShowLog", "self show info or token is null.");
        } catch (RuntimeException e) {
            HMSLog.m12621e("PushSelfShowLog", "onReceive RuntimeException.", e);
        } catch (Exception unused) {
            HMSLog.m12617d("PushSelfShowLog", "onReceive Exception.");
        }
    }

    /* renamed from: a */
    private static void m12525a(Context context, Intent intent, byte[] bArr, byte[] bArr2) throws URISyntaxException {
        String stringExtra = intent.getStringExtra("selfshow_event_id");
        int intExtra = intent.getIntExtra("selfshow_notify_id", 0);
        HMSLog.m12622i("PushSelfShowLog", "get notifyId:" + intExtra);
        C2229o c2229o = new C2229o(bArr, bArr2);
        if (!c2229o.m12510y()) {
            HMSLog.m12617d("PushSelfShowLog", "parseMessage failed");
            return;
        }
        HMSLog.m12622i("PushSelfShowLog", "onReceive the msg id = " + c2229o.m12502o() + ",and cmd is " + c2229o.m12495h() + ",and the eventId is " + stringExtra);
        if (stringExtra == null) {
            m12523a(context, intent, c2229o);
        } else {
            m12524a(context, intent, stringExtra, c2229o, intExtra);
        }
    }

    /* renamed from: a */
    private static void m12523a(Context context, Intent intent, C2229o c2229o) {
        HMSLog.m12622i("PushSelfShowLog", "receive a selfshow message, the cmd type is " + c2229o.m12495h());
        if (C2235u.m12530a(c2229o.m12495h())) {
            new C2230p(context, c2229o).start();
        }
    }

    /* renamed from: a */
    private static void m12524a(Context context, Intent intent, String str, C2229o c2229o, int i) throws URISyntaxException {
        HMSLog.m12617d("PushSelfShowLog", "receive a selfshow user handle message eventId = " + str);
        if ("1".equals(str)) {
            new C2235u(context, c2229o).m12532c();
            PluginUtil.onNotificationClicked(context, c2229o.m12502o(), c2229o.m12489b());
        } else if ("2".equals(str)) {
            C2226l.m12457a(context, c2229o.m12502o(), c2229o.m12489b(), "2");
        } else {
            HMSLog.m12617d("PushSelfShowLog", "other event");
        }
    }
}
