package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: eu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3667eu {
    public static final String a = System.getProperty("line.separator");

    public static void a(String str, String str2, ArrayList arrayList) {
        for (File file : new File(str).listFiles()) {
            String name = file.getName();
            String absolutePath = file.getAbsolutePath();
            String strL = AbstractC1705Vq.l(new StringBuilder(), str2.isEmpty() ? "" : str2.concat("/"), name);
            if (!strL.startsWith("__MACOSX/") && !strL.equals(".DS_Store") && !strL.endsWith("/.DS_Store") && !strL.equals(".codepushrelease") && !strL.endsWith("/.codepushrelease")) {
                if (file.isDirectory()) {
                    a(absolutePath, strL, arrayList);
                } else {
                    try {
                        arrayList.add(strL + StringUtils.PROCESS_POSTFIX_DELIMITER + b(new FileInputStream(file)));
                    } catch (FileNotFoundException e) {
                        throw new C3286cu("Unable to compute hash of update contents.", e);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.io.InputStream r6) throws java.lang.Throwable {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3667eu.b(java.io.InputStream):java.lang.String");
    }

    public static String c(String str, String str2) {
        for (File file : new File(str).listFiles()) {
            String strA = AbstractC2522cT1.a(str, file.getName());
            if (file.isDirectory()) {
                String strC = c(strA, str2);
                if (strC != null) {
                    return AbstractC2522cT1.a(file.getName(), strC);
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

    public static void d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        a(str, "", arrayList);
        Collections.sort(arrayList);
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        if (!str2.equals(b(new ByteArrayInputStream(jSONArray.toString().replace("\\/", "/").getBytes())))) {
            throw new C1402Rt("The update contents failed the data integrity check.");
        }
    }
}
