package ru.ok.tracer.crash.report;

import android.content.Context;
import defpackage.AbstractC0236Cu;
import defpackage.AbstractC2141aT1;
import defpackage.AbstractC5702lU;
import defpackage.AbstractC8069xu;
import defpackage.AbstractC8259yu;
import defpackage.C6512pj0;
import defpackage.GT1;
import defpackage.MN;
import defpackage.O90;
import defpackage.RunnableC1557Ts1;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.tracer.base.io.FileUtils;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerFiles;
import ru.ok.tracer.utils.TracerThreads;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u0000 32\u00020\u0001:\u0003345B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8F¢\u0006\u0006\u001a\u0004\b1\u0010/¨\u00066"}, d2 = {"Lru/ok/tracer/crash/report/LogStorage;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "LTf1;", "ensureLogStateWrite", "()V", "Lru/ok/tracer/crash/report/LogStorage$PrevLogsState;", "toPrevLogsState", "ensurePrevLogsState", "(Lru/ok/tracer/crash/report/LogStorage$PrevLogsState;)V", "clearPrevLogs", "", "message", "log", "(Ljava/lang/String;)V", "kotlin.jvm.PlatformType", "appContext", "Landroid/content/Context;", "Ljava/lang/Object;", "lock", "Ljava/lang/Object;", "prevLogsState", "Lru/ok/tracer/crash/report/LogStorage$PrevLogsState;", "", "Lru/ok/tracer/crash/report/LogEntry;", "prevLogsData", "Ljava/util/List;", "Lru/ok/tracer/crash/report/LogStorage$LogsState;", "logsState", "Lru/ok/tracer/crash/report/LogStorage$LogsState;", "Ljava/io/File;", "logsFile", "Ljava/io/File;", "", "logsFileLinesLength", "I", "logsApiLinesLength", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "logsData", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "", "logsStartTimeMillis", "J", "getPrevLogs", "()Ljava/util/List;", "prevLogs", "getLogs", LogStorage.DIR_USER_LOGS, "Companion", "LogsState", "PrevLogsState", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LogStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DIR_USER_LOGS = "logs";
    private static final String LOGS_FILE_A = "a.log";
    private static final String LOGS_FILE_B = "b.log";
    private static final String LOGS_FILE_STASH_A = "stash-a.log";
    private static final String LOGS_FILE_STASH_B = "stash-b.log";
    private final Context appContext;
    private final Object lock;
    private int logsApiLinesLength;
    private final ConcurrentLinkedQueue<LogEntry> logsData;
    private File logsFile;
    private int logsFileLinesLength;
    private final long logsStartTimeMillis;
    private LogsState logsState;
    private List<LogEntry> prevLogsData;
    private volatile PrevLogsState prevLogsState;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ;\u0010\u000b\u001a\u00020\u00072*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n0\u0004\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lru/ok/tracer/crash/report/LogStorage$Companion;", "", "<init>", "()V", "", "Ljava/io/File;", "files", "LTf1;", "deleteIfExist", "([Ljava/io/File;)V", "Lkotlin/Pair;", "renameIfExist", "([Lkotlin/Pair;)V", "", "Lru/ok/tracer/crash/report/LogEntry;", "readIfExist", "([Ljava/io/File;)Ljava/util/List;", "file", "readIfExists", "(Ljava/io/File;)Ljava/util/List;", "", "DIR_USER_LOGS", "Ljava/lang/String;", "LOGS_FILE_A", "LOGS_FILE_B", "LOGS_FILE_STASH_A", "LOGS_FILE_STASH_B", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void deleteIfExist(File... files) {
            for (File file : files) {
                if (file.exists()) {
                    try {
                        FileUtils.deleteChecked(file);
                    } catch (IOException unused) {
                        file.toString();
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<ru.ok.tracer.crash.report.LogEntry> readIfExist(java.io.File... r12) {
            /*
                r11 = this;
                n8 r0 = new n8
                r0.<init>()
                int r1 = r12.length
                r2 = 0
                r3 = r2
            L8:
                if (r3 >= r1) goto L81
                r4 = r12[r3]
                ru.ok.tracer.crash.report.LogStorage$Companion r5 = ru.ok.tracer.crash.report.LogStorage.INSTANCE
                java.util.List r4 = r5.readIfExists(r4)
                boolean r5 = r4.isEmpty()
                if (r5 == 0) goto L19
                goto L7e
            L19:
                boolean r5 = r0.isEmpty()
                if (r5 != 0) goto L79
                boolean r5 = r0.isEmpty()
                if (r5 != 0) goto L71
                java.lang.Object[] r5 = r0.b
                int r6 = r0.a
                int r7 = defpackage.AbstractC8259yu.d(r0)
                int r7 = r7 + r6
                int r6 = r0.u(r7)
                r5 = r5[r6]
                ru.ok.tracer.crash.report.LogEntry r5 = (ru.ok.tracer.crash.report.LogEntry) r5
                long r5 = r5.getTs()
                java.lang.Object r7 = defpackage.AbstractC8069xu.A(r4)
                ru.ok.tracer.crash.report.LogEntry r7 = (ru.ok.tracer.crash.report.LogEntry) r7
                long r7 = r7.getTs()
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L49
                goto L79
            L49:
                int r5 = r0.b()
                r6 = r2
            L4e:
                if (r6 >= r5) goto L7e
                java.lang.Object r7 = r0.get(r6)
                ru.ok.tracer.crash.report.LogEntry r7 = (ru.ok.tracer.crash.report.LogEntry) r7
                long r7 = r7.getTs()
                java.lang.Object r9 = defpackage.AbstractC8069xu.J(r4)
                ru.ok.tracer.crash.report.LogEntry r9 = (ru.ok.tracer.crash.report.LogEntry) r9
                long r9 = r9.getTs()
                int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r7 <= 0) goto L6e
                java.util.Collection r4 = (java.util.Collection) r4
                r0.addAll(r6, r4)
                goto L7e
            L6e:
                int r6 = r6 + 1
                goto L4e
            L71:
                java.util.NoSuchElementException r12 = new java.util.NoSuchElementException
                java.lang.String r0 = "ArrayDeque is empty."
                r12.<init>(r0)
                throw r12
            L79:
                java.util.Collection r4 = (java.util.Collection) r4
                r0.addAll(r4)
            L7e:
                int r3 = r3 + 1
                goto L8
            L81:
                java.util.Iterator r12 = r0.iterator()
            L85:
                boolean r1 = r12.hasNext()
                if (r1 == 0) goto L97
                java.lang.Object r1 = r12.next()
                ru.ok.tracer.crash.report.LogEntry r1 = (ru.ok.tracer.crash.report.LogEntry) r1
                int r1 = r1.getApiLineLength()
                int r2 = r2 + r1
                goto L85
            L97:
                r12 = 65536(0x10000, float:9.1835E-41)
                if (r2 <= r12) goto La7
                java.lang.Object r12 = r0.y()
                ru.ok.tracer.crash.report.LogEntry r12 = (ru.ok.tracer.crash.report.LogEntry) r12
                int r12 = r12.getApiLineLength()
                int r2 = r2 - r12
                goto L97
            La7:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.tracer.crash.report.LogStorage.Companion.readIfExist(java.io.File[]):java.util.List");
        }

        private final List<LogEntry> readIfExists(File file) {
            boolean zExists = file.exists();
            MN mn = MN.a;
            if (!zExists) {
                return mn;
            }
            try {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(AbstractC5702lU.d(file));
                C6512pj0 c6512pj0C = AbstractC8259yu.c();
                while (byteBufferWrap.hasRemaining()) {
                    try {
                        c6512pj0C.add(LogEntry.INSTANCE.parseFromStorage(byteBufferWrap));
                    } catch (BufferUnderflowException unused) {
                    }
                }
                if (c6512pj0C.b() > 1) {
                    AbstractC0236Cu.l(c6512pj0C, new Comparator() { // from class: ru.ok.tracer.crash.report.LogStorage$Companion$readIfExists$lambda$3$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return GT1.b(Long.valueOf(((LogEntry) t).getTs()), Long.valueOf(((LogEntry) t2).getTs()));
                        }
                    });
                }
                return AbstractC8259yu.b(c6512pj0C);
            } catch (Exception unused2) {
                file.toString();
                return mn;
            }
        }

        public final void renameIfExist(Pair<? extends File, ? extends File>... files) {
            for (Pair<? extends File, ? extends File> pair : files) {
                File file = (File) pair.a;
                File file2 = (File) pair.b;
                if (file.exists()) {
                    try {
                        file.renameTo(file2);
                    } catch (IOException unused) {
                        file.toString();
                        Objects.toString(file2);
                    }
                }
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ok/tracer/crash/report/LogStorage$LogsState;", "", "(Ljava/lang/String;I)V", "NONE", "WRITE_A", "WRITE_B", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum LogsState {
        NONE,
        WRITE_A,
        WRITE_B
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/tracer/crash/report/LogStorage$PrevLogsState;", "", "(Ljava/lang/String;I)V", "NONE", "STASHED", "LOADED", "CLEAN", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum PrevLogsState {
        NONE,
        STASHED,
        LOADED,
        CLEAN
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LogsState.values().length];
            try {
                iArr[LogsState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogsState.WRITE_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogsState.WRITE_B.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PrevLogsState.values().length];
            try {
                iArr2[PrevLogsState.STASHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PrevLogsState.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PrevLogsState.CLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PrevLogsState.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public LogStorage(Context context) {
        O90.f(context, "context");
        this.appContext = context.getApplicationContext();
        this.lock = new Object();
        this.prevLogsState = PrevLogsState.NONE;
        this.logsState = LogsState.NONE;
        this.logsData = new ConcurrentLinkedQueue<>();
        this.logsStartTimeMillis = System.currentTimeMillis();
    }

    private final void ensureLogStateWrite() {
        TracerFiles tracerFiles = TracerFiles.INSTANCE;
        Context context = this.appContext;
        O90.e(context, "appContext");
        File fileG = AbstractC5702lU.g(tracerFiles.getTracerDir(context), DIR_USER_LOGS);
        try {
            FileUtils.mkdirsChecked(fileG);
        } catch (IOException unused) {
            Logger.e$default("Cannot create dir " + fileG, null, 2, null);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.logsState.ordinal()];
        if (i == 1) {
            File fileG2 = AbstractC5702lU.g(fileG, LOGS_FILE_A);
            INSTANCE.deleteIfExist(fileG2, AbstractC5702lU.g(fileG, LOGS_FILE_B));
            this.logsFile = fileG2;
            this.logsState = LogsState.WRITE_A;
            return;
        }
        if (i == 2) {
            File file = this.logsFile;
            if (file == null) {
                O90.o("logsFile");
                throw null;
            }
            if (file.length() > 65536) {
                File fileG3 = AbstractC5702lU.g(fileG, LOGS_FILE_B);
                INSTANCE.deleteIfExist(fileG3);
                this.logsFile = fileG3;
                this.logsFileLinesLength = 0;
                this.logsState = LogsState.WRITE_B;
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        File file2 = this.logsFile;
        if (file2 == null) {
            O90.o("logsFile");
            throw null;
        }
        if (file2.length() > 65536) {
            File fileG4 = AbstractC5702lU.g(fileG, LOGS_FILE_A);
            INSTANCE.deleteIfExist(fileG4);
            this.logsFile = fileG4;
            this.logsFileLinesLength = 0;
            this.logsState = LogsState.WRITE_A;
        }
    }

    private final void ensurePrevLogsState(PrevLogsState toPrevLogsState) {
        if (this.prevLogsState.compareTo(toPrevLogsState) >= 0) {
            return;
        }
        synchronized (this.lock) {
            try {
                PrevLogsState prevLogsState = this.prevLogsState;
                if (prevLogsState.compareTo(toPrevLogsState) >= 0) {
                    return;
                }
                TracerFiles tracerFiles = TracerFiles.INSTANCE;
                Context context = this.appContext;
                O90.e(context, "appContext");
                File fileG = AbstractC5702lU.g(tracerFiles.getTracerDir(context), DIR_USER_LOGS);
                File fileG2 = AbstractC5702lU.g(fileG, LOGS_FILE_A);
                File fileG3 = AbstractC5702lU.g(fileG, LOGS_FILE_B);
                File fileG4 = AbstractC5702lU.g(fileG, LOGS_FILE_STASH_A);
                File fileG5 = AbstractC5702lU.g(fileG, LOGS_FILE_STASH_B);
                int[] iArr = WhenMappings.$EnumSwitchMapping$1;
                int i = iArr[prevLogsState.ordinal()];
                if (i == 1) {
                    int i2 = iArr[toPrevLogsState.ordinal()];
                    if (i2 == 2) {
                        Companion companion = INSTANCE;
                        this.prevLogsData = companion.readIfExist(fileG4, fileG5);
                        companion.deleteIfExist(fileG4, fileG5);
                    } else {
                        if (i2 != 3) {
                            throw new AssertionError("Unreachable code");
                        }
                        INSTANCE.deleteIfExist(fileG4, fileG5);
                    }
                } else if (i != 2) {
                    if (i != 4) {
                        throw new AssertionError("Unreachable code");
                    }
                    int i3 = iArr[toPrevLogsState.ordinal()];
                    if (i3 == 1) {
                        Companion companion2 = INSTANCE;
                        companion2.deleteIfExist(fileG4, fileG5);
                        companion2.renameIfExist(new Pair(fileG2, fileG4), new Pair(fileG3, fileG5));
                    } else if (i3 == 2) {
                        Companion companion3 = INSTANCE;
                        this.prevLogsData = companion3.readIfExist(fileG2, fileG3);
                        companion3.deleteIfExist(fileG2, fileG3);
                    } else {
                        if (i3 != 3) {
                            throw new AssertionError("Unreachable code");
                        }
                        Companion companion4 = INSTANCE;
                        companion4.deleteIfExist(fileG4, fileG5);
                        companion4.deleteIfExist(fileG2, fileG3);
                    }
                } else {
                    if (iArr[toPrevLogsState.ordinal()] != 3) {
                        throw new AssertionError("Unreachable code");
                    }
                    this.prevLogsData = null;
                }
                this.prevLogsState = toPrevLogsState;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void log$lambda$2(LogStorage logStorage, String str, LogEntry logEntry) {
        O90.f(logStorage, "this$0");
        O90.f(str, "$message");
        O90.f(logEntry, "$logEntry");
        logStorage.ensurePrevLogsState(PrevLogsState.STASHED);
        logStorage.ensureLogStateWrite();
        try {
            File file = logStorage.logsFile;
            if (file == null) {
                O90.o("logsFile");
                throw null;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file, true));
            try {
                logEntry.writeToStorage(dataOutputStream);
                AbstractC2141aT1.a(dataOutputStream, null);
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public final void clearPrevLogs() {
        ensurePrevLogsState(PrevLogsState.CLEAN);
    }

    public final List<LogEntry> getLogs() {
        return AbstractC8069xu.b0(this.logsData);
    }

    public final List<LogEntry> getPrevLogs() {
        ensurePrevLogsState(PrevLogsState.LOADED);
        List<LogEntry> list = this.prevLogsData;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Cannot get prev logs after clear");
    }

    public final void log(String message) {
        O90.f(message, "message");
        LogEntry logEntryInvoke = LogEntry.INSTANCE.invoke(System.currentTimeMillis() - this.logsStartTimeMillis, message);
        this.logsData.add(logEntryInvoke);
        this.logsApiLinesLength = logEntryInvoke.getApiLineLength() + this.logsApiLinesLength;
        while (this.logsApiLinesLength > 65536) {
            LogEntry logEntryPoll = this.logsData.poll();
            if (logEntryPoll != null) {
                this.logsApiLinesLength -= logEntryPoll.getApiLineLength();
            } else {
                this.logsApiLinesLength = 0;
            }
        }
        TracerThreads.INSTANCE.runInBgSequential(new RunnableC1557Ts1(this, message, logEntryInvoke, 27));
    }
}
