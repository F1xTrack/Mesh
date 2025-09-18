package com.yandex.mapkit.map;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import java.util.List;

/* loaded from: classes2.dex */
public class GeoObjectTags implements BaseMetadata, Serializable {
    private NativeObject nativeObject;
    private List<String> tags;
    private boolean tags__is_initialized;

    public GeoObjectTags() {
        this.tags__is_initialized = false;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::map::GeoObjectTags";
    }

    private native List<String> getTags__Native();

    private native NativeObject init(List<String> list);

    public synchronized List<String> getTags() {
        try {
            if (!this.tags__is_initialized) {
                this.tags = getTags__Native();
                this.tags__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.tags;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getTags(), false, (ArchivingHandler) new StringHandler());
            return;
        }
        List<String> listAdd = archive.add((List) this.tags, false, (ArchivingHandler) new StringHandler());
        this.tags = listAdd;
        this.tags__is_initialized = true;
        this.nativeObject = init(listAdd);
    }

    public GeoObjectTags(List<String> list) {
        this.tags__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.tags = list;
            this.tags__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"tags\" cannot be null");
    }

    private GeoObjectTags(NativeObject nativeObject) {
        this.tags__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
