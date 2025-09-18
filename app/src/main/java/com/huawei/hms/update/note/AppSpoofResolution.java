package com.huawei.hms.update.note;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.availableupdate.C2042a;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.p016ui.AbstractDialog;
import com.huawei.hms.p016ui.AbstractPromptDialog;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;

/* loaded from: classes2.dex */
public class AppSpoofResolution implements IBridgeActivityDelegate {

    /* renamed from: a */
    private Activity f19580a;

    /* renamed from: b */
    private C2274b f19581b;

    /* renamed from: com.huawei.hms.update.note.AppSpoofResolution$a */
    public class C2273a implements AbstractDialog.Callback {
        public C2273a() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onCancel(AbstractDialog abstractDialog) {
            C2042a.f18840c.m11532a(true);
            AppSpoofResolution.this.f19581b = null;
            AppSpoofResolution.this.m12626a();
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onDoWork(AbstractDialog abstractDialog) {
            C2042a.f18840c.m11532a(true);
            AppSpoofResolution.this.f19581b = null;
            AppSpoofResolution.this.m12626a();
        }
    }

    /* renamed from: com.huawei.hms.update.note.AppSpoofResolution$b */
    public static class C2274b extends AbstractPromptDialog {
        private C2274b() {
        }

        @Override // com.huawei.hms.p016ui.AbstractDialog
        public String onGetMessageString(Context context) throws PackageManager.NameNotFoundException {
            PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
            String str = PackageConstants.SERVICES_PACKAGE;
            String applicationName = packageManagerHelper.getApplicationName(PackageConstants.SERVICES_PACKAGE);
            if (!TextUtils.isEmpty(applicationName)) {
                str = applicationName;
            }
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_is_spoof", str);
        }

        @Override // com.huawei.hms.p016ui.AbstractDialog
        public String onGetPositiveButtonString(Context context) {
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_confirm");
        }

        @Override // com.huawei.hms.p016ui.AbstractPromptDialog, com.huawei.hms.p016ui.AbstractDialog
        public String onGetTitleString(Context context) {
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context);
            }
            return ResourceLoaderUtil.getString("hms_spoof_hints");
        }

        public /* synthetic */ C2274b(C2273a c2273a) {
            this();
        }
    }

    /* renamed from: b */
    private void m12628b() {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        C2274b c2274b = this.f19581b;
        if (c2274b == null) {
            this.f19581b = new C2274b(null);
        } else {
            c2274b.dismiss();
        }
        HMSLog.m12622i("AppSpoofResolution", "enter AppSpoofResolution showPromptdlg to resolve conn error");
        this.f19581b.show(activity, new C2273a());
    }

    public Activity getActivity() {
        return this.f19580a;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        HMSLog.m12622i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityCreate");
        if (activity == null || activity.isFinishing()) {
            HMSLog.m12620e("AppSpoofResolution", "activity is null or finishing");
            return;
        }
        this.f19580a = activity;
        C2042a c2042a = C2042a.f18840c;
        c2042a.m11531a(activity);
        c2042a.m11532a(false);
        m12628b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m12622i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityDestroy");
        C2042a c2042a = C2042a.f18840c;
        if (c2042a.m11530a().compareAndSet(true, false)) {
            SystemManager.getInstance().notifyNoticeResult(29);
        }
        c2042a.m11533b(this.f19580a);
        this.f19580a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        HMSLog.m12622i("AppSpoofResolution", "enter AppSpoofResolution onBridgeActivityResult");
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        if (this.f19581b == null) {
            return;
        }
        HMSLog.m12622i("AppSpoofResolution", "enter AppSpoofResolution re show prompt dialog");
        m12628b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m12622i("AppSpoofResolution", "enter AppSpoofResolution On key up when resolve spoof error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12626a() {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        HMSLog.m12622i("AppSpoofResolution", "enter AppSpoofResolution finishBridgeActivity：");
        if (C2042a.f18840c.m11530a().compareAndSet(true, false)) {
            SystemManager.getInstance().notifyNoticeResult(29);
        }
        activity.finish();
    }
}
