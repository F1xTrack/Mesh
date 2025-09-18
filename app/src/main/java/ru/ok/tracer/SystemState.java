package ru.ok.tracer;

import com.huawei.hms.rn.push.constants.NotificationConstants;
import defpackage.AbstractC1705Vq;
import defpackage.AbstractC7096sn0;
import defpackage.O90;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import ru.ok.tracer.base.datetime.DateTimeUtils;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0002\u0010\u0015J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\u0015\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u009f\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001J\u0013\u0010:\u001a\u00020\u000e2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\r\u0010?\u001a\u00020\u0000H\u0000¢\u0006\u0002\b@R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010!\u001a\u0004\u0018\u00010\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0017¨\u0006A"}, d2 = {"Lru/ok/tracer/SystemState;", "", "versionName", "", "versionCode", "", "packageName", "buildUuid", "sessionUuid", "device", "deviceId", "vendor", "osVersion", "isInBackground", "", "isRooted", "properties", "", "hostedLibrariesInfo", "", "Lru/ok/tracer/HostedTracerLibraryInfo;", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Ljava/util/Set;)V", "getBuildUuid", "()Ljava/lang/String;", "getDevice", "getDeviceId", "getHostedLibrariesInfo", "()Ljava/util/Set;", "setHostedLibrariesInfo", "(Ljava/util/Set;)V", "()Z", "getOsVersion", "getPackageName", "processName", "getProcessName$tracer_commons_release", "getProperties", "()Ljava/util/Map;", "setProperties", "(Ljava/util/Map;)V", "getSessionUuid", "getVendor", "getVersionCode", "()J", "getVersionName", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "withCurrentDate", "withCurrentDate$tracer_commons_release", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SystemState {
    private final String buildUuid;
    private final String device;
    private final String deviceId;
    private Set<HostedTracerLibraryInfo> hostedLibrariesInfo;
    private final boolean isInBackground;
    private final boolean isRooted;
    private final String osVersion;
    private final String packageName;
    private Map<String, String> properties;
    private final String sessionUuid;
    private final String vendor;
    private final long versionCode;
    private final String versionName;

    public SystemState(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, Map<String, String> map, Set<HostedTracerLibraryInfo> set) {
        O90.f(str, "versionName");
        O90.f(str2, "packageName");
        O90.f(str4, "sessionUuid");
        O90.f(str5, "device");
        O90.f(str6, "deviceId");
        O90.f(str7, "vendor");
        O90.f(str8, "osVersion");
        O90.f(map, "properties");
        O90.f(set, "hostedLibrariesInfo");
        this.versionName = str;
        this.versionCode = j;
        this.packageName = str2;
        this.buildUuid = str3;
        this.sessionUuid = str4;
        this.device = str5;
        this.deviceId = str6;
        this.vendor = str7;
        this.osVersion = str8;
        this.isInBackground = z;
        this.isRooted = z2;
        this.properties = map;
        this.hostedLibrariesInfo = set;
    }

    public static /* synthetic */ SystemState copy$default(SystemState systemState, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, Map map, Set set, int i, Object obj) {
        return systemState.copy((i & 1) != 0 ? systemState.versionName : str, (i & 2) != 0 ? systemState.versionCode : j, (i & 4) != 0 ? systemState.packageName : str2, (i & 8) != 0 ? systemState.buildUuid : str3, (i & 16) != 0 ? systemState.sessionUuid : str4, (i & 32) != 0 ? systemState.device : str5, (i & 64) != 0 ? systemState.deviceId : str6, (i & 128) != 0 ? systemState.vendor : str7, (i & 256) != 0 ? systemState.osVersion : str8, (i & 512) != 0 ? systemState.isInBackground : z, (i & 1024) != 0 ? systemState.isRooted : z2, (i & 2048) != 0 ? systemState.properties : map, (i & 4096) != 0 ? systemState.hostedLibrariesInfo : set);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsInBackground() {
        return this.isInBackground;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsRooted() {
        return this.isRooted;
    }

    public final Map<String, String> component12() {
        return this.properties;
    }

    public final Set<HostedTracerLibraryInfo> component13() {
        return this.hostedLibrariesInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final long getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBuildUuid() {
        return this.buildUuid;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSessionUuid() {
        return this.sessionUuid;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getVendor() {
        return this.vendor;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    public final SystemState copy(String versionName, long versionCode, String packageName, String buildUuid, String sessionUuid, String device, String deviceId, String vendor, String osVersion, boolean isInBackground, boolean isRooted, Map<String, String> properties, Set<HostedTracerLibraryInfo> hostedLibrariesInfo) {
        O90.f(versionName, "versionName");
        O90.f(packageName, "packageName");
        O90.f(sessionUuid, "sessionUuid");
        O90.f(device, "device");
        O90.f(deviceId, "deviceId");
        O90.f(vendor, "vendor");
        O90.f(osVersion, "osVersion");
        O90.f(properties, "properties");
        O90.f(hostedLibrariesInfo, "hostedLibrariesInfo");
        return new SystemState(versionName, versionCode, packageName, buildUuid, sessionUuid, device, deviceId, vendor, osVersion, isInBackground, isRooted, properties, hostedLibrariesInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SystemState)) {
            return false;
        }
        SystemState systemState = (SystemState) other;
        return O90.a(this.versionName, systemState.versionName) && this.versionCode == systemState.versionCode && O90.a(this.packageName, systemState.packageName) && O90.a(this.buildUuid, systemState.buildUuid) && O90.a(this.sessionUuid, systemState.sessionUuid) && O90.a(this.device, systemState.device) && O90.a(this.deviceId, systemState.deviceId) && O90.a(this.vendor, systemState.vendor) && O90.a(this.osVersion, systemState.osVersion) && this.isInBackground == systemState.isInBackground && this.isRooted == systemState.isRooted && O90.a(this.properties, systemState.properties) && O90.a(this.hostedLibrariesInfo, systemState.hostedLibrariesInfo);
    }

    public final String getBuildUuid() {
        return this.buildUuid;
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final Set<HostedTracerLibraryInfo> getHostedLibrariesInfo() {
        return this.hostedLibrariesInfo;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getProcessName$tracer_commons_release() {
        return this.properties.get("processName");
    }

    public final Map<String, String> getProperties() {
        return this.properties;
    }

    public final String getSessionUuid() {
        return this.sessionUuid;
    }

    public final String getVendor() {
        return this.vendor;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.versionName.hashCode() * 31;
        long j = this.versionCode;
        int iE = AbstractC1705Vq.e((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.packageName);
        String str = this.buildUuid;
        int iE2 = AbstractC1705Vq.e(AbstractC1705Vq.e(AbstractC1705Vq.e(AbstractC1705Vq.e(AbstractC1705Vq.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.sessionUuid), 31, this.device), 31, this.deviceId), 31, this.vendor), 31, this.osVersion);
        boolean z = this.isInBackground;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iE2 + i) * 31;
        boolean z2 = this.isRooted;
        return this.hostedLibrariesInfo.hashCode() + ((this.properties.hashCode() + ((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31)) * 31);
    }

    public final boolean isInBackground() {
        return this.isInBackground;
    }

    public final boolean isRooted() {
        return this.isRooted;
    }

    public final void setHostedLibrariesInfo(Set<HostedTracerLibraryInfo> set) {
        O90.f(set, "<set-?>");
        this.hostedLibrariesInfo = set;
    }

    public final void setProperties(Map<String, String> map) {
        O90.f(map, "<set-?>");
        this.properties = map;
    }

    public String toString() {
        return "SystemState(versionName=" + this.versionName + ", versionCode=" + this.versionCode + ", packageName=" + this.packageName + ", buildUuid=" + this.buildUuid + ", sessionUuid=" + this.sessionUuid + ", device=" + this.device + ", deviceId=" + this.deviceId + ", vendor=" + this.vendor + ", osVersion=" + this.osVersion + ", isInBackground=" + this.isInBackground + ", isRooted=" + this.isRooted + ", properties=" + this.properties + ", hostedLibrariesInfo=" + this.hostedLibrariesInfo + ')';
    }

    public final SystemState withCurrentDate$tracer_commons_release() {
        return copy$default(this, null, 0L, null, null, null, null, null, null, null, false, false, AbstractC7096sn0.k(this.properties, new Pair(NotificationConstants.DATE, DateTimeUtils.formatISO8601(new Date()))), null, 6143, null);
    }
}
