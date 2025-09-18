package com.yandex.mapkit.navigation;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class JamStyle implements Serializable {
    private List<JamTypeColor> colors;
    private boolean colors__is_initialized;
    private NativeObject nativeObject;

    public JamStyle() {
        this.colors__is_initialized = false;
    }

    private native List<JamTypeColor> getColors__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::navigation::JamStyle";
    }

    private native NativeObject init(List<JamTypeColor> list);

    public synchronized List<JamTypeColor> getColors() {
        try {
            if (!this.colors__is_initialized) {
                this.colors = getColors__Native();
                this.colors__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.colors;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((List) getColors(), false, (ArchivingHandler) new ClassHandler(JamTypeColor.class));
            return;
        }
        List<JamTypeColor> listAdd = archive.add((List) this.colors, false, (ArchivingHandler) new ClassHandler(JamTypeColor.class));
        this.colors = listAdd;
        this.colors__is_initialized = true;
        this.nativeObject = init(listAdd);
    }

    public JamStyle(List<JamTypeColor> list) {
        this.colors__is_initialized = false;
        if (list != null) {
            this.nativeObject = init(list);
            this.colors = list;
            this.colors__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"colors\" cannot be null");
    }

    private JamStyle(NativeObject nativeObject) {
        this.colors__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
