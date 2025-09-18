package com.yandex.runtime.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public class ReLinker {
    private static final int COPY_BUFFER_SIZE = 4096;
    private static final String LIB_DIR = "lib";
    private static final int MAX_TRIES = 5;

    public static class MissingLibraryException extends RuntimeException {
        public MissingLibraryException(String str) {
            super(str);
        }
    }

    private ReLinker() {
    }

    private static void closeSilently(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    private static File getWorkaroundLibDir(Context context) {
        return context.getDir(LIB_DIR, 0);
    }

    private static File getWorkaroundLibFile(Context context, String str) {
        return new File(getWorkaroundLibDir(context), System.mapLibraryName(str));
    }

    public static void loadLibrary(Context context, String str) throws Throwable {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError unused) {
            File workaroundLibFile = getWorkaroundLibFile(context, str);
            if (!workaroundLibFile.exists()) {
                unpackLibrary(context, str);
            }
            System.load(workaroundLibFile.getAbsolutePath());
        }
    }

    private static void unpackLibrary(Context context, String str) throws Throwable {
        ZipFile zipFile;
        String str2;
        ZipEntry entry;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        ZipFile zipFile2 = null;
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i >= 5) {
                    zipFile = null;
                    break;
                } else {
                    try {
                        zipFile = new ZipFile(new File(applicationInfo.sourceDir), 1);
                        break;
                    } catch (IOException unused) {
                        i = i2;
                    }
                }
            }
            if (zipFile == null) {
                if (zipFile != null) {
                    try {
                        zipFile.close();
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 < 5) {
                    try {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        if (strArr.length > 0) {
                            str2 = null;
                            entry = null;
                            for (String str3 : strArr) {
                                str2 = "lib/" + str3 + "/" + System.mapLibraryName(str);
                                entry = zipFile.getEntry(str2);
                                if (entry != null) {
                                    break;
                                }
                            }
                        } else {
                            str2 = "lib/" + Build.CPU_ABI + "/" + System.mapLibraryName(str);
                            entry = zipFile.getEntry(str2);
                        }
                        if (entry == null) {
                            if (str2 == null) {
                                throw new MissingLibraryException(str);
                            }
                            throw new MissingLibraryException(str2);
                        }
                        File workaroundLibFile = getWorkaroundLibFile(context, str);
                        workaroundLibFile.delete();
                        try {
                            if (workaroundLibFile.createNewFile()) {
                                try {
                                    inputStream = zipFile.getInputStream(entry);
                                    try {
                                        fileOutputStream = new FileOutputStream(workaroundLibFile);
                                        try {
                                            copy(inputStream, fileOutputStream);
                                            closeSilently(inputStream);
                                            closeSilently(fileOutputStream);
                                            workaroundLibFile.setReadable(true, false);
                                            workaroundLibFile.setExecutable(true, false);
                                            workaroundLibFile.setWritable(true);
                                            break;
                                        } catch (FileNotFoundException unused3) {
                                            closeSilently(inputStream);
                                            closeSilently(fileOutputStream);
                                            i3 = i4;
                                        } catch (IOException unused4) {
                                            closeSilently(inputStream);
                                            closeSilently(fileOutputStream);
                                            i3 = i4;
                                        } catch (Throwable th) {
                                            th = th;
                                            zipFile2 = inputStream;
                                            closeSilently(zipFile2);
                                            closeSilently(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused5) {
                                        fileOutputStream = null;
                                    } catch (IOException unused6) {
                                        fileOutputStream = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream = null;
                                    }
                                } catch (FileNotFoundException unused7) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (IOException unused8) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fileOutputStream = null;
                                }
                            } else {
                                continue;
                            }
                        } catch (IOException unused9) {
                        }
                        i3 = i4;
                    } catch (Throwable th4) {
                        th = th4;
                        zipFile2 = zipFile;
                        if (zipFile2 != null) {
                            try {
                                zipFile2.close();
                            } catch (IOException unused10) {
                            }
                        }
                        throw th;
                    }
                }
            }
            try {
                zipFile.close();
            } catch (IOException unused11) {
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
