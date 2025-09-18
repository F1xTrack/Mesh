package com.huawei.hms.device;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.support.log.common.Base64;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import p000.AbstractC0852NX;

/* renamed from: com.huawei.hms.device.a */
/* loaded from: classes.dex */
public class C2077a {
    /* renamed from: a */
    public static boolean m11665a(X509Certificate x509Certificate, List<X509Certificate> list) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        if (list == null || list.size() == 0) {
            return false;
        }
        if (x509Certificate == null) {
            HMSLog.m12620e("X509CertUtil", "rootCert is null,verify failed ");
            return false;
        }
        PublicKey publicKey = x509Certificate.getPublicKey();
        for (X509Certificate x509Certificate2 : list) {
            if (x509Certificate2 != null) {
                try {
                    x509Certificate2.checkValidity();
                    x509Certificate2.verify(publicKey);
                    publicKey = x509Certificate2.getPublicKey();
                } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e) {
                    HMSLog.m12620e("X509CertUtil", "verify failed " + e.getMessage());
                }
            }
            return false;
        }
        return m11667a(list);
    }

    /* renamed from: b */
    public static List<X509Certificate> m11669b(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m11660a(it.next()));
        }
        return arrayList;
    }

    /* renamed from: c */
    private static List<String> m11672c(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 1) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            HMSLog.m12620e("X509CertUtil", "Failed to getCertChain: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    public static List<X509Certificate> m11668b(String str) {
        return m11669b(m11672c(str));
    }

    /* renamed from: b */
    public static boolean m11671b(X509Certificate x509Certificate, String str, String str2) {
        if (x509Certificate == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(m11657a(x509Certificate.getSubjectDN().getName(), str));
    }

    /* renamed from: b */
    public static boolean m11670b(X509Certificate x509Certificate, String str) {
        return m11671b(x509Certificate, "OU", str);
    }

    /* renamed from: a */
    public static X509Certificate m11660a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m11661a(Base64.decode(str));
        } catch (IllegalArgumentException e) {
            HMSLog.m12620e("X509CertUtil", "getCert failed : " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static X509Certificate m11661a(byte[] bArr) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        } catch (CertificateException e) {
            HMSLog.m12620e("X509CertUtil", "Failed to get cert: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static String m11657a(String str, String str2) {
        int iIndexOf = str.toUpperCase(Locale.getDefault()).indexOf(str2 + ContainerUtils.KEY_VALUE_DELIMITER);
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = str.indexOf(StringUtils.COMMA, iIndexOf);
        if (iIndexOf2 != -1) {
            return str.substring(str2.length() + iIndexOf + 1, iIndexOf2);
        }
        return str.substring(str2.length() + iIndexOf + 1);
    }

    /* renamed from: a */
    public static boolean m11662a(X509Certificate x509Certificate) {
        if (x509Certificate == null || x509Certificate.getBasicConstraints() == -1) {
            return false;
        }
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (5 < keyUsage.length) {
            return keyUsage[5];
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m11667a(List<X509Certificate> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (!m11662a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m11663a(X509Certificate x509Certificate, String str) {
        return m11671b(x509Certificate, "CN", str);
    }

    /* renamed from: a */
    public static boolean m11664a(X509Certificate x509Certificate, String str, String str2) {
        try {
            return m11666a(x509Certificate, str.getBytes("UTF-8"), Base64.decode(str2));
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            AbstractC0852NX.m5766o(e, new StringBuilder(" plainText exception: "), "X509CertUtil");
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m11666a(X509Certificate x509Certificate, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        try {
            Signature signature = Signature.getInstance(x509Certificate.getSigAlgName());
            signature.initVerify(x509Certificate.getPublicKey());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            HMSLog.m12620e("X509CertUtil", "failed checkSignature : " + e.getMessage());
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x004c: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:64:0x004c */
    /* renamed from: a */
    public static X509Certificate m11659a(Context context, String str) throws Throwable {
        InputStream inputStream;
        InputStream inputStreamOpen;
        KeyStore keyStore;
        InputStream inputStream2 = null;
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        keyStore = KeyStore.getInstance("bks");
                        inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
                    } catch (IOException e) {
                        e = e;
                        inputStreamOpen = null;
                        HMSLog.m12620e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (KeyStoreException e2) {
                        e = e2;
                        inputStreamOpen = null;
                        HMSLog.m12620e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (NoSuchAlgorithmException e3) {
                        e = e3;
                        inputStreamOpen = null;
                        HMSLog.m12620e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (CertificateException e4) {
                        e = e4;
                        inputStreamOpen = null;
                        HMSLog.m12620e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        IOUtils.closeQuietly(inputStream2);
                        throw th;
                    }
                    try {
                        keyStore.load(inputStreamOpen, "".toCharArray());
                    } catch (IOException e5) {
                        e = e5;
                        HMSLog.m12620e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (KeyStoreException e6) {
                        e = e6;
                        HMSLog.m12620e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (NoSuchAlgorithmException e7) {
                        e = e7;
                        HMSLog.m12620e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    } catch (CertificateException e8) {
                        e = e8;
                        HMSLog.m12620e("X509CertUtil", "exception:" + e.getMessage());
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    }
                    if (!keyStore.containsAlias(str)) {
                        HMSLog.m12620e("X509CertUtil", "Not include alias " + str);
                        HMSPackageManager.getInstance(context).setUseOldCertificate(true);
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    }
                    Certificate certificate = keyStore.getCertificate(str);
                    if (!(certificate instanceof X509Certificate)) {
                        IOUtils.closeQuietly(inputStreamOpen);
                        return null;
                    }
                    X509Certificate x509Certificate = (X509Certificate) certificate;
                    x509Certificate.checkValidity();
                    IOUtils.closeQuietly(inputStreamOpen);
                    return x509Certificate;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
            }
        }
        HMSLog.m12620e("X509CertUtil", "args are error");
        return null;
    }

    /* renamed from: a */
    public static X509Certificate m11658a(Context context) {
        return m11659a(context, "052root");
    }
}
