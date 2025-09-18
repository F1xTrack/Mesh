package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.common.PackageConstants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: ri */
/* loaded from: classes2.dex */
public abstract class AbstractC6760ri {

    /* renamed from: a */
    public static final Uri f41813a = Uri.parse("content://com.huawei.hwid");

    /* renamed from: b */
    public static final String[] f41814b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", PackageConstants.SERVICES_SIGNATURE_V3};

    /* renamed from: a */
    public static String m24454a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.createDeviceProtectedStorageContext().getFilesDir());
            return AbstractC1374Vq.m8593l(sb, File.separator, "aegis");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getApplicationContext().getFilesDir());
        return AbstractC1374Vq.m8593l(sb2, File.separator, "aegis");
    }

    /* renamed from: b */
    public static String m24455b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static void m24456c(ByteArrayInputStream byteArrayInputStream, Context context) throws Throwable {
        FileOutputStream fileOutputStream;
        if (context == null) {
            return;
        }
        String strM24454a = m24454a(context);
        if (!new File(strM24454a).exists() && !TextUtils.isEmpty(strM24454a)) {
            File file = new File(strM24454a);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        File file2 = new File(strM24454a, "hmsrootcas.bks");
        if (file2.exists()) {
            file2.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file2);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i = byteArrayInputStream.read(bArr, 0, 2048);
                if (i == -1) {
                    B12.m464a(fileOutputStream);
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            B12.m464a(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            B12.m464a(fileOutputStream2);
            throw th;
        }
    }

    /* renamed from: d */
    public static byte[] m24457d(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.getMessage();
        } catch (Exception e2) {
            e2.getMessage();
        }
        return new byte[0];
    }

    /* renamed from: e */
    public static boolean m24458e(String str) throws NumberFormatException {
        int i;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = "4.0.2.300".split("\\.");
        int length = strArrSplit.length;
        int length2 = strArrSplit2.length;
        int iMax = Math.max(length, length2);
        int i2 = 0;
        while (i2 < iMax) {
            if (i2 < length) {
                try {
                    i = Integer.parseInt(strArrSplit[i2]);
                } catch (Exception e) {
                    e.getMessage();
                    return i2 >= length2;
                }
            } else {
                i = 0;
            }
            int i3 = i2 < length2 ? Integer.parseInt(strArrSplit2[i2]) : 0;
            if (i < i3) {
                return false;
            }
            if (i > i3) {
                return true;
            }
            i2++;
        }
        return true;
    }

    /* renamed from: f */
    public static String m24459f(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return m24455b(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e) {
            e.getMessage();
            return "";
        }
    }

    /* renamed from: g */
    public static boolean m24460g(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m24454a(context));
        return new File(AbstractC1374Vq.m8593l(sb, File.separator, "hmsrootcas.bks")).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.ByteArrayInputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* renamed from: h */
    public static synchronized FileInputStream m24461h(Context context) {
        InputStream inputStream;
        InputStream inputStreamOpenInputStream;
        ?? byteArrayInputStream;
        if (context != null) {
            if (AbstractC9120dU1.f26123a == null) {
                AbstractC9120dU1.f26123a = context.getApplicationContext();
            }
        }
        Context context2 = AbstractC9120dU1.f26123a;
        InputStream inputStream2 = null;
        if (context2 == null) {
            return null;
        }
        if (!m24458e(C12.m949c(PackageConstants.SERVICES_PACKAGE)) && !m24458e(C12.m949c(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
            C12.m949c(PackageConstants.SERVICES_PACKAGE);
            return null;
        }
        byte[] bArrM24457d = m24457d(context2, PackageConstants.SERVICES_PACKAGE);
        String[] strArr = f41814b;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (strArr[i].equalsIgnoreCase(m24459f(bArrM24457d))) {
                    break;
                }
                i++;
            } else if (!PackageConstants.SERVICES_SIGNATURE_V3.equalsIgnoreCase(m24459f(m24457d(context2, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)))) {
                return null;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStreamOpenInputStream = context2.getContentResolver().openInputStream(Uri.withAppendedPath(f41813a, "files/hmsrootcas.bks"));
            try {
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStreamOpenInputStream.read(bArr);
                        if (i2 <= -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                    byteArrayOutputStream.flush();
                    byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                    try {
                        String string = AbstractC11984zu1.m26587a(context2).getString("bks_hash", "");
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        String strM24455b = "";
                        if (byteArray != null) {
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                messageDigest.update(byteArray);
                                strM24455b = m24455b(messageDigest.digest());
                            } catch (NoSuchAlgorithmException unused) {
                            }
                        }
                        if (!m24460g(context2) || !string.equals(strM24455b)) {
                            m24456c(byteArrayInputStream, context2);
                            AbstractC11984zu1.m26587a(context2).edit().putString("bks_hash", strM24455b).apply();
                        }
                        B12.m464a(inputStreamOpenInputStream);
                        B12.m464a(byteArrayOutputStream);
                        B12.m464a(byteArrayInputStream);
                    } catch (Exception e) {
                        e = e;
                        inputStream2 = byteArrayInputStream;
                        e.getMessage();
                        B12.m464a(inputStreamOpenInputStream);
                        B12.m464a(byteArrayOutputStream);
                        B12.m464a(inputStream2);
                        return m24462i(context2);
                    } catch (Throwable th) {
                        th = th;
                        B12.m464a(inputStreamOpenInputStream);
                        B12.m464a(byteArrayOutputStream);
                        B12.m464a(byteArrayInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    InputStream inputStream3 = inputStreamOpenInputStream;
                    inputStream = inputStream2;
                    inputStream2 = inputStream3;
                    byteArrayInputStream = inputStream;
                    inputStreamOpenInputStream = inputStream2;
                    B12.m464a(inputStreamOpenInputStream);
                    B12.m464a(byteArrayOutputStream);
                    B12.m464a(byteArrayInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            inputStreamOpenInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            byteArrayInputStream = inputStream;
            inputStreamOpenInputStream = inputStream2;
            B12.m464a(inputStreamOpenInputStream);
            B12.m464a(byteArrayOutputStream);
            B12.m464a(byteArrayInputStream);
            throw th;
        }
        return m24462i(context2);
    }

    /* renamed from: i */
    public static FileInputStream m24462i(Context context) {
        if (!m24460g(context)) {
            return null;
        }
        try {
            return new FileInputStream(m24454a(context) + File.separator + "hmsrootcas.bks");
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
