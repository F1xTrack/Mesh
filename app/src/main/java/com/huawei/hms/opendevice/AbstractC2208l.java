package com.huawei.hms.opendevice;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC11284uO1;
import p000.AbstractC7261zO;
import p000.C11165tT0;
import p000.L12;
import p000.RM1;
import ru.mes.dnevnik.R;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: com.huawei.hms.opendevice.l */
/* loaded from: classes.dex */
public abstract class AbstractC2208l {

    /* renamed from: a */
    private static final String f19345a = "l";

    /* renamed from: b */
    private static Map<String, String> f19346b = new HashMap();

    /* renamed from: c */
    private static final Object f19347c = new Object();

    /* renamed from: a */
    private static byte[] m12373a(String str, String str2, String str3, String str4) {
        return Build.VERSION.SDK_INT >= 26 ? AbstractC11284uO1.m25183a(str, str2, str3, L12.m4864b(str4), 32, true) : AbstractC11284uO1.m25183a(str, str2, str3, L12.m4864b(str4), 32, false);
    }

    /* renamed from: b */
    private static byte[] m12377b() {
        return m12373a(m12380d(), m12382e(), m12378c(), m12385g());
    }

    /* renamed from: c */
    public static void m12379c(Context context) {
        synchronized (f19347c) {
            try {
                m12381d(context.getApplicationContext());
                if (m12387i()) {
                    HMSLog.m12622i(f19345a, "The local secret is already in separate file mode.");
                    return;
                }
                File file = new File(AbstractC2201e.m12343c(context.getApplicationContext()) + "/shared_prefs/LocalAvengers.xml");
                if (file.exists()) {
                    if (file.exists()) {
                        file.delete();
                    }
                    HMSLog.m12622i(f19345a, "destroy C, delete file LocalAvengers.xml.");
                }
                byte[] bArrM26397b = AbstractC7261zO.m26397b(32);
                byte[] bArrM26397b2 = AbstractC7261zO.m26397b(32);
                byte[] bArrM26397b3 = AbstractC7261zO.m26397b(32);
                byte[] bArrM26397b4 = AbstractC7261zO.m26397b(32);
                String strM12337a = AbstractC2200d.m12337a(bArrM26397b);
                String strM12337a2 = AbstractC2200d.m12337a(bArrM26397b2);
                String strM12337a3 = AbstractC2200d.m12337a(bArrM26397b3);
                String strM12337a4 = AbstractC2200d.m12337a(bArrM26397b4);
                m12371a(strM12337a, strM12337a2, strM12337a3, strM12337a4, RM1.m7005c(AbstractC2200d.m12337a(AbstractC7261zO.m26397b(32)), m12373a(strM12337a, strM12337a2, strM12337a3, strM12337a4)), context);
                HMSLog.m12622i(f19345a, "generate D.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    private static void m12381d(Context context) throws Throwable {
        if (m12387i()) {
            HMSLog.m12622i(f19345a, "secretKeyCache not empty.");
            return;
        }
        f19346b.clear();
        String strM12343c = AbstractC2201e.m12343c(context);
        if (TextUtils.isEmpty(strM12343c)) {
            return;
        }
        String strM12388a = AbstractC2209m.m12388a(strM12343c + "/files/math/m");
        String strM12388a2 = AbstractC2209m.m12388a(strM12343c + "/files/panda/p");
        String strM12388a3 = AbstractC2209m.m12388a(strM12343c + "/files/panda/d");
        String strM12388a4 = AbstractC2209m.m12388a(strM12343c + "/files/math/t");
        String strM12388a5 = AbstractC2209m.m12388a(strM12343c + "/files/s");
        if (C2210n.m12390a(strM12388a, strM12388a2, strM12388a3, strM12388a4, strM12388a5)) {
            f19346b.put("m", strM12388a);
            f19346b.put("p", strM12388a2);
            f19346b.put(UcumUtils.UCUM_DAYS, strM12388a3);
            f19346b.put("t", strM12388a4);
            f19346b.put(UcumUtils.UCUM_SECONDS, strM12388a5);
        }
    }

    /* renamed from: e */
    private static synchronized String m12383e(Context context) {
        String strM7003a = RM1.m7003a(m12384f(), m12377b());
        if (C2210n.m12390a(strM7003a)) {
            HMSLog.m12622i(f19345a, "keyS has been upgraded, no require operate again.");
            return strM7003a;
        }
        String strM7003a2 = RM1.m7003a(m12384f(), (byte[]) m12386h().f43087a.clone());
        if (C2210n.m12390a(strM7003a2)) {
            HMSLog.m12622i(f19345a, "keyS is encrypt by RootKeyUtil, upgrade encrypt mode.");
            m12369a(RM1.m7005c(strM7003a2, m12377b()), context);
            return strM7003a2;
        }
        String strM7003a3 = RM1.m7003a(m12384f(), AbstractC11284uO1.m25183a(m12380d(), m12382e(), m12378c(), L12.m4864b(m12385g()), 32, false));
        if (!C2210n.m12390a(strM7003a3)) {
            HMSLog.m12620e(f19345a, "all mode unable to decrypt root key.");
            return "";
        }
        HMSLog.m12622i(f19345a, "keyS is encrypt by ExportRootKey with sha1, upgrade encrypt mode to sha256.");
        m12369a(RM1.m7005c(strM7003a3, m12377b()), context);
        return strM7003a3;
    }

    /* renamed from: f */
    private static String m12384f() {
        return m12368a(UcumUtils.UCUM_SECONDS);
    }

    /* renamed from: g */
    private static String m12385g() {
        return m12368a("t");
    }

    /* renamed from: h */
    private static C11165tT0 m12386h() throws UnsupportedEncodingException {
        String strM12380d = m12380d();
        String strM12382e = m12382e();
        String strM12378c = m12378c();
        String strM12385g = m12385g();
        C11165tT0 c11165tT0 = new C11165tT0();
        c11165tT0.f43087a = null;
        byte[] bArrM4864b = L12.m4864b(strM12385g);
        if (Build.VERSION.SDK_INT < 26) {
            c11165tT0.f43087a = AbstractC11284uO1.m25183a(strM12380d, strM12382e, strM12378c, bArrM4864b, 16, false);
        } else {
            c11165tT0.f43087a = AbstractC11284uO1.m25183a(strM12380d, strM12382e, strM12378c, bArrM4864b, 16, true);
        }
        return c11165tT0;
    }

    /* renamed from: i */
    private static boolean m12387i() {
        return !TextUtils.isEmpty(m12384f());
    }

    /* renamed from: b */
    public static String m12376b(Context context) throws UnsupportedEncodingException {
        if (!m12387i()) {
            HMSLog.m12622i(f19345a, "work key is empty, execute init.");
            m12379c(context);
        }
        String strM7003a = RM1.m7003a(m12384f(), m12377b());
        return C2210n.m12390a(strM7003a) ? strM7003a : m12383e(context);
    }

    /* renamed from: a */
    public static byte[] m12372a(Context context) {
        byte[] bArrM12338a = AbstractC2200d.m12338a(context.getString(R.string.push_cat_head));
        byte[] bArrM12338a2 = AbstractC2200d.m12338a(context.getString(R.string.push_cat_body));
        return m12374a(m12375a(m12375a(bArrM12338a, bArrM12338a2), AbstractC2200d.m12338a(m12367a())));
    }

    /* renamed from: a */
    private static String m12367a() {
        return "2A57086C86EF54970C1E6EB37BFC72B1";
    }

    /* renamed from: a */
    private static byte[] m12375a(byte[] bArr, byte[] bArr2) {
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

    /* renamed from: a */
    private static byte[] m12374a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] >> 2);
            }
            return bArr;
        }
        return new byte[0];
    }

    /* renamed from: d */
    private static String m12380d() {
        return m12368a("m");
    }

    /* renamed from: a */
    private static void m12371a(String str, String str2, String str3, String str4, String str5, Context context) throws Throwable {
        String strM12343c = AbstractC2201e.m12343c(context.getApplicationContext());
        if (TextUtils.isEmpty(strM12343c)) {
            return;
        }
        try {
            m12370a("m", str, strM12343c + "/files/math/m");
            m12370a("p", str2, strM12343c + "/files/panda/p");
            m12370a(UcumUtils.UCUM_DAYS, str3, strM12343c + "/files/panda/d");
            m12370a("t", str4, strM12343c + "/files/math/t");
            m12370a(UcumUtils.UCUM_SECONDS, str5, strM12343c + "/files/s");
        } catch (IOException unused) {
            HMSLog.m12620e(f19345a, "save key IOException.");
        }
    }

    /* renamed from: c */
    private static String m12378c() {
        return m12368a(UcumUtils.UCUM_DAYS);
    }

    /* renamed from: e */
    private static String m12382e() {
        return m12368a("p");
    }

    /* renamed from: a */
    private static void m12369a(String str, Context context) throws Throwable {
        String strM12343c = AbstractC2201e.m12343c(context.getApplicationContext());
        if (TextUtils.isEmpty(strM12343c)) {
            return;
        }
        try {
            m12370a(UcumUtils.UCUM_SECONDS, str, strM12343c + "/files/s");
        } catch (IOException unused) {
            HMSLog.m12620e(f19345a, "save keyS IOException.");
        }
    }

    /* renamed from: a */
    private static void m12370a(String str, String str2, String str3) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        BufferedWriter bufferedWriter;
        HMSLog.m12622i(f19345a, "save local secret key.");
        BufferedWriter bufferedWriter2 = null;
        try {
            File file = new File(str3);
            AbstractC2209m.m12389a(file);
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
            f19346b.put(str, str2);
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

    /* renamed from: a */
    private static String m12368a(String str) {
        String str2 = f19346b.get(str);
        return TextUtils.isEmpty(str2) ? "" : str2;
    }
}
