package com.huawei.hms.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.encrypt.PushEncrypter;
import com.huawei.hms.aaid.init.AutoInitHelper;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.task.PushClientBuilder;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.task.BaseVoidTask;
import com.huawei.hms.push.task.IntentCallable;
import com.huawei.hms.push.task.SendUpStreamTask;
import com.huawei.hms.push.task.SubscribeTask;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.EnableNotifyReq;
import com.huawei.hms.support.api.entity.push.PushNaming;
import com.huawei.hms.support.api.entity.push.SubscribeReq;
import com.huawei.hms.support.api.entity.push.UpSendMsgReq;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.NetWorkUtil;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.regex.Pattern;
import p000.C8499Wu1;
import p000.CJ1;
import p000.T81;

/* loaded from: classes.dex */
public class HmsMessaging {
    public static final String DEFAULT_TOKEN_SCOPE = "HCM";

    /* renamed from: c */
    private static final Pattern f19362c = Pattern.compile("[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");

    /* renamed from: a */
    private Context f19363a;

    /* renamed from: b */
    private HuaweiApi<Api.ApiOptions.NoOptions> f19364b;

    private HmsMessaging(Context context) {
        Preconditions.checkNotNull(context);
        this.f19363a = context;
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f19364b = new HuaweiApi<>((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new PushClientBuilder());
        } else {
            this.f19364b = new HuaweiApi<>(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new PushClientBuilder());
        }
        this.f19364b.setKitSdkVersion(61200300);
    }

    /* renamed from: a */
    private Task m12404a(String str, String str2) throws ApiException {
        String strReportEntry = PushBiUtil.reportEntry(this.f19363a, PushNaming.SUBSCRIBE);
        if (str == null || !f19362c.matcher(str).matches()) {
            PushBiUtil.reportExit(this.f19363a, PushNaming.SUBSCRIBE, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            HMSLog.m12620e("HmsMessaging", "Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
            throw new IllegalArgumentException("Invalid topic: topic should match the format:[\\u4e00-\\u9fa5\\w-_.~%]{1,900}");
        }
        if (ProxyCenter.getProxy() != null) {
            HMSLog.m12622i("HmsMessaging", "use proxy subscribe.");
            return TextUtils.equals(str2, "Sub") ? ProxyCenter.getProxy().subscribe(this.f19363a, str, strReportEntry) : ProxyCenter.getProxy().unsubscribe(this.f19363a, str, strReportEntry);
        }
        try {
            ErrorEnum errorEnumM12540a = C2239v.m12540a(this.f19363a);
            if (errorEnumM12540a != ErrorEnum.SUCCESS) {
                throw errorEnumM12540a.toApiException();
            }
            if (NetWorkUtil.getNetworkType(this.f19363a) == 0) {
                HMSLog.m12620e("HmsMessaging", "no network");
                throw ErrorEnum.ERROR_NO_NETWORK.toApiException();
            }
            SubscribeReq subscribeReq = new SubscribeReq(this.f19363a, str2, str);
            subscribeReq.setToken(BaseUtils.getLocalToken(this.f19363a, null));
            return AbstractC2218d.m12433b() ? this.f19364b.doWrite(new BaseVoidTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), strReportEntry)) : this.f19364b.doWrite(new SubscribeTask(PushNaming.SUBSCRIBE, JsonUtil.createJsonString(subscribeReq), strReportEntry));
        } catch (ApiException e) {
            T81 t81 = new T81();
            t81.m7576a(e);
            PushBiUtil.reportExit(this.f19363a, PushNaming.SUBSCRIBE, strReportEntry, e.getStatusCode());
            return t81.f11181a;
        } catch (Exception unused) {
            C8499Wu1 c8499Wu1 = new C8499Wu1();
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            ApiException apiException = errorEnum.toApiException();
            synchronized (c8499Wu1.f13448a) {
                try {
                    if (!c8499Wu1.f13449b) {
                        c8499Wu1.f13449b = true;
                        c8499Wu1.f13451d = apiException;
                        c8499Wu1.f13448a.notifyAll();
                        c8499Wu1.m8879i();
                    }
                    PushBiUtil.reportExit(this.f19363a, PushNaming.SUBSCRIBE, strReportEntry, errorEnum);
                    return c8499Wu1;
                } finally {
                }
            }
        }
    }

    public static synchronized HmsMessaging getInstance(Context context) {
        return new HmsMessaging(context);
    }

    public boolean isAutoInitEnabled() {
        return AutoInitHelper.isAutoInitEnabled(this.f19363a);
    }

    public void send(RemoteMessage remoteMessage) {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.m12620e("HmsMessaging", "Operation(send) unsupported");
            throw new UnsupportedOperationException("Operation(send) unsupported");
        }
        HMSLog.m12622i("HmsMessaging", "send upstream message");
        m12406a(remoteMessage);
    }

    public void setAutoInitEnabled(boolean z) {
        AutoInitHelper.setAutoInitEnabled(this.f19363a, z);
    }

    public Task subscribe(String str) {
        HMSLog.m12622i("HmsMessaging", "invoke subscribe");
        return m12404a(str, "Sub");
    }

    public Task turnOffPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.m12622i("HmsMessaging", "turn off for proxy");
            return ProxyCenter.getProxy().turnOff(this.f19363a, null);
        }
        HMSLog.m12622i("HmsMessaging", "invoke turnOffPush");
        return m12405a(false);
    }

    public Task turnOnPush() {
        if (ProxyCenter.getProxy() != null) {
            HMSLog.m12622i("HmsMessaging", "turn on for proxy");
            return ProxyCenter.getProxy().turnOn(this.f19363a, null);
        }
        HMSLog.m12622i("HmsMessaging", "invoke turnOnPush");
        return m12405a(true);
    }

    public Task unsubscribe(String str) {
        HMSLog.m12622i("HmsMessaging", "invoke unsubscribe");
        return m12404a(str, "UnSub");
    }

    /* renamed from: a */
    private void m12406a(RemoteMessage remoteMessage) {
        String strReportEntry = PushBiUtil.reportEntry(this.f19363a, PushNaming.UPSEND_MSG);
        ErrorEnum errorEnumM12540a = C2239v.m12540a(this.f19363a);
        if (errorEnumM12540a == ErrorEnum.SUCCESS) {
            if (!TextUtils.isEmpty(remoteMessage.getTo())) {
                if (!TextUtils.isEmpty(remoteMessage.getMessageId())) {
                    if (!TextUtils.isEmpty(remoteMessage.getData())) {
                        UpSendMsgReq upSendMsgReq = new UpSendMsgReq();
                        upSendMsgReq.setPackageName(this.f19363a.getPackageName());
                        upSendMsgReq.setMessageId(remoteMessage.getMessageId());
                        upSendMsgReq.setTo(remoteMessage.getTo());
                        upSendMsgReq.setData(remoteMessage.getData());
                        upSendMsgReq.setMessageType(remoteMessage.getMessageType());
                        upSendMsgReq.setTtl(remoteMessage.getTtl());
                        upSendMsgReq.setCollapseKey(remoteMessage.getCollapseKey());
                        upSendMsgReq.setSendMode(remoteMessage.getSendMode());
                        upSendMsgReq.setReceiptMode(remoteMessage.getReceiptMode());
                        if (AbstractC2218d.m12433b()) {
                            this.f19364b.doWrite(new BaseVoidTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), strReportEntry));
                            return;
                        } else {
                            m12407a(upSendMsgReq, strReportEntry);
                            return;
                        }
                    }
                    HMSLog.m12620e("HmsMessaging", "Mandatory parameter 'data' missing");
                    PushBiUtil.reportExit(this.f19363a, PushNaming.UPSEND_MSG, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
                    throw new IllegalArgumentException("Mandatory parameter 'data' missing");
                }
                HMSLog.m12620e("HmsMessaging", "Mandatory parameter 'message_id' missing");
                PushBiUtil.reportExit(this.f19363a, PushNaming.UPSEND_MSG, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
                throw new IllegalArgumentException("Mandatory parameter 'message_id' missing");
            }
            HMSLog.m12620e("HmsMessaging", "Mandatory parameter 'to' missing");
            PushBiUtil.reportExit(this.f19363a, PushNaming.UPSEND_MSG, strReportEntry, ErrorEnum.ERROR_ARGUMENTS_INVALID);
            throw new IllegalArgumentException("Mandatory parameter 'to' missing");
        }
        HMSLog.m12620e("HmsMessaging", "Message sent failed:" + errorEnumM12540a.getExternalCode() + ':' + errorEnumM12540a.getMessage());
        PushBiUtil.reportExit(this.f19363a, PushNaming.UPSEND_MSG, strReportEntry, errorEnumM12540a);
        throw new UnsupportedOperationException(errorEnumM12540a.getMessage());
    }

    /* renamed from: a */
    private Task m12405a(boolean z) {
        String strReportEntry = PushBiUtil.reportEntry(this.f19363a, PushNaming.SET_NOTIFY_FLAG);
        if (AbstractC2218d.m12436d(this.f19363a) && !AbstractC2218d.m12433b()) {
            if (HwBuildEx.VERSION.EMUI_SDK_INT < 12) {
                HMSLog.m12620e("HmsMessaging", "operation not available on Huawei device with EMUI lower than 5.1");
                C8499Wu1 c8499Wu1 = new C8499Wu1();
                ErrorEnum errorEnum = ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED;
                ApiException apiException = errorEnum.toApiException();
                synchronized (c8499Wu1.f13448a) {
                    try {
                        if (!c8499Wu1.f13449b) {
                            c8499Wu1.f13449b = true;
                            c8499Wu1.f13451d = apiException;
                            c8499Wu1.f13448a.notifyAll();
                            c8499Wu1.m8879i();
                        }
                    } finally {
                    }
                }
                PushBiUtil.reportExit(this.f19363a, PushNaming.SET_NOTIFY_FLAG, strReportEntry, errorEnum);
                return c8499Wu1;
            }
            if (AbstractC2218d.m12432b(this.f19363a) < 90101310) {
                HMSLog.m12622i("HmsMessaging", "turn on/off with broadcast v1");
                Intent intentPutExtra = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG").putExtra("enalbeFlag", PushEncrypter.encrypterOld(this.f19363a, this.f19363a.getPackageName() + "#" + z));
                intentPutExtra.setPackage(ConstantDeviceInfo.APP_PLATFORM);
                return CJ1.m1144d(new IntentCallable(this.f19363a, intentPutExtra, strReportEntry));
            }
            if (AbstractC2218d.m12432b(this.f19363a) < 110118300) {
                HMSLog.m12622i("HmsMessaging", "turn on/off with broadcast v2");
                new PushPreferences(this.f19363a, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
                Uri uri = Uri.parse("content://" + this.f19363a.getPackageName() + ".huawei.push.provider/push_notify_flag.xml");
                Intent intent = new Intent("com.huawei.android.push.intent.SDK_COMMAND");
                intent.putExtra("type", "enalbeFlag");
                intent.putExtra("pkgName", this.f19363a.getPackageName());
                intent.putExtra("url", uri);
                intent.setPackage(ConstantDeviceInfo.APP_PLATFORM);
                return CJ1.m1144d(new IntentCallable(this.f19363a, intent, strReportEntry));
            }
            HMSLog.m12622i("HmsMessaging", "turn on/off with broadcast v3");
            if (TextUtils.isEmpty(BaseUtils.getLocalToken(this.f19363a, null))) {
                T81 t81 = new T81();
                t81.m7576a(ErrorEnum.ERROR_NO_TOKEN.toApiException());
                return t81.f11181a;
            }
            new PushPreferences(this.f19363a, "push_notify_flag").saveBoolean("notify_msg_enable", !z);
            Intent intent2 = new Intent("com.huawei.intent.action.SELF_SHOW_FLAG");
            intent2.putExtra("enalbeFlag", z);
            intent2.putExtra(RemoteMessageConst.DEVICE_TOKEN, BaseUtils.getLocalToken(this.f19363a, null));
            intent2.putExtra("pkgName", this.f19363a.getPackageName());
            intent2.putExtra("uid", this.f19363a.getApplicationInfo().uid);
            intent2.setPackage(ConstantDeviceInfo.APP_PLATFORM);
            return CJ1.m1144d(new IntentCallable(this.f19363a, intent2, strReportEntry));
        }
        HMSLog.m12622i("HmsMessaging", "turn on/off with AIDL");
        EnableNotifyReq enableNotifyReq = new EnableNotifyReq();
        enableNotifyReq.setPackageName(this.f19363a.getPackageName());
        enableNotifyReq.setEnable(z);
        return this.f19364b.doWrite(new BaseVoidTask(PushNaming.SET_NOTIFY_FLAG, JsonUtil.createJsonString(enableNotifyReq), strReportEntry));
    }

    /* renamed from: a */
    private void m12407a(UpSendMsgReq upSendMsgReq, String str) {
        upSendMsgReq.setToken(BaseUtils.getLocalToken(this.f19363a, null));
        try {
            this.f19364b.doWrite(new SendUpStreamTask(PushNaming.UPSEND_MSG, JsonUtil.createJsonString(upSendMsgReq), str, upSendMsgReq.getPackageName(), upSendMsgReq.getMessageId()));
        } catch (Exception e) {
            if (e.getCause() instanceof ApiException) {
                PushBiUtil.reportExit(this.f19363a, PushNaming.UPSEND_MSG, str, ((ApiException) e.getCause()).getStatusCode());
            } else {
                PushBiUtil.reportExit(this.f19363a, PushNaming.UPSEND_MSG, str, ErrorEnum.ERROR_INTERNAL_ERROR);
            }
        }
    }
}
