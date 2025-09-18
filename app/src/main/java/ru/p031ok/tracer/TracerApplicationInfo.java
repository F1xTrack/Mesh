package ru.p031ok.tracer;

import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m22267d2 = {"Lru/ok/tracer/TracerApplicationInfo;", "", "packageName", "", "versionName", "longVersionCode", "", "buildUuid", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getBuildUuid", "()Ljava/lang/String;", "getLongVersionCode", "()J", "getPackageName", "versionCode", "", "getVersionCode", "()I", "getVersionName", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerApplicationInfo {
    private final String buildUuid;
    private final long longVersionCode;
    private final String packageName;
    private final String versionName;

    public TracerApplicationInfo(String str, String str2, long j, String str3) {
        O90.m5968f(str, "packageName");
        O90.m5968f(str2, "versionName");
        this.packageName = str;
        this.versionName = str2;
        this.longVersionCode = j;
        this.buildUuid = str3;
    }

    public final String getBuildUuid() {
        return this.buildUuid;
    }

    public final long getLongVersionCode() {
        return this.longVersionCode;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getVersionCode() {
        return (int) this.longVersionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }
}
