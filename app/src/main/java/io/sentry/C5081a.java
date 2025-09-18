package io.sentry;

/* renamed from: io.sentry.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5081a {
    public final byte[] a;
    public final io.sentry.protocol.F b;
    public final String c;
    public final String d;
    public final String e;

    public C5081a(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = null;
        this.c = str;
        this.d = str2;
        this.e = "event.attachment";
    }

    public C5081a(io.sentry.protocol.F f) {
        this.a = null;
        this.b = f;
        this.c = "view-hierarchy.json";
        this.d = "application/json";
        this.e = "event.view_hierarchy";
    }
}
