package ru.ok.tracer.base.io;

import defpackage.AbstractC1705Vq;
import defpackage.AbstractC5702lU;
import defpackage.O90;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"deleteChecked", "Ljava/io/File;", "ensureDirs", "", "mkdirsChecked", "renameToChecked", "dest", "tracer-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FileUtils {
    public static final File deleteChecked(File file) throws IOException {
        O90.f(file, "<this>");
        if (!file.exists() || AbstractC5702lU.c(file)) {
            return file;
        }
        throw new IOException(AbstractC1705Vq.g(file, "Can't delete "));
    }

    public static final boolean ensureDirs(File file) {
        O90.f(file, "<this>");
        return file.exists() || file.mkdirs();
    }

    public static final File mkdirsChecked(File file) throws IOException {
        O90.f(file, "<this>");
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException(file + " is not a directory");
            }
        } else if (!file.mkdirs()) {
            throw new IOException(AbstractC1705Vq.g(file, "Can't create "));
        }
        return file;
    }

    public static final File renameToChecked(File file, File file2) throws IOException {
        O90.f(file, "<this>");
        O90.f(file2, "dest");
        if (file.renameTo(file2)) {
            return file;
        }
        throw new IOException("Can't rename " + file + " to " + file2);
    }
}
