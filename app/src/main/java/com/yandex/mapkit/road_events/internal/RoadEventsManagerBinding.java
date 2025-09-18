package com.yandex.mapkit.road_events.internal;

import com.yandex.mapkit.road_events.EventInfoSession;
import com.yandex.mapkit.road_events.RoadEventsManager;
import com.yandex.runtime.NativeObject;

/* loaded from: classes2.dex */
public class RoadEventsManagerBinding implements RoadEventsManager {
    private final NativeObject nativeObject;

    public RoadEventsManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events.RoadEventsManager
    public native EventInfoSession requestEventInfo(String str, EventInfoSession.EventInfoListener eventInfoListener);
}
