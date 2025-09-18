package ru.ok.tracer.heap.dumps.exceptions;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.AbstractC1061Nj0;
import defpackage.AbstractC2141aT1;
import defpackage.C0828Kj0;
import defpackage.C8317zC;
import defpackage.NN;
import defpackage.NP1;
import defpackage.O90;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.tracer.heap.dumps.FEATURE_HEAP_DUMPKt;
import ru.ok.tracer.upload.SampleUploader;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import ru.ok.tracer.utils.config.ConfigStorage;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ok/tracer/heap/dumps/exceptions/ShrinkDumpWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "LNj0;", "doWork", "()LNj0;", "Companion", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ShrinkDumpWorker extends Worker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int MINIMUM_DUMP_SIZE = 1048576;
    public static final String PARAM_DUMP_PATH = "param_dump_path";
    private static final String PARAM_TAG = "param_tag";

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087T¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"Lru/ok/tracer/heap/dumps/exceptions/ShrinkDumpWorker$Companion;", "", "<init>", "()V", "Ljava/io/File;", "dumpFile", "LzC;", "createInputData", "(Ljava/io/File;)LzC;", "", "tag", "createInputData$tracer_heap_dumps_release", "(Ljava/io/File;Ljava/lang/String;)LzC;", "PARAM_DUMP_PATH", "Ljava/lang/String;", "getPARAM_DUMP_PATH$annotations", "", "MINIMUM_DUMP_SIZE", "I", "PARAM_TAG", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getPARAM_DUMP_PATH$annotations() {
        }

        public final C8317zC createInputData(File dumpFile) {
            O90.f(dumpFile, "dumpFile");
            return createInputData$tracer_heap_dumps_release(dumpFile, null);
        }

        public final C8317zC createInputData$tracer_heap_dumps_release(File dumpFile, String tag) throws Throwable {
            O90.f(dumpFile, "dumpFile");
            HashMap map = new HashMap();
            map.put(ShrinkDumpWorker.PARAM_DUMP_PATH, dumpFile.getPath());
            map.put(ShrinkDumpWorker.PARAM_TAG, tag);
            C8317zC c8317zC = new C8317zC(map);
            C8317zC.c(c8317zC);
            return c8317zC;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShrinkDumpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        O90.f(context, "context");
        O90.f(workerParameters, "workerParams");
    }

    public static final C8317zC createInputData(File file) {
        return INSTANCE.createInputData(file);
    }

    /* JADX WARN: Finally extract failed */
    @Override // androidx.work.Worker
    public AbstractC1061Nj0 doWork() {
        String strB = getInputData().b(PARAM_DUMP_PATH);
        if (strB == null || strB.length() == 0) {
            return new C0828Kj0();
        }
        String strB2 = getInputData().b(PARAM_TAG);
        File file = new File(strB);
        long length = file.length();
        if (length < 1048576) {
            Logger.d$default("Dump has not interesting size " + length + " < 1048576", null, 2, null);
            file.delete();
            return AbstractC1061Nj0.a();
        }
        if (ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP(), null, 2, null)) {
            Logger.d$default("Not able to run dump shrinking", null, 2, null);
            file.delete();
            return AbstractC1061Nj0.a();
        }
        try {
            TracerFiles tracerFiles = TracerFiles.INSTANCE;
            Context applicationContext = getApplicationContext();
            O90.e(applicationContext, "applicationContext");
            File newSampleFile$default = TracerFiles.getNewSampleFile$default(tracerFiles, applicationContext, FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP(), null, 4, null);
            try {
                HprofFastInputStream hprofFastInputStreamDeflate = HprofFastInputStream.deflate(new BufferedInputStream(new FileInputStream(file)));
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(newSampleFile$default));
                    try {
                        O90.e(hprofFastInputStreamDeflate, "inS");
                        NP1.a(hprofFastInputStreamDeflate, bufferedOutputStream, 8192);
                        AbstractC2141aT1.a(bufferedOutputStream, null);
                        AbstractC2141aT1.a(hprofFastInputStreamDeflate, null);
                        file.delete();
                        SampleUploader sampleUploader = SampleUploader.INSTANCE;
                        Context applicationContext2 = getApplicationContext();
                        O90.e(applicationContext2, "applicationContext");
                        sampleUploader.upload(applicationContext2, FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP(), newSampleFile$default, (72 & 8) != 0, (72 & 16) != 0 ? null : strB2, (72 & 32) != 0 ? null : Long.valueOf(length), (72 & 64) != 0 ? NN.a : null);
                        return AbstractC1061Nj0.a();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                file.delete();
                throw th;
            }
        } catch (IOException unused) {
            return new C0828Kj0();
        }
    }
}
