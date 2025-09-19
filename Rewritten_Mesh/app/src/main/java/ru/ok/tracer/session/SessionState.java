package ru.ok.tracer.session;

import defpackage.AbstractC1705Vq;
import defpackage.F91;
import defpackage.O90;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.tracer.SystemState;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0002\"#B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006$"}, d2 = {"Lru/ok/tracer/session/SessionState;", "", "versionCode", "", "versionName", "", "sessionUuid", "processName", "status", "Lru/ok/tracer/session/SessionState$Status;", "isInBackground", "", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ok/tracer/session/SessionState$Status;Z)V", "()Z", "getProcessName", "()Ljava/lang/String;", "getSessionUuid", "getStatus", "()Lru/ok/tracer/session/SessionState$Status;", "getVersionCode", "()J", "getVersionName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "Status", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SessionState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isInBackground;
    private final String processName;
    private final String sessionUuid;
    private final Status status;
    private final long versionCode;
    private final String versionName;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0080\u0002¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ok/tracer/session/SessionState$Companion;", "", "()V", "invoke", "Lru/ok/tracer/session/SessionState;", "systemState", "Lru/ok/tracer/SystemState;", "status", "Lru/ok/tracer/session/SessionState$Status;", "invoke$tracer_commons_release", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SessionState invoke$tracer_commons_release(SystemState systemState, Status status) {
            O90.f(systemState, "systemState");
            O90.f(status, "status");
            return new SessionState(systemState.getVersionCode(), systemState.getVersionName(), systemState.getSessionUuid(), systemState.getProcessName$tracer_commons_release(), status, systemState.isInBackground());
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ok/tracer/session/SessionState$Status;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BLANK", "CRASH", "ANR", "NATIVE", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Status {
        BLANK("BLANK"),
        CRASH("CRASH"),
        ANR("ANR"),
        NATIVE("NATIVE");

        private final String value;

        Status(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public SessionState(long j, String str, String str2, String str3, Status status, boolean z) {
        O90.f(str, "versionName");
        O90.f(str2, "sessionUuid");
        O90.f(status, "status");
        this.versionCode = j;
        this.versionName = str;
        this.sessionUuid = str2;
        this.processName = str3;
        this.status = status;
        this.isInBackground = z;
    }

    /* renamed from: component1, reason: from getter */
    public final long getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSessionUuid() {
        return this.sessionUuid;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProcessName() {
        return this.processName;
    }

    /* renamed from: component5, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsInBackground() {
        return this.isInBackground;
    }

    public final SessionState copy(long versionCode, String versionName, String sessionUuid, String processName, Status status, boolean isInBackground) {
        O90.f(versionName, "versionName");
        O90.f(sessionUuid, "sessionUuid");
        O90.f(status, "status");
        return new SessionState(versionCode, versionName, sessionUuid, processName, status, isInBackground);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionState)) {
            return false;
        }
        SessionState sessionState = (SessionState) other;
        return this.versionCode == sessionState.versionCode && O90.a(this.versionName, sessionState.versionName) && O90.a(this.sessionUuid, sessionState.sessionUuid) && O90.a(this.processName, sessionState.processName) && this.status == sessionState.status && this.isInBackground == sessionState.isInBackground;
    }

    public final String getProcessName() {
        return this.processName;
    }

    public final String getSessionUuid() {
        return this.sessionUuid;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        long j = this.versionCode;
        int iE = AbstractC1705Vq.e(AbstractC1705Vq.e(((int) (j ^ (j >>> 32))) * 31, 31, this.versionName), 31, this.sessionUuid);
        String str = this.processName;
        int iHashCode = (this.status.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        boolean z = this.isInBackground;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final boolean isInBackground() {
        return this.isInBackground;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SessionState(versionCode=");
        sb.append(this.versionCode);
        sb.append(", versionName=");
        sb.append(this.versionName);
        sb.append(", sessionUuid=");
        sb.append(this.sessionUuid);
        sb.append(", processName=");
        sb.append(this.processName);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", isInBackground=");
        return F91.w(sb, this.isInBackground, ')');
    }
}
