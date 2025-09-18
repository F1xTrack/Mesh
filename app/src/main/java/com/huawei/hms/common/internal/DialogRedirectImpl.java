package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public class DialogRedirectImpl extends DialogRedirect {

    /* renamed from: a */
    private final Activity f18952a;

    /* renamed from: b */
    private final int f18953b;

    /* renamed from: c */
    private final Intent f18954c;

    public DialogRedirectImpl(Intent intent, Activity activity, int i) {
        this.f18954c = intent;
        this.f18952a = activity;
        this.f18953b = i;
    }

    @Override // com.huawei.hms.common.internal.DialogRedirect
    public final void redirect() {
        Activity activity;
        Intent intent = this.f18954c;
        if (intent == null || (activity = this.f18952a) == null) {
            return;
        }
        activity.startActivityForResult(intent, this.f18953b);
    }
}
