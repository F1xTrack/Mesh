package com.huawei.hms.push;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.notification.SubscribedItem;
import com.huawei.hms.push.task.SubscribeNotificationTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeNotificationReq;
import com.huawei.hms.support.log.HMSLog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p000.C8499Wu1;
import p000.CJ1;

/* loaded from: classes.dex */
public class NotificationSubscription {
    public static final int NOTIFICATION_SUBSCRIBE_REQUEST_CODE = 1001;

    /* renamed from: d */
    private static final String f19368d = "NotificationSubscription";

    /* renamed from: a */
    private Activity f19369a;

    /* renamed from: b */
    private Context f19370b;

    /* renamed from: c */
    private HuaweiApi<Api.ApiOptions.NoOptions> f19371c;

    private NotificationSubscription(Activity activity) {
        Preconditions.checkNotNull(activity);
        this.f19370b = activity.getApplicationContext();
        this.f19369a = activity;
        HuaweiApi<Api.ApiOptions.NoOptions> huaweiApi = new HuaweiApi<>(activity, (Api<Api.ApiOptions>) new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH), (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        this.f19371c = huaweiApi;
        huaweiApi.setKitSdkVersion(61200300);
    }

    /* renamed from: a */
    private Task m12411a(Exception exc) {
        C8499Wu1 c8499Wu1 = new C8499Wu1();
        synchronized (c8499Wu1.f13448a) {
            try {
                if (!c8499Wu1.f13449b) {
                    c8499Wu1.f13449b = true;
                    c8499Wu1.f13451d = exc;
                    c8499Wu1.f13448a.notifyAll();
                    c8499Wu1.m8879i();
                }
            } finally {
            }
        }
        return c8499Wu1;
    }

    /* renamed from: b */
    private SubscribeNotificationReq m12413b(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        SubscribeNotificationReq subscribeNotificationReq = new SubscribeNotificationReq();
        subscribeNotificationReq.setEntityIds(jSONArray.toString());
        subscribeNotificationReq.setToken(BaseUtils.getLocalToken(this.f19370b, null));
        return subscribeNotificationReq;
    }

    public static NotificationSubscription getInstance(Activity activity) {
        return new NotificationSubscription(activity);
    }

    public static SubscribeResult getSubscribeResult(Intent intent) {
        String stringExtra;
        if (intent == null) {
            return null;
        }
        try {
            stringExtra = intent.getStringExtra("errorMsg");
        } catch (Throwable unused) {
            HMSLog.m12620e(f19368d, "get subscribe result occurs exception");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            String stringExtra2 = intent.getStringExtra("subscribedItems");
            if (!TextUtils.isEmpty(stringExtra2)) {
                List<SubscribedItem> listM12425a = C2216b.m12425a(stringExtra2);
                SubscribeResult subscribeResult = new SubscribeResult();
                subscribeResult.setSubscribedItems(listM12425a);
                return subscribeResult;
            }
            return null;
        }
        SubscribeResult subscribeResult2 = new SubscribeResult();
        subscribeResult2.setErrorMsg(stringExtra);
        HMSLog.m12620e(f19368d, "get subscribe error msg:" + stringExtra);
        return subscribeResult2;
    }

    public Task requestSubscribeNotification(List<String> list) {
        HMSLog.m12622i(f19368d, "invoke request subscribe notification");
        return m12412a(list);
    }

    /* renamed from: a */
    private Task m12412a(List<String> list) {
        String strReportEntry = PushBiUtil.reportEntry(this.f19370b, PushNaming.SUBSCRIBE_NOTIFICATION);
        if (list != null && !list.isEmpty() && list.size() <= 3) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                if (!((NotificationManager) this.f19370b.getSystemService("notification")).areNotificationsEnabled()) {
                    HMSLog.m12622i(f19368d, "App disabled notification");
                    Context context = this.f19370b;
                    ErrorEnum errorEnum = ErrorEnum.ERROR_NOTIFICATION_DISABLED;
                    PushBiUtil.reportExit(context, PushNaming.SUBSCRIBE_NOTIFICATION, strReportEntry, errorEnum);
                    return m12411a(errorEnum.toApiException());
                }
                try {
                    if (C2239v.m12540a(this.f19370b) != ErrorEnum.SUCCESS) {
                        return m12411a(ErrorEnum.ERROR_NO_TOKEN.toApiException());
                    }
                    if (-1 != this.f19370b.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f19370b.getPackageName()) && C2221g.m12446a(this.f19370b) == -1) {
                        HMSLog.m12620e(f19368d, "no network");
                        return m12411a(ErrorEnum.ERROR_NO_NETWORK.toApiException());
                    }
                    Task taskDoWrite = this.f19371c.doWrite(new SubscribeNotificationTask(this.f19369a, PushNaming.SUBSCRIBE_NOTIFICATION, m12413b(list), strReportEntry));
                    CJ1.m1143c(taskDoWrite);
                    return taskDoWrite;
                } catch (Exception e) {
                    if (e.getCause() instanceof ApiException) {
                        ApiException apiException = (ApiException) e.getCause();
                        PushBiUtil.reportExit(this.f19370b, PushNaming.SUBSCRIBE_NOTIFICATION, strReportEntry, apiException.getStatusCode());
                        return m12411a(apiException);
                    }
                    Context context2 = this.f19370b;
                    ErrorEnum errorEnum2 = ErrorEnum.ERROR_INTERNAL_ERROR;
                    PushBiUtil.reportExit(context2, PushNaming.SUBSCRIBE_NOTIFICATION, strReportEntry, errorEnum2);
                    return m12411a(errorEnum2.toApiException());
                }
            }
            Context context3 = this.f19370b;
            ErrorEnum errorEnum3 = ErrorEnum.ERROR_MAIN_THREAD;
            PushBiUtil.reportExit(context3, PushNaming.SUBSCRIBE_NOTIFICATION, strReportEntry, errorEnum3);
            return m12411a(errorEnum3.toApiException());
        }
        Context context4 = this.f19370b;
        ErrorEnum errorEnum4 = ErrorEnum.ERROR_ARGUMENTS_INVALID;
        PushBiUtil.reportExit(context4, PushNaming.SUBSCRIBE_NOTIFICATION, strReportEntry, errorEnum4);
        HMSLog.m12620e(f19368d, "Invalid entityIds: entityId list should not be empty or more than max size");
        return m12411a(errorEnum4.toApiException());
    }
}
