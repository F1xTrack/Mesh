package com.yandex.mapkit.geometry;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class Subpolyline implements Serializable {
    private PolylinePosition begin;
    private PolylinePosition end;

    public Subpolyline(PolylinePosition polylinePosition, PolylinePosition polylinePosition2) {
        if (polylinePosition == null) {
            throw new IllegalArgumentException("Required field \"begin\" cannot be null");
        }
        if (polylinePosition2 == null) {
            throw new IllegalArgumentException("Required field \"end\" cannot be null");
        }
        this.begin = polylinePosition;
        this.end = polylinePosition2;
    }

    public PolylinePosition getBegin() {
        return this.begin;
    }

    public PolylinePosition getEnd() {
        return this.end;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.begin = (PolylinePosition) archive.add((Archive) this.begin, false, (Class<Archive>) PolylinePosition.class);
        this.end = (PolylinePosition) archive.add((Archive) this.end, false, (Class<Archive>) PolylinePosition.class);
    }

    public Subpolyline() {
    }
}
