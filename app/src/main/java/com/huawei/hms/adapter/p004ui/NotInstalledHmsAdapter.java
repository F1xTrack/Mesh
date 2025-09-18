package com.huawei.hms.adapter.p004ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.p017ui.NotInstalledHmsDialogHelper;

/* loaded from: classes.dex */
public class NotInstalledHmsAdapter implements IBridgeActivityDelegate {

    /* renamed from: c */
    private static final Object f18773c = new Object();

    /* renamed from: d */
    private static boolean f18774d;

    /* renamed from: a */
    private Activity f18775a;

    /* renamed from: b */
    private Dialog f18776b;

    /* renamed from: com.huawei.hms.adapter.ui.NotInstalledHmsAdapter$a */
    public static class DialogInterfaceOnCancelListenerC2027a implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        private final Activity f18777a;

        public DialogInterfaceOnCancelListenerC2027a(Activity activity) {
            this.f18777a = activity;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            HMSLog.m12622i("NotInstalledHmsAdapter", "<Dialog onCancel>");
            SystemManager.getInstance().notifyUpdateResult(13);
            this.f18777a.finish();
        }
    }

    /* renamed from: com.huawei.hms.adapter.ui.NotInstalledHmsAdapter$b */
    public static class DialogInterfaceOnClickListenerC2028b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        private final Activity f18778a;

        public DialogInterfaceOnClickListenerC2028b(Activity activity) {
            this.f18778a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HMSLog.m12622i("NotInstalledHmsAdapter", "<Dialog onClick>");
            SystemManager.getInstance().notifyUpdateResult(30);
            this.f18778a.finish();
        }
    }

    /* renamed from: a */
    private void m11476a(Activity activity) {
        Dialog dialog = this.f18776b;
        if (dialog != null && dialog.isShowing()) {
            this.f18776b.setOnCancelListener(null);
            this.f18776b.cancel();
        }
        this.f18776b = NotInstalledHmsDialogHelper.getDialogBuilder(activity).setPositiveButton(NotInstalledHmsDialogHelper.getConfirmResId(activity), new DialogInterfaceOnClickListenerC2028b(activity)).setOnCancelListener(new DialogInterfaceOnCancelListenerC2027a(activity)).show();
    }

    public static boolean getShowLock() {
        synchronized (f18773c) {
            try {
                HMSLog.m12622i("NotInstalledHmsAdapter", "<canShowDialog> sIsShowingDialog: " + f18774d);
                if (f18774d) {
                    return false;
                }
                f18774d = true;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        HMSLog.m12622i("NotInstalledHmsAdapter", "<getRequestCode>");
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.m12622i("NotInstalledHmsAdapter", "<onBridgeActivityCreate>");
        if (activity == null || activity.isFinishing()) {
            HMSLog.m12620e("NotInstalledHmsAdapter", "<onBridgeActivityCreate> activity is null or finishing");
        } else {
            this.f18775a = activity;
            m11476a(activity);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m12622i("NotInstalledHmsAdapter", "<onBridgeActivityDestroy>");
        synchronized (f18773c) {
            f18774d = false;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        HMSLog.m12622i("NotInstalledHmsAdapter", "<onBridgeActivityResult>");
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m12622i("NotInstalledHmsAdapter", "<onBridgeConfigurationChanged>");
        Activity activity = this.f18775a;
        if (activity == null || activity.isFinishing()) {
            HMSLog.m12620e("NotInstalledHmsAdapter", "<onBridgeConfigurationChanged> mActivity is null or finishing");
        } else {
            m11476a(this.f18775a);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m12622i("NotInstalledHmsAdapter", "<onKeyUp>");
    }
}
