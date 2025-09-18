package p000;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: eu */
/* loaded from: classes2.dex */
public abstract class AbstractC4019eu {

    /* renamed from: a */
    public static final String f26935a = System.getProperty("line.separator");

    /* renamed from: a */
    public static void m18067a(String str, String str2, ArrayList arrayList) {
        for (File file : new File(str).listFiles()) {
            String name = file.getName();
            String absolutePath = file.getAbsolutePath();
            String strM8593l = AbstractC1374Vq.m8593l(new StringBuilder(), str2.isEmpty() ? "" : str2.concat("/"), name);
            if (!strM8593l.startsWith("__MACOSX/") && !strM8593l.equals(".DS_Store") && !strM8593l.endsWith("/.DS_Store") && !strM8593l.equals(".codepushrelease") && !strM8593l.endsWith("/.codepushrelease")) {
                if (file.isDirectory()) {
                    m18067a(absolutePath, strM8593l, arrayList);
                } else {
                    try {
                        arrayList.add(strM8593l + StringUtils.PROCESS_POSTFIX_DELIMITER + m18068b(new FileInputStream(file)));
                    } catch (FileNotFoundException e) {
                        throw new C3894cu("Unable to compute hash of update contents.", e);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r6.printStackTrace();
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m18068b(java.io.InputStream r6) throws java.lang.Throwable {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "SHA-256"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L45
            java.security.DigestInputStream r3 = new java.security.DigestInputStream     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L45
            r3.<init>(r6, r2)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L45
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c java.security.NoSuchAlgorithmException -> L3f
        L11:
            int r4 = r3.read(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3c java.security.NoSuchAlgorithmException -> L3f
            r5 = -1
            if (r4 == r5) goto L19
            goto L11
        L19:
            r3.close()     // Catch: java.io.IOException -> L20
            r6.close()     // Catch: java.io.IOException -> L20
            goto L24
        L20:
            r6 = move-exception
            r6.printStackTrace()
        L24:
            byte[] r6 = r2.digest()
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0, r6)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r0 = 0
            r6[r0] = r1
            java.lang.String r0 = "%064x"
            java.lang.String r6 = java.lang.String.format(r0, r6)
            return r6
        L39:
            r0 = move-exception
            r1 = r3
            goto L4e
        L3c:
            r0 = move-exception
        L3d:
            r1 = r3
            goto L46
        L3f:
            r0 = move-exception
            goto L3d
        L41:
            r0 = move-exception
            goto L4e
        L43:
            r0 = move-exception
            goto L46
        L45:
            r0 = move-exception
        L46:
            cu r2 = new cu     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "Unable to compute hash of update contents."
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L41
            throw r2     // Catch: java.lang.Throwable -> L41
        L4e:
            if (r1 == 0) goto L56
            r1.close()     // Catch: java.io.IOException -> L54
            goto L56
        L54:
            r6 = move-exception
            goto L5a
        L56:
            r6.close()     // Catch: java.io.IOException -> L54
            goto L5d
        L5a:
            r6.printStackTrace()
        L5d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC4019eu.m18068b(java.io.InputStream):java.lang.String");
    }

    /* renamed from: c */
    public static String m18069c(String str, String str2) {
        for (File file : new File(str).listFiles()) {
            String strM10704a = AbstractC8985cT1.m10704a(str, file.getName());
            if (file.isDirectory()) {
                String strM18069c = m18069c(strM10704a, str2);
                if (strM18069c != null) {
                    return AbstractC8985cT1.m10704a(file.getName(), strM18069c);
                }
            } else {
                String name = file.getName();
                if (name.equals(str2)) {
                    return name;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static void m18070d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        m18067a(str, "", arrayList);
        Collections.sort(arrayList);
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        if (!str2.equals(m18068b(new ByteArrayInputStream(jSONArray.toString().replace("\\/", "/").getBytes())))) {
            throw new C1125Rt("The update contents failed the data integrity check.");
        }
    }
}
