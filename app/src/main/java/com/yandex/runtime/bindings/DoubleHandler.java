package com.yandex.runtime.bindings;

/* loaded from: classes2.dex */
public class DoubleHandler implements ArchivingHandler<Double> {
    private final boolean isOptional;

    public DoubleHandler() {
        this(false);
    }

    public DoubleHandler(boolean z) {
        this.isOptional = z;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Double add(Double d, Archive archive) {
        return archive.add(d, this.isOptional);
    }
}
