package com.yandex.metrica.impl.p022ob;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.yandex.metrica.impl.ob.f8 */
/* loaded from: classes2.dex */
class C3254f8 {

    /* renamed from: a */
    private final Context f23426a;

    /* renamed from: b */
    private final File f23427b;

    /* renamed from: c */
    private final C2742L0 f23428c;

    public C3254f8(Context context, File file) {
        this(context, file, new C2742L0());
    }

    @SuppressLint({"SetWorldReadable"})
    /* renamed from: a */
    public String m15927a(String str, String str2) throws IOException {
        ZipFile zipFile;
        String str3 = this.f23426a.getApplicationInfo().sourceDir;
        File fileM14503b = this.f23428c.m14503b(this.f23427b, str2);
        if (fileM14503b == null) {
            return null;
        }
        if (fileM14503b.exists()) {
            return fileM14503b.getAbsolutePath();
        }
        C2515Bn c2515BnM13939a = C2515Bn.m13939a(this.f23426a, "crpad_ext");
        try {
            c2515BnM13939a.m13940a();
            if (fileM14503b.exists()) {
                String absolutePath = fileM14503b.getAbsolutePath();
                c2515BnM13939a.m13941b();
                return absolutePath;
            }
            zipFile = new ZipFile(str3);
            try {
                ZipEntry entry = zipFile.getEntry(str);
                if (entry == null) {
                    throw new RuntimeException("Cannot find ZipEntry" + str);
                }
                InputStream inputStream = zipFile.getInputStream(entry);
                FileOutputStream fileOutputStream = new FileOutputStream(fileM14503b);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStream.read(bArr, 0, 4096);
                    if (-1 == i) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
                if (!fileM14503b.setReadable(true, false)) {
                    c2515BnM13939a.m13941b();
                    try {
                        zipFile.close();
                    } catch (IOException unused) {
                    }
                    return null;
                }
                if (!fileM14503b.setExecutable(true, false)) {
                    c2515BnM13939a.m13941b();
                    try {
                        zipFile.close();
                    } catch (IOException unused2) {
                    }
                    return null;
                }
                String absolutePath2 = fileM14503b.getAbsolutePath();
                c2515BnM13939a.m13941b();
                try {
                    zipFile.close();
                } catch (IOException unused3) {
                }
                return absolutePath2;
            } catch (Throwable unused4) {
                c2515BnM13939a.m13941b();
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused5) {
                    }
                }
                return null;
            }
        } catch (Throwable unused6) {
            zipFile = null;
        }
    }

    public C3254f8(Context context, File file, C2742L0 c2742l0) {
        this.f23426a = context;
        this.f23427b = file;
        this.f23428c = c2742l0;
    }
}
