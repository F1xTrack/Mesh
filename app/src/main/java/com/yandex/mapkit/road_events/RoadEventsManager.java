package com.yandex.mapkit.road_events;

import com.yandex.mapkit.road_events.EventInfoSession;

/* loaded from: classes2.dex */
public interface RoadEventsManager {
    EventInfoSession requestEventInfo(String str, EventInfoSession.EventInfoListener eventInfoListener);
}
