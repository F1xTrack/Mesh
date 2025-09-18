package defpackage;

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

/* renamed from: ri, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6889ri {
    public static final Uri a = Uri.parse("content://com.huawei.hwid");
    public static final String[] b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", PackageConstants.SERVICES_SIGNATURE_V3};

    public static String a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.createDeviceProtectedStorageContext().getFilesDir());
            return AbstractC1705Vq.l(sb, File.separator, "aegis");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getApplicationContext().getFilesDir());
        return AbstractC1705Vq.l(sb2, File.separator, "aegis");
    }

    public static String b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static void c(ByteArrayInputStream byteArrayInputStream, Context context) throws Throwable {
        FileOutputStream fileOutputStream;
        if (context == null) {
            return;
        }
        String strA = a(context);
        if (!new File(strA).exists() && !TextUtils.isEmpty(strA)) {
            File file = new File(strA);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        File file2 = new File(strA, "hmsrootcas.bks");
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
                    B12.a(fileOutputStream);
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            B12.a(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            B12.a(fileOutputStream2);
            throw th;
        }
    }

    public static byte[] d(Context context, String str) {
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

    public static boolean e(String str) throws NumberFormatException {
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

    public static String f(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return b(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e) {
            e.getMessage();
            return "";
        }
    }

    public static boolean g(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(context));
        return new File(AbstractC1705Vq.l(sb, File.separator, "hmsrootcas.bks")).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.ByteArrayInputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    public static synchronized FileInputStream h(Context context) {
        InputStream inputStream;
        InputStream inputStreamOpenInputStream;
        ?? byteArrayInputStream;
        if (context != null) {
            if (AbstractC3401dU1.a == null) {
                AbstractC3401dU1.a = context.getApplicationContext();
            }
        }
        Context context2 = AbstractC3401dU1.a;
        InputStream inputStream2 = null;
        if (context2 == null) {
            return null;
        }
        if (!e(C12.c(PackageConstants.SERVICES_PACKAGE)) && !e(C12.c(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
            C12.c(PackageConstants.SERVICES_PACKAGE);
            return null;
        }
        byte[] bArrD = d(context2, PackageConstants.SERVICES_PACKAGE);
        String[] strArr = b;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (strArr[i].equalsIgnoreCase(f(bArrD))) {
                    break;
                }
                i++;
            } else if (!PackageConstants.SERVICES_SIGNATURE_V3.equalsIgnoreCase(f(d(context2, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)))) {
                return null;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStreamOpenInputStream = context2.getContentResolver().openInputStream(Uri.withAppendedPath(a, "files/hmsrootcas.bks"));
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
                        String string = AbstractC8451zu1.a(context2).getString("bks_hash", "");
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        String strB = "";
                        if (byteArray != null) {
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                messageDigest.update(byteArray);
                                strB = b(messageDigest.digest());
                            } catch (NoSuchAlgorithmException unused) {
                            }
                        }
                        if (!g(context2) || !string.equals(strB)) {
                            c(byteArrayInputStream, context2);
                            AbstractC8451zu1.a(context2).edit().putString("bks_hash", strB).apply();
                        }
                        B12.a(inputStreamOpenInputStream);
                        B12.a(byteArrayOutputStream);
                        B12.a(byteArrayInputStream);
                    } catch (Exception e) {
                        e = e;
                        inputStream2 = byteArrayInputStream;
                        e.getMessage();
                        B12.a(inputStreamOpenInputStream);
                        B12.a(byteArrayOutputStream);
                        B12.a(inputStream2);
                        return i(context2);
                    } catch (Throwable th) {
                        th = th;
                        B12.a(inputStreamOpenInputStream);
                        B12.a(byteArrayOutputStream);
                        B12.a(byteArrayInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    InputStream inputStream3 = inputStreamOpenInputStream;
                    inputStream = inputStream2;
                    inputStream2 = inputStream3;
                    byteArrayInputStream = inputStream;
                    inputStreamOpenInputStream = inputStream2;
                    B12.a(inputStreamOpenInputStream);
                    B12.a(byteArrayOutputStream);
                    B12.a(byteArrayInputStream);
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
            B12.a(inputStreamOpenInputStream);
            B12.a(byteArrayOutputStream);
            B12.a(byteArrayInputStream);
            throw th;
        }
        return i(context2);
    }

    public static FileInputStream i(Context context) {
        if (!g(context)) {
            return null;
        }
        try {
            return new FileInputStream(a(context) + File.separator + "hmsrootcas.bks");
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
