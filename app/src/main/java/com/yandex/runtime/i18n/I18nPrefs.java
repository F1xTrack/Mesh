package com.yandex.runtime.i18n;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class I18nPrefs implements Serializable {
    private SystemOfMeasurement som;
    private TimeFormat timeFormat;

    public I18nPrefs(SystemOfMeasurement systemOfMeasurement, TimeFormat timeFormat) {
        if (systemOfMeasurement == null) {
            throw new IllegalArgumentException("Required field \"som\" cannot be null");
        }
        if (timeFormat == null) {
            throw new IllegalArgumentException("Required field \"timeFormat\" cannot be null");
        }
        this.som = systemOfMeasurement;
        this.timeFormat = timeFormat;
    }

    public SystemOfMeasurement getSom() {
        return this.som;
    }

    public TimeFormat getTimeFormat() {
        return this.timeFormat;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.som = (SystemOfMeasurement) archive.add((Archive) this.som, false, (Class<Archive>) SystemOfMeasurement.class);
        this.timeFormat = (TimeFormat) archive.add((Archive) this.timeFormat, false, (Class<Archive>) TimeFormat.class);
    }

    public I18nPrefs() {
    }
}
