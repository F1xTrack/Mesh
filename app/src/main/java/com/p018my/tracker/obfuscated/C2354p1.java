package com.p018my.tracker.obfuscated;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;
import p000.AbstractC7222ym;

/* renamed from: com.my.tracker.obfuscated.p1 */
/* loaded from: classes2.dex */
public final class C2354p1 {

    /* renamed from: a */
    final C2313f0 f20088a;

    /* renamed from: b */
    final C2395z2 f20089b;

    /* renamed from: c */
    final Context f20090c;

    /* renamed from: com.my.tracker.obfuscated.p1$a */
    public static final class a {

        /* renamed from: a */
        public final int f20091a;

        /* renamed from: b */
        public final String f20092b;

        /* renamed from: c */
        public final String f20093c;

        public a(int i, String str, String str2) {
            this.f20091a = i;
            this.f20092b = str;
            this.f20093c = str2;
        }
    }

    public C2354p1(C2313f0 c2313f0, C2395z2 c2395z2, Context context) {
        this.f20088a = c2313f0;
        this.f20089b = c2395z2;
        this.f20090c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static a m13382a(int i, String str, String str2) {
        try {
            AbstractC2391y2.m13568a("PreInstallHandler: converting raw data to json");
            return new a(i, new JSONObject(str).toString(), str2);
        } catch (Throwable th) {
            AbstractC2391y2.m13569a("PreInstallHandler error: exception when converting raw data to json", th);
            try {
                AbstractC2391y2.m13568a("PreInstallHandler: converting raw data to json with pid");
                return new a(i, new JSONObject().put("pid", str).toString(), str2);
            } catch (Throwable th2) {
                AbstractC2391y2.m13573b("PreInstallHandler error: exception when converting raw data to json with pid", th2);
                AbstractC2391y2.m13568a("PreInstallHandler: nothing has been found for source: " + i);
                return null;
            }
        }
    }

    /* renamed from: b */
    public a m13388b() {
        String strM26245v = AbstractC7222ym.m26245v("ro.mtpi.", this.f20089b.m13607g());
        String strM12869a = AbstractC2307d2.m12869a(strM26245v);
        if (TextUtils.isEmpty(strM12869a)) {
            AbstractC2391y2.m13568a("PreInstallHandler: empty data for source: 3");
            return null;
        }
        AbstractC2391y2.m13568a("PreInstallHandler: raw data in SystemProperties has been found: " + strM12869a);
        return m13382a(3, strM12869a, strM26245v);
    }

    /* renamed from: c */
    public void m13389c() {
        String strM13618r = this.f20089b.m13618r();
        if (TextUtils.isEmpty(strM13618r)) {
            return;
        }
        C2358q1 c2358q1M13407a = C2358q1.m13407a(this.f20090c);
        if (c2358q1M13407a.m13444q()) {
            return;
        }
        AbstractC2391y2.m13568a("PreInstallHandler: checking preinstall");
        try {
            String strM13384a = m13384a(this.f20090c.getPackageManager().getResourcesForApplication(strM13618r), this.f20090c.getPackageName(), strM13618r);
            c2358q1M13407a.m13448u();
            if (TextUtils.isEmpty(strM13384a)) {
                AbstractC2391y2.m13568a("PreInstallHandler: referrer is empty");
                return;
            }
            AbstractC2391y2.m13568a("PreInstallHandler: referrer " + strM13384a);
            this.f20088a.m13064a(strM13384a, AbstractC2372u.m13513b(this.f20090c), (Runnable) null);
            C2358q1.m13407a(this.f20090c).m13449v();
        } catch (Throwable unused) {
            AbstractC2391y2.m13568a("PreInstallHandler: unable to locate vendor app " + strM13618r);
        }
    }

    /* renamed from: a */
    public String m13387a(String str) {
        BufferedReader bufferedReader;
        String str2;
        int length;
        try {
            AbstractC2391y2.m13568a("PreInstallHandler: searching string in file " + str);
            str2 = this.f20090c.getPackageName() + ContainerUtils.KEY_VALUE_DELIMITER;
            length = str2.length();
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    AbstractC2391y2.m13568a("PreInstallHandler: processing string " + line);
                    if (line.startsWith(str2) && line.length() > length) {
                        String strSubstring = line.substring(length);
                        if (!TextUtils.isEmpty(strSubstring)) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable unused) {
                            }
                            return strSubstring;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    AbstractC2391y2.m13573b("PreInstallHandler error: exception while retrieving data in file" + str, th);
                    if (bufferedReader != null) {
                        bufferedReader.close();
                        break;
                    }
                    return null;
                } catch (Throwable th3) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    throw th3;
                }
            }
            try {
                bufferedReader.close();
                break;
            } catch (Throwable unused3) {
            }
        }
    }

    /* renamed from: a */
    public a m13386a(int i) {
        String string;
        String str;
        StringBuilder sb;
        if (i == 1) {
            str = "ro.mytracker.preinstall.path";
        } else {
            if (i != 2) {
                string = "PreInstallHandler: wrong property property key";
                AbstractC2391y2.m13568a(string);
                return null;
            }
            str = "ro.appsflyer.preinstall.path";
        }
        String strM12869a = AbstractC2307d2.m12869a(str);
        if (TextUtils.isEmpty(strM12869a)) {
            sb = new StringBuilder("PreInstallHandler: empty path for source: ");
        } else {
            String strM13387a = m13387a(strM12869a);
            if (!TextUtils.isEmpty(strM13387a)) {
                AbstractC2391y2.m13568a("PreInstallHandler: raw data for source has been found: " + strM13387a);
                return m13382a(i, strM13387a, strM12869a);
            }
            sb = new StringBuilder("PreInstallHandler: empty data for source: ");
        }
        sb.append(i);
        string = sb.toString();
        AbstractC2391y2.m13568a(string);
        return null;
    }

    /* renamed from: a */
    public a m13385a() {
        if (!this.f20089b.m13622v()) {
            AbstractC2391y2.m13568a("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        a aVarM13388b = m13388b();
        if (aVarM13388b != null) {
            return aVarM13388b;
        }
        a aVarM13386a = m13386a(1);
        if (aVarM13386a != null) {
            return aVarM13386a;
        }
        if (this.f20089b.m13623w()) {
            return m13386a(2);
        }
        return null;
    }

    /* renamed from: a */
    public static String m13384a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    /* renamed from: a */
    public static C2354p1 m13383a(C2313f0 c2313f0, C2395z2 c2395z2, Context context) {
        return new C2354p1(c2313f0, c2395z2, context);
    }
}
