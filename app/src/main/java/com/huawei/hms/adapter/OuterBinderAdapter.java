package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public class OuterBinderAdapter extends BinderAdapter {

    /* renamed from: j */
    private static final Object f18755j = new Object();

    /* renamed from: k */
    private static BinderAdapter f18756k;

    /* renamed from: l */
    private static String f18757l;

    /* renamed from: m */
    private static String f18758m;

    private OuterBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter binderAdapter;
        HMSLog.m12622i("OuterBinderAdapter", "OuterBinderAdapter getInstance.");
        synchronized (f18755j) {
            try {
                if (f18756k == null) {
                    f18757l = str;
                    f18758m = str2;
                    f18756k = new OuterBinderAdapter(context, str, str2);
                } else if (!Objects.equal(f18757l, str) || !Objects.equal(f18758m, str2)) {
                    HMSLog.m12622i("OuterBinderAdapter", "OuterBinderAdapter getInstance refresh adapter");
                    f18757l = str;
                    f18758m = str2;
                    f18756k.unBind();
                    f18756k = new OuterBinderAdapter(context, str, str2);
                }
                binderAdapter = f18756k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return binderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getConnTimeOut() {
        return 1001;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getMsgDelayDisconnect() {
        return 1002;
    }
}
