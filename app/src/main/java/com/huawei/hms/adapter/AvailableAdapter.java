package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.p004ui.NotInstalledHmsAdapter;
import com.huawei.hms.adapter.p004ui.UpdateAdapter;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.note.AppSpoofResolution;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;

/* loaded from: classes.dex */
public class AvailableAdapter {

    /* renamed from: a */
    private final int f18714a;

    /* renamed from: b */
    private AvailableCallBack f18715b;

    /* renamed from: d */
    private SystemObserver f18717d = new C2018a();

    /* renamed from: c */
    private boolean f18716c = false;

    public interface AvailableCallBack {
        void onComplete(int i);
    }

    /* renamed from: com.huawei.hms.adapter.AvailableAdapter$a */
    public class C2018a implements SystemObserver {
        public C2018a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onNoticeResult(int i) {
            AvailableCallBack availableCallBackM11403a = AvailableAdapter.this.m11403a();
            if (availableCallBackM11403a == null) {
                HMSLog.m12620e("AvailableAdapter", "onNoticeResult baseCallBack null");
                return true;
            }
            availableCallBackM11403a.onComplete(i);
            return true;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
            return false;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i) {
            AvailableCallBack availableCallBackM11403a = AvailableAdapter.this.m11403a();
            if (availableCallBackM11403a == null) {
                HMSLog.m12620e("AvailableAdapter", "onUpdateResult baseCallBack null");
                return true;
            }
            availableCallBackM11403a.onComplete(i);
            return true;
        }
    }

    public AvailableAdapter(int i) {
        this.f18714a = i;
    }

    /* renamed from: b */
    private void m11407b(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    public int checkHuaweiMobileServicesForUpdate(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int iM11402a = m11402a(context);
        if (iM11402a != 0 || !HMSPackageManager.getInstance(context).isApkNeedUpdate(this.f18714a)) {
            return iM11402a;
        }
        HMSLog.m12622i("AvailableAdapter", "The current version does not meet the target version requirements");
        return 2;
    }

    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int iM11402a = m11402a(context);
        if (iM11402a != 0 || !HMSPackageManager.getInstance(context).isApkUpdateNecessary(this.f18714a)) {
            return iM11402a;
        }
        HMSLog.m12622i("AvailableAdapter", "The current version does not meet the minimum version requirements");
        return 2;
    }

    public boolean isUserNoticeError(int i) {
        return i == 29;
    }

    public boolean isUserResolvableError(int i) {
        return i == 1 || i == 2;
    }

    public void setCalledBySolutionInstallHms(boolean z) {
        this.f18716c = z;
    }

    public void startNotice(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        if (UIUtil.isBackground(activity)) {
            HMSLog.m12622i("AvailableAdapter", "current app is in Background");
            availableCallBack.onComplete(28);
        } else {
            HMSLog.m12622i("AvailableAdapter", "startNotice");
            this.f18715b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.f18717d);
            activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, AppSpoofResolution.class.getName()));
        }
    }

    public void startResolution(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        m11407b(activity);
        if (UIUtil.isBackground(activity)) {
            HMSLog.m12622i("AvailableAdapter", "current app is in Background");
            availableCallBack.onComplete(28);
            return;
        }
        boolean zM11406a = m11406a(activity);
        if (!AvailableUtil.isInstallerLibExist(activity) && !zM11406a) {
            m11405a(activity, availableCallBack);
            return;
        }
        HMSLog.m12622i("AvailableAdapter", "startResolution");
        this.f18715b = availableCallBack;
        SystemManager.getSystemNotifier().registerObserver(this.f18717d);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, UpdateAdapter.class.getName());
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, this.f18714a);
        if (this.f18716c) {
            intentStartBridgeActivity.putExtra("installHMS", "installHMS");
        }
        intentStartBridgeActivity.putExtra(CommonCode.MapKey.NEW_UPDATE, zM11406a);
        activity.startActivity(intentStartBridgeActivity);
    }

    /* renamed from: a */
    private int m11402a(Context context) {
        if (HMSPackageManager.getInstance(context).isUseOldCertificate()) {
            HMSLog.m12620e("AvailableAdapter", "The CP uses the old certificate to terminate the connection.");
            return 13;
        }
        PackageManagerHelper.PackageStates hMSPackageStatesForMultiService = HMSPackageManager.getInstance(context).getHMSPackageStatesForMultiService();
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(hMSPackageStatesForMultiService)) {
            HMSLog.m12622i("AvailableAdapter", "HMS is not installed");
            return 1;
        }
        if (PackageManagerHelper.PackageStates.SPOOF.equals(hMSPackageStatesForMultiService)) {
            HMSLog.m12622i("AvailableAdapter", "HMS is spoofed");
            return 29;
        }
        if (!PackageManagerHelper.PackageStates.DISABLED.equals(hMSPackageStatesForMultiService)) {
            return 0;
        }
        HMSLog.m12622i("AvailableAdapter", "HMS is disabled");
        return 3;
    }

    /* renamed from: a */
    private void m11405a(Activity activity, AvailableCallBack availableCallBack) {
        HMSLog.m12622i("AvailableAdapter", "<showHmsApkNotInstalledDialog> startResolution");
        if (NotInstalledHmsAdapter.getShowLock()) {
            this.f18715b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.f18717d);
            activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, NotInstalledHmsAdapter.class.getName()));
            return;
        }
        availableCallBack.onComplete(31);
    }

    /* renamed from: a */
    private boolean m11406a(Activity activity) {
        if (HMSPackageManager.getInstance(activity).isUpdateHmsForThirdPartyDevice() || HMSPackageManager.getInstance(activity).getHmsVersionCode() < 40000000) {
            return false;
        }
        HMSLog.m12622i("AvailableAdapter", "enter 4.0 HmsCore upgrade process");
        return true;
    }

    /* renamed from: a */
    public AvailableCallBack m11403a() {
        return this.f18715b;
    }
}
