package com.yandex.mapkit.navigation;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class JamSegment implements Serializable {
    private JamType jamType;
    private double speed;

    public JamSegment(JamType jamType, double d) {
        if (jamType == null) {
            throw new IllegalArgumentException("Required field \"jamType\" cannot be null");
        }
        this.jamType = jamType;
        this.speed = d;
    }

    public JamType getJamType() {
        return this.jamType;
    }

    public double getSpeed() {
        return this.speed;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.jamType = (JamType) archive.add((Archive) this.jamType, false, (Class<Archive>) JamType.class);
        this.speed = archive.add(this.speed);
    }

    public JamSegment() {
    }
}
