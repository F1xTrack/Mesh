package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import java.util.concurrent.Callable;

/* renamed from: com.huawei.hms.opendevice.a */
/* loaded from: classes.dex */
public class CallableC2197a implements Callable<AAIDResult> {

    /* renamed from: a */
    private Context f19327a;

    public CallableC2197a(Context context) {
        this.f19327a = context;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AAIDResult call() throws Exception {
        Context context = this.f19327a;
        if (context == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        String strM12334b = C2198b.m12334b(context);
        AAIDResult aAIDResult = new AAIDResult();
        aAIDResult.setId(strM12334b);
        return aAIDResult;
    }
}
