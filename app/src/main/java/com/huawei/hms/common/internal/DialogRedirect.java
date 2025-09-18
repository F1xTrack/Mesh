package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes.dex */
public abstract class DialogRedirect implements DialogInterface.OnClickListener {
    public static DialogRedirect getInstance(Activity activity, Intent intent, int i) {
        return new DialogRedirectImpl(intent, activity, i);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                redirect();
                if (dialogInterface == null) {
                }
            } catch (Throwable unused) {
                HMSLog.m12620e("DialogRedirect", "Failed to start resolution intent");
            }
        } finally {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    public abstract void redirect();
}
