package com.huawei.hms.adapter.p004ui;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.RegionUtils;
import com.huawei.hms.utils.ResolutionFlagUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p000.AbstractC7222ym;

/* loaded from: classes.dex */
public class BaseResolutionAdapter implements IBridgeActivityDelegate {

    /* renamed from: a */
    private WeakReference<Activity> f18770a;

    /* renamed from: b */
    private String f18771b = "";

    /* renamed from: c */
    private long f18772c = 0;

    /* renamed from: a */
    private void m11471a(long j) {
        if (!RegionUtils.isChinaROM(m11474c())) {
            HMSLog.m12622i("BaseResolutionAdapter", "not ChinaROM");
            return;
        }
        Activity activityM11474c = m11474c();
        if (activityM11474c == null || activityM11474c.isFinishing()) {
            return;
        }
        HashMap map = new HashMap();
        map.put("package", activityM11474c.getPackageName());
        map.put(CommonCode.MapKey.RESOLUTION_FLAG, this.f18772c + "-" + j);
        HiAnalyticsUtils.getInstance().onEvent(activityM11474c, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, map);
        HMSLog.m12620e("BaseResolutionAdapter", "check resolution flag failed, transactionId: " + this.f18771b + ", carriedTimeStamp: " + this.f18772c + ", savedTimeStamp: " + j);
    }

    /* renamed from: b */
    private void m11473b() {
        Activity activityM11474c = m11474c();
        if (activityM11474c == null || activityM11474c.isFinishing()) {
            return;
        }
        activityM11474c.finish();
    }

    /* renamed from: c */
    private Activity m11474c() {
        WeakReference<Activity> weakReference = this.f18770a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: d */
    private void m11475d() {
        SystemManager.getInstance().notifyResolutionResult(null, this.f18771b);
        m11473b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBridgeActivityCreate(android.app.Activity r10) throws android.content.IntentSender.SendIntentException {
        /*
            r9 = this;
            java.lang.String r0 = "BaseResolutionAdapter"
            if (r10 != 0) goto Ld
            java.lang.String r10 = "activity is null"
            com.huawei.hms.support.log.HMSLog.m12620e(r0, r10)
            r9.m11475d()
            return
        Ld:
            boolean r1 = r10.isFinishing()
            if (r1 == 0) goto L19
            java.lang.String r10 = "activity is finishing"
            com.huawei.hms.support.log.HMSLog.m12620e(r0, r10)
            return
        L19:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r10)
            r9.f18770a = r1
            android.content.Intent r1 = r10.getIntent()
            if (r1 != 0) goto L2a
            r9.m11475d()
            return
        L2a:
            android.os.Bundle r2 = r1.getExtras()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "transaction_id"
            java.lang.String r3 = r1.getStringExtra(r3)     // Catch: java.lang.Throwable -> L41
            r9.f18771b = r3     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "resolution_flag"
            r4 = 0
            long r3 = r1.getLongExtra(r3, r4)     // Catch: java.lang.Throwable -> L41
            r9.f18772c = r3     // Catch: java.lang.Throwable -> L41
            goto L56
        L41:
            r1 = move-exception
            goto L45
        L43:
            r1 = move-exception
            r2 = 0
        L45:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = "get transaction_id or resolution_flag exception:"
            java.lang.String r1 = r3.concat(r1)
            com.huawei.hms.support.log.HMSLog.m12620e(r0, r1)
        L56:
            boolean r1 = r9.m11472a()
            if (r1 != 0) goto L60
            r9.m11475d()
            return
        L60:
            java.lang.String r1 = r9.f18771b
            if (r1 == 0) goto L78
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r1 < r3) goto L78
            java.lang.String r1 = "remove apk resolution failed task."
            com.huawei.hms.support.log.HMSLog.m12622i(r0, r1)
            com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager r1 = com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager.getInstance()
            java.lang.String r3 = r9.f18771b
            r1.removeTask(r3)
        L78:
            if (r2 != 0) goto L7e
            r9.m11475d()
            return
        L7e:
            java.lang.String r1 = "resolution"
            android.os.Parcelable r1 = r2.getParcelable(r1)
            if (r1 != 0) goto L8a
            r9.m11475d()
            return
        L8a:
            boolean r2 = r1 instanceof android.content.Intent
            if (r2 == 0) goto La3
            android.content.Intent r1 = (android.content.Intent) r1     // Catch: java.lang.Throwable -> L9a
            android.content.Intent r1 = com.huawei.hms.utils.IntentUtil.modifyIntentBehaviorsSafe(r1)     // Catch: java.lang.Throwable -> L9a
            r2 = 1001(0x3e9, float:1.403E-42)
            r10.startActivityForResult(r1, r2)     // Catch: java.lang.Throwable -> L9a
            goto Lc0
        L9a:
            r9.m11475d()
            java.lang.String r10 = "ActivityNotFoundException:exception"
            com.huawei.hms.support.log.HMSLog.m12620e(r0, r10)
            goto Lc0
        La3:
            boolean r2 = r1 instanceof android.app.PendingIntent
            if (r2 == 0) goto Lc0
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1     // Catch: android.content.IntentSender.SendIntentException -> Lb8
            android.content.IntentSender r3 = r1.getIntentSender()     // Catch: android.content.IntentSender.SendIntentException -> Lb8
            r7 = 0
            r8 = 0
            r4 = 1001(0x3e9, float:1.403E-42)
            r5 = 0
            r6 = 0
            r2 = r10
            r2.startIntentSenderForResult(r3, r4, r5, r6, r7, r8)     // Catch: android.content.IntentSender.SendIntentException -> Lb8
            goto Lc0
        Lb8:
            r9.m11475d()
            java.lang.String r10 = "SendIntentException:exception"
            com.huawei.hms.support.log.HMSLog.m12620e(r0, r10)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.adapter.p004ui.BaseResolutionAdapter.onBridgeActivityCreate(android.app.Activity):void");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.m12622i("BaseResolutionAdapter", "onBridgeActivityDestroy");
        this.f18770a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        AbstractC7222ym.m26244u(i2, "onBridgeActivityResult, resultCode: ", "BaseResolutionAdapter");
        if (i2 == 1001 || i2 == 1002) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, i2);
        }
        if (i2 == -1 || intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT) || intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            SystemManager.getInstance().notifyResolutionResult(intent, this.f18771b);
        } else {
            SystemManager.getInstance().notifyResolutionResult(null, this.f18771b);
        }
        m11473b();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.m12622i("BaseResolutionAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.m12622i("BaseResolutionAdapter", "On key up when resolve conn error");
    }

    /* renamed from: a */
    private boolean m11472a() {
        long resolutionFlag = ResolutionFlagUtil.getInstance().getResolutionFlag(this.f18771b);
        ResolutionFlagUtil.getInstance().removeResolutionFlag(this.f18771b);
        if (resolutionFlag != 0 && resolutionFlag == this.f18772c) {
            return true;
        }
        m11471a(resolutionFlag);
        return false;
    }
}
