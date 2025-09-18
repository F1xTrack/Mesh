package com.yandex.mapkit.map;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class GeoObjectInspectionMetadata implements BaseMetadata, Serializable {
    private String layerId;
    private boolean layerId__is_initialized;
    private NativeObject nativeObject;
    private ObjectType objectType;
    private boolean objectType__is_initialized;

    public enum ObjectType {
        POINT,
        POLYLINE,
        POLYGON,
        CIRCLE
    }

    public GeoObjectInspectionMetadata() {
        this.layerId__is_initialized = false;
        this.objectType__is_initialized = false;
    }

    private native String getLayerId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::map::GeoObjectInspectionMetadata";
    }

    private native ObjectType getObjectType__Native();

    private native NativeObject init(String str, ObjectType objectType);

    public synchronized String getLayerId() {
        try {
            if (!this.layerId__is_initialized) {
                this.layerId = getLayerId__Native();
                this.layerId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.layerId;
    }

    public synchronized ObjectType getObjectType() {
        try {
            if (!this.objectType__is_initialized) {
                this.objectType = getObjectType__Native();
                this.objectType__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.objectType;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getLayerId(), false);
            archive.add((Archive) getObjectType(), false, (Class<Archive>) ObjectType.class);
            return;
        }
        this.layerId = archive.add(this.layerId, false);
        this.layerId__is_initialized = true;
        ObjectType objectType = (ObjectType) archive.add((Archive) this.objectType, false, (Class<Archive>) ObjectType.class);
        this.objectType = objectType;
        this.objectType__is_initialized = true;
        this.nativeObject = init(this.layerId, objectType);
    }

    public GeoObjectInspectionMetadata(String str, ObjectType objectType) {
        this.layerId__is_initialized = false;
        this.objectType__is_initialized = false;
        if (str == null) {
            throw new IllegalArgumentException("Required field \"layerId\" cannot be null");
        }
        if (objectType != null) {
            this.nativeObject = init(str, objectType);
            this.layerId = str;
            this.layerId__is_initialized = true;
            this.objectType = objectType;
            this.objectType__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"objectType\" cannot be null");
    }

    private GeoObjectInspectionMetadata(NativeObject nativeObject) {
        this.layerId__is_initialized = false;
        this.objectType__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
