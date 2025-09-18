package p000;

import com.p019vk.push.core.remote.config.omicron.executor.DefaultExecutorFactory;
import com.p019vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.p019vk.push.core.remote.config.omicron.scheduler.WorkManagerScheduledExecutor;
import com.p019vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import com.p019vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import com.p019vk.push.core.remote.config.omicron.timetable.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: Ax0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7360Ax0 {

    /* renamed from: g */
    public static final TimeUnit f483g = TimeUnit.MINUTES;

    /* renamed from: a */
    public final SerializationDataStorage f484a;

    /* renamed from: b */
    public final NetworkDataRetriever f485b;

    /* renamed from: c */
    public final SharedPreferencesUpdateTimetable f486c;

    /* renamed from: d */
    public final TimeProvider f487d;

    /* renamed from: e */
    public final DefaultExecutorFactory f488e;

    /* renamed from: f */
    public final WorkManagerScheduledExecutor f489f;

    public C7360Ax0(SerializationDataStorage serializationDataStorage, NetworkDataRetriever networkDataRetriever, SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable, TimeProvider timeProvider, DefaultExecutorFactory defaultExecutorFactory, WorkManagerScheduledExecutor workManagerScheduledExecutor) {
        this.f484a = serializationDataStorage;
        this.f485b = networkDataRetriever;
        this.f486c = sharedPreferencesUpdateTimetable;
        this.f487d = timeProvider;
        this.f488e = defaultExecutorFactory;
        this.f489f = workManagerScheduledExecutor;
    }
}
