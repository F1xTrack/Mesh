package com.huawei.hms.push.task;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.push.utils.PushBiUtil;
import com.huawei.hms.support.api.entity.push.PushNaming;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class IntentCallable implements Callable<Void> {

    /* renamed from: a */
    private Context f19470a;

    /* renamed from: b */
    private Intent f19471b;

    /* renamed from: c */
    private String f19472c;

    public IntentCallable(Context context, Intent intent, String str) {
        this.f19470a = context;
        this.f19471b = intent;
        this.f19472c = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f19470a.sendBroadcast(this.f19471b);
        PushBiUtil.reportExit(this.f19470a, PushNaming.SET_NOTIFY_FLAG, this.f19472c, ErrorEnum.SUCCESS);
        return null;
    }
}
