package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.yandex.metrica.impl.ob.f8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2748f8 {
    private final Context a;
    private final File b;
    private final L0 c;

    public C2748f8(Context context, File file) {
        this(context, file, new L0());
    }

    @SuppressLint({"SetWorldReadable"})
    public String a(String str, String str2) throws IOException {
        ZipFile zipFile;
        String str3 = this.a.getApplicationInfo().sourceDir;
        File fileB = this.c.b(this.b, str2);
        if (fileB == null) {
            return null;
        }
        if (fileB.exists()) {
            return fileB.getAbsolutePath();
        }
        Bn bnA = Bn.a(this.a, "crpad_ext");
        try {
            bnA.a();
            if (fileB.exists()) {
                String absolutePath = fileB.getAbsolutePath();
                bnA.b();
                return absolutePath;
            }
            zipFile = new ZipFile(str3);
            try {
                ZipEntry entry = zipFile.getEntry(str);
                if (entry == null) {
                    throw new RuntimeException("Cannot find ZipEntry" + str);
                }
                InputStream inputStream = zipFile.getInputStream(entry);
                FileOutputStream fileOutputStream = new FileOutputStream(fileB);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStream.read(bArr, 0, 4096);
                    if (-1 == i) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
                if (!fileB.setReadable(true, false)) {
                    bnA.b();
                    try {
                        zipFile.close();
                    } catch (IOException unused) {
                    }
                    return null;
                }
                if (!fileB.setExecutable(true, false)) {
                    bnA.b();
                    try {
                        zipFile.close();
                    } catch (IOException unused2) {
                    }
                    return null;
                }
                String absolutePath2 = fileB.getAbsolutePath();
                bnA.b();
                try {
                    zipFile.close();
                } catch (IOException unused3) {
                }
                return absolutePath2;
            } catch (Throwable unused4) {
                bnA.b();
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

    public C2748f8(Context context, File file, L0 l0) {
        this.a = context;
        this.b = file;
        this.c = l0;
    }
}
