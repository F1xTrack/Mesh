package com.huawei.hms.push.task;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.utils.BaseUtils;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.push.C2216b;
import com.huawei.hms.push.SubscribeResult;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.push.SubscribeNotificationReq;
import com.huawei.hms.support.api.entity.push.SubscribeNotificationResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import p000.T81;

/* loaded from: classes.dex */
public class SubscribeNotificationTask extends TaskApiCall<PushClient, SubscribeResult> {

    /* renamed from: a */
    private Activity f19475a;

    public SubscribeNotificationTask(Activity activity, String str, SubscribeNotificationReq subscribeNotificationReq, String str2) {
        super(str, JsonUtil.createJsonString(subscribeNotificationReq), str2);
        this.f19475a = activity;
    }

    /* renamed from: a */
    private boolean m12528a(PushClient pushClient, ResponseErrorCode responseErrorCode) {
        Parcelable parcelable = responseErrorCode.getParcelable();
        if (!(parcelable instanceof Intent)) {
            HMSLog.m12620e("SubscribeNotificationTask", "not instance of intent");
            return false;
        }
        Intent intent = (Intent) parcelable;
        intent.putExtra("app_token", BaseUtils.getLocalToken(pushClient.getContext(), null));
        this.f19475a.startActivityForResult(intent, 1001);
        return true;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 6;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, T81 t81) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.m12620e("SubscribeNotificationTask", "Notification subscribe failed, error code: " + responseErrorCode.getErrorCode());
            m12527a(responseErrorCode, t81);
        } else {
            SubscribeNotificationResp subscribeNotificationResp = (SubscribeNotificationResp) JsonUtil.jsonToEntity(str, new SubscribeNotificationResp());
            ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(subscribeNotificationResp.getRetCode());
            if (errorEnumFromCode != ErrorEnum.SUCCESS) {
                t81.m7576a(errorEnumFromCode.toApiException());
                HMSLog.m12620e("PushLogSC3004", "Notification Subscription failed, StatusCode:" + errorEnumFromCode.getExternalCode());
            } else if (!responseErrorCode.hasResolution()) {
                SubscribeResult subscribeResult = new SubscribeResult();
                subscribeResult.setSubscribedItems(C2216b.m12425a(subscribeNotificationResp.getSubscribeResults()));
                t81.m7577b(subscribeResult);
            } else if (m12528a(pushClient, responseErrorCode)) {
                t81.m7577b(new SubscribeResult());
            } else {
                t81.m7576a(ErrorEnum.ERROR_PUSH_INTERNAL_ERROR.toApiException());
            }
        }
        PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
    }

    /* renamed from: a */
    private void m12527a(ResponseErrorCode responseErrorCode, T81 t81) {
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (errorEnumFromCode != ErrorEnum.ERROR_UNKNOWN) {
            t81.m7576a(errorEnumFromCode.toApiException());
        } else {
            t81.m7576a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }
}
