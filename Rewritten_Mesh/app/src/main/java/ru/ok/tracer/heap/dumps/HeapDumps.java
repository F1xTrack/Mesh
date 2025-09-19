package ru.ok.tracer.heap.dumps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Debug;
import defpackage.AbstractC5702lU;
import defpackage.AbstractC7538v51;
import defpackage.C0844Ko1;
import defpackage.C1623Uo1;
import defpackage.C5602ky0;
import defpackage.C5793ly0;
import defpackage.C8317zC;
import defpackage.F91;
import defpackage.O90;
import defpackage.R20;
import defpackage.RQ;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.heap.dumps.exceptions.ShrinkDumpWorker;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import ru.ok.tracer.utils.TracerThreads;
import ru.ok.tracer.utils.UncaughtExceptionHandlers;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ok/tracer/heap/dumps/HeapDumps;", "", "<init>", "()V", "", "tag", "LTf1;", "runInternal", "(Ljava/lang/String;)V", "shrinkAndUpload", "Ljava/io/File;", "file", "cleanupFile", "(Ljava/io/File;)V", "Landroid/content/Context;", "context", "install$tracer_heap_dumps_release", "(Landroid/content/Context;)V", "install", "runNow", "DUMP_TMP_FILE_NAME", "Ljava/lang/String;", "META_TMP_FILE_NAME", "DUMP_FILE_NAME", "META_FILE_NAME", "Ljava/util/concurrent/atomic/AtomicBoolean;", "canDump", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroid/content/Context;", "DumpMeta", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public final class HeapDumps {
    private static final String DUMP_FILE_NAME = "dump.hprof";
    private static final String DUMP_TMP_FILE_NAME = "dump-tmp.hprof";
    private static final String META_FILE_NAME = "dump-meta.json";
    private static final String META_TMP_FILE_NAME = "dump-tmp-meta.json";
    private static Context context;
    public static final HeapDumps INSTANCE = new HeapDumps();
    private static final AtomicBoolean canDump = new AtomicBoolean(true);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lru/ok/tracer/heap/dumps/HeapDumps$DumpMeta;", "", "buildUuid", "", "tag", "(Ljava/lang/String;Ljava/lang/String;)V", "getBuildUuid", "()Ljava/lang/String;", "getTag", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "serialize", "toString", "Companion", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class DumpMeta {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String buildUuid;
        private final String tag;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tracer/heap/dumps/HeapDumps$DumpMeta$Companion;", "", "()V", "parse", "Lru/ok/tracer/heap/dumps/HeapDumps$DumpMeta;", "string", "", "tracer-heap-dumps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DumpMeta parse(String string) {
                O90.f(string, "string");
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String strOptString = jSONObject.optString("buildUuid");
                    O90.e(strOptString, "it");
                    if (AbstractC7538v51.C(strOptString)) {
                        strOptString = null;
                    }
                    String strOptString2 = jSONObject.optString("tag");
                    O90.e(strOptString2, "it");
                    return new DumpMeta(strOptString, AbstractC7538v51.C(strOptString2) ? null : strOptString2);
                } catch (Exception e) {
                    throw new IllegalArgumentException(e);
                }
            }

            private Companion() {
            }
        }

        public DumpMeta(String str, String str2) {
            this.buildUuid = str;
            this.tag = str2;
        }

        public static /* synthetic */ DumpMeta copy$default(DumpMeta dumpMeta, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dumpMeta.buildUuid;
            }
            if ((i & 2) != 0) {
                str2 = dumpMeta.tag;
            }
            return dumpMeta.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBuildUuid() {
            return this.buildUuid;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public final DumpMeta copy(String buildUuid, String tag) {
            return new DumpMeta(buildUuid, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DumpMeta)) {
                return false;
            }
            DumpMeta dumpMeta = (DumpMeta) other;
            return O90.a(this.buildUuid, dumpMeta.buildUuid) && O90.a(this.tag, dumpMeta.tag);
        }

        public final String getBuildUuid() {
            return this.buildUuid;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            String str = this.buildUuid;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.tag;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String serialize() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("buildUuid", this.buildUuid);
            jSONObject.put("tag", this.tag);
            String string = jSONObject.toString();
            O90.e(string, "jsonObject.toString()");
            return string;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DumpMeta(buildUuid=");
            sb.append(this.buildUuid);
            sb.append(", tag=");
            return F91.v(sb, this.tag, ')');
        }
    }

    private HeapDumps() {
    }

    private final void cleanupFile(File file) {
        if (file.exists()) {
            Logger.d$default("Removing file " + file, null, 2, null);
            file.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void install$lambda$0(Thread thread, Throwable th) throws IOException {
        O90.e(th, "throwable");
        if (OutOfMemoryErrors.isOom(th)) {
            INSTANCE.runInternal(null);
        }
    }

    private final void runInternal(String tag) throws IOException {
        Context context2 = context;
        if (context2 == null) {
            Logger.e$default("HeapDumps not initialized", null, 2, null);
            return;
        }
        if (!canDump.getAndSet(false)) {
            Logger.d$default("Cannot run hprof", null, 2, null);
            return;
        }
        String buildUuid = Tracer.INSTANCE.getApplicationInfo().getBuildUuid();
        File tracerDir = TracerFiles.INSTANCE.getTracerDir(context2);
        File fileG = AbstractC5702lU.g(tracerDir, DUMP_TMP_FILE_NAME);
        File fileG2 = AbstractC5702lU.g(tracerDir, META_TMP_FILE_NAME);
        try {
            FileUtils.mkdirsChecked(tracerDir);
            Debug.dumpHprofData(fileG.getAbsolutePath());
            AbstractC5702lU.h(fileG2, new DumpMeta(buildUuid, tag).serialize());
        } catch (Exception unused) {
            cleanupFile(fileG);
            cleanupFile(fileG2);
        }
        File fileG3 = AbstractC5702lU.g(tracerDir, DUMP_FILE_NAME);
        File fileG4 = AbstractC5702lU.g(tracerDir, META_FILE_NAME);
        try {
            if (fileG3.exists()) {
                FileUtils.deleteChecked(fileG3);
            }
            if (fileG4.exists()) {
                FileUtils.deleteChecked(fileG4);
            }
            FileUtils.renameToChecked(fileG, fileG3);
            FileUtils.renameToChecked(fileG2, fileG4);
        } catch (Exception unused2) {
            cleanupFile(fileG3);
            cleanupFile(fileG4);
        }
    }

    private final void shrinkAndUpload() throws Throwable {
        Context context2 = context;
        if (context2 == null) {
            Logger.e$default("HeapDumps not initialized", null, 2, null);
            return;
        }
        TracerFiles tracerFiles = TracerFiles.INSTANCE;
        File tracerDir = tracerFiles.getTracerDir(context2);
        File fileG = AbstractC5702lU.g(tracerDir, DUMP_FILE_NAME);
        File fileG2 = AbstractC5702lU.g(tracerDir, META_FILE_NAME);
        if (fileG.exists() || fileG2.exists()) {
            try {
                DumpMeta dumpMeta = DumpMeta.INSTANCE.parse(AbstractC5702lU.f(fileG2));
                FileUtils.deleteChecked(fileG2);
                String buildUuid = dumpMeta.getBuildUuid();
                String buildUuid2 = Tracer.INSTANCE.getApplicationInfo().getBuildUuid();
                if (!O90.a(buildUuid, buildUuid2)) {
                    throw new IllegalStateException(("Dump from different buildUuid. Current " + buildUuid2 + " != " + buildUuid).toString());
                }
                String tag = dumpMeta.getTag();
                File newSampleFile$default = TracerFiles.getNewSampleFile$default(tracerFiles, context2, FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP(), null, 4, null);
                FileUtils.renameToChecked(fileG, newSampleFile$default);
                Logger.d$default("Schedule hprof upload", null, 2, null);
                C8317zC c8317zCCreateInputData$tracer_heap_dumps_release = ShrinkDumpWorker.INSTANCE.createInputData$tracer_heap_dumps_release(newSampleFile$default, tag);
                C5602ky0 c5602ky0 = new C5602ky0(ShrinkDumpWorker.class);
                O90.f(c8317zCCreateInputData$tracer_heap_dumps_release, "inputData");
                ((C1623Uo1) c5602ky0.c).e = c8317zCCreateInputData$tracer_heap_dumps_release;
                TracerThreads.INSTANCE.runInBgAfterStartup(new RQ(context2, 6, (C5793ly0) c5602ky0.b()));
            } catch (Exception unused) {
                cleanupFile(fileG);
                cleanupFile(fileG2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shrinkAndUpload$lambda$4(Context context2, C5793ly0 c5793ly0) {
        O90.f(c5793ly0, "$workRequest");
        C0844Ko1.d(context2).a(c5793ly0);
    }

    public final void install$tracer_heap_dumps_release(Context context2) {
        O90.f(context2, "context");
        context = context2;
        File tracerDir = TracerFiles.INSTANCE.getTracerDir(context2);
        HeapDumpConfiguration heapDumpConfiguration = HeapDumpConfiguration.INSTANCE.get$tracer_heap_dumps_release();
        cleanupFile(AbstractC5702lU.g(tracerDir, DUMP_TMP_FILE_NAME));
        cleanupFile(AbstractC5702lU.g(tracerDir, META_TMP_FILE_NAME));
        if (heapDumpConfiguration.getEnabled()) {
            UncaughtExceptionHandlers.prependDefault(new R20());
            shrinkAndUpload();
        } else {
            Logger.v$default("HeapDumps disabled", null, 2, null);
            cleanupFile(AbstractC5702lU.g(tracerDir, DUMP_FILE_NAME));
            cleanupFile(AbstractC5702lU.g(tracerDir, META_FILE_NAME));
            canDump.set(false);
        }
    }

    public final void runNow(String tag) throws IOException {
        O90.f(tag, "tag");
        if (AbstractC7538v51.C(tag)) {
            throw new IllegalArgumentException("Blank tag");
        }
        runInternal(tag);
    }
}
