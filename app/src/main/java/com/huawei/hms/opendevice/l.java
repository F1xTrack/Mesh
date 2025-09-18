package com.huawei.hms.opendevice;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import defpackage.AbstractC7404uO1;
import defpackage.AbstractC8353zO;
import defpackage.C7227tT0;
import defpackage.L12;
import defpackage.RM1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import ru.mes.dnevnik.R;
import ru.ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes.dex */
public abstract class l {
    private static final String a = "l";
    private static Map<String, String> b = new HashMap();
    private static final Object c = new Object();

    private static byte[] a(String str, String str2, String str3, String str4) {
        return Build.VERSION.SDK_INT >= 26 ? AbstractC7404uO1.a(str, str2, str3, L12.b(str4), 32, true) : AbstractC7404uO1.a(str, str2, str3, L12.b(str4), 32, false);
    }

    private static byte[] b() {
        return a(d(), e(), c(), g());
    }

    public static void c(Context context) {
        synchronized (c) {
            try {
                d(context.getApplicationContext());
                if (i()) {
                    HMSLog.i(a, "The local secret is already in separate file mode.");
                    return;
                }
                File file = new File(e.c(context.getApplicationContext()) + "/shared_prefs/LocalAvengers.xml");
                if (file.exists()) {
                    if (file.exists()) {
                        file.delete();
                    }
                    HMSLog.i(a, "destroy C, delete file LocalAvengers.xml.");
                }
                byte[] bArrB = AbstractC8353zO.b(32);
                byte[] bArrB2 = AbstractC8353zO.b(32);
                byte[] bArrB3 = AbstractC8353zO.b(32);
                byte[] bArrB4 = AbstractC8353zO.b(32);
                String strA = d.a(bArrB);
                String strA2 = d.a(bArrB2);
                String strA3 = d.a(bArrB3);
                String strA4 = d.a(bArrB4);
                a(strA, strA2, strA3, strA4, RM1.c(d.a(AbstractC8353zO.b(32)), a(strA, strA2, strA3, strA4)), context);
                HMSLog.i(a, "generate D.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void d(Context context) throws Throwable {
        if (i()) {
            HMSLog.i(a, "secretKeyCache not empty.");
            return;
        }
        b.clear();
        String strC = e.c(context);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        String strA = m.a(strC + "/files/math/m");
        String strA2 = m.a(strC + "/files/panda/p");
        String strA3 = m.a(strC + "/files/panda/d");
        String strA4 = m.a(strC + "/files/math/t");
        String strA5 = m.a(strC + "/files/s");
        if (n.a(strA, strA2, strA3, strA4, strA5)) {
            b.put("m", strA);
            b.put("p", strA2);
            b.put(UcumUtils.UCUM_DAYS, strA3);
            b.put("t", strA4);
            b.put(UcumUtils.UCUM_SECONDS, strA5);
        }
    }

    private static synchronized String e(Context context) {
        String strA = RM1.a(f(), b());
        if (n.a(strA)) {
            HMSLog.i(a, "keyS has been upgraded, no require operate again.");
            return strA;
        }
        String strA2 = RM1.a(f(), (byte[]) h().a.clone());
        if (n.a(strA2)) {
            HMSLog.i(a, "keyS is encrypt by RootKeyUtil, upgrade encrypt mode.");
            a(RM1.c(strA2, b()), context);
            return strA2;
        }
        String strA3 = RM1.a(f(), AbstractC7404uO1.a(d(), e(), c(), L12.b(g()), 32, false));
        if (!n.a(strA3)) {
            HMSLog.e(a, "all mode unable to decrypt root key.");
            return "";
        }
        HMSLog.i(a, "keyS is encrypt by ExportRootKey with sha1, upgrade encrypt mode to sha256.");
        a(RM1.c(strA3, b()), context);
        return strA3;
    }

    private static String f() {
        return a(UcumUtils.UCUM_SECONDS);
    }

    private static String g() {
        return a("t");
    }

    private static C7227tT0 h() throws UnsupportedEncodingException {
        String strD = d();
        String strE = e();
        String strC = c();
        String strG = g();
        C7227tT0 c7227tT0 = new C7227tT0();
        c7227tT0.a = null;
        byte[] bArrB = L12.b(strG);
        if (Build.VERSION.SDK_INT < 26) {
            c7227tT0.a = AbstractC7404uO1.a(strD, strE, strC, bArrB, 16, false);
        } else {
            c7227tT0.a = AbstractC7404uO1.a(strD, strE, strC, bArrB, 16, true);
        }
        return c7227tT0;
    }

    private static boolean i() {
        return !TextUtils.isEmpty(f());
    }

    public static String b(Context context) throws UnsupportedEncodingException {
        if (!i()) {
            HMSLog.i(a, "work key is empty, execute init.");
            c(context);
        }
        String strA = RM1.a(f(), b());
        return n.a(strA) ? strA : e(context);
    }

    public static byte[] a(Context context) {
        byte[] bArrA = d.a(context.getString(R.string.push_cat_head));
        byte[] bArrA2 = d.a(context.getString(R.string.push_cat_body));
        return a(a(a(bArrA, bArrA2), d.a(a())));
    }

    private static String a() {
        return "2A57086C86EF54970C1E6EB37BFC72B1";
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length != 0 && bArr2.length != 0) {
            int length = bArr.length;
            if (length != bArr2.length) {
                return new byte[0];
            }
            byte[] bArr3 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
            return bArr3;
        }
        return new byte[0];
    }

    private static byte[] a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] >> 2);
            }
            return bArr;
        }
        return new byte[0];
    }

    private static String d() {
        return a("m");
    }

    private static void a(String str, String str2, String str3, String str4, String str5, Context context) throws Throwable {
        String strC = e.c(context.getApplicationContext());
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        try {
            a("m", str, strC + "/files/math/m");
            a("p", str2, strC + "/files/panda/p");
            a(UcumUtils.UCUM_DAYS, str3, strC + "/files/panda/d");
            a("t", str4, strC + "/files/math/t");
            a(UcumUtils.UCUM_SECONDS, str5, strC + "/files/s");
        } catch (IOException unused) {
            HMSLog.e(a, "save key IOException.");
        }
    }

    private static String c() {
        return a(UcumUtils.UCUM_DAYS);
    }

    private static String e() {
        return a("p");
    }

    private static void a(String str, Context context) throws Throwable {
        String strC = e.c(context.getApplicationContext());
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        try {
            a(UcumUtils.UCUM_SECONDS, str, strC + "/files/s");
        } catch (IOException unused) {
            HMSLog.e(a, "save keyS IOException.");
        }
    }

    private static void a(String str, String str2, String str3) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        BufferedWriter bufferedWriter;
        HMSLog.i(a, "save local secret key.");
        BufferedWriter bufferedWriter2 = null;
        try {
            File file = new File(str3);
            m.a(file);
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            try {
                bufferedWriter = new BufferedWriter(outputStreamWriter);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStreamWriter = null;
        }
        try {
            bufferedWriter.write(str2);
            bufferedWriter.flush();
            b.put(str, str2);
            IOUtils.closeQuietly((Writer) outputStreamWriter);
            IOUtils.closeQuietly((Writer) bufferedWriter);
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            IOUtils.closeQuietly((Writer) outputStreamWriter);
            IOUtils.closeQuietly((Writer) bufferedWriter2);
            throw th;
        }
    }

    private static String a(String str) {
        String str2 = b.get(str);
        return TextUtils.isEmpty(str2) ? "" : str2;
    }
}
