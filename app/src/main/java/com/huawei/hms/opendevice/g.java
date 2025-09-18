package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResp;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.aaid.threads.AsyncExec;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import defpackage.T81;

/* loaded from: classes.dex */
public class g extends TaskApiCall<PushClient, TokenResult> {
    private Context a;
    private TokenReq b;

    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.a(g.this.a).b(this.a).equals(this.b)) {
                return;
            }
            HMSLog.i(HmsInstanceId.TAG, "receive a new token, refresh the local token");
            i.a(g.this.a).b(this.a, this.b);
        }
    }

    public g(String str, TokenReq tokenReq, Context context, String str2) {
        super(str, JsonUtil.createJsonString(tokenReq), str2);
        this.a = context;
        this.b = tokenReq;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.b.isMultiSender() ? 50004300 : 30000000;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, T81 t81) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.e(HmsInstanceId.TAG, "TokenTask failed, ErrorCode:" + responseErrorCode.getErrorCode());
            a(responseErrorCode, t81);
        } else {
            TokenResp tokenResp = (TokenResp) JsonUtil.jsonToEntity(str, new TokenResp());
            ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(tokenResp.getRetCode());
            if (errorEnumFromCode != ErrorEnum.SUCCESS) {
                t81.a(errorEnumFromCode.toApiException());
                HMSLog.e(HmsInstanceId.TAG, "TokenTask failed, StatusCode:" + errorEnumFromCode.getExternalCode());
            } else {
                TokenResult tokenResult = new TokenResult();
                tokenResult.setToken(tokenResp.getToken());
                tokenResult.setBelongId(tokenResp.getBelongId());
                tokenResult.setRetCode(ErrorEnum.fromCode(tokenResp.getRetCode()).getExternalCode());
                t81.b(tokenResult);
                String token = tokenResp.getToken();
                if (TextUtils.isEmpty(token)) {
                    HMSLog.i(HmsInstanceId.TAG, "GetTokenTask receive an empty token, please check onNewToken callback method.");
                    h.a(pushClient.getContext(), getUri(), responseErrorCode);
                    return;
                }
                a(token, this.b.getSubjectId());
            }
        }
        h.a(pushClient.getContext(), getUri(), responseErrorCode);
    }

    private void a(ResponseErrorCode responseErrorCode, T81 t81) {
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (errorEnumFromCode != ErrorEnum.ERROR_UNKNOWN) {
            t81.a(errorEnumFromCode.toApiException());
        } else {
            t81.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    private void a(String str, String str2) {
        AsyncExec.submitSeqIO(new a(str2, str));
    }
}
