package expo.modules.filesystem;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.InterfaceC1787bT;
import p000.O90;
import p000.RN0;

@Metadata(m22266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u000fR.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010\u0011R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010)\u0012\u0004\b+\u0010\"\u001a\u0004\b*\u0010\u0013¨\u0006,"}, m22267d2 = {"Lexpo/modules/filesystem/DownloadOptions;", "LRN0;", "", "md5", "cache", "", "", "headers", "Lexpo/modules/filesystem/SessionType;", "sessionType", "<init>", "(ZLjava/lang/Boolean;Ljava/util/Map;Lexpo/modules/filesystem/SessionType;)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/util/Map;", "component4", "()Lexpo/modules/filesystem/SessionType;", "copy", "(ZLjava/lang/Boolean;Ljava/util/Map;Lexpo/modules/filesystem/SessionType;)Lexpo/modules/filesystem/DownloadOptions;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getMd5", "getMd5$annotations", "()V", "Ljava/lang/Boolean;", "getCache", "getCache$annotations", "Ljava/util/Map;", "getHeaders", "getHeaders$annotations", "Lexpo/modules/filesystem/SessionType;", "getSessionType", "getSessionType$annotations", "expo-file-system_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DownloadOptions implements RN0 {
    private final Boolean cache;
    private final Map<String, String> headers;
    private final boolean md5;
    private final SessionType sessionType;

    public DownloadOptions(boolean z, Boolean bool, Map<String, String> map, SessionType sessionType) {
        O90.m5968f(sessionType, "sessionType");
        this.md5 = z;
        this.cache = bool;
        this.headers = map;
        this.sessionType = sessionType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownloadOptions copy$default(DownloadOptions downloadOptions, boolean z, Boolean bool, Map map, SessionType sessionType, int i, Object obj) {
        if ((i & 1) != 0) {
            z = downloadOptions.md5;
        }
        if ((i & 2) != 0) {
            bool = downloadOptions.cache;
        }
        if ((i & 4) != 0) {
            map = downloadOptions.headers;
        }
        if ((i & 8) != 0) {
            sessionType = downloadOptions.sessionType;
        }
        return downloadOptions.copy(z, bool, map, sessionType);
    }

    @InterfaceC1787bT
    public static /* synthetic */ void getCache$annotations() {
    }

    @InterfaceC1787bT
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @InterfaceC1787bT
    public static /* synthetic */ void getMd5$annotations() {
    }

    @InterfaceC1787bT
    public static /* synthetic */ void getSessionType$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getMd5() {
        return this.md5;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getCache() {
        return this.cache;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    /* renamed from: component4, reason: from getter */
    public final SessionType getSessionType() {
        return this.sessionType;
    }

    public final DownloadOptions copy(boolean md5, Boolean cache, Map<String, String> headers, SessionType sessionType) {
        O90.m5968f(sessionType, "sessionType");
        return new DownloadOptions(md5, cache, headers, sessionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadOptions)) {
            return false;
        }
        DownloadOptions downloadOptions = (DownloadOptions) other;
        return this.md5 == downloadOptions.md5 && O90.m5963a(this.cache, downloadOptions.cache) && O90.m5963a(this.headers, downloadOptions.headers) && this.sessionType == downloadOptions.sessionType;
    }

    public final Boolean getCache() {
        return this.cache;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final boolean getMd5() {
        return this.md5;
    }

    public final SessionType getSessionType() {
        return this.sessionType;
    }

    public int hashCode() {
        int i = (this.md5 ? 1231 : 1237) * 31;
        Boolean bool = this.cache;
        int iHashCode = (i + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, String> map = this.headers;
        return this.sessionType.hashCode() + ((iHashCode + (map != null ? map.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "DownloadOptions(md5=" + this.md5 + ", cache=" + this.cache + ", headers=" + this.headers + ", sessionType=" + this.sessionType + ")";
    }

    public /* synthetic */ DownloadOptions(boolean z, Boolean bool, Map map, SessionType sessionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, bool, map, (i & 8) != 0 ? SessionType.BACKGROUND : sessionType);
    }
}
