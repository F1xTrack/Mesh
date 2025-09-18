package ru.p031ok.tracer.utils;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import p000.AbstractC6366lU;
import p000.D51;
import p000.O90;
import ru.p031ok.tracer.TracerFeature;
import ru.p031ok.tracer.base.p032io.FileUtils;
import ru.p031ok.tracer.base.process.ProcessUtils;

@Metadata(m22266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000e"}, m22267d2 = {"Lru/ok/tracer/utils/TracerFiles;", "", "()V", "createTempFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "name", "", "getNewSampleFile", "tracerFeature", "Lru/ok/tracer/TracerFeature;", "suffix", "getTracerDir", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerFiles {
    public static final TracerFiles INSTANCE = new TracerFiles();

    private TracerFiles() {
    }

    public static /* synthetic */ File createTempFile$default(TracerFiles tracerFiles, Context context, String str, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            str = String.valueOf(System.nanoTime());
        }
        return tracerFiles.createTempFile(context, str);
    }

    public static /* synthetic */ File getNewSampleFile$default(TracerFiles tracerFiles, Context context, TracerFeature tracerFeature, String str, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            str = ".bin";
        }
        return tracerFiles.getNewSampleFile(context, tracerFeature, str);
    }

    public final File createTempFile(Context context, String name) throws IOException {
        O90.m5968f(context, "context");
        O90.m5968f(name, "name");
        return AbstractC6366lU.m22437g(FileUtils.mkdirsChecked(getTracerDir(context)), name.concat(".tmp"));
    }

    public final File getNewSampleFile(Context context, TracerFeature tracerFeature, String suffix) throws IOException {
        O90.m5968f(context, "context");
        O90.m5968f(tracerFeature, "tracerFeature");
        O90.m5968f(suffix, "suffix");
        return AbstractC6366lU.m22437g(FileUtils.mkdirsChecked(getTracerDir(context)), tracerFeature.getName() + '_' + System.currentTimeMillis() + suffix);
    }

    public final File getTracerDir(Context context) {
        String str;
        O90.m5968f(context, "context");
        String processName = ProcessUtils.getProcessName(context);
        if (O90.m5963a(processName, context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(D51.m1553l(processName, ':', '-'));
        }
        return new File(context.getCacheDir(), str);
    }
}
