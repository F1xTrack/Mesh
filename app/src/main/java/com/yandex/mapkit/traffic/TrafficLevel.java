package com.yandex.mapkit.traffic;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class TrafficLevel implements Serializable {
    private TrafficColor color;
    private boolean color__is_initialized;
    private int level;
    private boolean level__is_initialized;
    private NativeObject nativeObject;

    public TrafficLevel() {
        this.color__is_initialized = false;
        this.level__is_initialized = false;
    }

    private native TrafficColor getColor__Native();

    private native int getLevel__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::traffic::TrafficLevel";
    }

    private native NativeObject init(TrafficColor trafficColor, int i);

    public synchronized TrafficColor getColor() {
        try {
            if (!this.color__is_initialized) {
                this.color = getColor__Native();
                this.color__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.color;
    }

    public synchronized int getLevel() {
        try {
            if (!this.level__is_initialized) {
                this.level = getLevel__Native();
                this.level__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.level;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getColor(), false, (Class<Archive>) TrafficColor.class);
            archive.add(getLevel());
            return;
        }
        this.color = (TrafficColor) archive.add((Archive) this.color, false, (Class<Archive>) TrafficColor.class);
        this.color__is_initialized = true;
        int iAdd = archive.add(this.level);
        this.level = iAdd;
        this.level__is_initialized = true;
        this.nativeObject = init(this.color, iAdd);
    }

    public TrafficLevel(TrafficColor trafficColor, int i) {
        this.color__is_initialized = false;
        this.level__is_initialized = false;
        if (trafficColor != null) {
            this.nativeObject = init(trafficColor, i);
            this.color = trafficColor;
            this.color__is_initialized = true;
            this.level = i;
            this.level__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"color\" cannot be null");
    }

    private TrafficLevel(NativeObject nativeObject) {
        this.color__is_initialized = false;
        this.level__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
