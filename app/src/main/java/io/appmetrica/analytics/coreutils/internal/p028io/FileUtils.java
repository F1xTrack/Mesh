package io.appmetrica.analytics.coreutils.internal.p028io;

import android.annotation.SuppressLint;
import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.io.File;
import kotlin.Metadata;
import p000.AbstractC6366lU;

@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0006J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u0017*\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u0017*\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u0017*\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u0017*\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, m22267d2 = {"Lio/appmetrica/analytics/coreutils/internal/io/FileUtils;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "sdkStorage", "(Landroid/content/Context;)Ljava/io/File;", "getAppStorageDirectory", "", "fileName", "getFileFromSdkStorage", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "getFileFromAppStorage", "getCrashesDirectory", "getNativeCrashDirectory", "filePath", "getFileFromPath", "(Ljava/lang/String;)Ljava/io/File;", "getAppDataDir", "LTf1;", "resetSdkStorage", "()V", "to", "", "move", "(Ljava/io/File;Ljava/io/File;)Z", "copyToNullable", "moveByCopy", "moveByRename", "SDK_STORAGE_RELATIVE_PATH", "Ljava/lang/String;", "SDK_FILES_PREFIX", "core-utils_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class FileUtils {
    public static final FileUtils INSTANCE = new FileUtils();
    public static final String SDK_FILES_PREFIX = "appmetrica_analytics";
    public static final String SDK_STORAGE_RELATIVE_PATH = "/appmetrica/analytics";

    /* renamed from: a */
    private static volatile File f29719a;

    private FileUtils() {
    }

    public static final boolean copyToNullable(File file, File file2) {
        if (file != null && file2 != null && file.exists()) {
            try {
                AbstractC6366lU.m22432b(file, file2, false, 6);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    public static final File getAppDataDir(Context context) {
        if (AndroidUtils.isApiAchieved(24)) {
            return AppDataDirProviderForN.INSTANCE.dataDir(context);
        }
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir.getParentFile();
        }
        return null;
    }

    public static final File getAppStorageDirectory(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static final File getCrashesDirectory(Context context) {
        return getFileFromSdkStorage(context, "crashes");
    }

    public static final File getFileFromAppStorage(Context context, String fileName) {
        File appStorageDirectory = getAppStorageDirectory(context);
        if (appStorageDirectory != null) {
            return new File(appStorageDirectory, fileName);
        }
        return null;
    }

    public static final File getFileFromPath(String filePath) {
        return new File(filePath);
    }

    public static final File getFileFromSdkStorage(Context context, String fileName) {
        File fileSdkStorage = sdkStorage(context);
        if (fileSdkStorage != null) {
            return new File(fileSdkStorage, fileName);
        }
        return null;
    }

    public static final File getNativeCrashDirectory(Context context) {
        return getFileFromSdkStorage(context, "native_crashes");
    }

    public static final boolean move(File file, File file2) {
        FileUtils fileUtils = INSTANCE;
        return fileUtils.moveByRename(file, file2) || fileUtils.moveByCopy(file, file2);
    }

    public static final void resetSdkStorage() {
        synchronized (INSTANCE) {
            f29719a = null;
        }
    }

    public static final File sdkStorage(Context context) {
        File file;
        if (f29719a == null) {
            synchronized (INSTANCE) {
                try {
                    File appStorageDirectory = getAppStorageDirectory(context);
                    if (appStorageDirectory == null) {
                        file = null;
                    } else {
                        File file2 = new File(appStorageDirectory, SDK_STORAGE_RELATIVE_PATH);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        file = file2;
                    }
                    f29719a = file;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29719a;
    }

    public final boolean moveByCopy(File file, File file2) {
        if (file != null && file2 != null && file.exists()) {
            try {
                AbstractC6366lU.m22432b(file, file2, false, 6);
                file.delete();
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final boolean moveByRename(File file, File file2) {
        if (file2 != null) {
            Boolean boolValueOf = file != null ? Boolean.valueOf(file.renameTo(file2)) : null;
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return false;
    }
}
