package com.yandex.mapkit.geometry;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class Polygon implements Serializable {
    private List<LinearRing> innerRings;
    private boolean innerRings__is_initialized;
    private NativeObject nativeObject;
    private LinearRing outerRing;
    private boolean outerRing__is_initialized;

    public Polygon() {
        this.outerRing__is_initialized = false;
        this.innerRings__is_initialized = false;
    }

    private native List<LinearRing> getInnerRings__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::geometry::Polygon";
    }

    private native LinearRing getOuterRing__Native();

    private native NativeObject init(LinearRing linearRing, List<LinearRing> list);

    public synchronized List<LinearRing> getInnerRings() {
        try {
            if (!this.innerRings__is_initialized) {
                this.innerRings = getInnerRings__Native();
                this.innerRings__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.innerRings;
    }

    public synchronized LinearRing getOuterRing() {
        try {
            if (!this.outerRing__is_initialized) {
                this.outerRing = getOuterRing__Native();
                this.outerRing__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.outerRing;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getOuterRing(), false, (Class<Archive>) LinearRing.class);
            archive.add((List) getInnerRings(), false, (ArchivingHandler) new ClassHandler(LinearRing.class));
            return;
        }
        this.outerRing = (LinearRing) archive.add((Archive) this.outerRing, false, (Class<Archive>) LinearRing.class);
        this.outerRing__is_initialized = true;
        List<LinearRing> listAdd = archive.add((List) this.innerRings, false, (ArchivingHandler) new ClassHandler(LinearRing.class));
        this.innerRings = listAdd;
        this.innerRings__is_initialized = true;
        this.nativeObject = init(this.outerRing, listAdd);
    }

    public Polygon(LinearRing linearRing, List<LinearRing> list) {
        this.outerRing__is_initialized = false;
        this.innerRings__is_initialized = false;
        if (linearRing == null) {
            throw new IllegalArgumentException("Required field \"outerRing\" cannot be null");
        }
        if (list != null) {
            this.nativeObject = init(linearRing, list);
            this.outerRing = linearRing;
            this.outerRing__is_initialized = true;
            this.innerRings = list;
            this.innerRings__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"innerRings\" cannot be null");
    }

    private Polygon(NativeObject nativeObject) {
        this.outerRing__is_initialized = false;
        this.innerRings__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
