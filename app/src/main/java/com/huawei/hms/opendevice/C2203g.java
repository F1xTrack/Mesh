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
import p000.T81;

/* renamed from: com.huawei.hms.opendevice.g */
/* loaded from: classes.dex */
public class C2203g extends TaskApiCall<PushClient, TokenResult> {

    /* renamed from: a */
    private Context f19333a;

    /* renamed from: b */
    private TokenReq f19334b;

    /* renamed from: com.huawei.hms.opendevice.g$a */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f19335a;

        /* renamed from: b */
        final /* synthetic */ String f19336b;

        public a(String str, String str2) {
            this.f19335a = str;
            this.f19336b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2205i.m12355a(C2203g.this.f19333a).m12359b(this.f19335a).equals(this.f19336b)) {
                return;
            }
            HMSLog.m12622i(HmsInstanceId.TAG, "receive a new token, refresh the local token");
            C2205i.m12355a(C2203g.this.f19333a).m12360b(this.f19335a, this.f19336b);
        }
    }

    public C2203g(String str, TokenReq tokenReq, Context context, String str2) {
        super(str, JsonUtil.createJsonString(tokenReq), str2);
        this.f19333a = context;
        this.f19334b = tokenReq;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.f19334b.isMultiSender() ? 50004300 : 30000000;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, T81 t81) {
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.m12620e(HmsInstanceId.TAG, "TokenTask failed, ErrorCode:" + responseErrorCode.getErrorCode());
            m12348a(responseErrorCode, t81);
        } else {
            TokenResp tokenResp = (TokenResp) JsonUtil.jsonToEntity(str, new TokenResp());
            ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(tokenResp.getRetCode());
            if (errorEnumFromCode != ErrorEnum.SUCCESS) {
                t81.m7576a(errorEnumFromCode.toApiException());
                HMSLog.m12620e(HmsInstanceId.TAG, "TokenTask failed, StatusCode:" + errorEnumFromCode.getExternalCode());
            } else {
                TokenResult tokenResult = new TokenResult();
                tokenResult.setToken(tokenResp.getToken());
                tokenResult.setBelongId(tokenResp.getBelongId());
                tokenResult.setRetCode(ErrorEnum.fromCode(tokenResp.getRetCode()).getExternalCode());
                t81.m7577b(tokenResult);
                String token = tokenResp.getToken();
                if (TextUtils.isEmpty(token)) {
                    HMSLog.m12622i(HmsInstanceId.TAG, "GetTokenTask receive an empty token, please check onNewToken callback method.");
                    C2204h.m12352a(pushClient.getContext(), getUri(), responseErrorCode);
                    return;
                }
                m12349a(token, this.f19334b.getSubjectId());
            }
        }
        C2204h.m12352a(pushClient.getContext(), getUri(), responseErrorCode);
    }

    /* renamed from: a */
    private void m12348a(ResponseErrorCode responseErrorCode, T81 t81) {
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (errorEnumFromCode != ErrorEnum.ERROR_UNKNOWN) {
            t81.m7576a(errorEnumFromCode.toApiException());
        } else {
            t81.m7576a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    /* renamed from: a */
    private void m12349a(String str, String str2) {
        AsyncExec.submitSeqIO(new a(str2, str));
    }
}
