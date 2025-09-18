package ru.ok.tracer.utils;

import android.content.Context;
import android.net.Uri;
import defpackage.AbstractC5702lU;
import defpackage.D51;
import defpackage.O90;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import ru.ok.tracer.TracerFeature;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.base.process.ProcessUtils;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lru/ok/tracer/utils/TracerFiles;", "", "()V", "createTempFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "name", "", "getNewSampleFile", "tracerFeature", "Lru/ok/tracer/TracerFeature;", "suffix", "getTracerDir", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
        O90.f(context, "context");
        O90.f(name, "name");
        return AbstractC5702lU.g(FileUtils.mkdirsChecked(getTracerDir(context)), name.concat(".tmp"));
    }

    public final File getNewSampleFile(Context context, TracerFeature tracerFeature, String suffix) throws IOException {
        O90.f(context, "context");
        O90.f(tracerFeature, "tracerFeature");
        O90.f(suffix, "suffix");
        return AbstractC5702lU.g(FileUtils.mkdirsChecked(getTracerDir(context)), tracerFeature.getName() + '_' + System.currentTimeMillis() + suffix);
    }

    public final File getTracerDir(Context context) {
        String str;
        O90.f(context, "context");
        String processName = ProcessUtils.getProcessName(context);
        if (O90.a(processName, context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(D51.l(processName, ':', '-'));
        }
        return new File(context.getCacheDir(), str);
    }
}
