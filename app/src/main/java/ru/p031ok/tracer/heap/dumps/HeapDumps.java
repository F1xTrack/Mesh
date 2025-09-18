package ru.p031ok.tracer.heap.dumps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Debug;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11374v51;
import p000.AbstractC6366lU;
import p000.C10075ky0;
import p000.C10203ly0;
import p000.C7249zC;
import p000.C7863Ko1;
import p000.C8383Uo1;
import p000.F91;
import p000.O90;
import p000.R20;
import p000.RunnableC1096RQ;
import ru.p031ok.tracer.Tracer;
import ru.p031ok.tracer.base.p032io.FileUtils;
import ru.p031ok.tracer.heap.dumps.exceptions.ShrinkDumpWorker;
import ru.p031ok.tracer.utils.Logger;
import ru.p031ok.tracer.utils.TracerFiles;
import ru.p031ok.tracer.utils.TracerThreads;
import ru.p031ok.tracer.utils.UncaughtExceptionHandlers;

@Metadata(m22266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c¨\u0006\u001e"}, m22267d2 = {"Lru/ok/tracer/heap/dumps/HeapDumps;", "", "<init>", "()V", "", "tag", "LTf1;", "runInternal", "(Ljava/lang/String;)V", "shrinkAndUpload", "Ljava/io/File;", "file", "cleanupFile", "(Ljava/io/File;)V", "Landroid/content/Context;", "context", "install$tracer_heap_dumps_release", "(Landroid/content/Context;)V", "install", "runNow", "DUMP_TMP_FILE_NAME", "Ljava/lang/String;", "META_TMP_FILE_NAME", "DUMP_FILE_NAME", "META_FILE_NAME", "Ljava/util/concurrent/atomic/AtomicBoolean;", "canDump", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroid/content/Context;", "DumpMeta", "tracer-heap-dumps_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
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

    @Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, m22267d2 = {"Lru/ok/tracer/heap/dumps/HeapDumps$DumpMeta;", "", "buildUuid", "", "tag", "(Ljava/lang/String;Ljava/lang/String;)V", "getBuildUuid", "()Ljava/lang/String;", "getTag", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "serialize", "toString", "Companion", "tracer-heap-dumps_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
    public static final /* data */ class DumpMeta {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String buildUuid;
        private final String tag;

        @Metadata(m22266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m22267d2 = {"Lru/ok/tracer/heap/dumps/HeapDumps$DumpMeta$Companion;", "", "()V", "parse", "Lru/ok/tracer/heap/dumps/HeapDumps$DumpMeta;", "string", "", "tracer-heap-dumps_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DumpMeta parse(String string) {
                O90.m5968f(string, "string");
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String strOptString = jSONObject.optString("buildUuid");
                    O90.m5967e(strOptString, "it");
                    if (AbstractC11374v51.m25328C(strOptString)) {
                        strOptString = null;
                    }
                    String strOptString2 = jSONObject.optString("tag");
                    O90.m5967e(strOptString2, "it");
                    return new DumpMeta(strOptString, AbstractC11374v51.m25328C(strOptString2) ? null : strOptString2);
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
            return O90.m5963a(this.buildUuid, dumpMeta.buildUuid) && O90.m5963a(this.tag, dumpMeta.tag);
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
            O90.m5967e(string, "jsonObject.toString()");
            return string;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("DumpMeta(buildUuid=");
            sb.append(this.buildUuid);
            sb.append(", tag=");
            return F91.m2539v(sb, this.tag, ')');
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
        O90.m5967e(th, "throwable");
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
        File fileM22437g = AbstractC6366lU.m22437g(tracerDir, DUMP_TMP_FILE_NAME);
        File fileM22437g2 = AbstractC6366lU.m22437g(tracerDir, META_TMP_FILE_NAME);
        try {
            FileUtils.mkdirsChecked(tracerDir);
            Debug.dumpHprofData(fileM22437g.getAbsolutePath());
            AbstractC6366lU.m22438h(fileM22437g2, new DumpMeta(buildUuid, tag).serialize());
        } catch (Exception unused) {
            cleanupFile(fileM22437g);
            cleanupFile(fileM22437g2);
        }
        File fileM22437g3 = AbstractC6366lU.m22437g(tracerDir, DUMP_FILE_NAME);
        File fileM22437g4 = AbstractC6366lU.m22437g(tracerDir, META_FILE_NAME);
        try {
            if (fileM22437g3.exists()) {
                FileUtils.deleteChecked(fileM22437g3);
            }
            if (fileM22437g4.exists()) {
                FileUtils.deleteChecked(fileM22437g4);
            }
            FileUtils.renameToChecked(fileM22437g, fileM22437g3);
            FileUtils.renameToChecked(fileM22437g2, fileM22437g4);
        } catch (Exception unused2) {
            cleanupFile(fileM22437g3);
            cleanupFile(fileM22437g4);
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
        File fileM22437g = AbstractC6366lU.m22437g(tracerDir, DUMP_FILE_NAME);
        File fileM22437g2 = AbstractC6366lU.m22437g(tracerDir, META_FILE_NAME);
        if (fileM22437g.exists() || fileM22437g2.exists()) {
            try {
                DumpMeta dumpMeta = DumpMeta.INSTANCE.parse(AbstractC6366lU.m22436f(fileM22437g2));
                FileUtils.deleteChecked(fileM22437g2);
                String buildUuid = dumpMeta.getBuildUuid();
                String buildUuid2 = Tracer.INSTANCE.getApplicationInfo().getBuildUuid();
                if (!O90.m5963a(buildUuid, buildUuid2)) {
                    throw new IllegalStateException(("Dump from different buildUuid. Current " + buildUuid2 + " != " + buildUuid).toString());
                }
                String tag = dumpMeta.getTag();
                File newSampleFile$default = TracerFiles.getNewSampleFile$default(tracerFiles, context2, FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP(), null, 4, null);
                FileUtils.renameToChecked(fileM22437g, newSampleFile$default);
                Logger.d$default("Schedule hprof upload", null, 2, null);
                C7249zC c7249zCCreateInputData$tracer_heap_dumps_release = ShrinkDumpWorker.INSTANCE.createInputData$tracer_heap_dumps_release(newSampleFile$default, tag);
                C10075ky0 c10075ky0 = new C10075ky0(ShrinkDumpWorker.class);
                O90.m5968f(c7249zCCreateInputData$tracer_heap_dumps_release, "inputData");
                ((C8383Uo1) c10075ky0.f28106c).f12138e = c7249zCCreateInputData$tracer_heap_dumps_release;
                TracerThreads.INSTANCE.runInBgAfterStartup(new RunnableC1096RQ(context2, 6, (C10203ly0) c10075ky0.m18675b()));
            } catch (Exception unused) {
                cleanupFile(fileM22437g);
                cleanupFile(fileM22437g2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void shrinkAndUpload$lambda$4(Context context2, C10203ly0 c10203ly0) {
        O90.m5968f(c10203ly0, "$workRequest");
        C7863Ko1.m4736d(context2).m4021a(c10203ly0);
    }

    public final void install$tracer_heap_dumps_release(Context context2) {
        O90.m5968f(context2, "context");
        context = context2;
        File tracerDir = TracerFiles.INSTANCE.getTracerDir(context2);
        HeapDumpConfiguration heapDumpConfiguration = HeapDumpConfiguration.INSTANCE.get$tracer_heap_dumps_release();
        cleanupFile(AbstractC6366lU.m22437g(tracerDir, DUMP_TMP_FILE_NAME));
        cleanupFile(AbstractC6366lU.m22437g(tracerDir, META_TMP_FILE_NAME));
        if (heapDumpConfiguration.getEnabled()) {
            UncaughtExceptionHandlers.prependDefault(new R20());
            shrinkAndUpload();
        } else {
            Logger.v$default("HeapDumps disabled", null, 2, null);
            cleanupFile(AbstractC6366lU.m22437g(tracerDir, DUMP_FILE_NAME));
            cleanupFile(AbstractC6366lU.m22437g(tracerDir, META_FILE_NAME));
            canDump.set(false);
        }
    }

    public final void runNow(String tag) throws IOException {
        O90.m5968f(tag, "tag");
        if (AbstractC11374v51.m25328C(tag)) {
            throw new IllegalArgumentException("Blank tag");
        }
        runInternal(tag);
    }
}
