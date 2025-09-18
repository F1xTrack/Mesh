package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Pair;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.device.C2077a;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000.AbstractC0852NX;
import p000.AbstractC1374Vq;
import p000.F91;

/* loaded from: classes2.dex */
public class HMSPackageManager {

    /* renamed from: o */
    private static HMSPackageManager f19620o;

    /* renamed from: p */
    private static final Object f19621p = new Object();

    /* renamed from: q */
    private static final Object f19622q = new Object();

    /* renamed from: r */
    private static final Object f19623r = new Object();

    /* renamed from: s */
    private static final Map<String, String> f19624s;

    /* renamed from: a */
    private final Context f19625a;

    /* renamed from: b */
    private final PackageManagerHelper f19626b;

    /* renamed from: c */
    private String f19627c;

    /* renamed from: d */
    private String f19628d;

    /* renamed from: e */
    private int f19629e;

    /* renamed from: f */
    private String f19630f;

    /* renamed from: g */
    private String f19631g;

    /* renamed from: h */
    private String f19632h;

    /* renamed from: i */
    private String f19633i;

    /* renamed from: j */
    private int f19634j;

    /* renamed from: k */
    private int f19635k;

    /* renamed from: l */
    private long f19636l;

    /* renamed from: m */
    private boolean f19637m;

    /* renamed from: n */
    private int f19638n;

    public static class PackagePriorityInfo implements Comparable<PackagePriorityInfo> {

        /* renamed from: a */
        private String f19639a;

        /* renamed from: b */
        private String f19640b;

        /* renamed from: c */
        private String f19641c;

        /* renamed from: d */
        private String f19642d;

        /* renamed from: e */
        private String f19643e;

        /* renamed from: f */
        private Long f19644f;

        public PackagePriorityInfo(String str, String str2, String str3, String str4, String str5, long j) {
            this.f19639a = str;
            this.f19640b = str2;
            this.f19641c = str3;
            this.f19642d = str4;
            this.f19643e = str5;
            this.f19644f = Long.valueOf(j);
        }

        @Override // java.lang.Comparable
        public int compareTo(PackagePriorityInfo packagePriorityInfo) {
            return TextUtils.equals(this.f19643e, packagePriorityInfo.f19643e) ? this.f19644f.compareTo(packagePriorityInfo.f19644f) : this.f19643e.compareTo(packagePriorityInfo.f19643e);
        }
    }

    /* renamed from: com.huawei.hms.utils.HMSPackageManager$a */
    public class C2281a implements Comparator<ResolveInfo> {
        public C2281a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
            String str = resolveInfo.serviceInfo.applicationInfo.packageName;
            String str2 = resolveInfo2.serviceInfo.applicationInfo.packageName;
            if (HMSPackageManager.f19624s.containsKey(str) && HMSPackageManager.f19624s.containsKey(str2)) {
                return str.compareTo(str2);
            }
            if (HMSPackageManager.f19624s.containsKey(str)) {
                return -1;
            }
            return HMSPackageManager.f19624s.containsKey(str2) ? 1 : 0;
        }
    }

    /* renamed from: com.huawei.hms.utils.HMSPackageManager$b */
    public class RunnableC2282b implements Runnable {
        public RunnableC2282b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.m12622i("HMSPackageManager", "enter asyncOnceCheckMDMState");
            try {
                List<ResolveInfo> listQueryIntentServices = HMSPackageManager.this.f19625a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
                if (listQueryIntentServices == null || listQueryIntentServices.size() == 0) {
                    return;
                }
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                while (it.hasNext()) {
                    if (PackageConstants.SERVICES_PACKAGE.equals(it.next().serviceInfo.applicationInfo.packageName)) {
                        HMSPackageManager.this.m12666d();
                    }
                }
                HMSLog.m12622i("HMSPackageManager", "quit asyncOnceCheckMDMState");
            } catch (Exception e) {
                AbstractC0852NX.m5766o(e, new StringBuilder("asyncOnceCheckMDMState query hms action failed. "), "HMSPackageManager");
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f19624s = map;
        map.put(PackageConstants.SERVICES_PACKAGE, "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05");
        map.put("com.huawei.hwid.tv", "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C");
    }

    private HMSPackageManager(Context context) {
        this.f19625a = context;
        this.f19626b = new PackageManagerHelper(context);
    }

    /* renamed from: c */
    private boolean m12665c(String str, String str2) {
        return Objects.equals(str2, this.f19626b.getPackageSigningCertificate(str)) || Objects.equals(str2, this.f19626b.getPackageSignature(str));
    }

    /* renamed from: d */
    private Pair<String, String> m12667d(String str, String str2) {
        if (!f19624s.containsKey(str) || !PackageConstants.SERVICES_SIGNATURE_V3.equalsIgnoreCase(str2)) {
            return null;
        }
        this.f19638n = 3;
        return new Pair<>(str, str2);
    }

    /* renamed from: e */
    private void m12670e(String str) {
        if (SystemUtils.isHuawei() || SystemUtils.isSystemApp(this.f19625a, str) || Build.VERSION.SDK_INT < 28 || m12661b(str)) {
            AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
        }
    }

    /* renamed from: f */
    private void m12671f() {
        synchronized (f19622q) {
            this.f19627c = null;
            this.f19628d = null;
            this.f19629e = 0;
        }
    }

    /* renamed from: g */
    private Pair<String, String> m12672g() throws PackageManager.NameNotFoundException {
        try {
            List<ResolveInfo> listQueryIntentServices = this.f19625a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
            if (listQueryIntentServices == null || listQueryIntentServices.size() == 0) {
                HMSLog.m12620e("HMSPackageManager", "query hms action, resolveInfoList is null or empty.");
                return null;
            }
            m12656a(listQueryIntentServices);
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                String packageSigningCertificate = this.f19626b.getPackageSigningCertificate(str);
                String packageSignature = this.f19626b.getPackageSignature(str);
                Pair<String, String> pairM12667d = m12667d(str, packageSigningCertificate);
                if (pairM12667d != null) {
                    HMSLog.m12622i("HMSPackageManager", "signature V3 check success");
                    return pairM12667d;
                }
                Pair<String, String> pairM12650a = m12650a(resolveInfo.serviceInfo.metaData, str, packageSigningCertificate, packageSignature);
                if (pairM12650a != null) {
                    HMSLog.m12622i("HMSPackageManager", "DSS signature check success");
                    return pairM12650a;
                }
                Pair<String, String> pairM12651a = m12651a(str, packageSignature);
                if (pairM12651a != null) {
                    HMSLog.m12622i("HMSPackageManager", "signature V2 check success");
                    return pairM12651a;
                }
            }
            return null;
        } catch (Exception e) {
            AbstractC0852NX.m5766o(e, new StringBuilder("getHmsPackageName query hms action failed. "), "HMSPackageManager");
            return null;
        }
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (f19621p) {
            try {
                if (f19620o == null && context != null) {
                    if (context.getApplicationContext() != null) {
                        f19620o = new HMSPackageManager(context.getApplicationContext());
                    } else {
                        f19620o = new HMSPackageManager(context);
                    }
                    f19620o.m12676k();
                    f19620o.m12660b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f19620o;
    }

    /* renamed from: h */
    private Pair<String, String> m12673h() throws PackageManager.NameNotFoundException {
        Pair<String, String> pairM12672g = m12672g();
        if (pairM12672g != null) {
            HMSLog.m12622i("HMSPackageManager", "aidlService pkgName: " + ((String) pairM12672g.first));
            this.f19632h = "com.huawei.hms.core.aidlservice";
            this.f19633i = null;
            return pairM12672g;
        }
        ArrayList<PackagePriorityInfo> arrayListM12674i = m12674i();
        if (arrayListM12674i == null) {
            HMSLog.m12620e("HMSPackageManager", "PackagePriorityInfo list is null");
            return null;
        }
        Iterator<PackagePriorityInfo> it = arrayListM12674i.iterator();
        while (it.hasNext()) {
            PackagePriorityInfo next = it.next();
            String str = next.f19639a;
            String str2 = next.f19640b;
            String str3 = next.f19641c;
            String str4 = next.f19642d;
            String packageSignature = this.f19626b.getPackageSignature(str);
            if (m12658a(str + ContainerUtils.FIELD_DELIMITER + packageSignature + ContainerUtils.FIELD_DELIMITER + str2, str3, str4)) {
                StringBuilder sbM2541x = F91.m2541x("result: ", str, ", ", str2, ", ");
                sbM2541x.append(next.f19644f);
                HMSLog.m12622i("HMSPackageManager", sbM2541x.toString());
                this.f19632h = PackageConstants.GENERAL_SERVICES_ACTION;
                m12668d(str2);
                return new Pair<>(str, packageSignature);
            }
        }
        return null;
    }

    /* renamed from: i */
    private ArrayList<PackagePriorityInfo> m12674i() throws PackageManager.NameNotFoundException {
        try {
            List<ResolveInfo> listQueryIntentServices = this.f19625a.getPackageManager().queryIntentServices(new Intent(PackageConstants.GENERAL_SERVICES_ACTION), 128);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                HMSLog.m12620e("HMSPackageManager", "query aglite action, resolveInfoList is null or empty");
                return null;
            }
            ArrayList<PackagePriorityInfo> arrayList = new ArrayList<>();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                String str = resolveInfo.serviceInfo.applicationInfo.packageName;
                long packageFirstInstallTime = this.f19626b.getPackageFirstInstallTime(str);
                Bundle bundle = resolveInfo.serviceInfo.metaData;
                if (bundle == null) {
                    HMSLog.m12620e("HMSPackageManager", "package " + str + " get metaData is null");
                } else {
                    String strM12653a = m12653a(bundle, "hms_app_checker_config");
                    String strM12654a = m12654a(strM12653a);
                    if (TextUtils.isEmpty(strM12654a)) {
                        HMSLog.m12622i("HMSPackageManager", "get priority fail. hmsCheckerCfg: " + strM12653a);
                    } else {
                        String strM12653a2 = m12653a(bundle, "hms_app_signer_v2");
                        if (TextUtils.isEmpty(strM12653a2)) {
                            HMSLog.m12622i("HMSPackageManager", "get signerV2 fail.");
                        } else {
                            String strM12653a3 = m12653a(bundle, "hms_app_cert_chain");
                            if (TextUtils.isEmpty(strM12653a3)) {
                                HMSLog.m12622i("HMSPackageManager", "get certChain fail.");
                            } else {
                                StringBuilder sbM2541x = F91.m2541x("add: ", str, ", ", strM12653a, ", ");
                                sbM2541x.append(packageFirstInstallTime);
                                HMSLog.m12622i("HMSPackageManager", sbM2541x.toString());
                                arrayList.add(new PackagePriorityInfo(str, strM12653a, strM12653a2, strM12653a3, strM12654a, packageFirstInstallTime));
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList);
            return arrayList;
        } catch (Exception e) {
            AbstractC0852NX.m5766o(e, new StringBuilder("query aglite action failed. "), "HMSPackageManager");
            return null;
        }
    }

    /* renamed from: j */
    private void m12675j() {
        synchronized (f19622q) {
            try {
                Pair<String, String> pairM12672g = m12672g();
                if (pairM12672g == null) {
                    HMSLog.m12620e("HMSPackageManager", "<initHmsPackageInfo> Failed to find HMS apk");
                    m12671f();
                    return;
                }
                String str = (String) pairM12672g.first;
                this.f19627c = str;
                this.f19628d = (String) pairM12672g.second;
                this.f19629e = this.f19626b.getPackageVersionCode(str);
                HMSLog.m12622i("HMSPackageManager", "<initHmsPackageInfo> Succeed to find HMS apk: " + this.f19627c + " version: " + this.f19629e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: k */
    private void m12676k() {
        synchronized (f19622q) {
            try {
                Pair<String, String> pairM12673h = m12673h();
                if (pairM12673h == null) {
                    HMSLog.m12620e("HMSPackageManager", "<initHmsPackageInfoForMultiService> Failed to find HMS apk");
                    m12669e();
                    AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
                    return;
                }
                this.f19630f = (String) pairM12673h.first;
                this.f19631g = (String) pairM12673h.second;
                this.f19634j = this.f19626b.getPackageVersionCode(getHMSPackageNameForMultiService());
                m12670e(this.f19630f);
                HMSLog.m12622i("HMSPackageManager", "<initHmsPackageInfoForMultiService> Succeed to find HMS apk: " + this.f19630f + " version: " + this.f19634j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    private boolean m12677l() {
        Bundle bundle;
        PackageManager packageManager = this.f19625a.getPackageManager();
        if (packageManager == null) {
            HMSLog.m12620e("HMSPackageManager", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
        } catch (AndroidException unused) {
            HMSLog.m12620e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        } catch (RuntimeException e) {
            HMSLog.m12621e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.", e);
        }
        if (TextUtils.isEmpty(this.f19632h) || (!this.f19632h.equals(PackageConstants.GENERAL_SERVICES_ACTION) && !this.f19632h.equals(PackageConstants.INTERNAL_SERVICES_ACTION))) {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("com.huawei.hms.kit.api_level:hmscore") && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
                HMSLog.m12622i("HMSPackageManager", "MinApkVersion is disabled.");
                return false;
            }
            return true;
        }
        HMSLog.m12622i("HMSPackageManager", "action = " + this.f19632h + " exist");
        return false;
    }

    public String getHMSFingerprint() {
        String str = this.f19628d;
        return str == null ? "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05" : str;
    }

    public String getHMSPackageName() {
        HMSLog.m12622i("HMSPackageManager", "Enter getHMSPackageName");
        refresh();
        String str = this.f19627c;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f19626b.getPackageStates(str))) {
                HMSLog.m12622i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                m12675j();
            }
            String str2 = this.f19627c;
            if (str2 != null) {
                return str2;
            }
        }
        HMSLog.m12622i("HMSPackageManager", "return default packageName: com.huawei.hwid");
        return PackageConstants.SERVICES_PACKAGE;
    }

    public String getHMSPackageNameForMultiService() {
        HMSLog.m12622i("HMSPackageManager", "Enter getHMSPackageNameForMultiService");
        refreshForMultiService();
        String str = this.f19630f;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f19626b.getPackageStates(str))) {
                HMSLog.m12622i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                m12676k();
            }
            String str2 = this.f19630f;
            if (str2 != null) {
                return str2;
            }
        }
        HMSLog.m12622i("HMSPackageManager", "return default packageName: com.huawei.hwid");
        return PackageConstants.SERVICES_PACKAGE;
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        synchronized (f19621p) {
            try {
                refresh();
                PackageManagerHelper.PackageStates packageStates = this.f19626b.getPackageStates(this.f19627c);
                PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
                if (packageStates == packageStates2) {
                    m12671f();
                    return packageStates2;
                }
                if (PackageConstants.SERVICES_PACKAGE.equals(this.f19627c) && m12666d() == 1) {
                    return PackageManagerHelper.PackageStates.SPOOF;
                }
                return (packageStates != PackageManagerHelper.PackageStates.ENABLED || m12665c(this.f19627c, this.f19628d)) ? packageStates : packageStates2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PackageManagerHelper.PackageStates getHMSPackageStatesForMultiService() {
        synchronized (f19621p) {
            try {
                refreshForMultiService();
                PackageManagerHelper.PackageStates packageStates = this.f19626b.getPackageStates(this.f19630f);
                PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
                if (packageStates == packageStates2) {
                    m12669e();
                    return packageStates2;
                }
                if (PackageConstants.SERVICES_PACKAGE.equals(this.f19630f) && m12666d() == 1) {
                    return PackageManagerHelper.PackageStates.SPOOF;
                }
                return (packageStates != PackageManagerHelper.PackageStates.ENABLED || m12665c(this.f19630f, this.f19631g)) ? packageStates : packageStates2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getHmsMultiServiceVersion() {
        return this.f19626b.getPackageVersionCode(getHMSPackageNameForMultiService());
    }

    public int getHmsVersionCode() {
        return this.f19626b.getPackageVersionCode(getHMSPackageName());
    }

    public String getInnerServiceAction() {
        return PackageConstants.INTERNAL_SERVICES_ACTION;
    }

    public String getServiceAction() {
        return !TextUtils.isEmpty(this.f19632h) ? this.f19632h : "com.huawei.hms.core.aidlservice";
    }

    public boolean hmsVerHigherThan(int i) throws PackageManager.NameNotFoundException {
        if (this.f19629e >= i || !m12677l()) {
            return true;
        }
        int packageVersionCode = this.f19626b.getPackageVersionCode(getHMSPackageName());
        this.f19629e = packageVersionCode;
        return packageVersionCode >= i;
    }

    public boolean isApkNeedUpdate(int i) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.m12622i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", target version requirements: " + i);
        return hmsVersionCode < i;
    }

    public boolean isApkUpdateNecessary(int i) {
        if (isUpdateHmsForThirdPartyDevice()) {
            return true;
        }
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.m12622i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i);
        return m12677l() && hmsVersionCode < i;
    }

    public boolean isUpdateHmsForThirdPartyDevice() {
        return PackageConstants.SERVICES_PACKAGE.equals(this.f19630f) && AgHmsUpdateState.getInstance().isUpdateHms();
    }

    public boolean isUseOldCertificate() {
        return this.f19637m;
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.f19627c) || TextUtils.isEmpty(this.f19628d)) {
            m12675j();
        }
        m12663c(this.f19627c);
    }

    public void refreshForMultiService() {
        if (TextUtils.isEmpty(this.f19630f) || TextUtils.isEmpty(this.f19631g)) {
            m12676k();
        }
        m12663c(this.f19630f);
    }

    public void resetMultiServiceState() {
        m12669e();
    }

    public void setUseOldCertificate(boolean z) {
        this.f19637m = z;
    }

    /* renamed from: b */
    private boolean m12661b(String str) {
        return !PackageConstants.SERVICES_PACKAGE.equals(str) || this.f19638n == 3;
    }

    /* renamed from: a */
    private void m12656a(List<ResolveInfo> list) {
        if (list.size() <= 1) {
            return;
        }
        Collections.sort(list, new C2281a());
    }

    /* renamed from: b */
    private boolean m12662b(String str, String str2) {
        Map<String, String> map = f19624s;
        return map.containsKey(str) && map.get(str).equalsIgnoreCase(str2);
    }

    /* renamed from: c */
    private void m12663c(String str) {
        if (PackageConstants.SERVICES_PACKAGE.equals(str) && AgHmsUpdateState.getInstance().isUpdateHms() && this.f19626b.getPackageVersionCode(str) >= AgHmsUpdateState.getInstance().getTargetVersionCode()) {
            AgHmsUpdateState.getInstance().resetUpdateState();
            HMSLog.m12622i("HMSPackageManager", "refresh update state for HMS V3");
        }
    }

    /* renamed from: a */
    private Pair<String, String> m12650a(Bundle bundle, String str, String str2, String str3) {
        String str4;
        if (bundle == null) {
            HMSLog.m12620e("HMSPackageManager", "DSS check: " + str + " for metadata is null");
            return null;
        }
        this.f19638n = 2;
        if (m12657a(bundle, str, str2)) {
            HMSLog.m12622i("HMSPackageManager", "support DSS V3 check");
            str3 = str2;
            str4 = "hms_app_signer_v3";
        } else {
            str4 = "hms_app_signer";
        }
        if (!bundle.containsKey(str4)) {
            HMSLog.m12620e("HMSPackageManager", "skip package " + str + " for no " + str4);
            return null;
        }
        if (bundle.containsKey("hms_app_cert_chain")) {
            if (!m12658a(AbstractC1374Vq.m8589h(str, ContainerUtils.FIELD_DELIMITER, str3), bundle.getString(str4), bundle.getString("hms_app_cert_chain"))) {
                HMSLog.m12620e("HMSPackageManager", "checkSigner failed");
                return null;
            }
            if (str4.equals("hms_app_signer_v3")) {
                this.f19638n = 3;
            }
            return new Pair<>(str, str3);
        }
        HMSLog.m12620e("HMSPackageManager", "skip package " + str + " for no cert chain");
        return null;
    }

    /* renamed from: b */
    private void m12660b() {
        new Thread(new RunnableC2282b(), "Thread-asyncOnceCheckMDMState").start();
    }

    /* renamed from: d */
    private void m12668d(String str) {
        String strM12654a = m12654a(str);
        if (TextUtils.isEmpty(strM12654a)) {
            return;
        }
        this.f19633i = strM12654a.substring(9);
    }

    /* renamed from: e */
    private void m12669e() {
        synchronized (f19622q) {
            this.f19630f = null;
            this.f19631g = null;
            this.f19632h = null;
            this.f19633i = null;
            this.f19634j = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public int m12666d() {
        synchronized (f19623r) {
            try {
                HMSLog.m12622i("HMSPackageManager", "enter checkHmsIsSpoof");
                long packageFirstInstallTime = this.f19626b.getPackageFirstInstallTime(PackageConstants.SERVICES_PACKAGE);
                if (this.f19635k != 3 && this.f19636l == packageFirstInstallTime) {
                    HMSLog.m12622i("HMSPackageManager", "quit checkHmsIsSpoof cached state: " + m12652a(this.f19635k));
                    return this.f19635k;
                }
                this.f19635k = m12664c() ? 2 : 1;
                this.f19636l = this.f19626b.getPackageFirstInstallTime(PackageConstants.SERVICES_PACKAGE);
                HMSLog.m12622i("HMSPackageManager", "quit checkHmsIsSpoof state: " + m12652a(this.f19635k));
                return this.f19635k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    private boolean m12664c() {
        String hmsPath = ReadApkFileUtil.getHmsPath(this.f19625a);
        if (hmsPath == null) {
            HMSLog.m12622i("HMSPackageManager", "hmsPath is null!");
            return false;
        }
        if (!ReadApkFileUtil.isCertFound(hmsPath)) {
            HMSLog.m12622i("HMSPackageManager", "NO huawer.cer in HMS!");
            return false;
        }
        if (!ReadApkFileUtil.checkSignature()) {
            HMSLog.m12622i("HMSPackageManager", "checkSignature fail!");
            return false;
        }
        if (ReadApkFileUtil.verifyApkHash(hmsPath)) {
            return true;
        }
        HMSLog.m12622i("HMSPackageManager", "verifyApkHash fail!");
        return false;
    }

    /* renamed from: a */
    private Pair<String, String> m12651a(String str, String str2) {
        if (m12662b(str, str2)) {
            return new Pair<>(str, str2);
        }
        HMSLog.m12623w("HMSPackageManager", "check sign fail: " + str + "_" + str2);
        return null;
    }

    /* renamed from: a */
    private boolean m12657a(Bundle bundle, String str, String str2) {
        return bundle.containsKey("hms_app_signer_v3") && !m12662b(str, str2) && Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: a */
    private String m12653a(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            HMSLog.m12620e("HMSPackageManager", "no " + str + " in metaData");
            return null;
        }
        return bundle.getString(str);
    }

    /* renamed from: a */
    private String m12654a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("priority=");
        if (iIndexOf == -1) {
            HMSLog.m12620e("HMSPackageManager", "get indexOfIdentifier -1");
            return null;
        }
        int iIndexOf2 = str.indexOf(StringUtils.COMMA, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        return str.substring(iIndexOf, iIndexOf2);
    }

    /* renamed from: a */
    private boolean m12658a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            List<X509Certificate> listM11668b = C2077a.m11668b(str3);
            if (listM11668b.size() == 0) {
                HMSLog.m12620e("HMSPackageManager", "certChain is empty");
                return false;
            }
            if (!C2077a.m11665a(C2077a.m11658a(this.f19625a), listM11668b)) {
                HMSLog.m12620e("HMSPackageManager", "failed to verify cert chain");
                return false;
            }
            X509Certificate x509Certificate = listM11668b.get(listM11668b.size() - 1);
            if (!C2077a.m11663a(x509Certificate, "Huawei CBG HMS")) {
                HMSLog.m12620e("HMSPackageManager", "CN is invalid");
                return false;
            }
            if (!C2077a.m11670b(x509Certificate, "Huawei CBG Cloud Security Signer")) {
                HMSLog.m12620e("HMSPackageManager", "OU is invalid");
                return false;
            }
            if (C2077a.m11664a(x509Certificate, str, str2)) {
                return true;
            }
            HMSLog.m12620e("HMSPackageManager", "signature is invalid: " + str);
            return false;
        }
        HMSLog.m12620e("HMSPackageManager", "args is invalid");
        return false;
    }

    /* renamed from: a */
    private static String m12652a(int i) {
        if (i == 1) {
            return "SPOOFED";
        }
        if (i == 2) {
            return "SUCCESS";
        }
        if (i == 3) {
            return "UNCHECKED";
        }
        HMSLog.m12620e("HMSPackageManager", "invalid checkMDM state: " + i);
        return "";
    }
}
