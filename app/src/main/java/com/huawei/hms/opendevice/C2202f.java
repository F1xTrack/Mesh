package com.huawei.hms.opendevice;

import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.DeleteTokenReq;
import com.huawei.hms.aaid.entity.DeleteTokenResp;
import com.huawei.hms.aaid.task.PushClient;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import p000.T81;

/* renamed from: com.huawei.hms.opendevice.f */
/* loaded from: classes.dex */
public class C2202f extends TaskApiCall<PushClient, Void> {

    /* renamed from: a */
    private DeleteTokenReq f19332a;

    public C2202f(String str, DeleteTokenReq deleteTokenReq, String str2) {
        super(str, JsonUtil.createJsonString(deleteTokenReq), str2);
        this.f19332a = deleteTokenReq;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void doExecute(PushClient pushClient, ResponseErrorCode responseErrorCode, String str, T81 t81) {
        if (responseErrorCode.getErrorCode() == 0) {
            ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(((DeleteTokenResp) JsonUtil.jsonToEntity(str, new DeleteTokenResp())).getRetCode());
            if (errorEnumFromCode != ErrorEnum.SUCCESS) {
                t81.m7576a(errorEnumFromCode.toApiException());
                return;
            } else {
                t81.m7577b(null);
                C2204h.m12352a(pushClient.getContext(), getUri(), responseErrorCode);
                return;
            }
        }
        HMSLog.m12620e(HmsInstanceId.TAG, "DeleteTokenTask failed, ErrorCode: " + responseErrorCode.getErrorCode());
        ErrorEnum errorEnumFromCode2 = ErrorEnum.fromCode(responseErrorCode.getErrorCode());
        if (errorEnumFromCode2 != ErrorEnum.ERROR_UNKNOWN) {
            t81.m7576a(errorEnumFromCode2.toApiException());
        } else {
            t81.m7576a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return this.f19332a.isMultiSender() ? 50004300 : 30000000;
    }
}
