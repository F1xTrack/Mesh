package ru.ok.tracer.lite;

import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ok/tracer/lite/TracerLibraryInfo;", "", "packageName", "", "versionName", "buildUuid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuildUuid", "()Ljava/lang/String;", "getPackageName", "getVersionName", "tracer-lite-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerLibraryInfo {
    private final String buildUuid;
    private final String packageName;
    private final String versionName;

    public TracerLibraryInfo(String str, String str2, String str3) {
        O90.f(str, "packageName");
        O90.f(str2, "versionName");
        this.packageName = str;
        this.versionName = str2;
        this.buildUuid = str3;
    }

    public final String getBuildUuid() {
        return this.buildUuid;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getVersionName() {
        return this.versionName;
    }
}
