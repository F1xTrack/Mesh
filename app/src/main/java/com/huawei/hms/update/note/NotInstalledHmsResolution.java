package com.huawei.hms.update.note;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.availableupdate.C2043b;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.p017ui.NotInstalledHmsDialogHelper;

/* loaded from: classes2.dex */
public class NotInstalledHmsResolution implements IBridgeActivityDelegate {

    /* renamed from: a */
    private Dialog f19583a;

    /* renamed from: b */
    private Activity f19584b;

    /* renamed from: com.huawei.hms.update.note.NotInstalledHmsResolution$a */
    public static class DialogInterfaceOnClickListenerC2275a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        private final Activity f19585a;

        public DialogInterfaceOnClickListenerC2275a(Activity activity) {
            this.f19585a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            HMSLog.m12622i("NotInstalledHmsResolution", "<Dialog onClick>");
            this.f19585a.finish();
        }
    }

    /* renamed from: a */
    private void m12630a(Activity activity) {
        m12629a();
        this.f19583a = NotInstalledHmsDialogHelper.getDialogBuilder(activity).setPositiveButton(NotInstalledHmsDialogHelper.getConfirmResId(activity), new DialogInterfaceOnClickListenerC2275a(activity)).show();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        HMSLog.m12622i("NotInstalledHmsResolution", "<Resolution getRequestCode>");
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.m12622i("NotInstalledHmsResolution", "<Resolution onBridgeActivityCreate>");
        if (activity == null || activity.isFinishing()) {
            HMSLog.m12620e("NotInstalledHmsResolution", "<Resolution onBridgeActivityCreate> activity is null or finishing");
            return;
        }
        this.f19584b = activity;
        C2043b.f18844b.m11534a(activity);
        m12630a(activity);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m12622i("NotInstalledHmsResolution", "<Resolution onBridgeActivityDestroy>");
        m12629a();
        C2043b.f18844b.m11535b(this.f19584b);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        HMSLog.m12622i("NotInstalledHmsResolution", "<Resolution onBridgeActivityResult>");
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m12622i("NotInstalledHmsResolution", "<Resolution onBridgeConfigurationChanged>");
        Activity activity = this.f19584b;
        if (activity == null || activity.isFinishing()) {
            HMSLog.m12620e("NotInstalledHmsResolution", "<Resolution onBridgeActivityCreate> mActivity is null or finishing");
        } else {
            m12630a(this.f19584b);
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m12622i("NotInstalledHmsResolution", "<Resolution onKeyUp>");
    }

    /* renamed from: a */
    private void m12629a() {
        Dialog dialog = this.f19583a;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f19583a.cancel();
    }
}
