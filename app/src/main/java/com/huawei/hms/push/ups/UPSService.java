package com.huawei.hms.push.ups;

import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.push.AbstractC2218d;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hms.push.ups.entity.CodeResult;
import com.huawei.hms.push.ups.entity.TokenResult;
import com.huawei.hms.push.ups.entity.UPSRegisterCallBack;
import com.huawei.hms.push.ups.entity.UPSTurnCallBack;
import com.huawei.hms.push.ups.entity.UPSUnRegisterCallBack;
import com.huawei.hms.support.log.HMSLog;
import p000.InterfaceC7984Mx0;

/* loaded from: classes.dex */
public final class UPSService {
    private UPSService() {
    }

    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
        HMSLog.m12622i("UPSService", "invoke registerToken");
        Preconditions.checkNotNull(uPSRegisterCallBack);
        if (!AbstractC2218d.m12433b()) {
            uPSRegisterCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        try {
            uPSRegisterCallBack.onResult(new TokenResult(HmsInstanceId.getInstance(context).getToken(str, null)));
        } catch (ApiException e) {
            uPSRegisterCallBack.onResult(new TokenResult(e.getStatusCode(), e.getMessage()));
        }
    }

    public static void turnOffPush(Context context, final UPSTurnCallBack uPSTurnCallBack) {
        HMSLog.m12622i("UPSService", "invoke turnOffPush");
        Preconditions.checkNotNull(uPSTurnCallBack);
        if (AbstractC2218d.m12433b()) {
            HmsMessaging.getInstance(context).turnOffPush().mo8871a(new InterfaceC7984Mx0() { // from class: com.huawei.hms.push.ups.UPSService.2
                @Override // p000.InterfaceC7984Mx0
                public void onComplete(Task task) {
                    if (task.mo8877g()) {
                        uPSTurnCallBack.onResult(new CodeResult());
                    } else {
                        ApiException apiException = (ApiException) task.mo8874d();
                        uPSTurnCallBack.onResult(new CodeResult(apiException.getStatusCode(), apiException.getMessage()));
                    }
                }
            });
        } else {
            uPSTurnCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
        }
    }

    public static void turnOnPush(Context context, final UPSTurnCallBack uPSTurnCallBack) {
        HMSLog.m12622i("UPSService", "invoke turnOnPush");
        Preconditions.checkNotNull(uPSTurnCallBack);
        if (AbstractC2218d.m12433b()) {
            HmsMessaging.getInstance(context).turnOnPush().mo8871a(new InterfaceC7984Mx0() { // from class: com.huawei.hms.push.ups.UPSService.1
                @Override // p000.InterfaceC7984Mx0
                public void onComplete(Task task) {
                    if (task.mo8877g()) {
                        uPSTurnCallBack.onResult(new CodeResult());
                    } else {
                        ApiException apiException = (ApiException) task.mo8874d();
                        uPSTurnCallBack.onResult(new CodeResult(apiException.getStatusCode(), apiException.getMessage()));
                    }
                }
            });
        } else {
            uPSTurnCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
        }
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
        HMSLog.m12622i("UPSService", "invoke unRegisterToken");
        Preconditions.checkNotNull(uPSUnRegisterCallBack);
        if (!AbstractC2218d.m12433b()) {
            uPSUnRegisterCallBack.onResult(new TokenResult(ErrorEnum.ERROR_OPERATION_NOT_SUPPORTED.getExternalCode()));
            return;
        }
        try {
            HmsInstanceId.getInstance(context).deleteToken(null, null);
            uPSUnRegisterCallBack.onResult(new TokenResult());
        } catch (ApiException e) {
            uPSUnRegisterCallBack.onResult(new TokenResult(e.getStatusCode(), e.getMessage()));
        }
    }
}
