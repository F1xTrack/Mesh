package com.yandex.mapkit.geometry;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class LinearRing implements Serializable {
    private NativeObject nativeObject;
    private List<Point> points;
    private boolean points__is_initialized;

    public LinearRing() {
        this.points__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::geometry::LinearRing";
    }

    private native List<Point> getPoints__Native();

    private native NativeObject init(List<Point> list);

    public synchronized List<Point> getPoints() {
        try {
            if (!this.points__is_initialized) {
                this.points = getPoints__Native();
                this.points__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.points;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getPoints(), false, (ArchivingHandler) new ClassHandler(Point.class));
            return;
        }
        List<Point> listAdd = archive.add((List) this.points, false, (ArchivingHandler) new ClassHandler(Point.class));
        this.points = listAdd;
        this.points__is_initialized = true;
        this.nativeObject = init(listAdd);
    }

    public LinearRing(List<Point> list) {
        this.points__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.points = list;
            this.points__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"points\" cannot be null");
    }

    private LinearRing(NativeObject nativeObject) {
        this.points__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
