package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class LocalizedValue implements Serializable {
    private String text;
    private double value;

    public LocalizedValue(double d, String str) {
        if (str == null) {
            throw new IllegalArgumentException("Required field \"text\" cannot be null");
        }
        this.value = d;
        this.text = str;
    }

    public String getText() {
        return this.text;
    }

    public double getValue() {
        return this.value;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.value = archive.add(this.value);
        this.text = archive.add(this.text, false);
    }

    public LocalizedValue() {
    }
}
