package p000;

import com.facebook.react.bridge.Promise;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* renamed from: tL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC11149tL0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f43017a;

    /* renamed from: b */
    public final /* synthetic */ String f43018b;

    /* renamed from: c */
    public final /* synthetic */ String f43019c;

    /* renamed from: d */
    public final /* synthetic */ boolean f43020d;

    /* renamed from: e */
    public final /* synthetic */ boolean f43021e;

    /* renamed from: f */
    public final /* synthetic */ Promise f43022f;

    public RunnableC11149tL0(String str, String str2, String str3, boolean z, boolean z2, Promise promise) {
        this.f43017a = str;
        this.f43018b = str2;
        this.f43019c = str3;
        this.f43020d = z;
        this.f43021e = z2;
        this.f43022f = promise;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int length;
        FileOutputStream fileOutputStream;
        String str = this.f43017a;
        String str2 = this.f43018b;
        Promise promise = this.f43022f;
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
                    promise.reject("EUNSPECIFIED", "Failed to create parent directory of '" + str + "'");
                    return;
                }
                if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            boolean zEqualsIgnoreCase = str2.equalsIgnoreCase("uri");
            String str3 = this.f43019c;
            boolean z = this.f43021e;
            if (zEqualsIgnoreCase) {
                String strM157b = AL0.m157b(str3);
                File file2 = new File(strM157b);
                if (!file2.exists()) {
                    promise.reject("ENOENT", "No such file '" + str + "' ('" + strM157b + "')");
                    return;
                }
                byte[] bArr = new byte[10240];
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        fileOutputStream = new FileOutputStream(file, z);
                        length = 0;
                        while (true) {
                            try {
                                int i = fileInputStream2.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                                length += i;
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        }
                        fileInputStream2.close();
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } else {
                byte[] bArrM158c = AL0.m158c(str3, str2);
                if (this.f43020d) {
                    throw new IllegalStateException("Write file with transform was specified but the shared file transformer is not set");
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
                try {
                    fileOutputStream2.write(bArrM158c);
                    length = bArrM158c.length;
                } finally {
                    fileOutputStream2.close();
                }
            }
            promise.resolve(Integer.valueOf(length));
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created, or it is a directory");
        } catch (Exception e) {
            promise.reject("EUNSPECIFIED", e.getLocalizedMessage());
        }
    }
}
