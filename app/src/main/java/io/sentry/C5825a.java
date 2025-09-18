package io.sentry;

import io.sentry.protocol.C6083F;

/* renamed from: io.sentry.a */
/* loaded from: classes2.dex */
public final class C5825a {

    /* renamed from: a */
    public final byte[] f33467a;

    /* renamed from: b */
    public final C6083F f33468b;

    /* renamed from: c */
    public final String f33469c;

    /* renamed from: d */
    public final String f33470d;

    /* renamed from: e */
    public final String f33471e;

    public C5825a(String str, String str2, byte[] bArr) {
        this.f33467a = bArr;
        this.f33468b = null;
        this.f33469c = str;
        this.f33470d = str2;
        this.f33471e = "event.attachment";
    }

    public C5825a(C6083F c6083f) {
        this.f33467a = null;
        this.f33468b = c6083f;
        this.f33469c = "view-hierarchy.json";
        this.f33470d = "application/json";
        this.f33471e = "event.view_hierarchy";
    }
}
