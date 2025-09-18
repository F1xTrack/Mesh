package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class Animation implements Serializable {
    private float duration;
    private Type type;

    public enum Type {
        SMOOTH,
        LINEAR
    }

    public Animation(Type type, float f) {
        if (type == null) {
            throw new IllegalArgumentException("Required field \"type\" cannot be null");
        }
        this.type = type;
        this.duration = f;
    }

    public float getDuration() {
        return this.duration;
    }

    public Type getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.type = (Type) archive.add((Archive) this.type, false, (Class<Archive>) Type.class);
        this.duration = archive.add(this.duration);
    }

    public Animation() {
    }
}
