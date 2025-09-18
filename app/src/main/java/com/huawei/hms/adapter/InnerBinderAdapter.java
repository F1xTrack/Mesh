package com.huawei.hms.adapter;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public class InnerBinderAdapter extends BinderAdapter {

    /* renamed from: j */
    private static final Object f18753j = new Object();

    /* renamed from: k */
    private static BinderAdapter f18754k;

    private InnerBinderAdapter(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public static BinderAdapter getInstance(Context context, String str, String str2) {
        BinderAdapter binderAdapter;
        HMSLog.m12622i("InnerBinderAdapter", "InnerBinderAdapter getInstance.");
        synchronized (f18753j) {
            try {
                if (f18754k == null) {
                    f18754k = new InnerBinderAdapter(context, str, str2);
                }
                binderAdapter = f18754k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return binderAdapter;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getConnTimeOut() {
        return 2001;
    }

    @Override // com.huawei.hms.adapter.BinderAdapter
    public int getMsgDelayDisconnect() {
        return 2002;
    }
}
