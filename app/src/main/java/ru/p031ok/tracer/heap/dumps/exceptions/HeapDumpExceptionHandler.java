package ru.p031ok.tracer.heap.dumps.exceptions;

import android.os.Debug;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import kotlin.Metadata;
import p000.O90;
import ru.p031ok.tracer.base.p032io.FileUtils;
import ru.p031ok.tracer.heap.dumps.OutOfMemoryErrors;

@Metadata(m22266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, m22267d2 = {"Lru/ok/tracer/heap/dumps/exceptions/HeapDumpExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Ljava/io/File;", "file", "tmpFile", "<init>", "(Ljava/io/File;Ljava/io/File;)V", "Ljava/lang/Thread;", "t", "", "e", "LTf1;", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "Ljava/io/File;", "tracer-heap-dumps_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class HeapDumpExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final File file;
    private final File tmpFile;

    public HeapDumpExceptionHandler(File file, File file2) {
        O90.m5968f(file, "file");
        O90.m5968f(file2, "tmpFile");
        this.file = file;
        this.tmpFile = file2;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t, Throwable e) throws IOException {
        O90.m5968f(t, "t");
        O90.m5968f(e, "e");
        if (OutOfMemoryErrors.isOom(e)) {
            try {
                File parentFile = this.tmpFile.getParentFile();
                if (parentFile != null) {
                    FileUtils.mkdirsChecked(parentFile);
                }
                Debug.dumpHprofData(this.tmpFile.getAbsolutePath());
                File parentFile2 = this.file.getParentFile();
                if (parentFile2 != null) {
                    FileUtils.mkdirsChecked(parentFile2);
                }
                this.tmpFile.renameTo(this.file);
            } catch (IOException unused) {
            }
        }
    }
}
