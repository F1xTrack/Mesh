package com.huawei.hms.adapter.p004ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.availableupdate.C2044c;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.update.p017ui.UpdateBean;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import java.lang.ref.WeakReference;
import p000.AbstractC7222ym;
import p000.F91;

/* loaded from: classes.dex */
public class UpdateAdapter implements IBridgeActivityDelegate {

    /* renamed from: a */
    private WeakReference<Activity> f18779a;

    /* renamed from: b */
    private Context f18780b;

    /* renamed from: c */
    private int f18781c;

    /* renamed from: d */
    private UpdateBean f18782d;

    /* renamed from: e */
    private boolean f18783e = false;

    /* renamed from: a */
    private static Object m11477a(String str, String str2, Object[] objArr) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            HMSLog.m12620e("UpdateAdapter", "className is empty.");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            HMSLog.m12620e("UpdateAdapter", "methodName is empty.");
            return null;
        }
        if (objArr == null) {
            HMSLog.m12620e("UpdateAdapter", "args is null.");
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof Activity) {
                clsArr[i] = Activity.class;
            } else if (obj instanceof Context) {
                clsArr[i] = Context.class;
            } else if (obj instanceof UpdateBean) {
                clsArr[i] = UpdateBean.class;
            } else if (obj instanceof Integer) {
                clsArr[i] = Integer.TYPE;
            } else if (obj instanceof Boolean) {
                clsArr[i] = Boolean.TYPE;
            } else {
                HMSLog.m12620e("UpdateAdapter", "not set args[" + i + "] type");
            }
        }
        Class<?> cls = Class.forName(str);
        return cls.getMethod(str2, clsArr).invoke(cls.getDeclaredConstructor(null).newInstance(null), objArr);
    }

    /* renamed from: b */
    private Activity m11482b() {
        WeakReference<Activity> weakReference = this.f18779a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: c */
    private void m11483c() {
        SystemManager.getInstance().notifyUpdateResult(8);
        m11478a();
    }

    public static Object invokeMethod(String str, String str2, Object[] objArr) {
        try {
            return m11477a(str, str2, objArr);
        } catch (Throwable th) {
            StringBuilder sbM2541x = F91.m2541x("invoke ", str, ".", str2, " fail. ");
            sbM2541x.append(th.getMessage());
            HMSLog.m12620e("UpdateAdapter", sbM2541x.toString());
            return null;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            HMSLog.m12622i("UpdateAdapter", "activity == null");
            m11483c();
            return;
        }
        if (activity.isFinishing()) {
            HMSLog.m12622i("UpdateAdapter", "activity is finishing");
            m11483c();
            return;
        }
        this.f18780b = activity.getApplicationContext();
        this.f18779a = new WeakReference<>(activity);
        if (C2044c.f18847b.m11537a(m11482b())) {
            Intent intent = activity.getIntent();
            if (intent == null) {
                m11483c();
                return;
            }
            try {
                this.f18781c = intent.getIntExtra(CommonCode.MapKey.UPDATE_VERSION, 0);
            } catch (Throwable th) {
                HMSLog.m12620e("UpdateAdapter", "get update_version:" + th.getMessage());
            }
            if (this.f18781c == 0) {
                m11483c();
                return;
            }
            if (intent.hasExtra("installHMS")) {
                this.f18783e = true;
            }
            if (m11481a(intent, activity)) {
                return;
            }
            try {
                if (AvailableUtil.isInstallerLibExist(this.f18780b)) {
                    UpdateBean updateBean = (UpdateBean) m11477a("com.huawei.hms.adapter.ui.InstallerAdapter", "setUpdateBean", new Object[]{activity, Integer.valueOf(this.f18781c), Boolean.valueOf(this.f18783e)});
                    this.f18782d = updateBean;
                    m11477a("com.huawei.hms.adapter.ui.InstallerAdapter", "startUpdateHms", new Object[]{activity, updateBean, 1001});
                    this.f18782d = null;
                }
            } catch (Throwable th2) {
                HMSLog.m12620e("UpdateAdapter", "InstallerAdapter.startUpdateHms is failed. message：" + th2.getMessage());
                m11483c();
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m12622i("UpdateAdapter", "onBridgeActivityDestroy");
        C2044c.f18847b.m11538b(m11482b());
        this.f18779a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        int intExtra;
        if (i != getRequestCode()) {
            this.f18782d = null;
            return false;
        }
        AbstractC7222ym.m26244u(i2, "onBridgeActivityResult ", "UpdateAdapter");
        if (AvailableUtil.isInstallerLibExist(this.f18780b) && i2 == 1214) {
            HMSLog.m12622i("UpdateAdapter", "Enter update escape route");
            Activity activityM11482b = m11482b();
            if (activityM11482b == null) {
                HMSLog.m12620e("UpdateAdapter", "bridgeActivity is null, update escape failed ");
                this.f18782d = null;
                return true;
            }
            invokeMethod("com.huawei.hms.update.manager.UpdateManager", "startUpdate", new Object[]{activityM11482b, 1001, this.f18782d});
            this.f18782d = null;
        }
        if (i2 == -1) {
            if (intent != null) {
                try {
                    intExtra = intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0);
                } catch (Throwable unused) {
                    HMSLog.m12623w("UpdateAdapter", "get kit_update_result failed, throwable occur.");
                    intExtra = 0;
                }
                if (intExtra == 1) {
                    HMSLog.m12622i("UpdateAdapter", "new framework update process,Error resolved successfully!");
                    SystemManager.getInstance().notifyUpdateResult(0);
                    this.f18782d = null;
                    m11478a();
                    return true;
                }
                m11479a(intent);
            }
        } else if (i2 == 0) {
            HMSLog.m12622i("UpdateAdapter", "Activity.RESULT_CANCELED");
            this.f18782d = null;
            Activity activityM11482b2 = m11482b();
            if (activityM11482b2 == null) {
                return true;
            }
            String hMSPackageName = HMSPackageManager.getInstance(activityM11482b2.getApplicationContext()).getHMSPackageName();
            if (TextUtils.isEmpty(hMSPackageName)) {
                hMSPackageName = PackageConstants.SERVICES_PACKAGE;
            }
            if (this.f18783e || m11480a(activityM11482b2, hMSPackageName, this.f18781c)) {
                HMSLog.m12622i("UpdateAdapter", "Resolve error, process canceled by user clicking back button!");
                SystemManager.getInstance().notifyUpdateResult(13);
            } else {
                SystemManager.getInstance().notifyUpdateResult(0);
            }
        } else if (i2 == 1) {
            SystemManager.getInstance().notifyUpdateResult(28);
        }
        m11478a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m12622i("UpdateAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m12622i("UpdateAdapter", "On key up when resolve conn error");
    }

    /* renamed from: a */
    private boolean m11481a(Intent intent, Activity activity) {
        if (!intent.getBooleanExtra(CommonCode.MapKey.NEW_UPDATE, false)) {
            return false;
        }
        HMSLog.m12622i("UpdateAdapter", "4.0 framework HMSCore upgrade process");
        String hMSPackageName = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
        if (TextUtils.isEmpty(hMSPackageName)) {
            HMSLog.m12623w("UpdateAdapter", "hmsPackageName is empty, update invalid.");
            m11483c();
            return true;
        }
        ComponentName componentName = new ComponentName(hMSPackageName, "com.huawei.hms.fwksdk.stub.UpdateStubActivity");
        Intent intent2 = new Intent();
        intent2.putExtra(KpmsConstant.CALLER_PACKAGE_NAME, activity.getApplicationContext().getPackageName());
        intent2.putExtra(KpmsConstant.UPDATE_PACKAGE_NAME, hMSPackageName);
        intent2.setComponent(componentName);
        activity.startActivityForResult(intent2, 1001);
        return true;
    }

    /* renamed from: a */
    private void m11479a(Intent intent) {
        int intExtra = -1;
        try {
            intExtra = intent.getIntExtra(BridgeActivity.EXTRA_RESULT, -1);
        } catch (Throwable unused) {
            HMSLog.m12623w("UpdateAdapter", "get extra_result failed, throwable occur.");
        }
        if (intExtra == 0) {
            HMSLog.m12622i("UpdateAdapter", "Error resolved successfully!");
            SystemManager.getInstance().notifyUpdateResult(0);
        } else if (intExtra == 13) {
            HMSLog.m12622i("UpdateAdapter", "Resolve error process canceled by user!");
            SystemManager.getInstance().notifyUpdateResult(13);
        } else if (intExtra == 8) {
            HMSLog.m12622i("UpdateAdapter", "Internal error occurred, recommended retry.");
            SystemManager.getInstance().notifyUpdateResult(8);
        } else {
            HMSLog.m12622i("UpdateAdapter", "Other error codes.");
            SystemManager.getInstance().notifyUpdateResult(intExtra);
        }
    }

    /* renamed from: a */
    private void m11478a() {
        Activity activityM11482b = m11482b();
        if (activityM11482b == null || activityM11482b.isFinishing()) {
            return;
        }
        activityM11482b.finish();
    }

    /* renamed from: a */
    private boolean m11480a(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str) && i != 0) {
            PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
            return PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(str)) || packageManagerHelper.getPackageVersionCode(str) < i;
        }
        HMSLog.m12623w("UpdateAdapter", "Please check your params, one of params is invalid.");
        return false;
    }
}
