package ru.p031ok.tracer.crash.report;

import android.content.Context;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import p000.AbstractC0183Cu;
import p000.AbstractC11374v51;
import p000.AbstractC6366lU;
import p000.AbstractC7038vr;
import p000.AbstractC7167xu;
import p000.AbstractC8729aT1;
import p000.C0779MN;
import p000.C0842NN;
import p000.C4209hv;
import p000.GT1;
import p000.O90;
import ru.p031ok.tracer.SystemState;
import ru.p031ok.tracer.base.stacktrace.ThrowableUtils;
import ru.p031ok.tracer.utils.Logger;
import ru.p031ok.tracer.utils.TracerFiles;

@Metadata(m22266d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJc\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00142\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011¢\u0006\u0004\b\u001b\u0010\u001cJc\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00142\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011¢\u0006\u0004\b\u001b\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%¨\u0006'"}, m22267d2 = {"Lru/ok/tracer/crash/report/CrashStorage;", "", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "Ljava/io/File;", "crashDir", "Lru/ok/tracer/crash/report/CrashDescription;", "read", "(Ljava/io/File;)Lru/ok/tracer/crash/report/CrashDescription;", "Lru/ok/tracer/crash/report/CrashType;", "type", "", "throwable", "Lru/ok/tracer/SystemState;", "systemState", "", "", CrashStorage.FILE_TAGS, "", "Ljava/lang/Thread;", "", "Ljava/lang/StackTraceElement;", "allStackTraces", "Lru/ok/tracer/crash/report/LogEntry;", "logs", "save", "(Lru/ok/tracer/crash/report/CrashType;Ljava/lang/Throwable;Lru/ok/tracer/SystemState;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)Lru/ok/tracer/crash/report/CrashDescription;", "", RemoteMessageConst.Notification.CONTENT, "(Lru/ok/tracer/crash/report/CrashType;[BLru/ok/tracer/SystemState;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)Lru/ok/tracer/crash/report/CrashDescription;", "LTf1;", "deleteAll", "()V", "readAll", "()Ljava/util/List;", "Landroid/content/Context;", "Companion", "tracer-crash-report_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class CrashStorage {
    private static final String DIR_CRASHES = "crashes";
    private static final String FILE_ALL_STACKTRACES = "all_stacktraces";
    private static final String FILE_LOGS = "all_logs";
    private static final String FILE_STACKTRACE = "stacktrace";
    private static final String FILE_SYSTEM_INFO = "system_info";
    private static final String FILE_TAGS = "tags";
    private static final String MAIN_THREAD_NAME = "main";
    private static final Comparator<Thread> THREAD_COMPARATOR;
    private final Context appContext;
    private static final Comparator<Thread> THREAD_MAIN_FIRST_COMPARATOR = new Comparator<Thread>() { // from class: ru.ok.tracer.crash.report.CrashStorage$Companion$THREAD_MAIN_FIRST_COMPARATOR$1
        @Override // java.util.Comparator
        public int compare(Thread t1, Thread t2) {
            if (O90.m5963a(t1 != null ? t1.getName() : null, "main")) {
                return -1;
            }
            if (O90.m5963a(t2 != null ? t2.getName() : null, "main")) {
                return 1;
            }
            return CrashStorage.THREAD_COMPARATOR.compare(t1, t2);
        }
    };

    static {
        final C4209hv c4209hv = new C4209hv(0, new Comparator() { // from class: ru.ok.tracer.crash.report.CrashStorage$special$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return GT1.m3070b(((Thread) t).getName(), ((Thread) t2).getName());
            }
        });
        final Comparator comparator = new Comparator() { // from class: ru.ok.tracer.crash.report.CrashStorage$special$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = c4209hv.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                Thread thread = (Thread) t;
                Thread thread2 = (Thread) t2;
                return GT1.m3070b(thread != null ? Long.valueOf(thread.getId()) : 0, thread2 != null ? Long.valueOf(thread2.getId()) : 0);
            }
        };
        THREAD_COMPARATOR = new Comparator() { // from class: ru.ok.tracer.crash.report.CrashStorage$special$$inlined$thenBy$2
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare != 0 ? iCompare : GT1.m3070b(Integer.valueOf(System.identityHashCode(t)), Integer.valueOf(System.identityHashCode(t2)));
            }
        };
    }

    public CrashStorage(Context context) {
        O90.m5968f(context, "appContext");
        this.appContext = context;
    }

    private final CrashDescription read(File crashDir) throws Exception {
        try {
            String name = crashDir.getName();
            O90.m5967e(name, "crashDirName");
            int iM25331F = AbstractC11374v51.m25331F(name, '_', 0, 6);
            if (iM25331F < 0) {
                throw new IllegalStateException("Malformed directory name ".concat(name).toString());
            }
            String strSubstring = name.substring(0, iM25331F);
            O90.m5967e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            CrashType crashTypeValueOf = CrashType.valueOf(strSubstring);
            String strSubstring2 = name.substring(iM25331F + 1);
            O90.m5967e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            long j = Long.parseLong(strSubstring2);
            File fileM22437g = AbstractC6366lU.m22437g(crashDir, FILE_SYSTEM_INFO);
            if (!fileM22437g.exists()) {
                throw new IllegalStateException("No system info file");
            }
            File fileM22437g2 = AbstractC6366lU.m22437g(crashDir, FILE_STACKTRACE);
            if (!fileM22437g2.exists()) {
                throw new IllegalStateException("No stacktrace file");
            }
            File fileM22437g3 = AbstractC6366lU.m22437g(crashDir, FILE_TAGS);
            File fileM22437g4 = AbstractC6366lU.m22437g(crashDir, FILE_ALL_STACKTRACES);
            File fileM22437g5 = AbstractC6366lU.m22437g(crashDir, FILE_LOGS);
            String path = crashDir.getPath();
            O90.m5967e(path, "crashDir.path");
            String path2 = fileM22437g.getPath();
            O90.m5967e(path2, "systemInfoFile.path");
            String path3 = fileM22437g3.getPath();
            O90.m5967e(path3, "tagsFile.path");
            String path4 = fileM22437g2.getPath();
            O90.m5967e(path4, "stacktraceFile.path");
            String path5 = fileM22437g4.getPath();
            O90.m5967e(path5, "allStacktracesFile.path");
            String path6 = fileM22437g5.getPath();
            O90.m5967e(path6, "logsFile.path");
            return new CrashDescription(j, crashTypeValueOf, path, path2, path3, path4, path5, path6);
        } catch (Exception e) {
            AbstractC6366lU.m22433c(crashDir);
            throw e;
        }
    }

    public static /* synthetic */ CrashDescription save$default(CrashStorage crashStorage, CrashType crashType, Throwable th, SystemState systemState, List list, Map map, List list2, int i, Object obj) {
        int i2 = i & 8;
        C0779MN c0779mn = C0779MN.f7117a;
        return crashStorage.save(crashType, th, systemState, (List<String>) (i2 != 0 ? c0779mn : list), (Map<Thread, StackTraceElement[]>) ((i & 16) != 0 ? C0842NN.f7735a : map), (List<LogEntry>) ((i & 32) != 0 ? c0779mn : list2));
    }

    public final void deleteAll() {
        File fileM22437g = AbstractC6366lU.m22437g(TracerFiles.INSTANCE.getTracerDir(this.appContext), DIR_CRASHES);
        if (fileM22437g.exists() && !AbstractC6366lU.m22433c(fileM22437g)) {
            Logger.d$default("Can't delete crashes", null, 2, null);
        }
    }

    public final List<CrashDescription> readAll() {
        File fileM22437g = AbstractC6366lU.m22437g(TracerFiles.INSTANCE.getTracerDir(this.appContext), DIR_CRASHES);
        boolean zExists = fileM22437g.exists();
        C0779MN c0779mn = C0779MN.f7117a;
        if (!zExists) {
            Logger.d$default("No crashes detected", null, 2, null);
            return c0779mn;
        }
        File[] fileArrListFiles = fileM22437g.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            Logger.d$default("No crashes detected", null, 2, null);
            return c0779mn;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            try {
                O90.m5967e(file, "crashDir");
                arrayList.add(read(file));
            } catch (Exception unused) {
            }
        }
        if (arrayList.isEmpty()) {
            return c0779mn;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - BuildConfig.LIMIT_MAX_CRASH_REPORT_TTL_MILLIS;
        if (arrayList.size() > 1) {
            AbstractC0183Cu.m1455l(arrayList, new Comparator() { // from class: ru.ok.tracer.crash.report.CrashStorage$readAll$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return GT1.m3070b(Long.valueOf(((CrashDescription) t).getTimestamp()), Long.valueOf(((CrashDescription) t2).getTimestamp()));
                }
            });
        }
        while (arrayList.size() > 10) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            CrashDescription crashDescription = (CrashDescription) arrayList.remove(0);
            Logger.d$default("Removing obsolete crash", null, 2, null);
            crashDescription.delete();
        }
        while (((CrashDescription) AbstractC7167xu.m25955A(arrayList)).getTimestamp() < jCurrentTimeMillis) {
            if (arrayList.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            CrashDescription crashDescription2 = (CrashDescription) arrayList.remove(0);
            Logger.d$default("Removing obsolete crash", null, 2, null);
            crashDescription2.delete();
            if (arrayList.isEmpty()) {
                break;
            }
        }
        return arrayList;
    }

    public final CrashDescription save(CrashType type, Throwable throwable, SystemState systemState, List<String> list, Map<Thread, StackTraceElement[]> allStackTraces, List<LogEntry> logs) {
        O90.m5968f(type, "type");
        O90.m5968f(throwable, "throwable");
        O90.m5968f(systemState, "systemState");
        O90.m5968f(list, FILE_TAGS);
        O90.m5968f(allStackTraces, "allStackTraces");
        O90.m5968f(logs, "logs");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, AbstractC7038vr.f44561a), 8192);
        try {
            ThrowableUtils.appendStackTraceTo(throwable, bufferedWriter);
            AbstractC8729aT1.m9749a(bufferedWriter, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            O90.m5967e(byteArray, "content.toByteArray()");
            return save(type, byteArray, systemState, list, allStackTraces, logs);
        } finally {
        }
    }

    public static /* synthetic */ CrashDescription save$default(CrashStorage crashStorage, CrashType crashType, byte[] bArr, SystemState systemState, List list, Map map, List list2, int i, Object obj) {
        int i2 = i & 8;
        C0779MN c0779mn = C0779MN.f7117a;
        return crashStorage.save(crashType, bArr, systemState, (List<String>) (i2 != 0 ? c0779mn : list), (Map<Thread, StackTraceElement[]>) ((i & 16) != 0 ? C0842NN.f7735a : map), (List<LogEntry>) ((i & 32) != 0 ? c0779mn : list2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0194 A[Catch: IOException -> 0x0181, TRY_LEAVE, TryCatch #3 {IOException -> 0x0181, blocks: (B:121:0x00e1, B:123:0x00f4, B:140:0x017d, B:141:0x0180, B:143:0x0185, B:145:0x0194, B:160:0x01c6, B:161:0x01c9, B:157:0x01c3, B:146:0x01a0, B:147:0x01a5, B:149:0x01ab, B:137:0x017a, B:124:0x0104, B:125:0x010c, B:127:0x0112, B:129:0x015d), top: B:185:0x00e1, inners: #0, #2, #9, #10 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ru.ok.tracer.crash.report.CrashDescription] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ru.p031ok.tracer.crash.report.CrashDescription save(ru.p031ok.tracer.crash.report.CrashType r23, byte[] r24, ru.p031ok.tracer.SystemState r25, java.util.List<java.lang.String> r26, java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> r27, java.util.List<ru.p031ok.tracer.crash.report.LogEntry> r28) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.p031ok.tracer.crash.report.CrashStorage.save(ru.ok.tracer.crash.report.CrashType, byte[], ru.ok.tracer.SystemState, java.util.List, java.util.Map, java.util.List):ru.ok.tracer.crash.report.CrashDescription");
    }
}
