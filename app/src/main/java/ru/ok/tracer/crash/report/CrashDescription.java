package ru.ok.tracer.crash.report;

import defpackage.AbstractC1705Vq;
import defpackage.AbstractC5702lU;
import defpackage.F91;
import defpackage.O90;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J`\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b-\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b.\u0010\u0017R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b/\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b0\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b1\u0010\u0017¨\u00062"}, d2 = {"Lru/ok/tracer/crash/report/CrashDescription;", "", "", "timestamp", "Lru/ok/tracer/crash/report/CrashType;", "crashType", "", "crashFilesDir", "systemStatePath", "tagsPath", "stacktracePath", "allStacktracesPath", "logsPath", "<init>", "(JLru/ok/tracer/crash/report/CrashType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LTf1;", "delete", "()V", "component1", "()J", "component2", "()Lru/ok/tracer/crash/report/CrashType;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "copy", "(JLru/ok/tracer/crash/report/CrashType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ok/tracer/crash/report/CrashDescription;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "Lru/ok/tracer/crash/report/CrashType;", "getCrashType", "Ljava/lang/String;", "getCrashFilesDir", "getSystemStatePath", "getTagsPath", "getStacktracePath", "getAllStacktracesPath", "getLogsPath", "tracer-crash-report_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CrashDescription {
    private final String allStacktracesPath;
    private final String crashFilesDir;
    private final CrashType crashType;
    private final String logsPath;
    private final String stacktracePath;
    private final String systemStatePath;
    private final String tagsPath;
    private final long timestamp;

    public CrashDescription(long j, CrashType crashType, String str, String str2, String str3, String str4, String str5, String str6) {
        O90.f(crashType, "crashType");
        O90.f(str, "crashFilesDir");
        O90.f(str2, "systemStatePath");
        O90.f(str3, "tagsPath");
        O90.f(str4, "stacktracePath");
        O90.f(str5, "allStacktracesPath");
        O90.f(str6, "logsPath");
        this.timestamp = j;
        this.crashType = crashType;
        this.crashFilesDir = str;
        this.systemStatePath = str2;
        this.tagsPath = str3;
        this.stacktracePath = str4;
        this.allStacktracesPath = str5;
        this.logsPath = str6;
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final CrashType getCrashType() {
        return this.crashType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCrashFilesDir() {
        return this.crashFilesDir;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSystemStatePath() {
        return this.systemStatePath;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTagsPath() {
        return this.tagsPath;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStacktracePath() {
        return this.stacktracePath;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAllStacktracesPath() {
        return this.allStacktracesPath;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLogsPath() {
        return this.logsPath;
    }

    public final CrashDescription copy(long timestamp, CrashType crashType, String crashFilesDir, String systemStatePath, String tagsPath, String stacktracePath, String allStacktracesPath, String logsPath) {
        O90.f(crashType, "crashType");
        O90.f(crashFilesDir, "crashFilesDir");
        O90.f(systemStatePath, "systemStatePath");
        O90.f(tagsPath, "tagsPath");
        O90.f(stacktracePath, "stacktracePath");
        O90.f(allStacktracesPath, "allStacktracesPath");
        O90.f(logsPath, "logsPath");
        return new CrashDescription(timestamp, crashType, crashFilesDir, systemStatePath, tagsPath, stacktracePath, allStacktracesPath, logsPath);
    }

    public final void delete() {
        AbstractC5702lU.c(new File(this.crashFilesDir));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrashDescription)) {
            return false;
        }
        CrashDescription crashDescription = (CrashDescription) other;
        return this.timestamp == crashDescription.timestamp && this.crashType == crashDescription.crashType && O90.a(this.crashFilesDir, crashDescription.crashFilesDir) && O90.a(this.systemStatePath, crashDescription.systemStatePath) && O90.a(this.tagsPath, crashDescription.tagsPath) && O90.a(this.stacktracePath, crashDescription.stacktracePath) && O90.a(this.allStacktracesPath, crashDescription.allStacktracesPath) && O90.a(this.logsPath, crashDescription.logsPath);
    }

    public final String getAllStacktracesPath() {
        return this.allStacktracesPath;
    }

    public final String getCrashFilesDir() {
        return this.crashFilesDir;
    }

    public final CrashType getCrashType() {
        return this.crashType;
    }

    public final String getLogsPath() {
        return this.logsPath;
    }

    public final String getStacktracePath() {
        return this.stacktracePath;
    }

    public final String getSystemStatePath() {
        return this.systemStatePath;
    }

    public final String getTagsPath() {
        return this.tagsPath;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        long j = this.timestamp;
        return this.logsPath.hashCode() + AbstractC1705Vq.e(AbstractC1705Vq.e(AbstractC1705Vq.e(AbstractC1705Vq.e(AbstractC1705Vq.e((this.crashType.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31, 31, this.crashFilesDir), 31, this.systemStatePath), 31, this.tagsPath), 31, this.stacktracePath), 31, this.allStacktracesPath);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CrashDescription(timestamp=");
        sb.append(this.timestamp);
        sb.append(", crashType=");
        sb.append(this.crashType);
        sb.append(", crashFilesDir=");
        sb.append(this.crashFilesDir);
        sb.append(", systemStatePath=");
        sb.append(this.systemStatePath);
        sb.append(", tagsPath=");
        sb.append(this.tagsPath);
        sb.append(", stacktracePath=");
        sb.append(this.stacktracePath);
        sb.append(", allStacktracesPath=");
        sb.append(this.allStacktracesPath);
        sb.append(", logsPath=");
        return F91.v(sb, this.logsPath, ')');
    }
}
