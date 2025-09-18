package com.yandex.runtime.bindings;

/* loaded from: classes2.dex */
public class IntegerHandler implements ArchivingHandler<Integer> {
    private final boolean isOptional;

    public IntegerHandler() {
        this(false);
    }

    public IntegerHandler(boolean z) {
        this.isOptional = z;
    }

    @Override // com.yandex.runtime.bindings.ArchivingHandler
    public Integer add(Integer num, Archive archive) {
        return archive.add(num, this.isOptional);
    }
}
