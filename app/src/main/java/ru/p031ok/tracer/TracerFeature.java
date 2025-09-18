package ru.p031ok.tracer;

import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m22267d2 = {"Lru/ok/tracer/TracerFeature;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "toString", "tracer-commons_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerFeature {
    private final String name;

    public TracerFeature(String str) {
        O90.m5968f(str, "name");
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    public String toString() {
        return "TracerFeature::" + this.name;
    }
}
