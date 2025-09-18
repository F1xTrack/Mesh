package com.yandex.mapkit.map;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class MapLoadStatistics implements Serializable {
    private long curZoomGeometryLoaded;
    private long curZoomLabelsLoaded;
    private long curZoomModelsLoaded;
    private long curZoomPlacemarksLoaded;
    private long delayedGeometryLoaded;
    private long fullyAppeared;
    private long fullyLoaded;
    private int renderObjectCount;
    private int tileMemoryUsage;

    public MapLoadStatistics(long j, long j2, long j3, long j4, long j5, long j6, long j7, int i, int i2) {
        this.curZoomGeometryLoaded = j;
        this.curZoomPlacemarksLoaded = j2;
        this.curZoomLabelsLoaded = j3;
        this.delayedGeometryLoaded = j4;
        this.curZoomModelsLoaded = j5;
        this.fullyLoaded = j6;
        this.fullyAppeared = j7;
        this.renderObjectCount = i;
        this.tileMemoryUsage = i2;
    }

    public long getCurZoomGeometryLoaded() {
        return this.curZoomGeometryLoaded;
    }

    public long getCurZoomLabelsLoaded() {
        return this.curZoomLabelsLoaded;
    }

    public long getCurZoomModelsLoaded() {
        return this.curZoomModelsLoaded;
    }

    public long getCurZoomPlacemarksLoaded() {
        return this.curZoomPlacemarksLoaded;
    }

    public long getDelayedGeometryLoaded() {
        return this.delayedGeometryLoaded;
    }

    public long getFullyAppeared() {
        return this.fullyAppeared;
    }

    public long getFullyLoaded() {
        return this.fullyLoaded;
    }

    public int getRenderObjectCount() {
        return this.renderObjectCount;
    }

    public int getTileMemoryUsage() {
        return this.tileMemoryUsage;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.curZoomGeometryLoaded = archive.add(this.curZoomGeometryLoaded);
        this.curZoomPlacemarksLoaded = archive.add(this.curZoomPlacemarksLoaded);
        this.curZoomLabelsLoaded = archive.add(this.curZoomLabelsLoaded);
        this.delayedGeometryLoaded = archive.add(this.delayedGeometryLoaded);
        this.curZoomModelsLoaded = archive.add(this.curZoomModelsLoaded);
        this.fullyLoaded = archive.add(this.fullyLoaded);
        this.fullyAppeared = archive.add(this.fullyAppeared);
        this.renderObjectCount = archive.add(this.renderObjectCount);
        this.tileMemoryUsage = archive.add(this.tileMemoryUsage);
    }

    public MapLoadStatistics() {
    }
}
