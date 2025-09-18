package ru.p031ok.tracer.heap.dumps.exceptions;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.AbstractC8008Nj0;
import p000.AbstractC8729aT1;
import p000.C0842NN;
import p000.C7249zC;
import p000.C7852Kj0;
import p000.NP1;
import p000.O90;
import ru.p031ok.tracer.heap.dumps.FEATURE_HEAP_DUMPKt;
import ru.p031ok.tracer.upload.SampleUploader;
import ru.p031ok.tracer.utils.Logger;
import ru.p031ok.tracer.utils.TracerFiles;
import ru.p031ok.tracer.utils.config.ConfigStorage;

@Metadata(m22266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m22267d2 = {"Lru/ok/tracer/heap/dumps/exceptions/ShrinkDumpWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "LNj0;", "doWork", "()LNj0;", "Companion", "tracer-heap-dumps_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class ShrinkDumpWorker extends Worker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int MINIMUM_DUMP_SIZE = 1048576;
    public static final String PARAM_DUMP_PATH = "param_dump_path";
    private static final String PARAM_TAG = "param_tag";

    @Metadata(m22266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087T¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, m22267d2 = {"Lru/ok/tracer/heap/dumps/exceptions/ShrinkDumpWorker$Companion;", "", "<init>", "()V", "Ljava/io/File;", "dumpFile", "LzC;", "createInputData", "(Ljava/io/File;)LzC;", "", "tag", "createInputData$tracer_heap_dumps_release", "(Ljava/io/File;Ljava/lang/String;)LzC;", "PARAM_DUMP_PATH", "Ljava/lang/String;", "getPARAM_DUMP_PATH$annotations", "", "MINIMUM_DUMP_SIZE", "I", "PARAM_TAG", "tracer-heap-dumps_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getPARAM_DUMP_PATH$annotations() {
        }

        public final C7249zC createInputData(File dumpFile) {
            O90.m5968f(dumpFile, "dumpFile");
            return createInputData$tracer_heap_dumps_release(dumpFile, null);
        }

        public final C7249zC createInputData$tracer_heap_dumps_release(File dumpFile, String tag) throws Throwable {
            O90.m5968f(dumpFile, "dumpFile");
            HashMap map = new HashMap();
            map.put(ShrinkDumpWorker.PARAM_DUMP_PATH, dumpFile.getPath());
            map.put(ShrinkDumpWorker.PARAM_TAG, tag);
            C7249zC c7249zC = new C7249zC(map);
            C7249zC.m26327c(c7249zC);
            return c7249zC;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShrinkDumpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        O90.m5968f(context, "context");
        O90.m5968f(workerParameters, "workerParams");
    }

    public static final C7249zC createInputData(File file) {
        return INSTANCE.createInputData(file);
    }

    /* JADX WARN: Finally extract failed */
    @Override // androidx.work.Worker
    public AbstractC8008Nj0 doWork() {
        String strM26328b = getInputData().m26328b(PARAM_DUMP_PATH);
        if (strM26328b == null || strM26328b.length() == 0) {
            return new C7852Kj0();
        }
        String strM26328b2 = getInputData().m26328b(PARAM_TAG);
        File file = new File(strM26328b);
        long length = file.length();
        if (length < 1048576) {
            Logger.d$default("Dump has not interesting size " + length + " < 1048576", null, 2, null);
            file.delete();
            return AbstractC8008Nj0.m5818a();
        }
        if (ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP(), null, 2, null)) {
            Logger.d$default("Not able to run dump shrinking", null, 2, null);
            file.delete();
            return AbstractC8008Nj0.m5818a();
        }
        try {
            TracerFiles tracerFiles = TracerFiles.INSTANCE;
            Context applicationContext = getApplicationContext();
            O90.m5967e(applicationContext, "applicationContext");
            File newSampleFile$default = TracerFiles.getNewSampleFile$default(tracerFiles, applicationContext, FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP(), null, 4, null);
            try {
                HprofFastInputStream hprofFastInputStreamDeflate = HprofFastInputStream.deflate(new BufferedInputStream(new FileInputStream(file)));
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newSampleFile$default));
                    try {
                        O90.m5967e(hprofFastInputStreamDeflate, "inS");
                        NP1.m5671a(hprofFastInputStreamDeflate, bufferedOutputStream, 8192);
                        AbstractC8729aT1.m9749a(bufferedOutputStream, null);
                        AbstractC8729aT1.m9749a(hprofFastInputStreamDeflate, null);
                        file.delete();
                        SampleUploader sampleUploader = SampleUploader.INSTANCE;
                        Context applicationContext2 = getApplicationContext();
                        O90.m5967e(applicationContext2, "applicationContext");
                        sampleUploader.upload(applicationContext2, FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP(), newSampleFile$default, (72 & 8) != 0, (72 & 16) != 0 ? null : strM26328b2, (72 & 32) != 0 ? null : Long.valueOf(length), (72 & 64) != 0 ? C0842NN.f7735a : null);
                        return AbstractC8008Nj0.m5818a();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                file.delete();
                throw th;
            }
        } catch (IOException unused) {
            return new C7852Kj0();
        }
    }
}
