package ru.ok.tracer;

import defpackage.O90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ok/tracer/TracerFeature;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "toString", "tracer-commons_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerFeature {
    private final String name;

    public TracerFeature(String str) {
        O90.f(str, "name");
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    public String toString() {
        return "TracerFeature::" + this.name;
    }
}
