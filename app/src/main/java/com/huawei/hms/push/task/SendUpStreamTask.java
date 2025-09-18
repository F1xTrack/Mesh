package com.huawei.hms.push.task;

import android.content.Intent;
import android.os.Bundle;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.push.C2232r;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import p000.T81;

/* loaded from: classes.dex */
public class SendUpStreamTask extends TaskApiCall<PushClient, BaseVoidTask> {

    /* renamed from: a */
    private String f19473a;

    /* renamed from: b */
    private String f19474b;

    public SendUpStreamTask(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3);
        this.f19473a = str4;
        this.f19474b = str5;
    }

    /* renamed from: a */
    private void m12526a(PushClient pushClient, ResponseErrorCode responseErrorCode) {
        HMSLog.m12622i("SendUpStreamTask", "receive upstream, msgId :" + this.f19474b + " , packageName = " + this.f19473a + " , errorCode = " + responseErrorCode.getErrorCode());
        Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
        intent.setPackage(this.f19473a);
        Bundle bundle = new Bundle();
        bundle.putString("message_id", this.f19474b);
        bundle.putInt("error", responseErrorCode.getErrorCode());
        if (ErrorEnum.SUCCESS.getInternalCode() == responseErrorCode.getErrorCode()) {
            bundle.putString(RemoteMessageConst.MSGTYPE, "sent_message");
        } else {
            bundle.putString(RemoteMessageConst.MSGTYPE, "send_error");
        }
        if (new C2232r().m12519a(pushClient.getContext(), bundle, intent)) {
            HMSLog.m12622i("SendUpStreamTask", "receive upstream, start service success");
            PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode);
        } else {
            HMSLog.m12623w("SendUpStreamTask", "receive upstream, start service failed");
            PushBiUtil.reportExit(pushClient.getContext(), getUri(), responseErrorCode.getTransactionId(), ErrorEnum.ERROR_BIND_SERVICE_SELF_MAPPING);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40003000;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, T81 t81) {
        if (responseErrorCode.getErrorCode() == 0) {
            HMSLog.m12622i("SendUpStreamTask", "send up stream task,Operate succeed");
            t81.m7577b(null);
        } else {
            HMSLog.m12620e("SendUpStreamTask", "send up stream task,Operate failed with ret=" + responseErrorCode.getErrorCode());
            ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
            if (errorEnumFromCode != ErrorEnum.ERROR_UNKNOWN) {
                t81.m7576a(errorEnumFromCode.toApiException());
            } else {
                t81.m7576a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        m12526a(pushClient, responseErrorCode);
    }
}
