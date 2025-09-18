package defpackage;

import com.vk.push.core.remote.config.omicron.executor.DefaultExecutorFactory;
import com.vk.push.core.remote.config.omicron.retriever.NetworkDataRetriever;
import com.vk.push.core.remote.config.omicron.scheduler.WorkManagerScheduledExecutor;
import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import com.vk.push.core.remote.config.omicron.timetable.SharedPreferencesUpdateTimetable;
import com.vk.push.core.remote.config.omicron.timetable.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: Ax0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0090Ax0 {
    public static final TimeUnit g = TimeUnit.MINUTES;
    public final SerializationDataStorage a;
    public final NetworkDataRetriever b;
    public final SharedPreferencesUpdateTimetable c;
    public final TimeProvider d;
    public final DefaultExecutorFactory e;
    public final WorkManagerScheduledExecutor f;

    public C0090Ax0(SerializationDataStorage serializationDataStorage, NetworkDataRetriever networkDataRetriever, SharedPreferencesUpdateTimetable sharedPreferencesUpdateTimetable, TimeProvider timeProvider, DefaultExecutorFactory defaultExecutorFactory, WorkManagerScheduledExecutor workManagerScheduledExecutor) {
        this.a = serializationDataStorage;
        this.b = networkDataRetriever;
        this.c = sharedPreferencesUpdateTimetable;
        this.d = timeProvider;
        this.e = defaultExecutorFactory;
        this.f = workManagerScheduledExecutor;
    }
}
