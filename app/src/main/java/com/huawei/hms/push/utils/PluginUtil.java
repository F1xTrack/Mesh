package com.huawei.hms.push.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.push.C2223i;
import com.huawei.hms.push.C2226l;
import com.huawei.hms.push.C2227m;
import com.huawei.hms.push.C2232r;
import com.huawei.hms.push.C2234t;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.nio.charset.Charset;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PluginUtil {
    private PluginUtil() {
    }

    /* renamed from: a */
    private static void m12536a(Context context, String str, String str2, String str3) {
        HMSLog.m12622i("PluginUtil", "onNotification");
        if (!C2223i.m12451a(context)) {
            HMSLog.m12622i("PluginUtil", context.getPackageName() + " disable display notification.");
            C2226l.m12457a(context, str, null, "103");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.huawei.push.msg.NOTIFY_MSG");
        Charset charset = C2227m.f19425a;
        intent.putExtra("selfshow_info", str3.getBytes(charset));
        intent.putExtra("selfshow_token", str2.getBytes(charset));
        intent.setPackage(context.getPackageName());
        C2234t.m12522a(context, intent);
        HMSLog.m12622i("PluginUtil", "invokeSelfShow done");
    }

    public static void onAppOpened(Context context, String str, String str2, Bundle bundle) {
        C2226l.m12457a(context, str, str2, "appHasOpenedId");
        C2226l.m12456a(context, bundle, "hmsStatistics");
    }

    public static boolean onDataMessage(Context context, String str, String str2, boolean z) {
        HMSLog.m12622i("PluginUtil", "onDataMessage");
        if (TextUtils.isEmpty(str2)) {
            HMSLog.m12622i("PluginUtil", "Empty message received");
            return true;
        }
        if (z) {
            m12535a(context, str);
        }
        Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
        intent.setPackage(context.getPackageName());
        Bundle bundle = new Bundle();
        bundle.putString("message_id", str);
        bundle.putByteArray(RemoteMessageConst.MSGBODY, str2.getBytes(C2227m.f19425a));
        bundle.putString(RemoteMessageConst.MSGTYPE, "received_message");
        return new C2232r().m12519a(context, bundle, intent);
    }

    public static boolean onDeletedMessages(Context context) {
        HMSLog.m12622i("PluginUtil", "onDeletedMessages");
        if (context == null) {
            return false;
        }
        Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
        intent.setPackage(context.getPackageName());
        Bundle bundle = new Bundle();
        bundle.putString("message_proxy_type", ProxyCenter.getProxy().getProxyType());
        bundle.putString(RemoteMessageConst.MSGTYPE, "server_deleted_message");
        return new C2232r().m12519a(context, bundle, intent);
    }

    public static void onMessage(Context context, String[] strArr) {
        HMSLog.m12622i("PluginUtil", "onMessage");
        if (context == null || strArr == null || strArr.length < 5) {
            return;
        }
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(context.getApplicationContext());
        }
        if (m12538a(context, strArr)) {
            m12536a(context, strArr[0], strArr[3], strArr[4]);
        } else {
            onDataMessage(context, strArr[0], strArr[4], true);
        }
    }

    public static boolean onNewToken(Context context, String str, String str2, ErrorEnum errorEnum) {
        HMSLog.m12622i("PluginUtil", "onNewToken called.");
        Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
        intent.setPackage(context.getPackageName());
        Bundle bundle = new Bundle();
        bundle.putInt("error", errorEnum.getInternalCode());
        bundle.putString(RemoteMessageConst.MSGTYPE, "new_token");
        bundle.putString(RemoteMessageConst.DEVICE_TOKEN, str);
        if (TextUtils.equals(str2, context.getPackageName())) {
            bundle.putString("subjectId", null);
        } else {
            bundle.putString("subjectId", str2);
        }
        bundle.putString("message_proxy_type", ProxyCenter.getProxy().getProxyType());
        return new C2232r().m12519a(context, bundle, intent);
    }

    public static void onNotificationArrived(Context context, String str, String str2) {
        C2226l.m12457a(context, str, str2, "100");
    }

    public static void onNotificationClicked(Context context, String str, String str2) {
        C2226l.m12457a(context, str, str2, "1");
        onAppOpened(context, str, str2, null);
    }

    public static boolean onOldDataMessage(Context context, String str, String str2) {
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(context.getApplicationContext());
        }
        return onDataMessage(context, str, m12534a(str2), true);
    }

    public static void saveNotifySwitch(Context context, boolean z) {
        new PushPreferences(context, "push_notify_flag").saveBoolean("notify_msg_enable", z);
    }

    /* renamed from: a */
    private static String m12534a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("data", str);
            jSONObject2.put(RemoteMessageConst.MessageBody.MSG_CONTENT, jSONObject);
            return jSONObject2.toString();
        } catch (JSONException unused) {
            HMSLog.m12620e("PluginUtil", "rebuild message failed");
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m12537a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            HMSLog.m12623w("PluginUtil", "get running app processes null!");
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(context.getPackageName())) {
                int i = runningAppProcessInfo.importance;
                return (i == 100 || i == 200) ? false : true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m12538a(Context context, String[] strArr) {
        if (TextUtils.equals(strArr[1], "0")) {
            return m12537a(context) || TextUtils.equals(strArr[2], "1");
        }
        return false;
    }

    /* renamed from: a */
    private static void m12535a(Context context, String str) {
        C2226l.m12457a(context, str, null, "102");
    }
}
