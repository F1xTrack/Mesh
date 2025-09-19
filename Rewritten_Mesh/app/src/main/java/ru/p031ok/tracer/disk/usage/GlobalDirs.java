package ru.p031ok.tracer.disk.usage;

import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m22267d2 = {"Lru/ok/tracer/disk/usage/GlobalDirs;", "", "tag", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTag", "()Ljava/lang/String;", "excludePath", "path", "INTERNAL_DATA", "EXTERNAL_DATA", "SRC", "tracer-disk-usage_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public enum GlobalDirs {
    INTERNAL_DATA("int_data"),
    EXTERNAL_DATA("ext_data"),
    SRC("src_data");

    private final String tag;

    GlobalDirs(String str) {
        this.tag = str;
    }

    public final String excludePath(String path) {
        O90.m5968f(path, "path");
        return this.tag + ':' + path;
    }

    public final String getTag() {
        return this.tag;
    }
}
