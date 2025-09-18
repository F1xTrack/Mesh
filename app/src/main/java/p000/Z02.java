package p000;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public abstract class Z02 {
    /* renamed from: a */
    public static void m9449a(String str, String str2) throws Throwable {
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        File file = new File(str);
        File file2 = new File(str2);
        if (!file2.exists()) {
            file2.mkdir();
        }
        for (File file3 : file.listFiles()) {
            if (file3.isDirectory()) {
                m9449a(AbstractC8985cT1.m10704a(str, file3.getName()), AbstractC8985cT1.m10704a(str2, file3.getName()));
            } else {
                File file4 = new File(file2, file3.getName());
                byte[] bArr = new byte[8192];
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file3);
                    try {
                        bufferedInputStream = new BufferedInputStream(fileInputStream2);
                        try {
                            fileOutputStream = new FileOutputStream(file4);
                            while (true) {
                                try {
                                    int i = bufferedInputStream.read(bArr);
                                    if (i <= 0) {
                                        try {
                                            break;
                                        } catch (IOException e) {
                                            throw new C3894cu("Error closing IO resources.", e);
                                        }
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                } catch (Throwable th) {
                                    th = th;
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e2) {
                                            throw new C3894cu("Error closing IO resources.", e2);
                                        }
                                    }
                                    if (bufferedInputStream != null) {
                                        bufferedInputStream.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    throw th;
                                }
                            }
                            fileInputStream2.close();
                            bufferedInputStream.close();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedInputStream = null;
                        fileOutputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedInputStream = null;
                    fileOutputStream = null;
                }
            }
        }
    }

    /* renamed from: b */
    public static void m9450b(String str) {
        if (str == null) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            m9451c(file);
        }
    }

    /* renamed from: c */
    public static void m9451c(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    m9451c(file2);
                } else {
                    file2.delete();
                }
            }
        }
        if (file.delete()) {
            return;
        }
        file.getName();
    }

    /* renamed from: d */
    public static String m9452d(String str) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(new File(str));
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            String string = sb.toString();
                            bufferedReader.close();
                            fileInputStream.close();
                            return string;
                        }
                        sb.append(line);
                        sb.append("\n");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (fileInputStream == null) {
                        throw th;
                    }
                    fileInputStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
            }
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            fileInputStream = null;
        }
    }

    /* renamed from: e */
    public static void m9453e(C6318kj c6318kj, byte[] bArr) {
        long j;
        O90.m5968f(c6318kj, "cursor");
        O90.m5968f(bArr, "key");
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = c6318kj.f36636e;
            int i2 = c6318kj.f36637f;
            int i3 = c6318kj.f36638g;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = c6318kj.f36635d;
            C6507nj c6507nj = c6318kj.f36632a;
            O90.m5965c(c6507nj);
            if (j2 == c6507nj.f38488b) {
                throw new IllegalStateException("no more bytes");
            }
            j = c6318kj.f36635d;
        } while (c6318kj.m22247c(j == -1 ? 0L : j + (c6318kj.f36638g - c6318kj.f36637f)) != -1);
    }

    /* renamed from: f */
    public static String m9454f(File file, String str) throws IOException {
        String str2 = file.getCanonicalPath() + File.separator;
        String canonicalPath = new File(str2, str).getCanonicalPath();
        if (canonicalPath.startsWith(str2)) {
            return canonicalPath;
        }
        throw new IllegalStateException("File is outside extraction target directory.");
    }
}
