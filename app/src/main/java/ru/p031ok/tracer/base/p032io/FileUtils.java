package ru.p031ok.tracer.base.p032io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import p000.AbstractC1374Vq;
import p000.AbstractC6366lU;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\u0007"}, m22267d2 = {"deleteChecked", "Ljava/io/File;", "ensureDirs", "", "mkdirsChecked", "renameToChecked", "dest", "tracer-base_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class FileUtils {
    public static final File deleteChecked(File file) throws IOException {
        O90.m5968f(file, "<this>");
        if (!file.exists() || AbstractC6366lU.m22433c(file)) {
            return file;
        }
        throw new IOException(AbstractC1374Vq.m8588g(file, "Can't delete "));
    }

    public static final boolean ensureDirs(File file) {
        O90.m5968f(file, "<this>");
        return file.exists() || file.mkdirs();
    }

    public static final File mkdirsChecked(File file) throws IOException {
        O90.m5968f(file, "<this>");
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException(file + " is not a directory");
            }
        } else if (!file.mkdirs()) {
            throw new IOException(AbstractC1374Vq.m8588g(file, "Can't create "));
        }
        return file;
    }

    public static final File renameToChecked(File file, File file2) throws IOException {
        O90.m5968f(file, "<this>");
        O90.m5968f(file2, "dest");
        if (file.renameTo(file2)) {
            return file;
        }
        throw new IOException("Can't rename " + file + " to " + file2);
    }
}
