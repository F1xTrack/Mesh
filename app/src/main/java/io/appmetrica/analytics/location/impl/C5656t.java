package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.location.impl.t */
/* loaded from: classes2.dex */
public final class C5656t {

    /* renamed from: a */
    public LocationFilter f32996a;

    /* renamed from: d */
    public Location f32999d;

    /* renamed from: e */
    public long f33000e;

    /* renamed from: c */
    public final CopyOnWriteArrayList f32998c = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final TimePassedChecker f32997b = new TimePassedChecker();

    public C5656t(LocationFilter locationFilter) {
        this.f32996a = locationFilter;
    }
}
