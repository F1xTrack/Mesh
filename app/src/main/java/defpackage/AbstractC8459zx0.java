package defpackage;

import android.net.Uri;
import com.vk.push.core.remote.config.omicron.AnalyticsHandler;
import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;
import com.vk.push.core.remote.config.omicron.OmicronConfig;
import com.vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zx0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8459zx0 {
    public final AtomicReference a = new AtomicReference();
    public Data b;
    public final OmicronConfig c;
    public final DataId d;
    public final /* synthetic */ C0090Ax0 e;

    public AbstractC8459zx0(C0090Ax0 c0090Ax0, OmicronConfig omicronConfig) {
        this.e = c0090Ax0;
        this.c = omicronConfig;
        this.d = new DataId(new Uri.Builder().scheme(omicronConfig.b).authority(omicronConfig.c).path(omicronConfig.d).toString(), omicronConfig.a);
    }

    public final DataQuery a() {
        DataQuery.Builder builderNewBuilder = DataQuery.newBuilder();
        OmicronConfig omicronConfig = this.c;
        return builderNewBuilder.environment(omicronConfig.h).userId(omicronConfig.k).fingerprints(omicronConfig.e).build();
    }

    public final DataQuery b(Data data) {
        DataQuery.Builder builderSegments = DataQuery.newBuilder().version(data.getVersion()).condition(data.getCondition()).segments(data.getSegments());
        OmicronConfig omicronConfig = this.c;
        return builderSegments.environment(omicronConfig.h).userId(omicronConfig.k).fingerprints(omicronConfig.e).build();
    }

    public abstract Data c();

    public final void d() {
        OmicronConfig omicronConfig = this.c;
        AnalyticsHandler analyticsHandler = omicronConfig.f;
        SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable = this.e.c;
        long j = omicronConfig.g;
        TimeUnit timeUnit = C0090Ax0.g;
        DataId dataId = this.d;
        analyticsHandler.onCacheHit(dataId, sharedPreferencesUpdateTimetable.shouldUpdate(dataId, j, timeUnit));
    }
}
