package p000;

import android.net.Uri;
import com.p019vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.p019vk.push.core.remote.config.omicron.Data;
import com.p019vk.push.core.remote.config.omicron.DataId;
import com.p019vk.push.core.remote.config.omicron.OmicronConfig;
import com.p019vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.p019vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11989zx0 {

    /* renamed from: a */
    public final AtomicReference f47110a = new AtomicReference();

    /* renamed from: b */
    public Data f47111b;

    /* renamed from: c */
    public final OmicronConfig f47112c;

    /* renamed from: d */
    public final DataId f47113d;

    /* renamed from: e */
    public final /* synthetic */ C7360Ax0 f47114e;

    public AbstractC11989zx0(C7360Ax0 c7360Ax0, OmicronConfig omicronConfig) {
        this.f47114e = c7360Ax0;
        this.f47112c = omicronConfig;
        this.f47113d = new DataId(new Uri.Builder().scheme(omicronConfig.f20506b).authority(omicronConfig.f20507c).path(omicronConfig.f20508d).toString(), omicronConfig.f20505a);
    }

    /* renamed from: a */
    public final DataQuery m26590a() {
        DataQuery.Builder builderNewBuilder = DataQuery.newBuilder();
        OmicronConfig omicronConfig = this.f47112c;
        return builderNewBuilder.environment(omicronConfig.f20512h).userId(omicronConfig.f20515k).fingerprints(omicronConfig.f20509e).build();
    }

    /* renamed from: b */
    public final DataQuery m26591b(Data data) {
        DataQuery.Builder builderSegments = DataQuery.newBuilder().version(data.getVersion()).condition(data.getCondition()).segments(data.getSegments());
        OmicronConfig omicronConfig = this.f47112c;
        return builderSegments.environment(omicronConfig.f20512h).userId(omicronConfig.f20515k).fingerprints(omicronConfig.f20509e).build();
    }

    /* renamed from: c */
    public abstract Data mo13753c();

    /* renamed from: d */
    public final void m26592d() {
        OmicronConfig omicronConfig = this.f47112c;
        AnalyticsHandler analyticsHandler = omicronConfig.f20510f;
        SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = this.f47114e.f486c;
        long j = omicronConfig.f20511g;
        TimeUnit timeUnit = C7360Ax0.f483g;
        DataId dataId = this.f47113d;
        analyticsHandler.onCacheHit(dataId, sharedPreferencesUpdateTimetable.shouldUpdate(dataId, j, timeUnit));
    }
}
