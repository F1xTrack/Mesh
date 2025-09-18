package com.huawei.hms.support.api.push.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.huawei.hms.push.C2217c;
import com.huawei.hms.push.C2223i;
import com.huawei.hms.push.C2234t;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.Objects;

/* loaded from: classes2.dex */
public class HmsMsgService extends Service {

    /* renamed from: com.huawei.hms.support.api.push.service.HmsMsgService$a */
    public static class HandlerC2261a extends Handler {

        /* renamed from: a */
        private Context f19533a;

        public HandlerC2261a(Context context) {
            this.f19533a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            if (Objects.equals(this.f19533a.getApplicationContext().getPackageManager().getNameForUid(message.sendingUid), HMSPackageManager.getInstance(this.f19533a).getHMSPackageName()) && data != null) {
                PackageManagerHelper.PackageStates hMSPackageStates = HMSPackageManager.getInstance(this.f19533a).getHMSPackageStates();
                PackageManagerHelper.PackageStates packageStates = PackageManagerHelper.PackageStates.ENABLED;
                if (hMSPackageStates == packageStates) {
                    if (HMSPackageManager.getInstance(this.f19533a).getHMSPackageStates() != packageStates) {
                        HMSLog.m12622i("HmsMsgService", "service not start by hms");
                    } else {
                        HMSLog.m12622i("HmsMsgService", "chose push type");
                        if (Objects.equals(C2217c.m12427b(data, "push_action"), "com.huawei.push.msg.NOTIFY_MSG")) {
                            if (ResourceLoaderUtil.getmContext() == null) {
                                ResourceLoaderUtil.setmContext(this.f19533a.getApplicationContext());
                            }
                            HMSLog.m12622i("HmsMsgService", "invokeSelfShow");
                            HmsMsgService.m12596c(this.f19533a, data);
                        } else if (Objects.equals(C2217c.m12427b(data, "push_action"), "com.huawei.push.msg.PASSBY_MSG")) {
                            HMSLog.m12622i("HmsMsgService", "sendBroadcastToHms");
                            HmsMsgService.m12597d(this.f19533a, data);
                        }
                    }
                }
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m12596c(Context context, Bundle bundle) {
        if (!C2223i.m12451a(context)) {
            HMSLog.m12622i("HmsMsgService", context.getPackageName() + " disable display notification.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.huawei.push.msg.NOTIFY_MSG");
        intent.putExtra("selfshow_info", C2217c.m12426a(bundle, "selfshow_info"));
        intent.putExtra("selfshow_token", C2217c.m12426a(bundle, "selfshow_token"));
        intent.setPackage(C2217c.m12428c(bundle, "push_package"));
        C2234t.m12522a(context, intent);
        HMSLog.m12622i("HmsMsgService", "invokeSelfShow done");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static void m12597d(Context context, Bundle bundle) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.android.push.intent.RECEIVE");
            intent.putExtra("msg_data", C2217c.m12426a(bundle, "msg_data"));
            intent.putExtra(RemoteMessageConst.DEVICE_TOKEN, C2217c.m12426a(bundle, RemoteMessageConst.DEVICE_TOKEN));
            intent.putExtra("msgIdStr", C2217c.m12428c(bundle, "msgIdStr"));
            intent.setFlags(32);
            intent.setPackage(C2217c.m12428c(bundle, "push_package"));
            context.sendBroadcast(intent, context.getPackageName() + ".permission.PROCESS_PUSH_MSG");
            HMSLog.m12622i("HmsMsgService", "send broadcast passby done");
        } catch (SecurityException unused) {
            HMSLog.m12622i("HmsMsgService", "send broadcast SecurityException");
        } catch (Exception unused2) {
            HMSLog.m12622i("HmsMsgService", "send broadcast Exception");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        HMSLog.m12622i("HmsMsgService", "onBind");
        return new Messenger(new HandlerC2261a(this)).getBinder();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        HMSLog.m12622i("HmsMsgService", "Enter onStartCommand.");
        return 2;
    }
}
