package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class Version implements Serializable {
    private String str;

    public Version(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"str\" cannot be null");
        }
        this.str = str;
    }

    public String getStr() {
        return this.str;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.str = archive.add(this.str, false);
    }

    public Version() {
    }
}
