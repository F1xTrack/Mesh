package com.huawei.hms.hatool;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import p000.AbstractC7222ym;
import p000.AbstractC7261zO;
import p000.L12;
import p000.YJ1;

/* renamed from: com.huawei.hms.hatool.x */
/* loaded from: classes.dex */
public class C2190x {

    /* renamed from: a */
    private String f19316a = AbstractC2177q0.m12197i().getFilesDir().getPath();

    /* renamed from: a */
    private String m12288a(String str) {
        return this.f19316a + "/hms/component/".replace("component", str);
    }

    /* renamed from: b */
    private String m12292b(String str) throws Throwable {
        File file = new File(m12288a(str), AbstractC7222ym.m26245v("hianalytics_", str));
        if (m12290a(file)) {
            return C2160k1.m12086a(file);
        }
        String strM26398c = AbstractC7261zO.m26398c(128);
        C2160k1.m12089a(file, strM26398c);
        return strM26398c;
    }

    /* renamed from: c */
    public static boolean m12295c() {
        return m12294b(new File(AbstractC2177q0.m12197i().getFilesDir().getPath() + "/hms"));
    }

    /* renamed from: d */
    private String m12296d() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }

    /* renamed from: a */
    private void m12289a(String str, String str2) throws Throwable {
        File file = new File(m12288a(str));
        File file2 = new File(m12288a(str), AbstractC7222ym.m26245v("hianalytics_", str));
        if (!file.exists() && file.mkdirs()) {
            C2186v.m12271c("hmsSdk", "file directory is mkdirs");
        }
        if (m12290a(file2)) {
            C2160k1.m12089a(file2, str2);
        } else {
            C2186v.m12276f("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    /* renamed from: b */
    private boolean m12293b() {
        long jM11954a = C2137d.m11954a(AbstractC2177q0.m12197i(), "Privacy_MY", "assemblyFlash", -1L);
        if (-1 != jM11954a) {
            return System.currentTimeMillis() - jM11954a > 31536000000L;
        }
        C2186v.m12271c("hmsSdk", "First init components");
        return true;
    }

    /* renamed from: a */
    private boolean m12290a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            C2186v.m12276f("hmsSdk", "create new file error!");
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m12294b(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    C2186v.m12271c("hmsSdk", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                m12294b(file2);
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    private char[] m12291a(String str, String str2, String str3, String str4) throws UnsupportedEncodingException {
        byte[] bArrM4864b = L12.m4864b(str);
        byte[] bArrM4864b2 = L12.m4864b(str2);
        byte[] bArrM4864b3 = L12.m4864b(str3);
        byte[] bArrM4864b4 = L12.m4864b(str4);
        int length = bArrM4864b.length;
        if (length > bArrM4864b2.length) {
            length = bArrM4864b2.length;
        }
        if (length > bArrM4864b3.length) {
            length = bArrM4864b3.length;
        }
        if (length > bArrM4864b4.length) {
            length = bArrM4864b4.length;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (((bArrM4864b[i] ^ bArrM4864b2[i]) ^ bArrM4864b3[i]) ^ bArrM4864b4[i]);
        }
        return cArr;
    }

    /* renamed from: a */
    public String m12297a() throws Throwable {
        String strM12292b;
        String strM12292b2;
        String strM12292b3;
        String strM12292b4;
        String strM12296d = m12296d();
        if (m12293b()) {
            C2186v.m12271c("hmsSdk", "refresh components");
            strM12292b = AbstractC7261zO.m26398c(128);
            m12289a("aprpap", strM12292b);
            strM12292b2 = AbstractC7261zO.m26398c(128);
            m12289a("febdoc", strM12292b2);
            strM12292b3 = AbstractC7261zO.m26398c(128);
            m12289a("marfil", strM12292b3);
            strM12292b4 = AbstractC7261zO.m26398c(128);
            m12289a("maywnj", strM12292b4);
            C2137d.m11959b(AbstractC2177q0.m12197i(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            strM12292b = m12292b("aprpap");
            strM12292b2 = m12292b("febdoc");
            strM12292b3 = m12292b("marfil");
            strM12292b4 = m12292b("maywnj");
        }
        return L12.m4863a(YJ1.m9255a(m12291a(strM12292b, strM12292b2, strM12292b3, strM12296d), L12.m4864b(strM12292b4), 16, false));
    }
}
