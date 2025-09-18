package com.huawei.hms.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.hatool.HmsHiAnalyticsUtils;
import com.huawei.hms.stats.C2246a;
import com.huawei.hms.stats.HianalyticsExist;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class HMSBIInitializer {

    /* renamed from: d */
    private static final Object f19612d = new Object();

    /* renamed from: e */
    private static HMSBIInitializer f19613e;

    /* renamed from: f */
    private static HiAnalyticsInstance f19614f;

    /* renamed from: a */
    private final Context f19615a;

    /* renamed from: b */
    private AtomicBoolean f19616b = new AtomicBoolean(false);

    /* renamed from: c */
    private boolean f19617c = HianalyticsExist.isHianalyticsExist();

    /* renamed from: com.huawei.hms.utils.HMSBIInitializer$a */
    public class C2279a implements IQueryUrlCallBack {
        public C2279a() {
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackFail(int i) {
            HMSLog.m12620e("HMSBIInitializer", "get grs failed, the errorcode is " + i);
            HMSBIInitializer.this.f19616b.set(false);
            C2246a.m12561c().m12562a();
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackSuccess(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (HMSBIInitializer.this.f19617c) {
                    HMSBIInitializer.this.m12642a(str);
                } else {
                    HmsHiAnalyticsUtils.init(HMSBIInitializer.this.f19615a, false, false, false, str, PackageConstants.SERVICES_PACKAGE);
                }
                HMSLog.m12622i("HMSBIInitializer", "BI URL acquired successfully");
            }
            HMSBIInitializer.this.f19616b.set(false);
            C2246a.m12561c().m12564b();
        }
    }

    /* renamed from: com.huawei.hms.utils.HMSBIInitializer$b */
    public class AsyncTaskC2280b extends AsyncTask<String, Integer, Void> {
        private AsyncTaskC2280b() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            HMSBIInitializer.this.m12646b(strArr[0]);
            return null;
        }

        public /* synthetic */ AsyncTaskC2280b(HMSBIInitializer hMSBIInitializer, C2279a c2279a) {
            this();
        }
    }

    private HMSBIInitializer(Context context) {
        this.f19615a = context;
    }

    public static HMSBIInitializer getInstance(Context context) {
        synchronized (f19612d) {
            try {
                if (f19613e == null && context != null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        f19613e = new HMSBIInitializer(applicationContext);
                    } else {
                        f19613e = new HMSBIInitializer(context);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f19613e;
    }

    public HiAnalyticsInstance getAnalyticsInstance() {
        return f19614f;
    }

    public void initBI() {
        boolean initFlag = !this.f19617c ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
        HMSLog.m12622i("HMSBIInitializer", "Builder->biInitFlag :" + initFlag);
        if (initFlag || AnalyticsSwitchHolder.isAnalyticsDisabled(this.f19615a)) {
            return;
        }
        HMSLog.m12622i("HMSBIInitializer", "Builder->biInitFlag : start initHaSDK");
        initHaSDK();
    }

    public void initHaSDK() {
        if (this.f19616b.compareAndSet(false, true)) {
            String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(this.f19615a);
            if (!TextUtils.isEmpty(issueCountryCode)) {
                issueCountryCode = issueCountryCode.toUpperCase(Locale.ENGLISH);
            }
            if (!GrsBaseInfo.CountryCodeSource.UNKNOWN.equalsIgnoreCase(issueCountryCode) && !TextUtils.isEmpty(issueCountryCode)) {
                new AsyncTaskC2280b(this, null).execute(issueCountryCode);
            } else {
                HMSLog.m12620e("HMSBIInitializer", "Failed to get device issue country");
                this.f19616b.set(false);
            }
        }
    }

    public boolean isInit() {
        return !this.f19617c ? HmsHiAnalyticsUtils.getInitFlag() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m12642a(String str) {
        HiAnalyticsInstance instanceByTag = HiAnalyticsManager.getInstanceByTag(HiAnalyticsConstant.HA_SERVICE_TAG);
        f19614f = instanceByTag;
        if (instanceByTag != null) {
            instanceByTag.setAppid(PackageConstants.SERVICES_PACKAGE);
            return;
        }
        HiAnalyticsConfig hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build();
        HiAnalyticsInstance hiAnalyticsInstanceCreate = new HiAnalyticsInstance.Builder(this.f19615a).setOperConf(hiAnalyticsConfigBuild).setMaintConf(new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build()).create(HiAnalyticsConstant.HA_SERVICE_TAG);
        f19614f = hiAnalyticsInstanceCreate;
        if (hiAnalyticsInstanceCreate != null) {
            hiAnalyticsInstanceCreate.setAppid(PackageConstants.SERVICES_PACKAGE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m12646b(String str) {
        HMSLog.m12622i("HMSBIInitializer", "Start to query GRS");
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setIssueCountry(str);
        new GrsClient(this.f19615a, grsBaseInfo).ayncGetGrsUrl("com.huawei.cloud.opensdkhianalytics", "ROOTV2", new C2279a());
    }
}
