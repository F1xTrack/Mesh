package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import defpackage.AbstractC8235ym;
import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p1 {
    final f0 a;
    final z2 b;
    final Context c;

    public static final class a {
        public final int a;
        public final String b;
        public final String c;

        public a(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }
    }

    public p1(f0 f0Var, z2 z2Var, Context context) {
        this.a = f0Var;
        this.b = z2Var;
        this.c = context.getApplicationContext();
    }

    public static a a(int i, String str, String str2) {
        try {
            y2.a("PreInstallHandler: converting raw data to json");
            return new a(i, new JSONObject(str).toString(), str2);
        } catch (Throwable th) {
            y2.a("PreInstallHandler error: exception when converting raw data to json", th);
            try {
                y2.a("PreInstallHandler: converting raw data to json with pid");
                return new a(i, new JSONObject().put("pid", str).toString(), str2);
            } catch (Throwable th2) {
                y2.b("PreInstallHandler error: exception when converting raw data to json with pid", th2);
                y2.a("PreInstallHandler: nothing has been found for source: " + i);
                return null;
            }
        }
    }

    public a b() {
        String strV = AbstractC8235ym.v("ro.mtpi.", this.b.g());
        String strA = d2.a(strV);
        if (TextUtils.isEmpty(strA)) {
            y2.a("PreInstallHandler: empty data for source: 3");
            return null;
        }
        y2.a("PreInstallHandler: raw data in SystemProperties has been found: " + strA);
        return a(3, strA, strV);
    }

    public void c() {
        String strR = this.b.r();
        if (TextUtils.isEmpty(strR)) {
            return;
        }
        q1 q1VarA = q1.a(this.c);
        if (q1VarA.q()) {
            return;
        }
        y2.a("PreInstallHandler: checking preinstall");
        try {
            String strA = a(this.c.getPackageManager().getResourcesForApplication(strR), this.c.getPackageName(), strR);
            q1VarA.u();
            if (TextUtils.isEmpty(strA)) {
                y2.a("PreInstallHandler: referrer is empty");
                return;
            }
            y2.a("PreInstallHandler: referrer " + strA);
            this.a.a(strA, u.b(this.c), (Runnable) null);
            q1.a(this.c).v();
        } catch (Throwable unused) {
            y2.a("PreInstallHandler: unable to locate vendor app " + strR);
        }
    }

    public String a(String str) {
        BufferedReader bufferedReader;
        String str2;
        int length;
        try {
            y2.a("PreInstallHandler: searching string in file " + str);
            str2 = this.c.getPackageName() + ContainerUtils.KEY_VALUE_DELIMITER;
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
                    y2.a("PreInstallHandler: processing string " + line);
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
                    y2.b("PreInstallHandler error: exception while retrieving data in file" + str, th);
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

    public a a(int i) {
        String string;
        String str;
        StringBuilder sb;
        if (i == 1) {
            str = "ro.mytracker.preinstall.path";
        } else {
            if (i != 2) {
                string = "PreInstallHandler: wrong property property key";
                y2.a(string);
                return null;
            }
            str = "ro.appsflyer.preinstall.path";
        }
        String strA = d2.a(str);
        if (TextUtils.isEmpty(strA)) {
            sb = new StringBuilder("PreInstallHandler: empty path for source: ");
        } else {
            String strA2 = a(strA);
            if (!TextUtils.isEmpty(strA2)) {
                y2.a("PreInstallHandler: raw data for source has been found: " + strA2);
                return a(i, strA2, strA);
            }
            sb = new StringBuilder("PreInstallHandler: empty data for source: ");
        }
        sb.append(i);
        string = sb.toString();
        y2.a(string);
        return null;
    }

    public a a() {
        if (!this.b.v()) {
            y2.a("PreInstallHandler: tracking preinstall is disabled");
            return null;
        }
        a aVarB = b();
        if (aVarB != null) {
            return aVarB;
        }
        a aVarA = a(1);
        if (aVarA != null) {
            return aVarA;
        }
        if (this.b.w()) {
            return a(2);
        }
        return null;
    }

    public static String a(Resources resources, String str, String str2) {
        int identifier = resources.getIdentifier(str + "_mytracker", "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static p1 a(f0 f0Var, z2 z2Var, Context context) {
        return new p1(f0Var, z2Var, context);
    }
}
